/* The following code was generated by JFlex 1.7.0 tweaked for IntelliJ platform */

package org.intellij.sdk.language;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import org.intellij.sdk.language.psi.PascalTypes;
import com.intellij.psi.TokenType;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0
 * from the specification file <tt>Pascal.flex</tt>
 */
class PascalLexer implements FlexLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int WAITING_PROGRAM_NAME = 2;
  public static final int WAITING_WHITE_SPACE_P = 4;
  public static final int WAITING_PROGRAM_DEF_END = 6;
  public static final int VAR_DEF = 8;
  public static final int WAITING_WHITE_SPACE_V = 10;
  public static final int WAITING_VARIABLES_V = 12;
  public static final int WAITING_VARIABLES_C = 14;
  public static final int WAITING_COLON = 16;
  public static final int WAITING_TYPE = 18;
  public static final int WAITING_VARIABLES_DEF_END = 20;
  public static final int WAITING_EXPR_END = 22;
  public static final int WAITING_BEGIN = 24;
  public static final int END = 26;
  public static final int EXPRESSION_BEGIN = 28;
  public static final int WAITING_OPEN_BRACKET_R = 30;
  public static final int WAITING_CLOSE_BRACKET = 32;
  public static final int WAITING_OPEN_BRACKET_W = 34;
  public static final int ASSIGNMENT = 36;
  public static final int WAITING_WRITE_DATA = 38;
  public static final int WAITING_VARIABLE = 40;
  public static final int WAITING_VALUE_F = 42;
  public static final int WAITING_VALUE_S = 44;
  public static final int WAITING_ARITHM_EXPR_OR_END = 46;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2,  2,  3,  3,  4,  4,  5,  5,  6,  6,  7,  7, 
     8,  8,  9,  9, 10, 10, 11, 11, 12, 12,  8,  8, 13, 13, 14, 14, 
    15, 15, 16, 16, 17, 17, 18, 18, 19, 19, 20, 20, 21, 21, 22, 22
  };

  /** 
   * Translates characters to character classes
   * Chosen bits are [11, 6, 4]
   * Total runtime size is 14240 bytes
   */
  public static int ZZ_CMAP(int ch) {
    return ZZ_CMAP_A[(ZZ_CMAP_Y[(ZZ_CMAP_Z[ch>>10]<<6)|((ch>>4)&0x3f)]<<4)|(ch&0xf)];
  }

  /* The ZZ_CMAP_Z table has 1088 entries */
  static final char ZZ_CMAP_Z[] = zzUnpackCMap(
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\2\11\1\12\1\13\6\14\1\15\23\14\1\16"+
    "\1\14\1\17\1\20\12\14\1\21\10\11\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1"+
    "\32\1\33\1\34\1\35\2\11\1\14\1\36\3\11\1\37\10\11\1\40\1\41\5\14\1\42\1\43"+
    "\11\11\1\44\2\11\1\45\5\11\1\46\4\11\1\47\1\50\4\11\51\14\1\51\3\14\1\52\1"+
    "\53\4\14\1\54\12\11\1\55\u0381\11");

  /* The ZZ_CMAP_Y table has 2944 entries */
  static final char ZZ_CMAP_Y[] = zzUnpackCMap(
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\2\1\1\10\1\11\1\12\1\13\1\12\1\13\34\12\1"+
    "\14\1\15\1\16\10\1\1\17\1\20\1\12\1\21\4\12\1\22\10\12\1\23\12\12\1\4\1\12"+
    "\1\24\1\4\1\12\1\25\4\1\1\12\1\26\1\27\2\1\2\12\1\26\1\1\1\30\1\4\5\12\1\31"+
    "\1\32\1\33\1\1\1\34\1\12\1\1\1\35\5\12\1\36\1\37\1\40\1\12\1\26\1\41\1\12"+
    "\1\42\1\43\1\1\1\12\1\44\4\1\1\12\1\45\4\1\1\46\2\12\1\47\1\1\1\50\1\51\1"+
    "\4\1\52\1\53\1\54\1\55\1\56\1\57\1\51\1\15\1\60\1\53\1\54\1\61\1\1\1\62\1"+
    "\63\1\64\1\65\1\21\1\54\1\66\1\1\1\67\1\51\1\70\1\71\1\53\1\54\1\66\1\1\1"+
    "\57\1\51\1\37\1\72\1\73\1\74\1\75\1\1\1\67\1\63\1\1\1\76\1\34\1\54\1\47\1"+
    "\1\1\77\1\51\1\1\1\100\1\34\1\54\1\101\1\1\1\56\1\51\1\102\1\76\1\34\1\12"+
    "\1\103\1\56\1\104\1\51\1\105\1\106\1\107\1\12\1\110\1\111\1\1\1\63\1\1\1\4"+
    "\2\12\1\112\1\111\1\113\2\1\1\114\1\115\1\116\1\117\1\120\1\121\2\1\1\67\1"+
    "\1\1\113\1\1\1\122\1\12\1\123\1\1\1\124\7\1\2\12\1\26\1\125\1\113\1\126\1"+
    "\127\1\130\1\131\1\113\2\12\1\132\2\12\1\133\24\12\1\134\1\135\2\12\1\134"+
    "\2\12\1\136\1\137\1\13\3\12\1\137\3\12\1\26\2\1\1\12\1\1\5\12\1\140\1\4\45"+
    "\12\1\141\1\12\1\4\1\26\4\12\1\26\1\142\1\143\1\15\1\12\1\15\1\12\1\15\1\143"+
    "\1\67\3\12\1\144\1\1\1\145\1\113\2\1\1\113\5\12\1\25\1\146\1\12\1\147\4\12"+
    "\1\36\1\12\1\150\2\1\1\63\1\12\1\151\1\152\2\12\1\153\1\12\1\75\1\113\2\1"+
    "\1\12\1\111\3\12\1\152\2\1\2\113\1\154\5\1\1\106\2\12\1\144\1\155\1\113\2"+
    "\1\1\156\1\12\1\157\1\40\2\12\1\36\1\1\2\12\1\144\1\1\1\160\1\40\1\12\1\151"+
    "\1\44\5\1\1\161\1\162\14\12\4\1\21\12\1\140\2\12\1\140\1\163\1\12\1\151\3"+
    "\12\1\164\1\165\1\166\1\123\1\165\7\1\1\167\1\1\1\123\6\1\1\170\1\171\1\172"+
    "\1\173\1\174\3\1\1\175\147\1\2\12\1\150\2\12\1\150\10\12\1\176\1\177\2\12"+
    "\1\132\3\12\1\200\1\1\1\12\1\111\4\201\4\1\1\125\35\1\1\202\2\1\1\203\1\4"+
    "\4\12\1\204\1\4\4\12\1\133\1\106\1\12\1\151\1\4\4\12\1\150\1\1\1\12\1\26\3"+
    "\1\1\12\40\1\133\12\1\36\4\1\135\12\1\36\2\1\10\12\1\123\4\1\2\12\1\151\20"+
    "\12\1\123\1\12\1\205\1\1\2\12\1\150\1\125\1\12\1\151\4\12\1\36\2\1\1\206\1"+
    "\207\5\12\1\210\1\12\1\150\1\25\3\1\1\206\1\211\1\12\1\27\1\1\3\12\1\144\1"+
    "\207\2\12\1\144\1\1\1\113\1\1\1\212\1\40\1\12\1\36\1\12\1\111\1\1\1\12\1\123"+
    "\1\46\2\12\1\27\1\125\1\113\1\213\1\214\2\12\1\44\1\1\1\215\1\113\1\12\1\216"+
    "\3\12\1\217\1\220\1\221\1\26\1\64\1\222\1\223\1\201\2\12\1\133\1\36\7\12\1"+
    "\27\1\113\72\12\1\144\1\12\1\224\2\12\1\153\20\1\26\12\1\151\6\12\1\75\2\1"+
    "\1\111\1\225\1\54\1\226\1\227\6\12\1\15\1\1\1\156\25\12\1\151\1\1\4\12\1\207"+
    "\2\12\1\25\2\1\1\153\7\1\1\213\7\12\1\123\1\1\1\113\1\4\1\26\1\4\1\26\1\230"+
    "\4\12\1\150\1\231\1\232\2\1\1\233\1\12\1\13\1\234\2\151\2\1\7\12\1\26\30\1"+
    "\1\12\1\123\3\12\1\67\2\1\2\12\1\1\1\12\1\235\2\12\1\36\1\12\1\151\2\12\1"+
    "\236\3\1\11\12\1\151\1\113\2\12\1\236\1\12\1\153\2\12\1\25\3\12\1\144\11\1"+
    "\23\12\1\111\1\12\1\36\1\25\11\1\1\237\2\12\1\240\1\12\1\36\1\12\1\111\1\12"+
    "\1\150\4\1\1\12\1\241\1\12\1\36\1\12\1\75\4\1\3\12\1\242\4\1\1\67\1\243\1"+
    "\12\1\144\2\1\1\12\1\123\1\12\1\123\2\1\1\122\1\12\1\152\1\1\3\12\1\36\1\12"+
    "\1\36\1\12\1\27\1\12\1\15\6\1\4\12\1\44\3\1\3\12\1\27\3\12\1\27\60\1\1\156"+
    "\2\12\1\25\2\1\1\63\1\1\1\156\2\12\2\1\1\12\1\44\1\113\1\156\1\12\1\111\1"+
    "\63\1\1\2\12\1\244\1\156\2\12\1\27\1\245\1\246\2\1\1\12\1\21\1\153\5\1\1\247"+
    "\1\250\1\44\2\12\1\150\1\1\1\113\1\71\1\53\1\54\1\66\1\1\1\251\1\15\11\1\3"+
    "\12\1\152\1\252\1\113\2\1\3\12\1\1\1\253\1\113\12\1\2\12\1\150\2\1\1\254\2"+
    "\1\3\12\1\1\1\255\1\113\2\1\2\12\1\26\1\1\1\113\3\1\1\12\1\75\1\1\1\113\26"+
    "\1\4\12\1\113\1\125\34\1\3\12\1\44\20\1\1\54\1\12\1\150\1\1\1\67\1\113\1\1"+
    "\1\207\1\12\67\1\71\12\1\75\16\1\14\12\1\144\53\1\2\12\1\150\75\1\44\12\1"+
    "\111\33\1\43\12\1\44\1\12\1\150\1\113\6\1\1\12\1\151\1\1\3\12\1\1\1\144\1"+
    "\113\1\156\1\256\1\12\67\1\4\12\1\152\1\67\3\1\1\156\4\1\1\67\1\1\76\12\1"+
    "\123\1\1\57\12\1\27\20\1\1\15\77\1\6\12\1\26\1\123\1\44\1\75\66\1\5\12\1\213"+
    "\3\12\1\143\1\257\1\260\1\261\3\12\1\262\1\263\1\12\1\264\1\265\1\34\24\12"+
    "\1\266\1\12\1\34\1\133\1\12\1\133\1\12\1\213\1\12\1\213\1\150\1\12\1\150\1"+
    "\12\1\54\1\12\1\54\1\12\1\267\3\270\14\12\1\152\3\1\4\12\1\144\1\113\112\1"+
    "\1\261\1\12\1\271\1\272\1\273\1\274\1\275\1\276\1\277\1\153\1\300\1\153\24"+
    "\1\55\12\1\111\2\1\103\12\1\152\15\12\1\151\150\12\1\15\25\1\41\12\1\151\36"+
    "\1");

  /* The ZZ_CMAP_A table has 3088 entries */
  static final char ZZ_CMAP_A[] = zzUnpackCMap(
    "\11\0\1\1\1\40\1\0\1\40\23\0\1\1\7\0\1\13\1\14\2\16\1\12\1\16\1\26\1\16\12"+
    "\31\1\11\1\27\1\0\1\15\3\0\32\30\1\0\1\37\2\0\1\32\1\0\1\6\1\24\1\30\1\23"+
    "\1\22\1\30\1\5\1\36\1\20\2\30\1\34\1\7\1\25\1\4\1\2\1\30\1\3\1\35\1\21\1\30"+
    "\1\10\1\17\1\30\1\33\1\30\17\0\1\30\12\0\1\30\4\0\1\30\5\0\27\30\1\0\12\30"+
    "\4\0\14\30\16\0\5\30\7\0\1\30\1\0\1\30\1\0\5\30\1\0\2\30\2\0\4\30\1\0\1\30"+
    "\6\0\1\30\1\0\3\30\1\0\1\30\1\0\4\30\1\0\23\30\1\0\13\30\10\0\15\30\2\0\1"+
    "\30\6\0\10\30\10\0\13\30\5\0\3\30\15\0\12\31\4\0\6\30\1\0\1\30\17\0\2\30\7"+
    "\0\2\30\12\31\3\30\2\0\2\30\1\0\16\30\15\0\11\30\13\0\1\30\16\0\12\31\6\30"+
    "\4\0\2\30\4\0\1\30\5\0\6\30\4\0\1\30\11\0\1\30\3\0\1\30\7\0\11\30\7\0\5\30"+
    "\1\0\10\30\6\0\26\30\3\0\1\30\2\0\1\30\7\0\12\30\4\0\12\31\1\30\4\0\10\30"+
    "\2\0\2\30\2\0\26\30\1\0\7\30\1\0\1\30\3\0\4\30\3\0\1\30\20\0\1\30\15\0\2\30"+
    "\1\0\1\30\5\0\6\30\4\0\2\30\1\0\2\30\1\0\2\30\1\0\2\30\17\0\4\30\1\0\1\30"+
    "\7\0\12\31\2\0\3\30\20\0\11\30\1\0\2\30\1\0\2\30\1\0\5\30\3\0\1\30\2\0\1\30"+
    "\30\0\1\30\13\0\10\30\2\0\1\30\3\0\1\30\1\0\6\30\3\0\3\30\1\0\4\30\3\0\2\30"+
    "\1\0\1\30\1\0\2\30\3\0\2\30\3\0\3\30\3\0\14\30\13\0\10\30\1\0\2\30\10\0\3"+
    "\30\5\0\1\30\4\0\10\30\1\0\6\30\1\0\5\30\3\0\1\30\3\0\2\30\15\0\13\30\2\0"+
    "\1\30\6\0\3\30\10\0\1\30\12\0\6\30\5\0\22\30\3\0\10\30\1\0\11\30\1\0\1\30"+
    "\2\0\7\30\11\0\1\30\1\0\2\30\14\0\12\31\7\0\2\30\1\0\1\30\2\0\2\30\1\0\1\30"+
    "\2\0\1\30\6\0\4\30\1\0\7\30\1\0\3\30\1\0\1\30\1\0\1\30\2\0\2\30\1\0\4\30\1"+
    "\0\2\30\11\0\1\30\2\0\5\30\1\0\1\30\11\0\12\31\2\0\14\30\1\0\24\30\13\0\5"+
    "\30\22\0\7\30\4\0\4\30\3\0\1\30\3\0\2\30\7\0\3\30\4\0\15\30\14\0\1\30\1\0"+
    "\6\30\1\0\1\30\5\0\1\30\2\0\13\30\1\0\15\30\1\0\4\30\2\0\7\30\1\0\1\30\1\0"+
    "\4\30\2\0\1\30\1\0\4\30\2\0\7\30\1\0\1\30\1\0\4\30\2\0\16\30\2\0\6\30\2\0"+
    "\15\30\2\0\1\30\1\0\10\30\7\0\15\30\1\0\6\30\23\0\1\30\4\0\1\30\3\0\5\30\2"+
    "\0\22\30\1\0\1\30\5\0\17\30\1\0\16\30\2\0\5\30\13\0\14\30\13\0\1\30\15\0\7"+
    "\30\7\0\16\30\15\0\2\30\12\31\3\0\3\30\11\0\4\30\1\0\4\30\3\0\2\30\11\0\10"+
    "\30\1\0\1\30\1\0\1\30\1\0\1\30\1\0\6\30\1\0\7\30\1\0\1\30\3\0\3\30\1\0\7\30"+
    "\3\0\4\30\2\0\6\30\5\0\1\30\15\0\1\30\2\0\1\30\4\0\1\30\2\0\12\30\1\0\1\30"+
    "\3\0\5\30\6\0\1\30\1\0\1\30\1\0\1\30\1\0\4\30\1\0\13\30\2\0\4\30\5\0\5\30"+
    "\4\0\1\30\4\0\2\30\13\0\5\30\6\0\4\30\3\0\2\30\14\0\10\30\7\0\10\30\1\0\7"+
    "\30\6\0\2\30\12\0\5\30\5\0\2\30\3\0\7\30\6\0\3\30\12\31\2\30\13\0\11\30\2"+
    "\0\27\30\2\0\7\30\1\0\3\30\1\0\4\30\1\0\4\30\2\0\6\30\3\0\1\30\1\0\1\30\2"+
    "\0\5\30\1\0\12\30\12\31\5\30\1\0\3\30\1\0\10\30\4\0\7\30\3\0\1\30\3\0\2\30"+
    "\1\0\1\30\3\0\2\30\2\0\5\30\2\0\1\30\1\0\1\30\30\0\3\30\3\0\6\30\2\0\6\30"+
    "\2\0\6\30\11\0\7\30\4\0\5\30\3\0\5\30\5\0\1\30\1\0\10\30\1\0\5\30\1\0\1\30"+
    "\1\0\2\30\1\0\2\30\1\0\12\30\6\0\12\30\2\0\6\30\2\0\6\30\2\0\6\30\2\0\3\30"+
    "\3\0\14\30\1\0\16\30\1\0\2\30\1\0\2\30\1\0\10\30\6\0\4\30\4\0\16\30\2\0\1"+
    "\30\1\0\14\30\1\0\2\30\3\0\1\30\2\0\4\30\1\0\2\30\12\0\10\30\6\0\6\30\1\0"+
    "\3\30\1\0\12\30\3\0\1\30\12\0\4\30\13\0\12\31\1\30\1\0\1\30\3\0\7\30\1\0\1"+
    "\30\1\0\4\30\1\0\17\30\1\0\2\30\14\0\3\30\7\0\4\30\11\0\2\30\1\0\1\30\20\0"+
    "\4\30\10\0\1\30\13\0\10\30\5\0\3\30\2\0\1\30\2\0\2\30\2\0\4\30\1\0\14\30\1"+
    "\0\1\30\1\0\7\30\1\0\21\30\1\0\4\30\2\0\10\30\1\0\7\30\1\0\14\30\1\0\4\30"+
    "\1\0\5\30\1\0\1\30\3\0\14\30\2\0\13\30\1\0\10\30\2\0\22\31\1\0\2\30\1\0\1"+
    "\30\2\0\1\30\1\0\12\30\1\0\4\30\1\0\1\30\1\0\1\30\6\0\1\30\4\0\1\30\1\0\1"+
    "\30\1\0\1\30\1\0\3\30\1\0\2\30\1\0\1\30\2\0\1\30\1\0\1\30\1\0\1\30\1\0\1\30"+
    "\1\0\1\30\1\0\2\30\1\0\1\30\2\0\4\30\1\0\7\30\1\0\4\30\1\0\4\30\1\0\1\30\1"+
    "\0\12\30\1\0\5\30\1\0\3\30\1\0\5\30\1\0\5\30");

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\22\0\1\1\1\0\1\2\1\3\1\0\2\4\1\5"+
    "\1\6\1\7\1\4\1\10\1\11\1\12\1\13\3\4"+
    "\1\14\1\15\1\4\4\16\1\17\1\20\1\21\1\4"+
    "\1\1\1\22\1\23\1\2\1\24\1\3\1\25\6\0"+
    "\3\16\1\26\1\0\1\27\4\0\3\16\1\0\1\30"+
    "\3\0\1\31\1\16\1\32\2\0\1\33\1\34\2\0"+
    "\1\35";

  private static int [] zzUnpackAction() {
    int [] result = new int[88];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\41\0\102\0\143\0\204\0\245\0\306\0\347"+
    "\0\u0108\0\u0129\0\u014a\0\u016b\0\u018c\0\u01ad\0\u01ce\0\u01ef"+
    "\0\u0210\0\u0231\0\u0252\0\u0273\0\u0294\0\u02b5\0\u02d6\0\u02f7"+
    "\0\u0318\0\u0339\0\u02f7\0\u02f7\0\u035a\0\u02f7\0\u037b\0\u02f7"+
    "\0\u02f7\0\u039c\0\u03bd\0\u03de\0\u02f7\0\u02f7\0\u03ff\0\u0420"+
    "\0\u0441\0\u0462\0\u0483\0\u02f7\0\u02f7\0\u02f7\0\u04a4\0\u04c5"+
    "\0\u04e6\0\u0507\0\u0528\0\u0549\0\u056a\0\u02f7\0\u058b\0\u05ac"+
    "\0\u05cd\0\u05ee\0\u060f\0\u0630\0\u0651\0\u0672\0\u0693\0\u02f7"+
    "\0\u06b4\0\u02f7\0\u06d5\0\u06f6\0\u0717\0\u0738\0\u0759\0\u077a"+
    "\0\u079b\0\u07bc\0\u02f7\0\u07dd\0\u07fe\0\u081f\0\u0420\0\u0840"+
    "\0\u02f7\0\u0861\0\u0882\0\u02f7\0\u0420\0\u08a3\0\u08c4\0\u02f7";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[88];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\2\30\1\31\40\30\7\32\6\30\7\32\2\30\1\32"+
    "\2\30\4\32\3\30\1\33\36\30\1\33\27\30\1\34"+
    "\21\30\1\35\31\30\1\36\36\30\1\36\2\30\7\37"+
    "\6\30\7\37\2\30\1\37\2\30\4\37\13\30\1\40"+
    "\1\41\113\30\1\42\7\30\1\43\1\44\32\30\1\45"+
    "\40\30\1\46\35\30\1\47\16\30\1\50\1\51\5\50"+
    "\6\30\1\52\2\50\1\53\3\50\2\30\1\50\2\30"+
    "\4\50\15\30\1\54\41\30\1\55\37\30\1\56\36\30"+
    "\1\57\27\30\14\60\1\30\22\60\4\30\7\61\6\30"+
    "\7\61\2\30\1\61\2\30\4\61\4\30\7\62\6\30"+
    "\7\62\2\30\1\62\1\63\1\30\4\62\4\30\7\64"+
    "\6\30\7\64\2\30\1\64\1\65\1\30\4\64\20\30"+
    "\1\66\10\30\1\46\11\30\44\0\1\67\37\0\7\32"+
    "\6\0\7\32\2\0\7\32\10\0\1\70\34\0\7\37"+
    "\6\0\7\37\2\0\7\37\35\0\1\71\11\0\1\72"+
    "\72\0\1\73\24\0\1\74\20\0\7\50\6\0\7\50"+
    "\2\0\7\50\4\0\7\50\6\0\3\50\1\75\3\50"+
    "\2\0\7\50\4\0\1\50\1\76\5\50\6\0\7\50"+
    "\2\0\7\50\4\0\7\50\6\0\6\50\1\77\2\0"+
    "\7\50\17\0\1\100\23\0\14\60\1\0\22\60\4\0"+
    "\7\61\6\0\7\61\2\0\7\61\4\0\7\62\6\0"+
    "\7\62\2\0\7\62\33\0\1\63\11\0\7\64\6\0"+
    "\7\64\2\0\7\64\33\0\1\65\13\0\1\101\37\0"+
    "\1\102\56\0\1\103\44\0\1\104\17\0\1\105\41\0"+
    "\1\106\35\0\4\50\1\107\2\50\6\0\7\50\2\0"+
    "\7\50\4\0\7\50\6\0\1\50\1\110\5\50\2\0"+
    "\7\50\4\0\7\50\6\0\4\50\1\111\2\50\2\0"+
    "\7\50\7\0\1\112\55\0\1\113\23\0\1\114\36\0"+
    "\1\115\55\0\1\116\22\0\7\50\6\0\4\50\1\117"+
    "\2\50\2\0\7\50\4\0\7\50\6\0\2\50\1\120"+
    "\4\50\2\0\7\50\4\0\7\50\6\0\7\50\1\121"+
    "\1\0\7\50\5\0\1\122\55\0\1\123\41\0\1\114"+
    "\44\0\1\124\15\0\7\50\6\0\3\50\1\125\3\50"+
    "\2\0\7\50\10\0\1\126\57\0\1\127\22\0\1\130"+
    "\52\0\1\113\17\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[2277];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String[] ZZ_ERROR_MSG = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\22\0\1\1\1\0\2\1\1\0\1\11\2\1\2\11"+
    "\1\1\1\11\1\1\2\11\3\1\2\11\5\1\3\11"+
    "\7\1\1\11\6\0\3\1\1\11\1\0\1\11\4\0"+
    "\3\1\1\0\1\11\3\0\2\1\1\11\2\0\1\11"+
    "\1\1\2\0\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[88];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  PascalLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    int size = 0;
    for (int i = 0, length = packed.length(); i < length; i += 2) {
      size += packed.charAt(i);
    }
    char[] map = new char[size];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < packed.length()) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart() {
    return zzStartRead;
  }

  public final int getTokenEnd() {
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end, int initialState) {
    zzBuffer = buffer;
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      {@code false}, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position {@code pos} from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + ZZ_CMAP(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        zzDoEOF();
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { yybegin(WAITING_CLOSE_BRACKET); return PascalTypes.CLOSE_BRACKET;
            } 
            // fall through
          case 30: break;
          case 2: 
            { yybegin(WAITING_ARITHM_EXPR_OR_END); return PascalTypes.NUMBER;
            } 
            // fall through
          case 31: break;
          case 3: 
            { yybegin(WAITING_EXPR_END); return PascalTypes.NUMBER;
            } 
            // fall through
          case 32: break;
          case 4: 
            { return TokenType.BAD_CHARACTER;
            } 
            // fall through
          case 33: break;
          case 5: 
            { yybegin(WAITING_PROGRAM_DEF_END); return PascalTypes.PROGRAM_NAME;
            } 
            // fall through
          case 34: break;
          case 6: 
            { yybegin(WAITING_PROGRAM_NAME); return TokenType.WHITE_SPACE;
            } 
            // fall through
          case 35: break;
          case 7: 
            { yybegin(VAR_DEF); return PascalTypes.SEMICOLON;
            } 
            // fall through
          case 36: break;
          case 8: 
            { yybegin(WAITING_VARIABLES_V); return TokenType.WHITE_SPACE;
            } 
            // fall through
          case 37: break;
          case 9: 
            { yybegin(WAITING_VARIABLES_C); return PascalTypes.VARIABLE;
            } 
            // fall through
          case 38: break;
          case 10: 
            { yybegin(WAITING_TYPE); return PascalTypes.COLON;
            } 
            // fall through
          case 39: break;
          case 11: 
            { yybegin(WAITING_VARIABLES_V); return PascalTypes.COMMA;
            } 
            // fall through
          case 40: break;
          case 12: 
            { yybegin(WAITING_BEGIN); return PascalTypes.SEMICOLON;
            } 
            // fall through
          case 41: break;
          case 13: 
            { yybegin(EXPRESSION_BEGIN); return PascalTypes.SEMICOLON;
            } 
            // fall through
          case 42: break;
          case 14: 
            { yybegin(ASSIGNMENT); return PascalTypes.VARIABLE;
            } 
            // fall through
          case 43: break;
          case 15: 
            { yybegin(WAITING_VARIABLE); return PascalTypes.OPEN_BRACKET;
            } 
            // fall through
          case 44: break;
          case 16: 
            { yybegin(WAITING_EXPR_END); return PascalTypes.CLOSE_BRACKET;
            } 
            // fall through
          case 45: break;
          case 17: 
            { yybegin(WAITING_WRITE_DATA); return PascalTypes.OPEN_BRACKET;
            } 
            // fall through
          case 46: break;
          case 18: 
            { yybegin(WAITING_CLOSE_BRACKET); return PascalTypes.VARIABLE;
            } 
            // fall through
          case 47: break;
          case 19: 
            { yybegin(WAITING_ARITHM_EXPR_OR_END); return PascalTypes.VARIABLE;
            } 
            // fall through
          case 48: break;
          case 20: 
            { yybegin(WAITING_EXPR_END); return PascalTypes.VARIABLE;
            } 
            // fall through
          case 49: break;
          case 21: 
            { yybegin(WAITING_VALUE_S); return PascalTypes.BINARY_OPEARTOR;
            } 
            // fall through
          case 50: break;
          case 22: 
            { yybegin(WAITING_VALUE_F); return PascalTypes.ASSIGNMENT;
            } 
            // fall through
          case 51: break;
          case 23: 
            { yybegin(WAITING_WHITE_SPACE_V); return PascalTypes.VAR;
            } 
            // fall through
          case 52: break;
          case 24: 
            { yybegin(WAITING_VARIABLES_DEF_END); return PascalTypes.TYPE;
            } 
            // fall through
          case 53: break;
          case 25: 
            { yybegin(WAITING_OPEN_BRACKET_R); return PascalTypes.READ_KEY;
            } 
            // fall through
          case 54: break;
          case 26: 
            { yybegin(END); return PascalTypes.END;
            } 
            // fall through
          case 55: break;
          case 27: 
            { yybegin(EXPRESSION_BEGIN); return PascalTypes.BEGIN;
            } 
            // fall through
          case 56: break;
          case 28: 
            { yybegin(WAITING_OPEN_BRACKET_W); return PascalTypes.WRITE_KEY;
            } 
            // fall through
          case 57: break;
          case 29: 
            { yybegin(WAITING_WHITE_SPACE_P); return PascalTypes.PROGRAM;
            } 
            // fall through
          case 58: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
