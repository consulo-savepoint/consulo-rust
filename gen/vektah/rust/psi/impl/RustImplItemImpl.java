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

public class RustImplItemImpl extends RustItemImpl implements RustImplItem {

  public RustImplItemImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RustVisitor) ((RustVisitor)visitor).visitImplItem(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public RustFunctionType getFunctionType() {
    return findChildByClass(RustFunctionType.class);
  }

  @Override
  @Nullable
  public RustGenericParams getGenericParams() {
    return findChildByClass(RustGenericParams.class);
  }

  @Override
  @Nullable
  public RustImplBlock getImplBlock() {
    return findChildByClass(RustImplBlock.class);
  }

  @Override
  @Nullable
  public RustImplFor getImplFor() {
    return findChildByClass(RustImplFor.class);
  }

  @Override
  @Nullable
  public RustTypeBasic getTypeBasic() {
    return findChildByClass(RustTypeBasic.class);
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
