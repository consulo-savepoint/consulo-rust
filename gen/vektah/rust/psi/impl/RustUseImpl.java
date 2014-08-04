// This is a generated file. Not intended for manual editing.
package vektah.rust.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static vektah.rust.psi.RustTokens.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import vektah.rust.psi.*;

public class RustUseImpl extends ASTWrapperPsiElement implements RustUse {

  public RustUseImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RustVisitor) ((RustVisitor)visitor).visitUse(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public RustExprPath getExprPath() {
    return findChildByClass(RustExprPath.class);
  }

  @Override
  @Nullable
  public RustVisibility getVisibility() {
    return findChildByClass(RustVisibility.class);
  }

}
