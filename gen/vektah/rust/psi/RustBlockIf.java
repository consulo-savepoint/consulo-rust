// This is a generated file. Not intended for manual editing.
package vektah.rust.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface RustBlockIf extends RustExprBlock {

  @NotNull
  RustExpr getExpr();

  @NotNull
  RustIfTail getIfTail();

  @NotNull
  RustStatementBlock getStatementBlock();

}
