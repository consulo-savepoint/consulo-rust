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

public class RustClosureBodyImpl extends ASTWrapperPsiElement implements RustClosureBody {

  public RustClosureBodyImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RustVisitor) ((RustVisitor)visitor).visitClosureBody(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public RustAttribute getAttribute() {
    return findChildByClass(RustAttribute.class);
  }

  @Override
  @Nullable
  public RustEmptyStatement getEmptyStatement() {
    return findChildByClass(RustEmptyStatement.class);
  }

  @Override
  @Nullable
  public RustExpr getExpr() {
    return findChildByClass(RustExpr.class);
  }

  @Override
  @Nullable
  public RustFunctionType getFunctionType() {
    return findChildByClass(RustFunctionType.class);
  }

  @Override
  @Nullable
  public RustItem getItem() {
    return findChildByClass(RustItem.class);
  }

  @Override
  @Nullable
  public RustLet getLet() {
    return findChildByClass(RustLet.class);
  }

  @Override
  @Nullable
  public RustMacroRules getMacroRules() {
    return findChildByClass(RustMacroRules.class);
  }

  @Override
  @Nullable
  public RustReturnStatement getReturnStatement() {
    return findChildByClass(RustReturnStatement.class);
  }

  @Override
  @Nullable
  public RustStatementBlock getStatementBlock() {
    return findChildByClass(RustStatementBlock.class);
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

  @Override
  @Nullable
  public RustUse getUse() {
    return findChildByClass(RustUse.class);
  }

}
