// This is a generated file. Not intended for manual editing.
package vektah.rust.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface RustTypeBasic extends PsiElement {

  @Nullable
  RustGeneric getGeneric();

  @NotNull
  List<RustLifetime> getLifetimeList();

  @NotNull
  List<RustRef> getRefList();

  @Nullable
  RustTraitBounds getTraitBounds();

}
