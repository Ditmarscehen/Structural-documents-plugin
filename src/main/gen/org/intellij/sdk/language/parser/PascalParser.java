// This is a generated file. Not intended for manual editing.
package org.intellij.sdk.language.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static org.intellij.sdk.language.psi.PascalTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class PascalParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return pascalFile(b, l + 1);
  }

  /* ********************************************************** */
  // value BINARY_OPEARTOR value
  public static boolean arithmetic_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arithmetic_expression")) return false;
    if (!nextTokenIs(b, "<arithmetic expression>", NUMBER, VARIABLE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ARITHMETIC_EXPRESSION, "<arithmetic expression>");
    r = value(b, l + 1);
    r = r && consumeToken(b, BINARY_OPEARTOR);
    r = r && value(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // VARIABLE WHITE_SPACE EQUAL WHITE_SPACE (arithmetic_expression | value)
  public static boolean assignment(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assignment")) return false;
    if (!nextTokenIs(b, VARIABLE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, VARIABLE, WHITE_SPACE, EQUAL, WHITE_SPACE);
    r = r && assignment_4(b, l + 1);
    exit_section_(b, m, ASSIGNMENT, r);
    return r;
  }

  // arithmetic_expression | value
  private static boolean assignment_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assignment_4")) return false;
    boolean r;
    r = arithmetic_expression(b, l + 1);
    if (!r) r = value(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // (write | read | assignment) SEMICOLON
  public static boolean expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPRESSION, "<expression>");
    r = expression_0(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // write | read | assignment
  private static boolean expression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_0")) return false;
    boolean r;
    r = write(b, l + 1);
    if (!r) r = read(b, l + 1);
    if (!r) r = assignment(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // program_declaring variable_declaring program_body
  static boolean pascalFile(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pascalFile")) return false;
    if (!nextTokenIs(b, PROGRAM)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = program_declaring(b, l + 1);
    r = r && variable_declaring(b, l + 1);
    r = r && program_body(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // BEGIN expression* END
  public static boolean program_body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "program_body")) return false;
    if (!nextTokenIs(b, BEGIN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BEGIN);
    r = r && program_body_1(b, l + 1);
    r = r && consumeToken(b, END);
    exit_section_(b, m, PROGRAM_BODY, r);
    return r;
  }

  // expression*
  private static boolean program_body_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "program_body_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!expression(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "program_body_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // PROGRAM WHITE_SPACE PROGRAM_NAME
  public static boolean program_declaring(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "program_declaring")) return false;
    if (!nextTokenIs(b, PROGRAM)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, PROGRAM, WHITE_SPACE, PROGRAM_NAME);
    exit_section_(b, m, PROGRAM_DECLARING, r);
    return r;
  }

  /* ********************************************************** */
  // READ_KEY OPEN_BRACKET VARIABLE CLOSE_BRACKET
  public static boolean read(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "read")) return false;
    if (!nextTokenIs(b, READ_KEY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, READ_KEY, OPEN_BRACKET, VARIABLE, CLOSE_BRACKET);
    exit_section_(b, m, READ, r);
    return r;
  }

  /* ********************************************************** */
  // VARIABLE | NUMBER
  public static boolean value(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "value")) return false;
    if (!nextTokenIs(b, "<value>", NUMBER, VARIABLE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VALUE, "<value>");
    r = consumeToken(b, VARIABLE);
    if (!r) r = consumeToken(b, NUMBER);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (VAR WHITE_SPACE variables COLON TYPE)* SEMICOLON
  public static boolean variable_declaring(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_declaring")) return false;
    if (!nextTokenIs(b, "<variable declaring>", SEMICOLON, VAR)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VARIABLE_DECLARING, "<variable declaring>");
    r = variable_declaring_0(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (VAR WHITE_SPACE variables COLON TYPE)*
  private static boolean variable_declaring_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_declaring_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!variable_declaring_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "variable_declaring_0", c)) break;
    }
    return true;
  }

  // VAR WHITE_SPACE variables COLON TYPE
  private static boolean variable_declaring_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_declaring_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, VAR, WHITE_SPACE);
    r = r && variables(b, l + 1);
    r = r && consumeTokens(b, 0, COLON, TYPE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // VARIABLE (VARIABLE COMMA)*
  public static boolean variables(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variables")) return false;
    if (!nextTokenIs(b, VARIABLE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, VARIABLE);
    r = r && variables_1(b, l + 1);
    exit_section_(b, m, VARIABLES, r);
    return r;
  }

  // (VARIABLE COMMA)*
  private static boolean variables_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variables_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!variables_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "variables_1", c)) break;
    }
    return true;
  }

  // VARIABLE COMMA
  private static boolean variables_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variables_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, VARIABLE, COMMA);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // WRITE_KEY OPEN_BRACKET WRITE_DATA CLOSE_BRACKET
  public static boolean write(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "write")) return false;
    if (!nextTokenIs(b, WRITE_KEY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, WRITE_KEY, OPEN_BRACKET, WRITE_DATA, CLOSE_BRACKET);
    exit_section_(b, m, WRITE, r);
    return r;
  }

}
