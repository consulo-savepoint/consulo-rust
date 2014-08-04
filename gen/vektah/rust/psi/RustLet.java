// This is a generated file. Not intended for manual editing.
package vektah.rust.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface RustLet extends PsiElement {

  @Nullable
  RustExpr getExpr();

  @NotNull
  RustLetBind getLetBind();

  @Nullable
  RustStatementBlock getStatementBlock();

}
