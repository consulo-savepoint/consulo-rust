// This is a generated file. Not intended for manual editing.
package vektah.rust.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface RustStatementBlock extends PsiElement {

  @NotNull
  List<RustAttribute> getAttributeList();

  @NotNull
  List<RustEmptyStatement> getEmptyStatementList();

  @NotNull
  List<RustExpr> getExprList();

  @NotNull
  List<RustItem> getItemList();

  @NotNull
  List<RustLet> getLetList();

  @NotNull
  List<RustMacroRules> getMacroRulesList();

  @NotNull
  List<RustReturnStatement> getReturnStatementList();

  @NotNull
  List<RustUse> getUseList();

}
