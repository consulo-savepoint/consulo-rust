// This is a generated file. Not intended for manual editing.
package vektah.rust.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static vektah.rust.psi.RustTokens.*;
import vektah.rust.psi.*;

public class RustExprIndexImpl extends RustExprImpl implements RustExprIndex {

  public RustExprIndexImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RustVisitor) ((RustVisitor)visitor).visitExprIndex(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public RustExpr getExpr() {
    return findNotNullChildByClass(RustExpr.class);
  }

  @Override
  @NotNull
  public RustIndexExpr getIndexExpr() {
    return findNotNullChildByClass(RustIndexExpr.class);
  }

}
