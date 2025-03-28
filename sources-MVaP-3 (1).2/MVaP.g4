grammar MVaP;


@header {
    import java.util.HashMap;
}

@members {
    /** La map pour mémoriser les addresses des étiquettes */
    private HashMap<String, Integer> labels = new HashMap<String, Integer>();
    /** adresse instruction */
    private int instrAddress = 0;
    /** Récupère le dictionnaire des étiquettes */
    public HashMap<String, Integer> getLabels() { return labels; }
    public int getProgramSize() { return instrAddress; }
}

// axiom
program : instr+ 
    ;

// lexer

WS :   (' '|'\t')+  -> skip;

ENTIER : ('+'|'-')? ('0'..'9')+  ;


FLOAT
    :   ('0'..'9')+ '.' ('0'..'9')* EXPONENT?
    |   '.' ('0'..'9')+ EXPONENT?
    |   ('0'..'9')+ EXPONENT
    ;

fragment
EXPONENT : ('e'|'E') ('+'|'-')? ('0'..'9')+ ;

ADD   : 'ADD';
SUB   : 'SUB';
MUL   : 'MUL';
DIV   : 'DIV';
MOD   : 'MOD';

INF   : 'INF';
INFEQ : 'INFEQ';
SUP   : 'SUP';
SUPEQ : 'SUPEQ';
EQUAL : 'EQUAL';
NEQ : 'NEQ';

FADD : 'FADD';
FSUB : 'FSUB';
FMUL : 'FMUL';
FDIV : 'FDIV';
FINF : 'FINF';
FINFEQ : 'FINFEQ';
FSUP : 'FSUP';
FSUPEQ : 'FSUPEQ';
FEQUAL : 'FEQUAL';
FNEQ : 'FNEQ';

ITOF : 'ITOF';
FTOI : 'FTOI';

RETURN: 'RETURN';

POP   : 'POP';
DUP   : 'DUP';


READ  : 'READ';
READF  : 'READF';
WRITE : 'WRITE';
WRITEF : 'WRITEF';

PUSHSP : 'PUSHSP';
PUSHFP : 'PUSHFP';

PUSHI : 'PUSHI';
PUSHF : 'PUSHF';
PUSHG : 'PUSHG';
STOREG : 'STOREG';
PUSHL : 'PUSHL';
STOREL : 'STOREL';
PUSHR  : 'PUSHR';
STORER : 'STORER';
FREE : 'FREE';
ALLOC : 'ALLOC';



CALL  : 'CALL';
JUMP  : 'JUMP ';
JUMPF : 'JUMPF';
JUMPR : 'JUMPR';
HALT  : 'HALT';

LABEL : 'LABEL';

IDENTIFIANT : ('a'..'z' | 'A'..'Z' | '_')('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;

NEWLINE : ('#' ~('\n'|'\r')*)? '\r'? '\n' ; // and Comment

// parser
instr 
    : instr1 NEWLINE
    | instr2 NEWLINE
    | instr2f NEWLINE
    | label NEWLINE
    | saut NEWLINE
    | NEWLINE
    ;


commande1 : ADD | SUB | MUL | DIV | MOD | INF | INFEQ | SUP | SUPEQ | EQUAL | NEQ 
   | FADD | FSUB | FMUL | FDIV | FINF | FINFEQ | FSUP | FSUPEQ | FEQUAL | FNEQ 
   | ITOF | FTOI
   | RETURN | POP | READ | READF | WRITE | WRITEF  
   | PUSHSP | PUSHFP 
   | DUP  
   | HALT;

instr1
    : c=commande1
        { instrAddress++; }
    ;    

commande2 : PUSHI | PUSHG | STOREG | PUSHL | STOREL | PUSHR | STORER | FREE | ALLOC;

instr2 
    : commande2 ENTIER 
        { instrAddress+=2; /* 2 entiers pour stocker l'instruction */ }
    ;
instr2f
    : PUSHF FLOAT  { instrAddress+=3; /* 1 entier pour le code op et 2 pour le flottant */ }
    ;

commandeSaut : JUMP | JUMPF | JUMPR | CALL;

saut
    : commandeSaut IDENTIFIANT
        { instrAddress+=2; /* 2 entiers pour stocker l'instruction */ }
    ;
label 
    : LABEL IDENTIFIANT 
        { labels.put($IDENTIFIANT.text, instrAddress); }
    ;
