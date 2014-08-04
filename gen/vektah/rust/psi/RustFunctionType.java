// This is a generated file. Not intended for manual editing.
package vektah.rust.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface RustFunctionType extends PsiElement {

  @NotNull
  RustFnPrototypeArgs getFnPrototypeArgs();

  @Nullable
  RustFunctionType getFunctionType();

  @Nullable
  RustRef getRef();

  @Nullable
  RustTraitBounds getTraitBounds();

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
