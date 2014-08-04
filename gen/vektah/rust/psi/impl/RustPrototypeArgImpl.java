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

public class RustPrototypeArgImpl extends ASTWrapperPsiElement implements RustPrototypeArg {

  public RustPrototypeArgImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RustVisitor) ((RustVisitor)visitor).visitPrototypeArg(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public RustPrototypeSelfArg getPrototypeSelfArg() {
    return findChildByClass(RustPrototypeSelfArg.class);
  }

  @Override
  @Nullable
  public RustPrototypeStructArg getPrototypeStructArg() {
    return findChildByClass(RustPrototypeStructArg.class);
  }

  @Override
  @Nullable
  public RustPrototypeTupleArg getPrototypeTupleArg() {
    return findChildByClass(RustPrototypeTupleArg.class);
  }

  @Override
  @Nullable
  public RustPrototypeVariableArg getPrototypeVariableArg() {
    return findChildByClass(RustPrototypeVariableArg.class);
  }

}
