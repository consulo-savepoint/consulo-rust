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

public class RustAttributeArgImpl extends ASTWrapperPsiElement implements RustAttributeArg {

  public RustAttributeArgImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RustVisitor) ((RustVisitor)visitor).visitAttributeArg(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<RustAttributeArg> getAttributeArgList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RustAttributeArg.class);
  }

  @Override
  @Nullable
  public RustRef getRef() {
    return findChildByClass(RustRef.class);
  }

}
