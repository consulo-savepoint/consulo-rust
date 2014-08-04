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

public class RustTraitItemImpl extends RustItemImpl implements RustTraitItem {

  public RustTraitItemImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RustVisitor) ((RustVisitor)visitor).visitTraitItem(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<RustAttribute> getAttributeList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RustAttribute.class);
  }

  @Override
  @NotNull
  public List<RustGenericParams> getGenericParamsList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RustGenericParams.class);
  }

  @Override
  @NotNull
  public List<RustStatementBlock> getStatementBlockList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RustStatementBlock.class);
  }

  @Override
  @NotNull
  public List<RustTraitFunctionDeclaration> getTraitFunctionDeclarationList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RustTraitFunctionDeclaration.class);
  }

  @Override
  @Nullable
  public RustTraitImplements getTraitImplements() {
    return findChildByClass(RustTraitImplements.class);
  }

  @Override
  @Nullable
  public RustVisibility getVisibility() {
    return findChildByClass(RustVisibility.class);
  }

}
