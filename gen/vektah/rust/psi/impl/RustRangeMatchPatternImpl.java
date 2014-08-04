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

public class RustRangeMatchPatternImpl extends RustMatchPatternImpl implements RustRangeMatchPattern {

  public RustRangeMatchPatternImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RustVisitor) ((RustVisitor)visitor).visitRangeMatchPattern(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<RustMatchIdentifier> getMatchIdentifierList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RustMatchIdentifier.class);
  }

  @Override
  @Nullable
  public RustMatchLabel getMatchLabel() {
    return findChildByClass(RustMatchLabel.class);
  }

  @Override
  @NotNull
  public List<RustRef> getRefList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RustRef.class);
  }

}
