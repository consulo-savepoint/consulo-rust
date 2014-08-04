// This is a generated file. Not intended for manual editing.
package vektah.rust.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface RustStaticItem extends RustItem {

  @NotNull
  List<RustAttribute> getAttributeList();

  @Nullable
  RustExpr getExpr();

  @Nullable
  RustFunctionType getFunctionType();

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
  RustVisibility getVisibility();

}
