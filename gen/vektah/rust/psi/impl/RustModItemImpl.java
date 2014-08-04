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

public class RustModItemImpl extends RustItemImpl implements RustModItem {

  public RustModItemImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RustVisitor) ((RustVisitor)visitor).visitModItem(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<RustAttribute> getAttributeList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RustAttribute.class);
  }

  @Override
  @NotNull
  public List<RustExprMacro> getExprMacroList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RustExprMacro.class);
  }

  @Override
  @Nullable
  public RustGeneric getGeneric() {
    return findChildByClass(RustGeneric.class);
  }

  @Override
  @NotNull
  public List<RustItem> getItemList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RustItem.class);
  }

  @Override
  @NotNull
  public List<RustMacroRules> getMacroRulesList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RustMacroRules.class);
  }

  @Override
  @Nullable
  public RustTraitBounds getTraitBounds() {
    return findChildByClass(RustTraitBounds.class);
  }

  @Override
  @NotNull
  public List<RustUse> getUseList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RustUse.class);
  }

  @Override
  @Nullable
  public RustVisibility getVisibility() {
    return findChildByClass(RustVisibility.class);
  }

}
