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

public class RustStatementBlockImpl extends ASTWrapperPsiElement implements RustStatementBlock {

  public RustStatementBlockImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RustVisitor) ((RustVisitor)visitor).visitStatementBlock(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<RustAttribute> getAttributeList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RustAttribute.class);
  }

  @Override
  @NotNull
  public List<RustEmptyStatement> getEmptyStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RustEmptyStatement.class);
  }

  @Override
  @NotNull
  public List<RustExpr> getExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RustExpr.class);
  }

  @Override
  @NotNull
  public List<RustItem> getItemList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RustItem.class);
  }

  @Override
  @NotNull
  public List<RustLet> getLetList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RustLet.class);
  }

  @Override
  @NotNull
  public List<RustMacroRules> getMacroRulesList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RustMacroRules.class);
  }

  @Override
  @NotNull
  public List<RustReturnStatement> getReturnStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RustReturnStatement.class);
  }

  @Override
  @NotNull
  public List<RustUse> getUseList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RustUse.class);
  }

}
