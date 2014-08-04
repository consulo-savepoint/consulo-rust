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

public class RustLetTupleBindImpl extends RustLetBindImpl implements RustLetTupleBind {

  public RustLetTupleBindImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RustVisitor) ((RustVisitor)visitor).visitLetTupleBind(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public RustFunctionType getFunctionType() {
    return findChildByClass(RustFunctionType.class);
  }

  @Override
  @NotNull
  public List<RustLetBind> getLetBindList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RustLetBind.class);
  }

  @Override
  @NotNull
  public List<RustRef> getRefList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RustRef.class);
  }

  @Override
  @NotNull
  public List<RustTypeBasic> getTypeBasicList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RustTypeBasic.class);
  }

  @Override
  @Nullable
  public RustTypeClosure getTypeClosure() {
    return findChildByClass(RustTypeClosure.class);
  }

  @Override
  @Nullable
  public RustTypeProc getTypeProc() {
    return findChildByClass(RustTypeProc.class);
  }

  @Override
  @Nullable
  public RustTypeTuple getTypeTuple() {
    return findChildByClass(RustTypeTuple.class);
  }

  @Override
  @Nullable
  public RustTypeUnit getTypeUnit() {
    return findChildByClass(RustTypeUnit.class);
  }

  @Override
  @Nullable
  public RustTypeVector getTypeVector() {
    return findChildByClass(RustTypeVector.class);
  }

}
