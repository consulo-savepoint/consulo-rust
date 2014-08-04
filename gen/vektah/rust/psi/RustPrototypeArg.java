// This is a generated file. Not intended for manual editing.
package vektah.rust.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface RustPrototypeArg extends PsiElement {

  @Nullable
  RustPrototypeSelfArg getPrototypeSelfArg();

  @Nullable
  RustPrototypeStructArg getPrototypeStructArg();

  @Nullable
  RustPrototypeTupleArg getPrototypeTupleArg();

  @Nullable
  RustPrototypeVariableArg getPrototypeVariableArg();

}
