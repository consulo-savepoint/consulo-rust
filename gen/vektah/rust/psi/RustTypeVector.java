// This is a generated file. Not intended for manual editing.
package vektah.rust.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface RustTypeVector extends PsiElement {

  @Nullable
  RustExpr getExpr();

  @Nullable
  RustFunctionType getFunctionType();

  @NotNull
  List<RustLifetime> getLifetimeList();

  @NotNull
  List<RustRef> getRefList();

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

}
