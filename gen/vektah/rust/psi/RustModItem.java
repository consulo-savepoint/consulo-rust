// This is a generated file. Not intended for manual editing.
package vektah.rust.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface RustModItem extends RustItem {

  @NotNull
  List<RustAttribute> getAttributeList();

  @NotNull
  List<RustExprMacro> getExprMacroList();

  @Nullable
  RustGeneric getGeneric();

  @NotNull
  List<RustItem> getItemList();

  @NotNull
  List<RustMacroRules> getMacroRulesList();

  @Nullable
  RustTraitBounds getTraitBounds();

  @NotNull
  List<RustUse> getUseList();

  @Nullable
  RustVisibility getVisibility();

}
