// This is a generated file. Not intended for manual editing.
package vektah.rust.psi;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.PsiElement;

public class RustVisitor extends PsiElementVisitor {

  public void visitAttribute(@NotNull RustAttribute o) {
    visitPsiElement(o);
  }

  public void visitAttributeArg(@NotNull RustAttributeArg o) {
    visitPsiElement(o);
  }

  public void visitBasicMatchPattern(@NotNull RustBasicMatchPattern o) {
    visitMatchPattern(o);
  }

  public void visitBlockFor(@NotNull RustBlockFor o) {
    visitExprBlock(o);
  }

  public void visitBlockIf(@NotNull RustBlockIf o) {
    visitExprBlock(o);
  }

  public void visitBlockLoop(@NotNull RustBlockLoop o) {
    visitExprBlock(o);
  }

  public void visitBlockMatch(@NotNull RustBlockMatch o) {
    visitExprBlock(o);
  }

  public void visitBlockUnsafe(@NotNull RustBlockUnsafe o) {
    visitExprBlock(o);
  }

  public void visitBlockWhile(@NotNull RustBlockWhile o) {
    visitExprBlock(o);
  }

  public void visitCallParams(@NotNull RustCallParams o) {
    visitPsiElement(o);
  }

  public void visitClosureBody(@NotNull RustClosureBody o) {
    visitPsiElement(o);
  }

  public void visitClosureExprArgs(@NotNull RustClosureExprArgs o) {
    visitPsiElement(o);
  }

  public void visitClosurePrototypeArgs(@NotNull RustClosurePrototypeArgs o) {
    visitPsiElement(o);
  }

  public void visitEmptyStatement(@NotNull RustEmptyStatement o) {
    visitPsiElement(o);
  }

  public void visitEnumBody(@NotNull RustEnumBody o) {
    visitPsiElement(o);
  }

  public void visitEnumItem(@NotNull RustEnumItem o) {
    visitItem(o);
  }

  public void visitEnumVariant(@NotNull RustEnumVariant o) {
    visitPsiElement(o);
  }

  public void visitEnumVariantNullary(@NotNull RustEnumVariantNullary o) {
    visitEnumVariant(o);
  }

  public void visitEnumVariantStruct(@NotNull RustEnumVariantStruct o) {
    visitEnumVariant(o);
  }

  public void visitEnumVariantStructMember(@NotNull RustEnumVariantStructMember o) {
    visitEnumVariant(o);
  }

  public void visitEnumVariantTuple(@NotNull RustEnumVariantTuple o) {
    visitEnumVariant(o);
  }

  public void visitExpr(@NotNull RustExpr o) {
    visitPsiElement(o);
  }

  public void visitExprAs(@NotNull RustExprAs o) {
    visitExpr(o);
  }

  public void visitExprAssign(@NotNull RustExprAssign o) {
    visitExpr(o);
  }

  public void visitExprAssignAnd(@NotNull RustExprAssignAnd o) {
    visitExpr(o);
  }

  public void visitExprAssignDecrement(@NotNull RustExprAssignDecrement o) {
    visitExpr(o);
  }

  public void visitExprAssignDivide(@NotNull RustExprAssignDivide o) {
    visitExpr(o);
  }

  public void visitExprAssignIncrement(@NotNull RustExprAssignIncrement o) {
    visitExpr(o);
  }

  public void visitExprAssignLeftShift(@NotNull RustExprAssignLeftShift o) {
    visitExpr(o);
  }

  public void visitExprAssignModulo(@NotNull RustExprAssignModulo o) {
    visitExpr(o);
  }

  public void visitExprAssignMultiply(@NotNull RustExprAssignMultiply o) {
    visitExpr(o);
  }

  public void visitExprAssignNot(@NotNull RustExprAssignNot o) {
    visitExpr(o);
  }

  public void visitExprAssignOr(@NotNull RustExprAssignOr o) {
    visitExpr(o);
  }

  public void visitExprAssignRightShift(@NotNull RustExprAssignRightShift o) {
    visitExpr(o);
  }

  public void visitExprBitwiseAnd(@NotNull RustExprBitwiseAnd o) {
    visitExpr(o);
  }

  public void visitExprBitwiseOr(@NotNull RustExprBitwiseOr o) {
    visitExpr(o);
  }

  public void visitExprBitwiseXor(@NotNull RustExprBitwiseXor o) {
    visitExpr(o);
  }

