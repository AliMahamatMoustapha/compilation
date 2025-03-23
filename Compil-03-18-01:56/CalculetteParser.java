// Generated from Calculette.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CalculetteParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, COMM=36, COMMLIGNE=37, COMMMULTI=38, 
		NEWLINE=39, WS=40, ENTIER=41, OP=42, TYPE=43, BOOL=44, IDENTIFIANT=45, 
		UNMATCH=46;
	public static final int
		RULE_start = 0, RULE_calcul = 1, RULE_decl = 2, RULE_instruction = 3, 
		RULE_expression = 4, RULE_assignation = 5, RULE_input = 6, RULE_output = 7, 
		RULE_bloc = 8, RULE_bouclewhile = 9, RULE_condition = 10, RULE_operationRationelle = 11, 
		RULE_branchements = 12, RULE_boucleFor = 13, RULE_finInstruction = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "calcul", "decl", "instruction", "expression", "assignation", 
			"input", "output", "bloc", "bouclewhile", "condition", "operationRationelle", 
			"branchements", "boucleFor", "finInstruction"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'-'", "'*'", "'/'", "'%'", "'+'", "'('", "')'", "'*='", 
			"'/='", "'%='", "'-='", "'+='", "'input('", "'output('", "'{'", "'}'", 
			"'while'", "'not'", "'and'", "'or'", "'True'", "'False'", "'<'", "'>'", 
			"'<='", "'>='", "'!='", "'<>'", "'=='", "'if'", "'then'", "'else'", "'for'", 
			"';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"COMM", "COMMLIGNE", "COMMMULTI", "NEWLINE", "WS", "ENTIER", "OP", "TYPE", 
			"BOOL", "IDENTIFIANT", "UNMATCH"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Calculette.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


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

	public CalculetteParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public CalculContext calcul() {
			return getRuleContext(CalculContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CalculetteParser.EOF, 0); }
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			calcul();
			setState(31);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CalculContext extends ParserRuleContext {
		public String code;
		public DeclContext decl;
		public InstructionContext instruction;
		public List<TerminalNode> NEWLINE() { return getTokens(CalculetteParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CalculetteParser.NEWLINE, i);
		}
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public List<FinInstructionContext> finInstruction() {
			return getRuleContexts(FinInstructionContext.class);
		}
		public FinInstructionContext finInstruction(int i) {
			return getRuleContext(FinInstructionContext.class,i);
		}
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public CalculContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calcul; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).enterCalcul(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).exitCalcul(this);
		}
	}

	public final CalculContext calcul() throws RecognitionException {
		CalculContext _localctx = new CalculContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_calcul);
		 ((CalculContext)_localctx).code =  new String(); 
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(33);
					match(NEWLINE);
					}
					} 
				}
				setState(38);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TYPE) {
				{
				{
				setState(39);
				((CalculContext)_localctx).decl = decl();
				setState(40);
				finInstruction();
				 _localctx.code += ((CalculContext)_localctx).decl.code; 
				}
				}
				setState(47);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__6) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__17) | (1L << T__30) | (1L << T__33) | (1L << T__34) | (1L << NEWLINE) | (1L << ENTIER) | (1L << IDENTIFIANT))) != 0)) {
				{
				{
				setState(48);
				((CalculContext)_localctx).instruction = instruction();
				 _localctx.code += ((CalculContext)_localctx).instruction.code; 
				}
				}
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			 _localctx.code += "HALT\n"; 
			}
			_ctx.stop = _input.LT(-1);
			 System.out.println(_localctx.code); 
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclContext extends ParserRuleContext {
		public String code;
		public Token TYPE;
		public Token IDENTIFIANT;
		public ExpressionContext expression;
		public TerminalNode TYPE() { return getToken(CalculetteParser.TYPE, 0); }
		public TerminalNode IDENTIFIANT() { return getToken(CalculetteParser.IDENTIFIANT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).enterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).exitDecl(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_decl);
		try {
			setState(67);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				((DeclContext)_localctx).TYPE = match(TYPE);
				setState(59);
				((DeclContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);

				            // declaration de variable

				            tablesSymboles.addVarDecl((((DeclContext)_localctx).IDENTIFIANT!=null?((DeclContext)_localctx).IDENTIFIANT.getText():null),(((DeclContext)_localctx).TYPE!=null?((DeclContext)_localctx).TYPE.getText():null));
				            VariableInfo vi = tablesSymboles.getVar((((DeclContext)_localctx).IDENTIFIANT!=null?((DeclContext)_localctx).IDENTIFIANT.getText():null));
				            ((DeclContext)_localctx).code =  "PUSHI 0 \n";
				           
				        
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				((DeclContext)_localctx).TYPE = match(TYPE);
				setState(62);
				((DeclContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
				setState(63);
				match(T__0);
				setState(64);
				((DeclContext)_localctx).expression = expression(0);

				        tablesSymboles.addVarDecl((((DeclContext)_localctx).IDENTIFIANT!=null?((DeclContext)_localctx).IDENTIFIANT.getText():null),(((DeclContext)_localctx).TYPE!=null?((DeclContext)_localctx).TYPE.getText():null));
				        VariableInfo vi = tablesSymboles.getVar((((DeclContext)_localctx).IDENTIFIANT!=null?((DeclContext)_localctx).IDENTIFIANT.getText():null));
				        ((DeclContext)_localctx).code =  "PUSHI 0\n" + ((DeclContext)_localctx).expression.code + "STOREG " + vi.address+"\n";
				    
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstructionContext extends ParserRuleContext {
		public String code;
		public AssignationContext assignation;
		public ExpressionContext expression;
		public InputContext input;
		public OutputContext output;
		public BlocContext bloc;
		public BouclewhileContext bouclewhile;
		public BranchementsContext branchements;
		public BoucleForContext boucleFor;
		public AssignationContext assignation() {
			return getRuleContext(AssignationContext.class,0);
		}
		public FinInstructionContext finInstruction() {
			return getRuleContext(FinInstructionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public OutputContext output() {
			return getRuleContext(OutputContext.class,0);
		}
		public BlocContext bloc() {
			return getRuleContext(BlocContext.class,0);
		}
		public BouclewhileContext bouclewhile() {
			return getRuleContext(BouclewhileContext.class,0);
		}
		public BranchementsContext branchements() {
			return getRuleContext(BranchementsContext.class,0);
		}
		public BoucleForContext boucleFor() {
			return getRuleContext(BoucleForContext.class,0);
		}
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).enterInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).exitInstruction(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_instruction);
		try {
			setState(100);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				((InstructionContext)_localctx).assignation = assignation();
				setState(70);
				finInstruction();
				 
						// à compléter
				            ((InstructionContext)_localctx).code =  ((InstructionContext)_localctx).assignation.code;
				        
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				((InstructionContext)_localctx).expression = expression(0);
				setState(74);
				finInstruction();
				 
				            // à compléter
				            ((InstructionContext)_localctx).code =  ((InstructionContext)_localctx).expression.code;

				        
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(77);
				((InstructionContext)_localctx).input = input();
				setState(78);
				finInstruction();

				        ((InstructionContext)_localctx).code =  ((InstructionContext)_localctx).input.code;
				    
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(81);
				((InstructionContext)_localctx).output = output();
				setState(82);
				finInstruction();

				            ((InstructionContext)_localctx).code =  ((InstructionContext)_localctx).output.code;
				        
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(85);
				((InstructionContext)_localctx).bloc = bloc();

				         ((InstructionContext)_localctx).code =  ((InstructionContext)_localctx).bloc.code;
				      
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(88);
				((InstructionContext)_localctx).bouclewhile = bouclewhile();

				        ((InstructionContext)_localctx).code =  ((InstructionContext)_localctx).bouclewhile.code ;
				    
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(91);
				((InstructionContext)_localctx).branchements = branchements();

				        ((InstructionContext)_localctx).code =  ((InstructionContext)_localctx).branchements.code ;
				    
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(94);
				((InstructionContext)_localctx).boucleFor = boucleFor();

				        ((InstructionContext)_localctx).code =  ((InstructionContext)_localctx).boucleFor.code;
				    
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(97);
				finInstruction();

				            ((InstructionContext)_localctx).code =  "";
				        
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public String code;
		public ExpressionContext exp1;
		public ExpressionContext expression;
		public Token IDENTIFIANT;
		public Token ENTIER;
		public Token OP;
		public ExpressionContext exp2;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode IDENTIFIANT() { return getToken(CalculetteParser.IDENTIFIANT, 0); }
		public TerminalNode ENTIER() { return getToken(CalculetteParser.ENTIER, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				setState(103);
				match(T__1);
				setState(104);
				((ExpressionContext)_localctx).expression = expression(6);

				        ((ExpressionContext)_localctx).code =  "PUSHI 0 \n" + ((ExpressionContext)_localctx).expression.code + evalexpr("-");
				    
				}
				break;
			case T__6:
				{
				setState(107);
				match(T__6);
				setState(108);
				((ExpressionContext)_localctx).expression = expression(0);
				setState(109);
				match(T__7);

				        ((ExpressionContext)_localctx).code =  ((ExpressionContext)_localctx).expression.code;
				    
				}
				break;
			case IDENTIFIANT:
				{
				setState(112);
				((ExpressionContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);

				            VariableInfo vi = tablesSymboles.getVar((((ExpressionContext)_localctx).IDENTIFIANT!=null?((ExpressionContext)_localctx).IDENTIFIANT.getText():null));
				            ((ExpressionContext)_localctx).code =  "PUSHG " + vi.address+"\n";
				        
				}
				break;
			case ENTIER:
				{
				setState(114);
				((ExpressionContext)_localctx).ENTIER = match(ENTIER);

				        ((ExpressionContext)_localctx).code =  "PUSHI " + (((ExpressionContext)_localctx).ENTIER!=null?((ExpressionContext)_localctx).ENTIER.getText():null) + "\n";
				    
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(130);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(128);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.exp1 = _prevctx;
						_localctx.exp1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(118);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(119);
						((ExpressionContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4))) != 0)) ) {
							((ExpressionContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(120);
						((ExpressionContext)_localctx).exp2 = ((ExpressionContext)_localctx).expression = expression(6);

						              
						                  ((ExpressionContext)_localctx).code =  ((ExpressionContext)_localctx).exp1.code + ((ExpressionContext)_localctx).exp2.code + evalexpr((((ExpressionContext)_localctx).OP!=null?((ExpressionContext)_localctx).OP.getText():null));
						              
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.exp1 = _prevctx;
						_localctx.exp1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(123);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(124);
						((ExpressionContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__1 || _la==T__5) ) {
							((ExpressionContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(125);
						((ExpressionContext)_localctx).exp2 = ((ExpressionContext)_localctx).expression = expression(5);

						              
						                  ((ExpressionContext)_localctx).code =  ((ExpressionContext)_localctx).exp1.code + ((ExpressionContext)_localctx).exp2.code + evalexpr((((ExpressionContext)_localctx).OP!=null?((ExpressionContext)_localctx).OP.getText():null));
						              
						}
						break;
					}
					} 
				}
				setState(132);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AssignationContext extends ParserRuleContext {
		public String code;
		public Token IDENTIFIANT;
		public ExpressionContext expression;
		public Token OP;
		public TerminalNode IDENTIFIANT() { return getToken(CalculetteParser.IDENTIFIANT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).enterAssignation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).exitAssignation(this);
		}
	}

	public final AssignationContext assignation() throws RecognitionException {
		AssignationContext _localctx = new AssignationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assignation);
		int _la;
		try {
			setState(143);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				((AssignationContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
				setState(134);
				match(T__0);
				setState(135);
				((AssignationContext)_localctx).expression = expression(0);
				  
				            // à compléter
				            VariableInfo vi = tablesSymboles.getVar((((AssignationContext)_localctx).IDENTIFIANT!=null?((AssignationContext)_localctx).IDENTIFIANT.getText():null));
				            ((AssignationContext)_localctx).code =  ((AssignationContext)_localctx).expression.code + "STOREG " +vi.address+"\n";
				        
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(138);
				((AssignationContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
				setState(139);
				((AssignationContext)_localctx).OP = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12))) != 0)) ) {
					((AssignationContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(140);
				((AssignationContext)_localctx).expression = expression(0);


				         VariableInfo vi = tablesSymboles.getVar((((AssignationContext)_localctx).IDENTIFIANT!=null?((AssignationContext)_localctx).IDENTIFIANT.getText():null)); 
				           
				         ((AssignationContext)_localctx).code =  "PUSHG " + vi.address + "\n"+                                               
				                  ((AssignationContext)_localctx).expression.code + evalexpr(Character.toString((((AssignationContext)_localctx).OP!=null?((AssignationContext)_localctx).OP.getText():null).charAt(0)))+
				                  "STOREG " + vi.address +"\n";
				        
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InputContext extends ParserRuleContext {
		public String code;
		public Token IDENTIFIANT;
		public TerminalNode IDENTIFIANT() { return getToken(CalculetteParser.IDENTIFIANT, 0); }
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).enterInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).exitInput(this);
		}
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_input);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(T__13);
			setState(146);
			((InputContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
			setState(147);
			match(T__7);

			        VariableInfo vi = tablesSymboles.getVar((((InputContext)_localctx).IDENTIFIANT!=null?((InputContext)_localctx).IDENTIFIANT.getText():null));
			        ((InputContext)_localctx).code =  "READ \nSTOREG " + vi.address + "\n";
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OutputContext extends ParserRuleContext {
		public String code;
		public ExpressionContext expression;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public OutputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).enterOutput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).exitOutput(this);
		}
	}

	public final OutputContext output() throws RecognitionException {
		OutputContext _localctx = new OutputContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_output);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(T__14);
			setState(151);
			((OutputContext)_localctx).expression = expression(0);
			setState(152);
			match(T__7);


			        ((OutputContext)_localctx).code =  ((OutputContext)_localctx).expression.code + "WRITE\nPOP \n";

			     
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlocContext extends ParserRuleContext {
		public String code;
		public InstructionContext instruction;
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(CalculetteParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CalculetteParser.NEWLINE, i);
		}
		public BlocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).enterBloc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).exitBloc(this);
		}
	}

	public final BlocContext bloc() throws RecognitionException {
		BlocContext _localctx = new BlocContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_bloc);
		 ((BlocContext)_localctx).code =  new String(); 
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(T__15);
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__6) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__17) | (1L << T__30) | (1L << T__33) | (1L << T__34) | (1L << NEWLINE) | (1L << ENTIER) | (1L << IDENTIFIANT))) != 0)) {
				{
				{
				setState(156);
				((BlocContext)_localctx).instruction = instruction();
				 _localctx.code += ((BlocContext)_localctx).instruction.code; 
				}
				}
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(164);
			match(T__16);
			setState(168);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(165);
					match(NEWLINE);
					}
					} 
				}
				setState(170);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BouclewhileContext extends ParserRuleContext {
		public String code;
		public ConditionContext condition;
		public InstructionContext instruction;
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public BouclewhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bouclewhile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).enterBouclewhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).exitBouclewhile(this);
		}
	}

	public final BouclewhileContext bouclewhile() throws RecognitionException {
		BouclewhileContext _localctx = new BouclewhileContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_bouclewhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(T__17);
			setState(172);
			match(T__6);
			setState(173);
			((BouclewhileContext)_localctx).condition = condition(0);
			setState(174);
			match(T__7);
			setState(175);
			((BouclewhileContext)_localctx).instruction = instruction();

			        String debut = newLabel();
			        String fin = newLabel();
			        ((BouclewhileContext)_localctx).code =  "LABEL " + debut + ((BouclewhileContext)_localctx).condition.code + "JUMPF " + fin + ((BouclewhileContext)_localctx).instruction.code + "JUMP " + debut + "LABEL " + fin ; 
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionContext extends ParserRuleContext {
		public String code;
		public ConditionContext a;
		public ConditionContext condition;
		public OperationRationelleContext operationRationelle;
		public ConditionContext b;
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public OperationRationelleContext operationRationelle() {
			return getRuleContext(OperationRationelleContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		return condition(0);
	}

	private ConditionContext condition(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionContext _localctx = new ConditionContext(_ctx, _parentState);
		ConditionContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_condition, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__18:
				{
				setState(179);
				match(T__18);
				setState(180);
				((ConditionContext)_localctx).condition = condition(6);

				            ((ConditionContext)_localctx).code =  ((ConditionContext)_localctx).condition.code + "PUSHI 1\nNEQ\n";
				        
				}
				break;
			case T__21:
				{
				setState(183);
				match(T__21);

				            ((ConditionContext)_localctx).code =   "PUSHI 1\n";
				        
				}
				break;
			case T__22:
				{
				setState(185);
				match(T__22);

				           ((ConditionContext)_localctx).code =   "PUSHI 0\n"; 
				        
				}
				break;
			case T__1:
			case T__6:
			case ENTIER:
			case IDENTIFIANT:
				{
				setState(187);
				((ConditionContext)_localctx).operationRationelle = operationRationelle();

				            ((ConditionContext)_localctx).code =  ((ConditionContext)_localctx).operationRationelle.code;
				        
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(204);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(202);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new ConditionContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(192);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(193);
						match(T__19);
						setState(194);
						((ConditionContext)_localctx).b = ((ConditionContext)_localctx).condition = condition(6);

						                      ((ConditionContext)_localctx).code =  ((ConditionContext)_localctx).a.code + ((ConditionContext)_localctx).b.code + "MUL\n";
						                  
						}
						break;
					case 2:
						{
						_localctx = new ConditionContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(197);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(198);
						match(T__20);
						setState(199);
						((ConditionContext)_localctx).b = ((ConditionContext)_localctx).condition = condition(5);

						                  ((ConditionContext)_localctx).code =  ((ConditionContext)_localctx).a.code + ((ConditionContext)_localctx).b.code + "ADD\nPUSHI 0\nSUP\n";
						                  
						}
						break;
					}
					} 
				}
				setState(206);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class OperationRationelleContext extends ParserRuleContext {
		public String code;
		public ExpressionContext a;
		public Token OP;
		public ExpressionContext b;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public OperationRationelleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operationRationelle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).enterOperationRationelle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).exitOperationRationelle(this);
		}
	}

	public final OperationRationelleContext operationRationelle() throws RecognitionException {
		OperationRationelleContext _localctx = new OperationRationelleContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_operationRationelle);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			((OperationRationelleContext)_localctx).a = expression(0);
			setState(208);
			((OperationRationelleContext)_localctx).OP = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29))) != 0)) ) {
				((OperationRationelleContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(209);
			((OperationRationelleContext)_localctx).b = expression(0);

			            ((OperationRationelleContext)_localctx).code =  ((OperationRationelleContext)_localctx).a.code + ((OperationRationelleContext)_localctx).b.code + evalexpr( (String) (((OperationRationelleContext)_localctx).OP!=null?((OperationRationelleContext)_localctx).OP.getText():null));
			        
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BranchementsContext extends ParserRuleContext {
		public String code;
		public ConditionContext condition;
		public InstructionContext instruction;
		public InstructionContext a;
		public InstructionContext b;
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(CalculetteParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CalculetteParser.NEWLINE, i);
		}
		public BranchementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_branchements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).enterBranchements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).exitBranchements(this);
		}
	}

	public final BranchementsContext branchements() throws RecognitionException {
		BranchementsContext _localctx = new BranchementsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_branchements);
		int _la;
		try {
			setState(235);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(212);
				match(T__30);
				setState(213);
				match(T__6);
				setState(214);
				((BranchementsContext)_localctx).condition = condition(0);
				setState(215);
				match(T__7);
				setState(216);
				match(T__31);
				setState(217);
				((BranchementsContext)_localctx).instruction = instruction();

				            String sifaux = newLabel();
				            ((BranchementsContext)_localctx).code =  ((BranchementsContext)_localctx).condition.code +"JUMPF " + sifaux + ((BranchementsContext)_localctx).instruction.code +  "LABEL " + sifaux;
				        
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(220);
				match(T__30);
				setState(221);
				match(T__6);
				setState(222);
				((BranchementsContext)_localctx).condition = condition(0);
				setState(223);
				match(T__7);
				setState(224);
				match(T__31);
				setState(225);
				((BranchementsContext)_localctx).a = instruction();
				setState(227); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(226);
					match(NEWLINE);
					}
					}
					setState(229); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				setState(231);
				match(T__32);
				setState(232);
				((BranchementsContext)_localctx).b = instruction();

				             String sinon = newLabel();
				            ((BranchementsContext)_localctx).code =  ((BranchementsContext)_localctx).condition.code + "JUMPF " + sinon + ((BranchementsContext)_localctx).a.code + "LABEL " + sinon +  ((BranchementsContext)_localctx).b.code;
				        
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BoucleForContext extends ParserRuleContext {
		public String code;
		public AssignationContext a;
		public ConditionContext condition;
		public AssignationContext b;
		public InstructionContext instruction;
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public List<AssignationContext> assignation() {
			return getRuleContexts(AssignationContext.class);
		}
		public AssignationContext assignation(int i) {
			return getRuleContext(AssignationContext.class,i);
		}
		public BoucleForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boucleFor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).enterBoucleFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).exitBoucleFor(this);
		}
	}

	public final BoucleForContext boucleFor() throws RecognitionException {
		BoucleForContext _localctx = new BoucleForContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_boucleFor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(T__33);
			setState(238);
			match(T__6);
			setState(239);
			((BoucleForContext)_localctx).a = assignation();
			setState(240);
			match(T__34);
			setState(241);
			((BoucleForContext)_localctx).condition = condition(0);
			setState(242);
			match(T__34);
			setState(243);
			((BoucleForContext)_localctx).b = assignation();
			setState(244);
			match(T__7);
			setState(245);
			((BoucleForContext)_localctx).instruction = instruction();

			        ((BoucleForContext)_localctx).code =  ((BoucleForContext)_localctx).a.code + ((BoucleForContext)_localctx).condition.code + ((BoucleForContext)_localctx).b.code + ((BoucleForContext)_localctx).instruction.code;
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FinInstructionContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(CalculetteParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CalculetteParser.NEWLINE, i);
		}
		public FinInstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finInstruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).enterFinInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).exitFinInstruction(this);
		}
	}

	public final FinInstructionContext finInstruction() throws RecognitionException {
		FinInstructionContext _localctx = new FinInstructionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_finInstruction);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(249); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(248);
					_la = _input.LA(1);
					if ( !(_la==T__34 || _la==NEWLINE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(251); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 10:
			return condition_sempred((ConditionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean condition_sempred(ConditionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\60\u0100\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\3\7"+
		"\3%\n\3\f\3\16\3(\13\3\3\3\3\3\3\3\3\3\7\3.\n\3\f\3\16\3\61\13\3\3\3\3"+
		"\3\3\3\7\3\66\n\3\f\3\16\39\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\5\4F\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\5\5g\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6"+
		"w\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u0083\n\6\f\6\16\6\u0086"+
		"\13\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0092\n\7\3\b\3\b\3"+
		"\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\7\n\u00a2\n\n\f\n\16\n"+
		"\u00a5\13\n\3\n\3\n\7\n\u00a9\n\n\f\n\16\n\u00ac\13\n\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f"+
		"\u00c1\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00cd\n\f\f\f\16"+
		"\f\u00d0\13\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\6\16\u00e6\n\16\r\16\16\16\u00e7"+
		"\3\16\3\16\3\16\3\16\5\16\u00ee\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\20\6\20\u00fc\n\20\r\20\16\20\u00fd\3\20\2\4\n"+
		"\26\21\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36\2\7\3\2\5\7\4\2\4\4\b\b"+
		"\3\2\13\17\3\2\32 \4\2%%))\2\u010c\2 \3\2\2\2\4&\3\2\2\2\6E\3\2\2\2\b"+
		"f\3\2\2\2\nv\3\2\2\2\f\u0091\3\2\2\2\16\u0093\3\2\2\2\20\u0098\3\2\2\2"+
		"\22\u009d\3\2\2\2\24\u00ad\3\2\2\2\26\u00c0\3\2\2\2\30\u00d1\3\2\2\2\32"+
		"\u00ed\3\2\2\2\34\u00ef\3\2\2\2\36\u00fb\3\2\2\2 !\5\4\3\2!\"\7\2\2\3"+
		"\"\3\3\2\2\2#%\7)\2\2$#\3\2\2\2%(\3\2\2\2&$\3\2\2\2&\'\3\2\2\2\'/\3\2"+
		"\2\2(&\3\2\2\2)*\5\6\4\2*+\5\36\20\2+,\b\3\1\2,.\3\2\2\2-)\3\2\2\2.\61"+
		"\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\67\3\2\2\2\61/\3\2\2\2\62\63\5\b\5\2"+
		"\63\64\b\3\1\2\64\66\3\2\2\2\65\62\3\2\2\2\669\3\2\2\2\67\65\3\2\2\2\67"+
		"8\3\2\2\28:\3\2\2\29\67\3\2\2\2:;\b\3\1\2;\5\3\2\2\2<=\7-\2\2=>\7/\2\2"+
		">F\b\4\1\2?@\7-\2\2@A\7/\2\2AB\7\3\2\2BC\5\n\6\2CD\b\4\1\2DF\3\2\2\2E"+
		"<\3\2\2\2E?\3\2\2\2F\7\3\2\2\2GH\5\f\7\2HI\5\36\20\2IJ\b\5\1\2Jg\3\2\2"+
		"\2KL\5\n\6\2LM\5\36\20\2MN\b\5\1\2Ng\3\2\2\2OP\5\16\b\2PQ\5\36\20\2QR"+
		"\b\5\1\2Rg\3\2\2\2ST\5\20\t\2TU\5\36\20\2UV\b\5\1\2Vg\3\2\2\2WX\5\22\n"+
		"\2XY\b\5\1\2Yg\3\2\2\2Z[\5\24\13\2[\\\b\5\1\2\\g\3\2\2\2]^\5\32\16\2^"+
		"_\b\5\1\2_g\3\2\2\2`a\5\34\17\2ab\b\5\1\2bg\3\2\2\2cd\5\36\20\2de\b\5"+
		"\1\2eg\3\2\2\2fG\3\2\2\2fK\3\2\2\2fO\3\2\2\2fS\3\2\2\2fW\3\2\2\2fZ\3\2"+
		"\2\2f]\3\2\2\2f`\3\2\2\2fc\3\2\2\2g\t\3\2\2\2hi\b\6\1\2ij\7\4\2\2jk\5"+
		"\n\6\bkl\b\6\1\2lw\3\2\2\2mn\7\t\2\2no\5\n\6\2op\7\n\2\2pq\b\6\1\2qw\3"+
		"\2\2\2rs\7/\2\2sw\b\6\1\2tu\7+\2\2uw\b\6\1\2vh\3\2\2\2vm\3\2\2\2vr\3\2"+
		"\2\2vt\3\2\2\2w\u0084\3\2\2\2xy\f\7\2\2yz\t\2\2\2z{\5\n\6\b{|\b\6\1\2"+
		"|\u0083\3\2\2\2}~\f\6\2\2~\177\t\3\2\2\177\u0080\5\n\6\7\u0080\u0081\b"+
		"\6\1\2\u0081\u0083\3\2\2\2\u0082x\3\2\2\2\u0082}\3\2\2\2\u0083\u0086\3"+
		"\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\13\3\2\2\2\u0086"+
		"\u0084\3\2\2\2\u0087\u0088\7/\2\2\u0088\u0089\7\3\2\2\u0089\u008a\5\n"+
		"\6\2\u008a\u008b\b\7\1\2\u008b\u0092\3\2\2\2\u008c\u008d\7/\2\2\u008d"+
		"\u008e\t\4\2\2\u008e\u008f\5\n\6\2\u008f\u0090\b\7\1\2\u0090\u0092\3\2"+
		"\2\2\u0091\u0087\3\2\2\2\u0091\u008c\3\2\2\2\u0092\r\3\2\2\2\u0093\u0094"+
		"\7\20\2\2\u0094\u0095\7/\2\2\u0095\u0096\7\n\2\2\u0096\u0097\b\b\1\2\u0097"+
		"\17\3\2\2\2\u0098\u0099\7\21\2\2\u0099\u009a\5\n\6\2\u009a\u009b\7\n\2"+
		"\2\u009b\u009c\b\t\1\2\u009c\21\3\2\2\2\u009d\u00a3\7\22\2\2\u009e\u009f"+
		"\5\b\5\2\u009f\u00a0\b\n\1\2\u00a0\u00a2\3\2\2\2\u00a1\u009e\3\2\2\2\u00a2"+
		"\u00a5\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a6\3\2"+
		"\2\2\u00a5\u00a3\3\2\2\2\u00a6\u00aa\7\23\2\2\u00a7\u00a9\7)\2\2\u00a8"+
		"\u00a7\3\2\2\2\u00a9\u00ac\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2"+
		"\2\2\u00ab\23\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad\u00ae\7\24\2\2\u00ae\u00af"+
		"\7\t\2\2\u00af\u00b0\5\26\f\2\u00b0\u00b1\7\n\2\2\u00b1\u00b2\5\b\5\2"+
		"\u00b2\u00b3\b\13\1\2\u00b3\25\3\2\2\2\u00b4\u00b5\b\f\1\2\u00b5\u00b6"+
		"\7\25\2\2\u00b6\u00b7\5\26\f\b\u00b7\u00b8\b\f\1\2\u00b8\u00c1\3\2\2\2"+
		"\u00b9\u00ba\7\30\2\2\u00ba\u00c1\b\f\1\2\u00bb\u00bc\7\31\2\2\u00bc\u00c1"+
		"\b\f\1\2\u00bd\u00be\5\30\r\2\u00be\u00bf\b\f\1\2\u00bf\u00c1\3\2\2\2"+
		"\u00c0\u00b4\3\2\2\2\u00c0\u00b9\3\2\2\2\u00c0\u00bb\3\2\2\2\u00c0\u00bd"+
		"\3\2\2\2\u00c1\u00ce\3\2\2\2\u00c2\u00c3\f\7\2\2\u00c3\u00c4\7\26\2\2"+
		"\u00c4\u00c5\5\26\f\b\u00c5\u00c6\b\f\1\2\u00c6\u00cd\3\2\2\2\u00c7\u00c8"+
		"\f\6\2\2\u00c8\u00c9\7\27\2\2\u00c9\u00ca\5\26\f\7\u00ca\u00cb\b\f\1\2"+
		"\u00cb\u00cd\3\2\2\2\u00cc\u00c2\3\2\2\2\u00cc\u00c7\3\2\2\2\u00cd\u00d0"+
		"\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\27\3\2\2\2\u00d0"+
		"\u00ce\3\2\2\2\u00d1\u00d2\5\n\6\2\u00d2\u00d3\t\5\2\2\u00d3\u00d4\5\n"+
		"\6\2\u00d4\u00d5\b\r\1\2\u00d5\31\3\2\2\2\u00d6\u00d7\7!\2\2\u00d7\u00d8"+
		"\7\t\2\2\u00d8\u00d9\5\26\f\2\u00d9\u00da\7\n\2\2\u00da\u00db\7\"\2\2"+
		"\u00db\u00dc\5\b\5\2\u00dc\u00dd\b\16\1\2\u00dd\u00ee\3\2\2\2\u00de\u00df"+
		"\7!\2\2\u00df\u00e0\7\t\2\2\u00e0\u00e1\5\26\f\2\u00e1\u00e2\7\n\2\2\u00e2"+
		"\u00e3\7\"\2\2\u00e3\u00e5\5\b\5\2\u00e4\u00e6\7)\2\2\u00e5\u00e4\3\2"+
		"\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8"+
		"\u00e9\3\2\2\2\u00e9\u00ea\7#\2\2\u00ea\u00eb\5\b\5\2\u00eb\u00ec\b\16"+
		"\1\2\u00ec\u00ee\3\2\2\2\u00ed\u00d6\3\2\2\2\u00ed\u00de\3\2\2\2\u00ee"+
		"\33\3\2\2\2\u00ef\u00f0\7$\2\2\u00f0\u00f1\7\t\2\2\u00f1\u00f2\5\f\7\2"+
		"\u00f2\u00f3\7%\2\2\u00f3\u00f4\5\26\f\2\u00f4\u00f5\7%\2\2\u00f5\u00f6"+
		"\5\f\7\2\u00f6\u00f7\7\n\2\2\u00f7\u00f8\5\b\5\2\u00f8\u00f9\b\17\1\2"+
		"\u00f9\35\3\2\2\2\u00fa\u00fc\t\6\2\2\u00fb\u00fa\3\2\2\2\u00fc\u00fd"+
		"\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\37\3\2\2\2\23&"+
		"/\67Efv\u0082\u0084\u0091\u00a3\u00aa\u00c0\u00cc\u00ce\u00e7\u00ed\u00fd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}