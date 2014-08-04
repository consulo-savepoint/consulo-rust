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

public class RustMacroBodyImpl extends ASTWrapperPsiElement implements RustMacroBody {

  public RustMacroBodyImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RustVisitor) ((RustVisitor)visitor).visitMacroBody(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<RustMacroBrace> getMacroBraceList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RustMacroBrace.class);
  }

  @Override
  @NotNull
  public List<RustMacroBracket> getMacroBracketList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RustMacroBracket.class);
  }

  @Override
  @NotNull
  public List<RustMacroParen> getMacroParenList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RustMacroParen.class);
  }

}
