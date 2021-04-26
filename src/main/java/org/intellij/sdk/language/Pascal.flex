package org.intellij.sdk.language;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import org.intellij.sdk.language.psi.PascalTypes;
import com.intellij.psi.TokenType;

%%

%class PascalLexer
%implements FlexLexer
%unicode
%function advance
%type IElementType
%eof{  return;
%eof}


WHITE_SPACE=[\ \n\t\f]
PROGRAM=("program")
VAR=("var")
COLON=(":")
COMMA=(",")
OPEN_BRACKET=("(")
CLOSE_BRACKET=(")")
ASSIGNMENT=(":=")
BINARY_OPERATOR=("+" | "-" | "/" | "*")
WRITE=("write")
READ=("read")
BEGIN=("begin")
END=("end.")
SEMICOLON=(";")
VARIABLE=[:letter:] ([:letter:]* [:digit:]* "_"*)*
NUMBER=[:digit:]*
PROGRAM_NAME=[:letter:] ([:letter:]* [:digit:]* "_"*)*
TYPE=("byte" | "longint" | "shortint")
WRITE_DATA=[^")"\n\f\\]*





%state WAITING_PROGRAM_NAME
%state WAITING_WHITE_SPACE_P
%state WAITING_PROGRAM_DEF_END
%state VAR_DEF
%state WAITING_WHITE_SPACE_V
%state WAITING_VARIABLES_V
%state WAITING_VARIABLES_C
%state WAITING_COLON
%state WAITING_TYPE
%state WAITING_VARIABLES_DEF_END
%state WAITING_EXPR_END
%state WAITING_BEGIN
%state END
%state EXPRESSION_BEGIN
%state WAITING_OPEN_BRACKET_R
%state WAITING_CLOSE_BRACKET
%state WAITING_OPEN_BRACKET_W
%state ASSIGNMENT
%state WAITING_WRITE_DATA
%state WAITING_VARIABLE
%state WAITING_VALUE_F
%state WAITING_VALUE_S
%state WAITING_ARITHM_EXPR_OR_END

%%

<YYINITIAL> {PROGRAM}                                   { yybegin(WAITING_WHITE_SPACE_P); return PascalTypes.PROGRAM; }
<WAITING_WHITE_SPACE_P> {WHITE_SPACE}                   { yybegin(WAITING_PROGRAM_NAME); return TokenType.WHITE_SPACE; }
<WAITING_PROGRAM_NAME> {PROGRAM_NAME}                   { yybegin(WAITING_PROGRAM_DEF_END); return PascalTypes.PROGRAM_NAME; }
<WAITING_PROGRAM_DEF_END> {SEMICOLON}                   { yybegin(VAR_DEF); return PascalTypes.SEMICOLON; }
<VAR_DEF> {VAR}                                         { yybegin(WAITING_WHITE_SPACE_V); return PascalTypes.VAR; }
<WAITING_WHITE_SPACE_V> {WHITE_SPACE}                   { yybegin(WAITING_VARIABLES_V); return TokenType.WHITE_SPACE; }
<WAITING_VARIABLES_V> {VARIABLE}                        { yybegin(WAITING_VARIABLES_C); return PascalTypes.VARIABLE; }
<WAITING_VARIABLES_C> {COMMA}                           { yybegin(WAITING_VARIABLES_V); return PascalTypes.COMMA; }
<WAITING_VARIABLES_C> {COLON}                           { yybegin(WAITING_TYPE); return PascalTypes.COLON; }
<WAITING_TYPE> {TYPE}                                   { yybegin(WAITING_VARIABLES_DEF_END); return PascalTypes.TYPE; }
<WAITING_VARIABLES_DEF_END> {SEMICOLON}                 { yybegin(WAITING_BEGIN); return PascalTypes.SEMICOLON; }
<WAITING_BEGIN> {BEGIN}                                 { yybegin(EXPRESSION_BEGIN); return PascalTypes.BEGIN; }
<EXPRESSION_BEGIN> {READ}                               { yybegin(WAITING_OPEN_BRACKET_R); return PascalTypes.READ_KEY; }
<WAITING_OPEN_BRACKET_R> {OPEN_BRACKET}                 { yybegin(WAITING_VARIABLE); return PascalTypes.OPEN_BRACKET; }
<WAITING_VARIABLE> {VARIABLE}                           { yybegin(WAITING_CLOSE_BRACKET); return PascalTypes.VARIABLE; }
<WAITING_CLOSE_BRACKET> {CLOSE_BRACKET}                 { yybegin(WAITING_EXPR_END); return PascalTypes.CLOSE_BRACKET; }
<WAITING_EXPR_END> {SEMICOLON}                          { yybegin(EXPRESSION_BEGIN); return PascalTypes.SEMICOLON; }
<EXPRESSION_BEGIN> {WRITE}                              { yybegin(WAITING_OPEN_BRACKET_W); return PascalTypes.WRITE_KEY; }
<WAITING_OPEN_BRACKET_W> {OPEN_BRACKET}                 { yybegin(WAITING_WRITE_DATA); return PascalTypes.OPEN_BRACKET; }
<WAITING_WRITE_DATA> {WRITE_DATA}                       { yybegin(WAITING_CLOSE_BRACKET); return PascalTypes.CLOSE_BRACKET; }
<EXPRESSION_BEGIN> {VARIABLE}                           { yybegin(ASSIGNMENT); return PascalTypes.VARIABLE; }
<ASSIGNMENT> {ASSIGNMENT}                               { yybegin(WAITING_VALUE_F); return PascalTypes.ASSIGNMENT; }
<WAITING_VALUE_F> {VARIABLE}                            { yybegin(WAITING_ARITHM_EXPR_OR_END); return PascalTypes.VARIABLE; }
<WAITING_ARITHM_EXPR_OR_END> {BINARY_OPERATOR}          { yybegin(WAITING_VALUE_S); return PascalTypes.BINARY_OPEARTOR; }
<WAITING_ARITHM_EXPR_OR_END> {SEMICOLON}                { yybegin(EXPRESSION_BEGIN); return PascalTypes.SEMICOLON; }
<WAITING_VALUE_S> {VARIABLE}                            { yybegin(WAITING_EXPR_END); return PascalTypes.VARIABLE; }
<WAITING_VALUE_F> {NUMBER}                              { yybegin(WAITING_ARITHM_EXPR_OR_END); return PascalTypes.NUMBER; }
<WAITING_VALUE_S> {NUMBER}                              { yybegin(WAITING_EXPR_END); return PascalTypes.NUMBER; }
<EXPRESSION_BEGIN> {END}                                { yybegin(END); return PascalTypes.END; }

[^]                                                         { return TokenType.BAD_CHARACTER; }
