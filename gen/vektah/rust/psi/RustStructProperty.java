// This is a generated file. Not intended for manual editing.
package vektah.rust.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface RustStructProperty extends PsiElement {

  @NotNull
  List<RustAttribute> getAttributeList();

  @NotNull
  RustLetVariableBind getLetVariableBind();

  @Nullable
  RustVisibility getVisibility();

}
