// This is a generated file. Not intended for manual editing.
package vektah.rust.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface RustExternBlock extends PsiElement {

  @NotNull
  List<RustAttribute> getAttributeList();

  @NotNull
  List<RustExternVariable> getExternVariableList();

  @NotNull
  List<RustTraitFunctionDeclaration> getTraitFunctionDeclarationList();

}
