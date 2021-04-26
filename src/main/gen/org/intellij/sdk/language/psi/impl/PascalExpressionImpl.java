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

public class PascalExpressionImpl extends ASTWrapperPsiElement implements PascalExpression {

  public PascalExpressionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PascalVisitor visitor) {
    visitor.visitExpression(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof PascalVisitor) accept((PascalVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public PascalAssignment getAssignment() {
    return findChildByClass(PascalAssignment.class);
  }

  @Override
  @Nullable
  public PascalRead getRead() {
    return findChildByClass(PascalRead.class);
  }

  @Override
  @Nullable
  public PascalWrite getWrite() {
    return findChildByClass(PascalWrite.class);
  }

}
