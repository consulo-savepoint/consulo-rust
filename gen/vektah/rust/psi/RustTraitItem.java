// This is a generated file. Not intended for manual editing.
package vektah.rust.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface RustTraitItem extends RustItem {

  @NotNull
  List<RustAttribute> getAttributeList();

  @NotNull
  List<RustGenericParams> getGenericParamsList();

  @NotNull
  List<RustStatementBlock> getStatementBlockList();

  @NotNull
  List<RustTraitFunctionDeclaration> getTraitFunctionDeclarationList();

  @Nullable
  RustTraitImplements getTraitImplements();

  @Nullable
  RustVisibility getVisibility();

}
