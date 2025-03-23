grammar Calculette;


@parser::members {
   // instance de la table symbole qui permet de stocker variable globale , locale , fonction et parametres de fonction
   private TablesSymboles tablesSymboles = new TablesSymboles();


    private int _cur_label = 1;
    /** générateur de nom d'étiquettes pour les boucles */
    private String newLabel(){ return "Label"+(_cur_label++)+"\n"; }; 

    private String evalexpr (String op) {
        if ( op.equals("*") ){
            return "MUL\n";
        } if ( op.equals("+") ){
            return "ADD\n";
        } 
        if ( op.equals("/") ){
            return "DIV\n";
        } 
         if ( op.equals("%") ){
            return "MOD\n";
        } 
        if ( op.equals("-") ){
            return "SUB\n";
        } 
        if(op.equals("<")){
            return "INF\n";
        }
        if(op.equals(">")){
            return "SUP\n";
        }
        if(op.equals(">=")){
            return "SUPEQ\n";
        }
         if(op.equals("<=")){
            return "INFEQ\n";
        }
        if(op.equals("!=") || op.equals("<>")){
            return "NEQ\n";
        }
        if(op.equals("==")){
            return "EQUAL\n";
        }
        else {
           System.err.println("Opérateur arithmétique incorrect : '"+op+"'");
           throw new IllegalArgumentException("Opérateur arithmétique incorrect : '"+op+"'");
        }
    }
}

//regles de production   
start : calcul  EOF ;// point d'entrer ou axiome
calcul returns [ String code ]
@init{ $code = new String(); }   // On initialise une variable pour accumuler le code 
@after{ System.out.println($code); } // On affiche le code effectivement produit
    : 
        NEWLINE*
        (decl finInstruction{ $code += $decl.code; } )*     
        (instruction { $code += $instruction.code; })*
        { $code += "HALT\n"; }
    ;
decl returns [ String code ] 
    :
    TYPE IDENTIFIANT 
        {
            // declaration de variable

            tablesSymboles.addVarDecl($IDENTIFIANT.text,$TYPE.text);
            VariableInfo vi = tablesSymboles.getVar($IDENTIFIANT.text);
            $code = "PUSHI 0 \n";
           
        }
    | TYPE IDENTIFIANT '=' expression 
    {
        tablesSymboles.addVarDecl($IDENTIFIANT.text,$TYPE.text);
        VariableInfo vi = tablesSymboles.getVar($IDENTIFIANT.text);
        $code = "PUSHI 0\n" + $expression.code + "STOREG " + vi.address+"\n";
    }
    ;


instruction returns [ String code ] 
    : 
    assignation finInstruction
        { 
		// à compléter
            $code = $assignation.code;
        }

    |expression finInstruction
        { 
            // à compléter
            $code = $expression.code;

        }
   | input finInstruction
    {
        $code = $input.code;
    }
   | output finInstruction
        {
            $code = $output.code;
        }
   | bloc 
      {
         $code = $bloc.code;
      }
    | bouclewhile 
    {
        $code = $bouclewhile.code ;
    }
    | branchements 
    {
        $code = $branchements.code ;
    }
    | boucleFor 
    {
        $code = $boucleFor.code;
    }

   | finInstruction
        {
            $code = "";
        }
    
;
expression returns [ String code ]
    : 
    
    // à compléter
    '-'expression{
        $code = "PUSHI 0 \n" + $expression.code + evalexpr("-");
    }

    | exp1=expression OP=('*'|'/'|'%') exp2=expression{
    
        $code = $exp1.code + $exp2.code + evalexpr($OP.text);
    }
    | exp1=expression OP=('+'|'-') exp2=expression{
    
        $code = $exp1.code + $exp2.code + evalexpr($OP.text);
    }
    |'('expression')'{
        $code = $expression.code;
    }
    
    | IDENTIFIANT 
        {
            VariableInfo vi = tablesSymboles.getVar($IDENTIFIANT.text);
            $code = "PUSHG " + vi.address+"\n";
        }

    | ENTIER {
        $code = "PUSHI " + $ENTIER.text + "\n";
    };
