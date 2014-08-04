// This is a generated file. Not intended for manual editing.
package vektah.rust.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface RustClosureBody extends PsiElement {

  @Nullable
  RustAttribute getAttribute();

  @Nullable
  RustEmptyStatement getEmptyStatement();

  @Nullable
  RustExpr getExpr();

  @Nullable
  RustFunctionType getFunctionType();

  @Nullable
  RustItem getItem();

  @Nullable
  RustLet getLet();

  @Nullable
  RustMacroRules getMacroRules();

  @Nullable
  RustReturnStatement getReturnStatement();

  @Nullable
  RustStatementBlock getStatementBlock();

  @Nullable
  RustTypeBasic getTypeBasic();

  @Nullable
  RustTypeClosure getTypeClosure();

  @Nullable
  RustTypeProc getTypeProc();

  @Nullable
  RustTypeTuple getTypeTuple();

  @Nullable
  RustTypeUnit getTypeUnit();

  @Nullable
  RustTypeVector getTypeVector();

  @Nullable
  RustUse getUse();

}
