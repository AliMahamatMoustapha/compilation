// Generated from Calculette.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CalculetteLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
			"T__33", "T__34", "COMM", "COMMLIGNE", "COMMMULTI", "NEWLINE", "WS", 
			"ENTIER", "OP", "TYPE", "BOOL", "IDENTIFIANT", "UNMATCH"
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


	public CalculetteLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Calculette.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\60\u012a\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7"+
		"\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3"+
		"\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3"+
		"\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3"+
		"\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3"+
		" \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3$\3$\3%\3%\7%"+
		"\u00d6\n%\f%\16%\u00d9\13%\3%\3%\3&\3&\3&\3&\7&\u00e1\n&\f&\16&\u00e4"+
		"\13&\3&\3&\3\'\3\'\3\'\3\'\7\'\u00ec\n\'\f\'\16\'\u00ef\13\'\3\'\3\'\3"+
		"\'\3\'\3\'\3(\5(\u00f7\n(\3(\3(\3)\6)\u00fc\n)\r)\16)\u00fd\3)\3)\3*\6"+
		"*\u0103\n*\r*\16*\u0104\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3,\5,\u0112\n,\3"+
		"-\3-\3-\3-\3-\3-\3-\3-\3-\5-\u011d\n-\3.\3.\3.\7.\u0122\n.\f.\16.\u0125"+
		"\13.\3/\3/\3/\3/\3\u00ed\2\60\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61"+
		"\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60\3"+
		"\2\6\3\2\f\f\4\2\13\13\"\"\6\2\'\',-//\61\61\5\2C\\aac|\2\u0133\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3"+
		"\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2"+
		"%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61"+
		"\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2"+
		"\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I"+
		"\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2"+
		"\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\3_\3\2\2\2\5a\3\2\2\2"+
		"\7c\3\2\2\2\te\3\2\2\2\13g\3\2\2\2\ri\3\2\2\2\17k\3\2\2\2\21m\3\2\2\2"+
		"\23o\3\2\2\2\25r\3\2\2\2\27u\3\2\2\2\31x\3\2\2\2\33{\3\2\2\2\35~\3\2\2"+
		"\2\37\u0085\3\2\2\2!\u008d\3\2\2\2#\u008f\3\2\2\2%\u0091\3\2\2\2\'\u0097"+
		"\3\2\2\2)\u009b\3\2\2\2+\u009f\3\2\2\2-\u00a2\3\2\2\2/\u00a7\3\2\2\2\61"+
		"\u00ad\3\2\2\2\63\u00af\3\2\2\2\65\u00b1\3\2\2\2\67\u00b4\3\2\2\29\u00b7"+
		"\3\2\2\2;\u00ba\3\2\2\2=\u00bd\3\2\2\2?\u00c0\3\2\2\2A\u00c3\3\2\2\2C"+
		"\u00c8\3\2\2\2E\u00cd\3\2\2\2G\u00d1\3\2\2\2I\u00d3\3\2\2\2K\u00dc\3\2"+
		"\2\2M\u00e7\3\2\2\2O\u00f6\3\2\2\2Q\u00fb\3\2\2\2S\u0102\3\2\2\2U\u0106"+
		"\3\2\2\2W\u0111\3\2\2\2Y\u011c\3\2\2\2[\u011e\3\2\2\2]\u0126\3\2\2\2_"+
		"`\7?\2\2`\4\3\2\2\2ab\7/\2\2b\6\3\2\2\2cd\7,\2\2d\b\3\2\2\2ef\7\61\2\2"+
		"f\n\3\2\2\2gh\7\'\2\2h\f\3\2\2\2ij\7-\2\2j\16\3\2\2\2kl\7*\2\2l\20\3\2"+
		"\2\2mn\7+\2\2n\22\3\2\2\2op\7,\2\2pq\7?\2\2q\24\3\2\2\2rs\7\61\2\2st\7"+
		"?\2\2t\26\3\2\2\2uv\7\'\2\2vw\7?\2\2w\30\3\2\2\2xy\7/\2\2yz\7?\2\2z\32"+
		"\3\2\2\2{|\7-\2\2|}\7?\2\2}\34\3\2\2\2~\177\7k\2\2\177\u0080\7p\2\2\u0080"+
		"\u0081\7r\2\2\u0081\u0082\7w\2\2\u0082\u0083\7v\2\2\u0083\u0084\7*\2\2"+
		"\u0084\36\3\2\2\2\u0085\u0086\7q\2\2\u0086\u0087\7w\2\2\u0087\u0088\7"+
		"v\2\2\u0088\u0089\7r\2\2\u0089\u008a\7w\2\2\u008a\u008b\7v\2\2\u008b\u008c"+
		"\7*\2\2\u008c \3\2\2\2\u008d\u008e\7}\2\2\u008e\"\3\2\2\2\u008f\u0090"+
		"\7\177\2\2\u0090$\3\2\2\2\u0091\u0092\7y\2\2\u0092\u0093\7j\2\2\u0093"+
		"\u0094\7k\2\2\u0094\u0095\7n\2\2\u0095\u0096\7g\2\2\u0096&\3\2\2\2\u0097"+
		"\u0098\7p\2\2\u0098\u0099\7q\2\2\u0099\u009a\7v\2\2\u009a(\3\2\2\2\u009b"+
		"\u009c\7c\2\2\u009c\u009d\7p\2\2\u009d\u009e\7f\2\2\u009e*\3\2\2\2\u009f"+
		"\u00a0\7q\2\2\u00a0\u00a1\7t\2\2\u00a1,\3\2\2\2\u00a2\u00a3\7V\2\2\u00a3"+
		"\u00a4\7t\2\2\u00a4\u00a5\7w\2\2\u00a5\u00a6\7g\2\2\u00a6.\3\2\2\2\u00a7"+
		"\u00a8\7H\2\2\u00a8\u00a9\7c\2\2\u00a9\u00aa\7n\2\2\u00aa\u00ab\7u\2\2"+
		"\u00ab\u00ac\7g\2\2\u00ac\60\3\2\2\2\u00ad\u00ae\7>\2\2\u00ae\62\3\2\2"+
		"\2\u00af\u00b0\7@\2\2\u00b0\64\3\2\2\2\u00b1\u00b2\7>\2\2\u00b2\u00b3"+
		"\7?\2\2\u00b3\66\3\2\2\2\u00b4\u00b5\7@\2\2\u00b5\u00b6\7?\2\2\u00b68"+
		"\3\2\2\2\u00b7\u00b8\7#\2\2\u00b8\u00b9\7?\2\2\u00b9:\3\2\2\2\u00ba\u00bb"+
		"\7>\2\2\u00bb\u00bc\7@\2\2\u00bc<\3\2\2\2\u00bd\u00be\7?\2\2\u00be\u00bf"+
		"\7?\2\2\u00bf>\3\2\2\2\u00c0\u00c1\7k\2\2\u00c1\u00c2\7h\2\2\u00c2@\3"+
		"\2\2\2\u00c3\u00c4\7v\2\2\u00c4\u00c5\7j\2\2\u00c5\u00c6\7g\2\2\u00c6"+
		"\u00c7\7p\2\2\u00c7B\3\2\2\2\u00c8\u00c9\7g\2\2\u00c9\u00ca\7n\2\2\u00ca"+
		"\u00cb\7u\2\2\u00cb\u00cc\7g\2\2\u00ccD\3\2\2\2\u00cd\u00ce\7h\2\2\u00ce"+
		"\u00cf\7q\2\2\u00cf\u00d0\7t\2\2\u00d0F\3\2\2\2\u00d1\u00d2\7=\2\2\u00d2"+
		"H\3\2\2\2\u00d3\u00d7\7%\2\2\u00d4\u00d6\n\2\2\2\u00d5\u00d4\3\2\2\2\u00d6"+
		"\u00d9\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00da\3\2"+
		"\2\2\u00d9\u00d7\3\2\2\2\u00da\u00db\b%\2\2\u00dbJ\3\2\2\2\u00dc\u00dd"+
		"\7\61\2\2\u00dd\u00de\7\61\2\2\u00de\u00e2\3\2\2\2\u00df\u00e1\n\2\2\2"+
		"\u00e0\u00df\3\2\2\2\u00e1\u00e4\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3"+
		"\3\2\2\2\u00e3\u00e5\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5\u00e6\b&\2\2\u00e6"+
		"L\3\2\2\2\u00e7\u00e8\7\61\2\2\u00e8\u00e9\7,\2\2\u00e9\u00ed\3\2\2\2"+
		"\u00ea\u00ec\13\2\2\2\u00eb\u00ea\3\2\2\2\u00ec\u00ef\3\2\2\2\u00ed\u00ee"+
		"\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ee\u00f0\3\2\2\2\u00ef\u00ed\3\2\2\2\u00f0"+
		"\u00f1\7,\2\2\u00f1\u00f2\7\61\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f4\b\'"+
		"\2\2\u00f4N\3\2\2\2\u00f5\u00f7\7\17\2\2\u00f6\u00f5\3\2\2\2\u00f6\u00f7"+
		"\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00f9\7\f\2\2\u00f9P\3\2\2\2\u00fa"+
		"\u00fc\t\3\2\2\u00fb\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fb\3\2"+
		"\2\2\u00fd\u00fe\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0100\b)\2\2\u0100"+
		"R\3\2\2\2\u0101\u0103\4\62;\2\u0102\u0101\3\2\2\2\u0103\u0104\3\2\2\2"+
		"\u0104\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105T\3\2\2\2\u0106\u0107\t"+
		"\4\2\2\u0107V\3\2\2\2\u0108\u0109\7k\2\2\u0109\u010a\7p\2\2\u010a\u0112"+
		"\7v\2\2\u010b\u010c\7f\2\2\u010c\u010d\7q\2\2\u010d\u010e\7w\2\2\u010e"+
		"\u010f\7d\2\2\u010f\u0110\7n\2\2\u0110\u0112\7g\2\2\u0111\u0108\3\2\2"+
		"\2\u0111\u010b\3\2\2\2\u0112X\3\2\2\2\u0113\u0114\7V\2\2\u0114\u0115\7"+
		"t\2\2\u0115\u0116\7w\2\2\u0116\u011d\7g\2\2\u0117\u0118\7H\2\2\u0118\u0119"+
		"\7c\2\2\u0119\u011a\7n\2\2\u011a\u011b\7u\2\2\u011b\u011d\7g\2\2\u011c"+
		"\u0113\3\2\2\2\u011c\u0117\3\2\2\2\u011dZ\3\2\2\2\u011e\u0123\t\5\2\2"+
		"\u011f\u0122\t\5\2\2\u0120\u0122\5S*\2\u0121\u011f\3\2\2\2\u0121\u0120"+
		"\3\2\2\2\u0122\u0125\3\2\2\2\u0123\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124"+
		"\\\3\2\2\2\u0125\u0123\3\2\2\2\u0126\u0127\13\2\2\2\u0127\u0128\3\2\2"+
		"\2\u0128\u0129\b/\2\2\u0129^\3\2\2\2\r\2\u00d7\u00e2\u00ed\u00f6\u00fd"+
		"\u0104\u0111\u011c\u0121\u0123\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}