  public void visitExprBlock(@NotNull RustExprBlock o) {
    visitExpr(o);
  }

  public void visitExprBorrow(@NotNull RustExprBorrow o) {
    visitExpr(o);
  }

  public void visitExprBox(@NotNull RustExprBox o) {
    visitExpr(o);
  }

  public void visitExprBreak(@NotNull RustExprBreak o) {
    visitExpr(o);
  }

  public void visitExprCall(@NotNull RustExprCall o) {
    visitExpr(o);
  }

  public void visitExprClosure(@NotNull RustExprClosure o) {
    visitExpr(o);
  }

  public void visitExprContinue(@NotNull RustExprContinue o) {
    visitExpr(o);
  }

  public void visitExprDeref(@NotNull RustExprDeref o) {
    visitExpr(o);
  }

  public void visitExprDivide(@NotNull RustExprDivide o) {
    visitExpr(o);
  }

  public void visitExprEqualTo(@NotNull RustExprEqualTo o) {
    visitExpr(o);
  }

  public void visitExprField(@NotNull RustExprField o) {
    visitExpr(o);
  }

  public void visitExprGreaterOrEqual(@NotNull RustExprGreaterOrEqual o) {
    visitExpr(o);
  }

  public void visitExprGreaterThan(@NotNull RustExprGreaterThan o) {
    visitExpr(o);
  }

  public void visitExprIdentifier(@NotNull RustExprIdentifier o) {
    visitExpr(o);
  }

  public void visitExprIndex(@NotNull RustExprIndex o) {
    visitExpr(o);
  }

  public void visitExprLeftShift(@NotNull RustExprLeftShift o) {
    visitExpr(o);
  }

  public void visitExprLessOrEqual(@NotNull RustExprLessOrEqual o) {
    visitExpr(o);
  }

  public void visitExprLessThan(@NotNull RustExprLessThan o) {
    visitExpr(o);
  }

  public void visitExprLogicalAnd(@NotNull RustExprLogicalAnd o) {
    visitExpr(o);
  }

  public void visitExprLogicalOr(@NotNull RustExprLogicalOr o) {
    visitExpr(o);
  }

  public void visitExprMacro(@NotNull RustExprMacro o) {
    visitExpr(o);
  }

  public void visitExprManagedBox(@NotNull RustExprManagedBox o) {
    visitExpr(o);
  }

  public void visitExprMinus(@NotNull RustExprMinus o) {
    visitExpr(o);
  }

  public void visitExprModulo(@NotNull RustExprModulo o) {
    visitExpr(o);
  }

  public void visitExprMultiply(@NotNull RustExprMultiply o) {
    visitExpr(o);
  }

  public void visitExprNotEqualTo(@NotNull RustExprNotEqualTo o) {
    visitExpr(o);
  }

  public void visitExprOldBox(@NotNull RustExprOldBox o) {
    visitExpr(o);
  }

  public void visitExprParen(@NotNull RustExprParen o) {
    visitExpr(o);
  }

  public void visitExprPath(@NotNull RustExprPath o) {
    visitExpr(o);
  }

  public void visitExprPlus(@NotNull RustExprPlus o) {
    visitExpr(o);
  }

  public void visitExprProc(@NotNull RustExprProc o) {
    visitExpr(o);
  }

  public void visitExprRightShift(@NotNull RustExprRightShift o) {
    visitExpr(o);
  }

  public void visitExprStructInitializer(@NotNull RustExprStructInitializer o) {
    visitExpr(o);
  }

  public void visitExprTupleBody(@NotNull RustExprTupleBody o) {
    visitExpr(o);
  }

  public void visitExprUnaryMinus(@NotNull RustExprUnaryMinus o) {
    visitExpr(o);
  }

  public void visitExprUnaryNot(@NotNull RustExprUnaryNot o) {
    visitExpr(o);
  }

  public void visitExprUnaryPlus(@NotNull RustExprUnaryPlus o) {
    visitExpr(o);
  }

  public void visitExprValue(@NotNull RustExprValue o) {
    visitExpr(o);
  }

  public void visitExprVector(@NotNull RustExprVector o) {
    visitExpr(o);
  }

  public void visitExternBlock(@NotNull RustExternBlock o) {
    visitPsiElement(o);
  }

