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

public class RustExprClosureImpl extends RustExprImpl implements RustExprClosure {

  public RustExprClosureImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RustVisitor) ((RustVisitor)visitor).visitExprClosure(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public RustClosureBody getClosureBody() {
    return findNotNullChildByClass(RustClosureBody.class);
  }

  @Override
  @NotNull
  public RustClosureExprArgs getClosureExprArgs() {
    return findNotNullChildByClass(RustClosureExprArgs.class);
  }

}