assignation returns [ String code ] 
    : IDENTIFIANT '=' expression 
        {  
            // à compléter
            VariableInfo vi = tablesSymboles.getVar($IDENTIFIANT.text);
            $code = $expression.code + "STOREG " +vi.address+"\n";
        }

    | IDENTIFIANT  OP=('*=' | '/=' | '%=' | '-=' | '+=')  expression 
        {

         VariableInfo vi = tablesSymboles.getVar($IDENTIFIANT.text); 
           
         $code = "PUSHG " + vi.address + "\n"+                                               
                  $expression.code + evalexpr(Character.toString($OP.text.charAt(0)))+
                  "STOREG " + vi.address +"\n";
        }
    ;
input returns [ String code ]:
    'input('IDENTIFIANT')'
    {
        VariableInfo vi = tablesSymboles.getVar($IDENTIFIANT.text);
        $code = "READ \nSTOREG " + vi.address + "\n";
    }
    ;
output returns [String code]:
     'output('expression')'
     {

        $code = $expression.code + "WRITE\nPOP \n";

     };
bloc returns [ String code ]  
@init{ $code = new String(); } 
    : '{' 
           // à compléter    
           (instruction { $code += $instruction.code; })*  
      '}'  
      NEWLINE*
    ;
// Traitement du while 
bouclewhile returns [String code] :
    'while' '('condition')' instruction
    {
        String debut = newLabel();
        String fin = newLabel();
        $code  = "LABEL " + debut + $condition.code + "JUMPF " + fin + $instruction.code + "JUMP " + debut + "LABEL " + fin ; 
    }
    ;

condition returns [String code]: 
    'not'condition
        {
            $code = $condition.code + "PUSHI 1\nNEQ\n";
        }
    
   | a=condition 'and' b=condition 
        {
            $code = $a.code + $b.code + "MUL\n";
        }
    | a=condition 'or' b=condition 
        {
        $code = $a.code + $b.code + "ADD\nPUSHI 0\nSUP\n";
        }
    |'True'
        {
            $code =  "PUSHI 1\n";
        }
    |'False'
        {
           $code =  "PUSHI 0\n"; 
        }
    | operationRationelle
        {
            $code = $operationRationelle.code;
        }
    ;
operationRationelle returns [String code]:
      a=expression OP=('<' | '>' | '<=' | '>=' | '!=' | '<>' | '==') b=expression
        {
            $code = $a.code + $b.code + evalexpr( (String) $OP.text);
        };

branchements returns [String code]:
    'if' '('condition')' 'then' instruction
        {
            String sifaux = newLabel();
            $code = $condition.code +"JUMPF " + sifaux + $instruction.code +  "LABEL " + sifaux;
        }
    |'if' '('condition')' 'then' a=instruction NEWLINE+ 'else' b=instruction
        {
             String sinon = newLabel();
            $code = $condition.code + "JUMPF " + sinon + $a.code + "LABEL " + sinon +  $b.code;
        }
;
// regle de boucle for 
boucleFor  returns [String code]:
    'for' '(' a=assignation ';' condition ';' b=assignation ')' instruction
    {
        $code = $a.code + $condition.code + $b.code + $instruction.code;
    };
finInstruction : ( NEWLINE | ';' )+ ;


//lexer 
COMM :  ( ('#')(~('\n'))* ) -> skip;
COMMLIGNE : ( ('//')(~('\n'))* )  -> skip;
COMMMULTI : ( ('/*') .*? ('*/') ) -> skip;

NEWLINE : '\r'? '\n' ;

WS :   (' '|'\t')+  -> skip;
ENTIER : ('0'..'9')+  ;
OP : '*' | '/' | '%'| '-' | '+'  ;
TYPE : 'int' | 'double' ;
BOOL : 'True' | 'False';
IDENTIFIANT :('a'..'z' | 'A'..'Z' | '_')('a'..'z' | 'A'..'Z' | '_' | ENTIER)*;
UNMATCH : . -> skip;