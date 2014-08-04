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

public class RustExternItemImpl extends RustItemImpl implements RustExternItem {

  public RustExternItemImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RustVisitor) ((RustVisitor)visitor).visitExternItem(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public RustExternBlock getExternBlock() {
    return findChildByClass(RustExternBlock.class);
  }

  @Override
  @Nullable
  public RustExternCrate getExternCrate() {
    return findChildByClass(RustExternCrate.class);
  }

  @Override
  @Nullable
  public RustExternFunction getExternFunction() {
    return findChildByClass(RustExternFunction.class);
  }

  @Override
  @Nullable
  public RustVisibility getVisibility() {
    return findChildByClass(RustVisibility.class);
  }

}
