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

public class RustStructPropertyImpl extends ASTWrapperPsiElement implements RustStructProperty {

  public RustStructPropertyImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RustVisitor) ((RustVisitor)visitor).visitStructProperty(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<RustAttribute> getAttributeList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RustAttribute.class);
  }

  @Override
  @NotNull
  public RustLetVariableBind getLetVariableBind() {
    return findNotNullChildByClass(RustLetVariableBind.class);
  }

  @Override
  @Nullable
  public RustVisibility getVisibility() {
    return findChildByClass(RustVisibility.class);
  }

}
