// This is a generated file. Not intended for manual editing.
package vektah.rust.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface RustPrototypeTupleArg extends PsiElement {

  @Nullable
  RustFunctionType getFunctionType();

  @NotNull
  List<RustPrototypeArg> getPrototypeArgList();

  @NotNull
  List<RustRef> getRefList();

  @NotNull
  List<RustTypeBasic> getTypeBasicList();

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
