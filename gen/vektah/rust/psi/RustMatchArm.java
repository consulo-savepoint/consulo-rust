// This is a generated file. Not intended for manual editing.
package vektah.rust.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface RustMatchArm extends PsiElement {

  @Nullable
  RustAttribute getAttribute();

  @Nullable
  RustEmptyStatement getEmptyStatement();

  @Nullable
  RustExpr getExpr();

  @Nullable
  RustItem getItem();

  @Nullable
  RustLet getLet();

  @Nullable
  RustMacroRules getMacroRules();

  @NotNull
  List<RustMatchFilter> getMatchFilterList();

  @Nullable
  RustReturnStatement getReturnStatement();

  @Nullable
  RustStatementBlock getStatementBlock();

  @Nullable
  RustUse getUse();

}