  public void visitExternCrate(@NotNull RustExternCrate o) {
    visitPsiElement(o);
  }

  public void visitExternFunction(@NotNull RustExternFunction o) {
    visitPsiElement(o);
  }

  public void visitExternItem(@NotNull RustExternItem o) {
    visitItem(o);
  }

  public void visitExternVariable(@NotNull RustExternVariable o) {
    visitPsiElement(o);
  }

  public void visitFnArgs(@NotNull RustFnArgs o) {
    visitPsiElement(o);
  }

  public void visitFnDeclaration(@NotNull RustFnDeclaration o) {
    visitPsiElement(o);
  }

  public void visitFnItem(@NotNull RustFnItem o) {
    visitItem(o);
  }

  public void visitFnPrototypeArgs(@NotNull RustFnPrototypeArgs o) {
    visitPsiElement(o);
  }

  public void visitFunctionType(@NotNull RustFunctionType o) {
    visitPsiElement(o);
  }

  public void visitGeneric(@NotNull RustGeneric o) {
    visitPsiElement(o);
  }

  public void visitGenericParams(@NotNull RustGenericParams o) {
    visitPsiElement(o);
  }

  public void visitIfTail(@NotNull RustIfTail o) {
    visitPsiElement(o);
  }

  public void visitImplBlock(@NotNull RustImplBlock o) {
    visitPsiElement(o);
  }

  public void visitImplBody(@NotNull RustImplBody o) {
    visitPsiElement(o);
  }

  public void visitImplFor(@NotNull RustImplFor o) {
    visitPsiElement(o);
  }

  public void visitImplItem(@NotNull RustImplItem o) {
    visitItem(o);
  }

  public void visitIndexExpr(@NotNull RustIndexExpr o) {
    visitPsiElement(o);
  }

  public void visitItem(@NotNull RustItem o) {
    visitPsiElement(o);
  }

  public void visitLet(@NotNull RustLet o) {
    visitPsiElement(o);
  }

  public void visitLetArgs(@NotNull RustLetArgs o) {
    visitPsiElement(o);
  }

  public void visitLetBind(@NotNull RustLetBind o) {
    visitPsiElement(o);
  }

  public void visitLetSelfArg(@NotNull RustLetSelfArg o) {
    visitPsiElement(o);
  }

  public void visitLetStructBind(@NotNull RustLetStructBind o) {
    visitLetBind(o);
  }

  public void visitLetTupleBind(@NotNull RustLetTupleBind o) {
    visitLetBind(o);
  }

  public void visitLetUnitBind(@NotNull RustLetUnitBind o) {
    visitLetBind(o);
  }

  public void visitLetVariableBind(@NotNull RustLetVariableBind o) {
    visitLetBind(o);
  }

  public void visitLifetime(@NotNull RustLifetime o) {
    visitPsiElement(o);
  }

  public void visitMacroBody(@NotNull RustMacroBody o) {
    visitPsiElement(o);
  }

  public void visitMacroBrace(@NotNull RustMacroBrace o) {
    visitPsiElement(o);
  }

  public void visitMacroBracket(@NotNull RustMacroBracket o) {
    visitPsiElement(o);
  }

  public void visitMacroParen(@NotNull RustMacroParen o) {
    visitPsiElement(o);
  }

  public void visitMacroRules(@NotNull RustMacroRules o) {
    visitPsiElement(o);
  }

  public void visitMatchArm(@NotNull RustMatchArm o) {
    visitPsiElement(o);
  }

  public void visitMatchBlock(@NotNull RustMatchBlock o) {
    visitPsiElement(o);
  }

  public void visitMatchBody(@NotNull RustMatchBody o) {
    visitPsiElement(o);
  }

  public void visitMatchFilter(@NotNull RustMatchFilter o) {
    visitPsiElement(o);
  }

  public void visitMatchIdentifier(@NotNull RustMatchIdentifier o) {
    visitPsiElement(o);
  }

  public void visitMatchIf(@NotNull RustMatchIf o) {
    visitPsiElement(o);
  }

  public void visitMatchLabel(@NotNull RustMatchLabel o) {
    visitPsiElement(o);
  }

  public void visitMatchPattern(@NotNull RustMatchPattern o) {
    visitPsiElement(o);
  }

  public void visitModItem(@NotNull RustModItem o) {
    visitItem(o);
  }

