// This is a generated file. Not intended for manual editing.
package org.intellij.sdk.language.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.intellij.sdk.language.psi.PascalTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import org.intellij.sdk.language.psi.*;

public class PascalProgramDeclaringImpl extends ASTWrapperPsiElement implements PascalProgramDeclaring {

  public PascalProgramDeclaringImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PascalVisitor visitor) {
    visitor.visitProgramDeclaring(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof PascalVisitor) accept((PascalVisitor)visitor);
    else super.accept(visitor);
  }

}
