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

public class RustMacroRulesImpl extends ASTWrapperPsiElement implements RustMacroRules {

  public RustMacroRulesImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RustVisitor) ((RustVisitor)visitor).visitMacroRules(this);
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
