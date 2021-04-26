// This is a generated file. Not intended for manual editing.
package org.intellij.sdk.language.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import org.intellij.sdk.language.psi.impl.*;

public interface PascalTypes {

  IElementType ARITHMETIC_EXPRESSION = new PascalElementType("ARITHMETIC_EXPRESSION");
  IElementType ASSIGNMENT = new PascalElementType("ASSIGNMENT");
  IElementType EXPRESSION = new PascalElementType("EXPRESSION");
  IElementType PROGRAM_BODY = new PascalElementType("PROGRAM_BODY");
  IElementType PROGRAM_DECLARING = new PascalElementType("PROGRAM_DECLARING");
  IElementType READ = new PascalElementType("READ");
  IElementType VALUE = new PascalElementType("VALUE");
  IElementType VARIABLES = new PascalElementType("VARIABLES");
  IElementType VARIABLE_DECLARING = new PascalElementType("VARIABLE_DECLARING");
  IElementType WRITE = new PascalElementType("WRITE");

  IElementType BEGIN = new PascalTokenType("BEGIN");
  IElementType BINARY_OPEARTOR = new PascalTokenType("BINARY_OPEARTOR");
  IElementType CLOSE_BRACKET = new PascalTokenType("CLOSE_BRACKET");
  IElementType COLON = new PascalTokenType("COLON");
  IElementType COMMA = new PascalTokenType("COMMA");
  IElementType END = new PascalTokenType("END");
  IElementType EQUAL = new PascalTokenType("EQUAL");
  IElementType NUMBER = new PascalTokenType("NUMBER");
  IElementType OPEN_BRACKET = new PascalTokenType("OPEN_BRACKET");
  IElementType PROGRAM = new PascalTokenType("PROGRAM");
  IElementType PROGRAM_NAME = new PascalTokenType("PROGRAM_NAME");
  IElementType READ_KEY = new PascalTokenType("READ_KEY");
  IElementType SEMICOLON = new PascalTokenType("SEMICOLON");
  IElementType TYPE = new PascalTokenType("TYPE");
  IElementType VAR = new PascalTokenType("VAR");
  IElementType VARIABLE = new PascalTokenType("VARIABLE");
  IElementType WHITE_SPACE = new PascalTokenType("WHITE_SPACE");
  IElementType WRITE_DATA = new PascalTokenType("WRITE_DATA");
  IElementType WRITE_KEY = new PascalTokenType("WRITE_KEY");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ARITHMETIC_EXPRESSION) {
        return new PascalArithmeticExpressionImpl(node);
      }
      else if (type == ASSIGNMENT) {
        return new PascalAssignmentImpl(node);
      }
      else if (type == EXPRESSION) {
        return new PascalExpressionImpl(node);
      }
      else if (type == PROGRAM_BODY) {
        return new PascalProgramBodyImpl(node);
      }
      else if (type == PROGRAM_DECLARING) {
        return new PascalProgramDeclaringImpl(node);
      }
      else if (type == READ) {
        return new PascalReadImpl(node);
      }
      else if (type == VALUE) {
        return new PascalValueImpl(node);
      }
      else if (type == VARIABLES) {
        return new PascalVariablesImpl(node);
      }
      else if (type == VARIABLE_DECLARING) {
        return new PascalVariableDeclaringImpl(node);
      }
      else if (type == WRITE) {
        return new PascalWriteImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
