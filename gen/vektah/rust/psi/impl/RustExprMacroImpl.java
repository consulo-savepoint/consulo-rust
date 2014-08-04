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

public class RustExprMacroImpl extends RustExprImpl implements RustExprMacro {

  public RustExprMacroImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RustVisitor) ((RustVisitor)visitor).visitExprMacro(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public RustMacroBrace getMacroBrace() {
    return findChildByClass(RustMacroBrace.class);
  }

  @Override
  @Nullable
  public RustMacroBracket getMacroBracket() {
    return findChildByClass(RustMacroBracket.class);
  }

  @Override
  @Nullable
  public RustMacroParen getMacroParen() {
    return findChildByClass(RustMacroParen.class);
  }

}