  public void visitPrototypeArg(@NotNull RustPrototypeArg o) {
    visitPsiElement(o);
  }

  public void visitPrototypeArgs(@NotNull RustPrototypeArgs o) {
    visitPsiElement(o);
  }

  public void visitPrototypeSelfArg(@NotNull RustPrototypeSelfArg o) {
    visitPsiElement(o);
  }

  public void visitPrototypeStructArg(@NotNull RustPrototypeStructArg o) {
    visitPsiElement(o);
  }

  public void visitPrototypeTupleArg(@NotNull RustPrototypeTupleArg o) {
    visitPsiElement(o);
  }

  public void visitPrototypeVariableArg(@NotNull RustPrototypeVariableArg o) {
    visitPsiElement(o);
  }

  public void visitRangeMatchPattern(@NotNull RustRangeMatchPattern o) {
    visitMatchPattern(o);
  }

  public void visitRef(@NotNull RustRef o) {
    visitPsiElement(o);
  }

  public void visitRegionBound(@NotNull RustRegionBound o) {
    visitPsiElement(o);
  }

  public void visitReturnStatement(@NotNull RustReturnStatement o) {
    visitPsiElement(o);
  }

  public void visitStatementBlock(@NotNull RustStatementBlock o) {
    visitPsiElement(o);
  }

  public void visitStaticItem(@NotNull RustStaticItem o) {
    visitItem(o);
  }

  public void visitStructBody(@NotNull RustStructBody o) {
    visitPsiElement(o);
  }

  public void visitStructBodyBlock(@NotNull RustStructBodyBlock o) {
    visitStructBody(o);
  }

  public void visitStructBodyEmpty(@NotNull RustStructBodyEmpty o) {
    visitStructBody(o);
  }

  public void visitStructBodyTuple(@NotNull RustStructBodyTuple o) {
    visitStructBody(o);
  }

  public void visitStructDefault(@NotNull RustStructDefault o) {
    visitPsiElement(o);
  }

  public void visitStructInitializerList(@NotNull RustStructInitializerList o) {
    visitPsiElement(o);
  }

  public void visitStructItem(@NotNull RustStructItem o) {
    visitItem(o);
  }

  public void visitStructMatchPattern(@NotNull RustStructMatchPattern o) {
    visitMatchPattern(o);
  }

  public void visitStructProperty(@NotNull RustStructProperty o) {
    visitPsiElement(o);
  }

  public void visitStructRecover(@NotNull RustStructRecover o) {
    visitPsiElement(o);
  }

  public void visitStructTupleProperty(@NotNull RustStructTupleProperty o) {
    visitPsiElement(o);
  }

  public void visitTraitBounds(@NotNull RustTraitBounds o) {
    visitPsiElement(o);
  }

  public void visitTraitFunctionDeclaration(@NotNull RustTraitFunctionDeclaration o) {
    visitPsiElement(o);
  }

  public void visitTraitImplements(@NotNull RustTraitImplements o) {
    visitPsiElement(o);
  }

  public void visitTraitItem(@NotNull RustTraitItem o) {
    visitItem(o);
  }

  public void visitTupleMatchPattern(@NotNull RustTupleMatchPattern o) {
    visitMatchPattern(o);
  }

  public void visitTypeBasic(@NotNull RustTypeBasic o) {
    visitPsiElement(o);
  }

  public void visitTypeClosure(@NotNull RustTypeClosure o) {
    visitPsiElement(o);
  }

  public void visitTypeItem(@NotNull RustTypeItem o) {
    visitItem(o);
  }

  public void visitTypeProc(@NotNull RustTypeProc o) {
    visitPsiElement(o);
  }

  public void visitTypeTuple(@NotNull RustTypeTuple o) {
    visitPsiElement(o);
  }

  public void visitTypeUnit(@NotNull RustTypeUnit o) {
    visitPsiElement(o);
  }

  public void visitTypeVector(@NotNull RustTypeVector o) {
    visitPsiElement(o);
  }

  public void visitUse(@NotNull RustUse o) {
    visitPsiElement(o);
  }

  public void visitVectorMatchPattern(@NotNull RustVectorMatchPattern o) {
    visitMatchPattern(o);
  }

  public void visitVisibility(@NotNull RustVisibility o) {
    visitPsiElement(o);
  }

  public void visitPsiElement(@NotNull PsiElement o) {
    visitElement(o);
  }

}
