// This is a generated file. Not intended for manual editing.
package vektah.rust.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import vektah.rust.psi.impl.*;

public interface RustTokens {

  IElementType ATTRIBUTE = new RustTokenType("ATTRIBUTE");
  IElementType ATTRIBUTE_ARG = new RustTokenType("ATTRIBUTE_ARG");
  IElementType BASIC_MATCH_PATTERN = new RustTokenType("BASIC_MATCH_PATTERN");
  IElementType BLOCK_FOR = new RustTokenType("BLOCK_FOR");
  IElementType BLOCK_IF = new RustTokenType("BLOCK_IF");
  IElementType BLOCK_LOOP = new RustTokenType("BLOCK_LOOP");
  IElementType BLOCK_MATCH = new RustTokenType("BLOCK_MATCH");
  IElementType BLOCK_UNSAFE = new RustTokenType("BLOCK_UNSAFE");
  IElementType BLOCK_WHILE = new RustTokenType("BLOCK_WHILE");
  IElementType CALL_PARAMS = new RustTokenType("CALL_PARAMS");
  IElementType CLOSURE_BODY = new RustTokenType("CLOSURE_BODY");
  IElementType CLOSURE_EXPR_ARGS = new RustTokenType("CLOSURE_EXPR_ARGS");
  IElementType CLOSURE_PROTOTYPE_ARGS = new RustTokenType("CLOSURE_PROTOTYPE_ARGS");
  IElementType EMPTY_STATEMENT = new RustTokenType("EMPTY_STATEMENT");
  IElementType ENUM_BODY = new RustTokenType("ENUM_BODY");
  IElementType ENUM_ITEM = new RustTokenType("ENUM_ITEM");
  IElementType ENUM_VARIANT = new RustTokenType("ENUM_VARIANT");
  IElementType ENUM_VARIANT_NULLARY = new RustTokenType("ENUM_VARIANT_NULLARY");
  IElementType ENUM_VARIANT_STRUCT = new RustTokenType("ENUM_VARIANT_STRUCT");
  IElementType ENUM_VARIANT_STRUCT_MEMBER = new RustTokenType("ENUM_VARIANT_STRUCT_MEMBER");
  IElementType ENUM_VARIANT_TUPLE = new RustTokenType("ENUM_VARIANT_TUPLE");
  IElementType EXPR = new RustTokenType("EXPR");
  IElementType EXPR_AS = new RustTokenType("EXPR_AS");
  IElementType EXPR_ASSIGN = new RustTokenType("EXPR_ASSIGN");
  IElementType EXPR_ASSIGN_AND = new RustTokenType("EXPR_ASSIGN_AND");
  IElementType EXPR_ASSIGN_DECREMENT = new RustTokenType("EXPR_ASSIGN_DECREMENT");
  IElementType EXPR_ASSIGN_DIVIDE = new RustTokenType("EXPR_ASSIGN_DIVIDE");
  IElementType EXPR_ASSIGN_INCREMENT = new RustTokenType("EXPR_ASSIGN_INCREMENT");
  IElementType EXPR_ASSIGN_LEFT_SHIFT = new RustTokenType("EXPR_ASSIGN_LEFT_SHIFT");
  IElementType EXPR_ASSIGN_MODULO = new RustTokenType("EXPR_ASSIGN_MODULO");
  IElementType EXPR_ASSIGN_MULTIPLY = new RustTokenType("EXPR_ASSIGN_MULTIPLY");
  IElementType EXPR_ASSIGN_NOT = new RustTokenType("EXPR_ASSIGN_NOT");
  IElementType EXPR_ASSIGN_OR = new RustTokenType("EXPR_ASSIGN_OR");
  IElementType EXPR_ASSIGN_RIGHT_SHIFT = new RustTokenType("EXPR_ASSIGN_RIGHT_SHIFT");
  IElementType EXPR_BITWISE_AND = new RustTokenType("EXPR_BITWISE_AND");
  IElementType EXPR_BITWISE_OR = new RustTokenType("EXPR_BITWISE_OR");
  IElementType EXPR_BITWISE_XOR = new RustTokenType("EXPR_BITWISE_XOR");
  IElementType EXPR_BLOCK = new RustTokenType("EXPR_BLOCK");
  IElementType EXPR_BORROW = new RustTokenType("EXPR_BORROW");
  IElementType EXPR_BOX = new RustTokenType("EXPR_BOX");
  IElementType EXPR_BREAK = new RustTokenType("EXPR_BREAK");
  IElementType EXPR_CALL = new RustTokenType("EXPR_CALL");
  IElementType EXPR_CLOSURE = new RustTokenType("EXPR_CLOSURE");
  IElementType EXPR_CONTINUE = new RustTokenType("EXPR_CONTINUE");
  IElementType EXPR_DEREF = new RustTokenType("EXPR_DEREF");
  IElementType EXPR_DIVIDE = new RustTokenType("EXPR_DIVIDE");
  IElementType EXPR_EQUAL_TO = new RustTokenType("EXPR_EQUAL_TO");
  IElementType EXPR_FIELD = new RustTokenType("EXPR_FIELD");
  IElementType EXPR_GREATER_OR_EQUAL = new RustTokenType("EXPR_GREATER_OR_EQUAL");
  IElementType EXPR_GREATER_THAN = new RustTokenType("EXPR_GREATER_THAN");
  IElementType EXPR_IDENTIFIER = new RustTokenType("EXPR_IDENTIFIER");
  IElementType EXPR_INDEX = new RustTokenType("EXPR_INDEX");
  IElementType EXPR_LEFT_SHIFT = new RustTokenType("EXPR_LEFT_SHIFT");
  IElementType EXPR_LESS_OR_EQUAL = new RustTokenType("EXPR_LESS_OR_EQUAL");
  IElementType EXPR_LESS_THAN = new RustTokenType("EXPR_LESS_THAN");
  IElementType EXPR_LOGICAL_AND = new RustTokenType("EXPR_LOGICAL_AND");
  IElementType EXPR_LOGICAL_OR = new RustTokenType("EXPR_LOGICAL_OR");
  IElementType EXPR_MACRO = new RustTokenType("EXPR_MACRO");
  IElementType EXPR_MANAGED_BOX = new RustTokenType("EXPR_MANAGED_BOX");
  IElementType EXPR_MINUS = new RustTokenType("EXPR_MINUS");
  IElementType EXPR_MODULO = new RustTokenType("EXPR_MODULO");
  IElementType EXPR_MULTIPLY = new RustTokenType("EXPR_MULTIPLY");
  IElementType EXPR_NOT_EQUAL_TO = new RustTokenType("EXPR_NOT_EQUAL_TO");
  IElementType EXPR_OLD_BOX = new RustTokenType("EXPR_OLD_BOX");
  IElementType EXPR_PAREN = new RustTokenType("EXPR_PAREN");
  IElementType EXPR_PATH = new RustTokenType("EXPR_PATH");
  IElementType EXPR_PLUS = new RustTokenType("EXPR_PLUS");
  IElementType EXPR_PROC = new RustTokenType("EXPR_PROC");
  IElementType EXPR_RIGHT_SHIFT = new RustTokenType("EXPR_RIGHT_SHIFT");
  IElementType EXPR_STRUCT_INITIALIZER = new RustTokenType("EXPR_STRUCT_INITIALIZER");
  IElementType EXPR_TUPLE_BODY = new RustTokenType("EXPR_TUPLE_BODY");
  IElementType EXPR_UNARY_MINUS = new RustTokenType("EXPR_UNARY_MINUS");
  IElementType EXPR_UNARY_NOT = new RustTokenType("EXPR_UNARY_NOT");
  IElementType EXPR_UNARY_PLUS = new RustTokenType("EXPR_UNARY_PLUS");
  IElementType EXPR_VALUE = new RustTokenType("EXPR_VALUE");
  IElementType EXPR_VECTOR = new RustTokenType("EXPR_VECTOR");
  IElementType EXTERN_BLOCK = new RustTokenType("EXTERN_BLOCK");
  IElementType EXTERN_CRATE = new RustTokenType("EXTERN_CRATE");
  IElementType EXTERN_FUNCTION = new RustTokenType("EXTERN_FUNCTION");
  IElementType EXTERN_ITEM = new RustTokenType("EXTERN_ITEM");
  IElementType EXTERN_VARIABLE = new RustTokenType("EXTERN_VARIABLE");
  IElementType FN_ARGS = new RustTokenType("FN_ARGS");
  IElementType FN_DECLARATION = new RustTokenType("FN_DECLARATION");
  IElementType FN_ITEM = new RustTokenType("FN_ITEM");
  IElementType FN_PROTOTYPE_ARGS = new RustTokenType("FN_PROTOTYPE_ARGS");
  IElementType FUNCTION_TYPE = new RustTokenType("FUNCTION_TYPE");
  IElementType GENERIC = new RustTokenType("GENERIC");
  IElementType GENERIC_PARAMS = new RustTokenType("GENERIC_PARAMS");
  IElementType IF_TAIL = new RustTokenType("IF_TAIL");
  IElementType IMPL_BLOCK = new RustTokenType("IMPL_BLOCK");
  IElementType IMPL_BODY = new RustTokenType("IMPL_BODY");
  IElementType IMPL_FOR = new RustTokenType("IMPL_FOR");
  IElementType IMPL_ITEM = new RustTokenType("IMPL_ITEM");
  IElementType INDEX_EXPR = new RustTokenType("INDEX_EXPR");
  IElementType ITEM = new RustTokenType("ITEM");
  IElementType LET = new RustTokenType("LET");
  IElementType LET_ARGS = new RustTokenType("LET_ARGS");
  IElementType LET_BIND = new RustTokenType("LET_BIND");
  IElementType LET_SELF_ARG = new RustTokenType("LET_SELF_ARG");
  IElementType LET_STRUCT_BIND = new RustTokenType("LET_STRUCT_BIND");
  IElementType LET_TUPLE_BIND = new RustTokenType("LET_TUPLE_BIND");
  IElementType LET_UNIT_BIND = new RustTokenType("LET_UNIT_BIND");
  IElementType LET_VARIABLE_BIND = new RustTokenType("LET_VARIABLE_BIND");
  IElementType LIFETIME = new RustTokenType("LIFETIME");
  IElementType MACRO_BODY = new RustTokenType("MACRO_BODY");
  IElementType MACRO_BRACE = new RustTokenType("MACRO_BRACE");
  IElementType MACRO_BRACKET = new RustTokenType("MACRO_BRACKET");
  IElementType MACRO_PAREN = new RustTokenType("MACRO_PAREN");
  IElementType MACRO_RULES = new RustTokenType("MACRO_RULES");
  IElementType MATCH_ARM = new RustTokenType("MATCH_ARM");
  IElementType MATCH_BLOCK = new RustTokenType("MATCH_BLOCK");
  IElementType MATCH_BODY = new RustTokenType("MATCH_BODY");
  IElementType MATCH_FILTER = new RustTokenType("MATCH_FILTER");
  IElementType MATCH_IDENTIFIER = new RustTokenType("MATCH_IDENTIFIER");
  IElementType MATCH_IF = new RustTokenType("MATCH_IF");
  IElementType MATCH_LABEL = new RustTokenType("MATCH_LABEL");
  IElementType MATCH_PATTERN = new RustTokenType("MATCH_PATTERN");
  IElementType MOD_ITEM = new RustTokenType("MOD_ITEM");
  IElementType PROTOTYPE_ARG = new RustTokenType("PROTOTYPE_ARG");
  IElementType PROTOTYPE_ARGS = new RustTokenType("PROTOTYPE_ARGS");
  IElementType PROTOTYPE_SELF_ARG = new RustTokenType("PROTOTYPE_SELF_ARG");
  IElementType PROTOTYPE_STRUCT_ARG = new RustTokenType("PROTOTYPE_STRUCT_ARG");
  IElementType PROTOTYPE_TUPLE_ARG = new RustTokenType("PROTOTYPE_TUPLE_ARG");
  IElementType PROTOTYPE_VARIABLE_ARG = new RustTokenType("PROTOTYPE_VARIABLE_ARG");
  IElementType RANGE_MATCH_PATTERN = new RustTokenType("RANGE_MATCH_PATTERN");
  IElementType REF = new RustTokenType("REF");
  IElementType REGION_BOUND = new RustTokenType("REGION_BOUND");
  IElementType RETURN_STATEMENT = new RustTokenType("RETURN_STATEMENT");
  IElementType STATEMENT_BLOCK = new RustTokenType("STATEMENT_BLOCK");
  IElementType STATIC_ITEM = new RustTokenType("STATIC_ITEM");
  IElementType STRUCT_BODY = new RustTokenType("STRUCT_BODY");
  IElementType STRUCT_BODY_BLOCK = new RustTokenType("STRUCT_BODY_BLOCK");
  IElementType STRUCT_BODY_EMPTY = new RustTokenType("STRUCT_BODY_EMPTY");
  IElementType STRUCT_BODY_TUPLE = new RustTokenType("STRUCT_BODY_TUPLE");
  IElementType STRUCT_DEFAULT = new RustTokenType("STRUCT_DEFAULT");
  IElementType STRUCT_INITIALIZER_LIST = new RustTokenType("STRUCT_INITIALIZER_LIST");
  IElementType STRUCT_ITEM = new RustTokenType("STRUCT_ITEM");
  IElementType STRUCT_MATCH_PATTERN = new RustTokenType("STRUCT_MATCH_PATTERN");
  IElementType STRUCT_PROPERTY = new RustTokenType("STRUCT_PROPERTY");
  IElementType STRUCT_RECOVER = new RustTokenType("STRUCT_RECOVER");
  IElementType STRUCT_TUPLE_PROPERTY = new RustTokenType("STRUCT_TUPLE_PROPERTY");
  IElementType TRAIT_BOUNDS = new RustTokenType("TRAIT_BOUNDS");
  IElementType TRAIT_FUNCTION_DECLARATION = new RustTokenType("TRAIT_FUNCTION_DECLARATION");
  IElementType TRAIT_IMPLEMENTS = new RustTokenType("TRAIT_IMPLEMENTS");
  IElementType TRAIT_ITEM = new RustTokenType("TRAIT_ITEM");
  IElementType TUPLE_MATCH_PATTERN = new RustTokenType("TUPLE_MATCH_PATTERN");
  IElementType TYPE_BASIC = new RustTokenType("TYPE_BASIC");
  IElementType TYPE_CLOSURE = new RustTokenType("TYPE_CLOSURE");
  IElementType TYPE_ITEM = new RustTokenType("TYPE_ITEM");
  IElementType TYPE_PROC = new RustTokenType("TYPE_PROC");
  IElementType TYPE_TUPLE = new RustTokenType("TYPE_TUPLE");
  IElementType TYPE_UNIT = new RustTokenType("TYPE_UNIT");
  IElementType TYPE_VECTOR = new RustTokenType("TYPE_VECTOR");
  IElementType USE = new RustTokenType("USE");
  IElementType VECTOR_MATCH_PATTERN = new RustTokenType("VECTOR_MATCH_PATTERN");
  IElementType VISIBILITY = new RustTokenType("VISIBILITY");

  IElementType ASSIGN = new RustTokenType("=");
  IElementType ASSIGN_LEFT_SHIFT = new RustTokenType("<<=");
  IElementType ASSIGN_RIGHT_SHIFT = new RustTokenType(">>=");
  IElementType AT = new RustTokenType("@");
  IElementType BAD_CHARACTER = new RustTokenType("BAD_CHARACTER");
  IElementType BIN_LIT = new RustTokenType("BIN_LIT");
  IElementType BITWISE_AND = new RustTokenType("&");
  IElementType BITWISE_OR = new RustTokenType("|");
  IElementType BITWISE_XOR = new RustTokenType("^");
  IElementType BLOCK_COMMENT = new RustTokenType("BLOCK_COMMENT");
  IElementType BLOCK_DOC_COMMENT = new RustTokenType("BLOCK_DOC_COMMENT");
  IElementType BOX = new RustTokenType("~");
  IElementType CHAR_LIT = new RustTokenType("CHAR_LIT");
  IElementType CLOSE_BRACE = new RustTokenType("}");
  IElementType CLOSE_PAREN = new RustTokenType(")");
  IElementType CLOSE_SQUARE_BRACKET = new RustTokenType("]");
  IElementType COLON = new RustTokenType(":");
  IElementType COMMA = new RustTokenType(",");
  IElementType DEC_LIT = new RustTokenType("DEC_LIT");
  IElementType DIVIDE = new RustTokenType("/");
  IElementType DOLLAR = new RustTokenType("$");
  IElementType DOT = new RustTokenType(".");
  IElementType DOUBLE_COLON = new RustTokenType("::");
  IElementType DOUBLE_DOT = new RustTokenType("..");
  IElementType EQUAL = new RustTokenType("==");
  IElementType FAT_ARROW = new RustTokenType("=>");
  IElementType GREATER_THAN = new RustTokenType(">");
  IElementType GREATER_THAN_OR_EQUAL = new RustTokenType(">=");
  IElementType HASH = new RustTokenType("#");
  IElementType HEX_LIT = new RustTokenType("HEX_LIT");
  IElementType IDENTIFIER = new RustTokenType("IDENTIFIER");
  IElementType KW_AS = new RustTokenType("as");
  IElementType KW_BOX = new RustTokenType("box");
  IElementType KW_BREAK = new RustTokenType("break");
  IElementType KW_CONTINUE = new RustTokenType("continue");
  IElementType KW_CRATE = new RustTokenType("crate");
  IElementType KW_ELSE = new RustTokenType("else");
  IElementType KW_ENUM = new RustTokenType("enum");
  IElementType KW_EXTERN = new RustTokenType("extern");
  IElementType KW_FALSE = new RustTokenType("false");
  IElementType KW_FN = new RustTokenType("fn");
  IElementType KW_FOR = new RustTokenType("for");
  IElementType KW_IF = new RustTokenType("if");
  IElementType KW_IMPL = new RustTokenType("impl");
  IElementType KW_IN = new RustTokenType("in");
  IElementType KW_LET = new RustTokenType("let");
  IElementType KW_LOOP = new RustTokenType("loop");
  IElementType KW_MACRO_RULES = new RustTokenType("macro_rules!");
  IElementType KW_MATCH = new RustTokenType("match");
  IElementType KW_MOD = new RustTokenType("mod");
  IElementType KW_MUT = new RustTokenType("mut");
  IElementType KW_PRIV = new RustTokenType("priv");
  IElementType KW_PROC = new RustTokenType("proc");
  IElementType KW_PUB = new RustTokenType("pub");
  IElementType KW_REF = new RustTokenType("ref");
  IElementType KW_RETURN = new RustTokenType("return");
  IElementType KW_SELF = new RustTokenType("self");
  IElementType KW_STATIC = new RustTokenType("static");
  IElementType KW_STRUCT = new RustTokenType("struct");
  IElementType KW_SUPER = new RustTokenType("super");
  IElementType KW_TRAIT = new RustTokenType("trait");
  IElementType KW_TRUE = new RustTokenType("true");
  IElementType KW_TYPE = new RustTokenType("type");
  IElementType KW_UNSAFE = new RustTokenType("unsafe");
  IElementType KW_USE = new RustTokenType("use");
  IElementType KW_WHILE = new RustTokenType("while");
  IElementType LESS_THAN = new RustTokenType("<");
  IElementType LESS_THAN_OR_EQUAL = new RustTokenType("<=");
  IElementType LINE_COMMENT = new RustTokenType("LINE_COMMENT");
  IElementType LINE_DOC_COMMENT = new RustTokenType("LINE_DOC_COMMENT");
  IElementType MINUS = new RustTokenType("-");
  IElementType MULTIPLY = new RustTokenType("*");
  IElementType NOT = new RustTokenType("!");
  IElementType NOT_EQUAL = new RustTokenType("!=");
  IElementType OCT_LIT = new RustTokenType("OCT_LIT");
  IElementType OPEN_BRACE = new RustTokenType("{");
  IElementType OPEN_PAREN = new RustTokenType("(");
  IElementType OPEN_SQUARE_BRACKET = new RustTokenType("[");
  IElementType PLUS = new RustTokenType("+");
  IElementType RAW_STRING_LIT = new RustTokenType("RAW_STRING_LIT");
  IElementType REMAINDER = new RustTokenType("%");
  IElementType SEMICOLON = new RustTokenType(";");
  IElementType SINGLE_QUOTE = new RustTokenType("'");
  IElementType STRING_LIT = new RustTokenType("STRING_LIT");
  IElementType THIN_ARROW = new RustTokenType("->");
  IElementType TRIPLE_DOT = new RustTokenType("...");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == ATTRIBUTE) {
        return new RustAttributeImpl(node);
      }
      else if (type == ATTRIBUTE_ARG) {
        return new RustAttributeArgImpl(node);
      }
      else if (type == BASIC_MATCH_PATTERN) {
        return new RustBasicMatchPatternImpl(node);
      }
      else if (type == BLOCK_FOR) {
        return new RustBlockForImpl(node);
      }
      else if (type == BLOCK_IF) {
        return new RustBlockIfImpl(node);
      }
      else if (type == BLOCK_LOOP) {
        return new RustBlockLoopImpl(node);
      }
      else if (type == BLOCK_MATCH) {
        return new RustBlockMatchImpl(node);
      }
      else if (type == BLOCK_UNSAFE) {
        return new RustBlockUnsafeImpl(node);
      }
      else if (type == BLOCK_WHILE) {
        return new RustBlockWhileImpl(node);
      }
      else if (type == CALL_PARAMS) {
        return new RustCallParamsImpl(node);
      }
      else if (type == CLOSURE_BODY) {
        return new RustClosureBodyImpl(node);
      }
      else if (type == CLOSURE_EXPR_ARGS) {
        return new RustClosureExprArgsImpl(node);
      }
      else if (type == CLOSURE_PROTOTYPE_ARGS) {
        return new RustClosurePrototypeArgsImpl(node);
      }
      else if (type == EMPTY_STATEMENT) {
        return new RustEmptyStatementImpl(node);
      }
      else if (type == ENUM_BODY) {
        return new RustEnumBodyImpl(node);
      }
      else if (type == ENUM_ITEM) {
        return new RustEnumItemImpl(node);
      }
      else if (type == ENUM_VARIANT) {
        return new RustEnumVariantImpl(node);
      }
      else if (type == ENUM_VARIANT_NULLARY) {
        return new RustEnumVariantNullaryImpl(node);
      }
      else if (type == ENUM_VARIANT_STRUCT) {
        return new RustEnumVariantStructImpl(node);
      }
      else if (type == ENUM_VARIANT_STRUCT_MEMBER) {
        return new RustEnumVariantStructMemberImpl(node);
      }
      else if (type == ENUM_VARIANT_TUPLE) {
        return new RustEnumVariantTupleImpl(node);
      }
      else if (type == EXPR) {
        return new RustExprImpl(node);
      }
      else if (type == EXPR_AS) {
        return new RustExprAsImpl(node);
      }
      else if (type == EXPR_ASSIGN) {
        return new RustExprAssignImpl(node);
      }
      else if (type == EXPR_ASSIGN_AND) {
        return new RustExprAssignAndImpl(node);
      }
      else if (type == EXPR_ASSIGN_DECREMENT) {
        return new RustExprAssignDecrementImpl(node);
      }
      else if (type == EXPR_ASSIGN_DIVIDE) {
        return new RustExprAssignDivideImpl(node);
      }
      else if (type == EXPR_ASSIGN_INCREMENT) {
        return new RustExprAssignIncrementImpl(node);
      }
      else if (type == EXPR_ASSIGN_LEFT_SHIFT) {
        return new RustExprAssignLeftShiftImpl(node);
      }
      else if (type == EXPR_ASSIGN_MODULO) {
        return new RustExprAssignModuloImpl(node);
      }
      else if (type == EXPR_ASSIGN_MULTIPLY) {
        return new RustExprAssignMultiplyImpl(node);
      }
      else if (type == EXPR_ASSIGN_NOT) {
        return new RustExprAssignNotImpl(node);
      }
      else if (type == EXPR_ASSIGN_OR) {
        return new RustExprAssignOrImpl(node);
      }
      else if (type == EXPR_ASSIGN_RIGHT_SHIFT) {
        return new RustExprAssignRightShiftImpl(node);
      }
      else if (type == EXPR_BITWISE_AND) {
        return new RustExprBitwiseAndImpl(node);
      }
      else if (type == EXPR_BITWISE_OR) {
        return new RustExprBitwiseOrImpl(node);
      }
      else if (type == EXPR_BITWISE_XOR) {
        return new RustExprBitwiseXorImpl(node);
      }
      else if (type == EXPR_BLOCK) {
        return new RustExprBlockImpl(node);
      }
      else if (type == EXPR_BORROW) {
        return new RustExprBorrowImpl(node);
      }
      else if (type == EXPR_BOX) {
        return new RustExprBoxImpl(node);
      }
      else if (type == EXPR_BREAK) {
        return new RustExprBreakImpl(node);
      }
      else if (type == EXPR_CALL) {
        return new RustExprCallImpl(node);
      }
      else if (type == EXPR_CLOSURE) {
        return new RustExprClosureImpl(node);
      }
      else if (type == EXPR_CONTINUE) {
        return new RustExprContinueImpl(node);
      }
      else if (type == EXPR_DEREF) {
        return new RustExprDerefImpl(node);
      }
      else if (type == EXPR_DIVIDE) {
        return new RustExprDivideImpl(node);
      }
      else if (type == EXPR_EQUAL_TO) {
        return new RustExprEqualToImpl(node);
      }
      else if (type == EXPR_FIELD) {
        return new RustExprFieldImpl(node);
      }
      else if (type == EXPR_GREATER_OR_EQUAL) {
        return new RustExprGreaterOrEqualImpl(node);
      }
      else if (type == EXPR_GREATER_THAN) {
        return new RustExprGreaterThanImpl(node);
      }
      else if (type == EXPR_IDENTIFIER) {
        return new RustExprIdentifierImpl(node);
      }
      else if (type == EXPR_INDEX) {
        return new RustExprIndexImpl(node);
      }
      else if (type == EXPR_LEFT_SHIFT) {
        return new RustExprLeftShiftImpl(node);
      }
      else if (type == EXPR_LESS_OR_EQUAL) {
        return new RustExprLessOrEqualImpl(node);
      }
      else if (type == EXPR_LESS_THAN) {
        return new RustExprLessThanImpl(node);
      }
      else if (type == EXPR_LOGICAL_AND) {
        return new RustExprLogicalAndImpl(node);
      }
      else if (type == EXPR_LOGICAL_OR) {
        return new RustExprLogicalOrImpl(node);
      }
      else if (type == EXPR_MACRO) {
        return new RustExprMacroImpl(node);
      }
      else if (type == EXPR_MANAGED_BOX) {
        return new RustExprManagedBoxImpl(node);
      }
      else if (type == EXPR_MINUS) {
        return new RustExprMinusImpl(node);
      }
      else if (type == EXPR_MODULO) {
        return new RustExprModuloImpl(node);
      }
      else if (type == EXPR_MULTIPLY) {
        return new RustExprMultiplyImpl(node);
      }
      else if (type == EXPR_NOT_EQUAL_TO) {
        return new RustExprNotEqualToImpl(node);
      }
      else if (type == EXPR_OLD_BOX) {
        return new RustExprOldBoxImpl(node);
      }
      else if (type == EXPR_PAREN) {
        return new RustExprParenImpl(node);
      }
      else if (type == EXPR_PATH) {
        return new RustExprPathImpl(node);
      }
      else if (type == EXPR_PLUS) {
        return new RustExprPlusImpl(node);
      }
      else if (type == EXPR_PROC) {
        return new RustExprProcImpl(node);
      }
      else if (type == EXPR_RIGHT_SHIFT) {
        return new RustExprRightShiftImpl(node);
      }
      else if (type == EXPR_STRUCT_INITIALIZER) {
        return new RustExprStructInitializerImpl(node);
      }
      else if (type == EXPR_TUPLE_BODY) {
        return new RustExprTupleBodyImpl(node);
      }
      else if (type == EXPR_UNARY_MINUS) {
        return new RustExprUnaryMinusImpl(node);
      }
      else if (type == EXPR_UNARY_NOT) {
        return new RustExprUnaryNotImpl(node);
      }
      else if (type == EXPR_UNARY_PLUS) {
        return new RustExprUnaryPlusImpl(node);
      }
      else if (type == EXPR_VALUE) {
        return new RustExprValueImpl(node);
      }
      else if (type == EXPR_VECTOR) {
        return new RustExprVectorImpl(node);
      }
      else if (type == EXTERN_BLOCK) {
        return new RustExternBlockImpl(node);
      }
      else if (type == EXTERN_CRATE) {
        return new RustExternCrateImpl(node);
      }
      else if (type == EXTERN_FUNCTION) {
        return new RustExternFunctionImpl(node);
      }
      else if (type == EXTERN_ITEM) {
        return new RustExternItemImpl(node);
      }
      else if (type == EXTERN_VARIABLE) {
        return new RustExternVariableImpl(node);
      }
      else if (type == FN_ARGS) {
        return new RustFnArgsImpl(node);
      }
      else if (type == FN_DECLARATION) {
        return new RustFnDeclarationImpl(node);
      }
      else if (type == FN_ITEM) {
        return new RustFnItemImpl(node);
      }
      else if (type == FN_PROTOTYPE_ARGS) {
        return new RustFnPrototypeArgsImpl(node);
      }
      else if (type == FUNCTION_TYPE) {
        return new RustFunctionTypeImpl(node);
      }
      else if (type == GENERIC) {
        return new RustGenericImpl(node);
      }
      else if (type == GENERIC_PARAMS) {
        return new RustGenericParamsImpl(node);
      }
      else if (type == IF_TAIL) {
        return new RustIfTailImpl(node);
      }
      else if (type == IMPL_BLOCK) {
        return new RustImplBlockImpl(node);
      }
      else if (type == IMPL_BODY) {
        return new RustImplBodyImpl(node);
      }
      else if (type == IMPL_FOR) {
        return new RustImplForImpl(node);
      }
      else if (type == IMPL_ITEM) {
        return new RustImplItemImpl(node);
      }
      else if (type == INDEX_EXPR) {
        return new RustIndexExprImpl(node);
      }
      else if (type == ITEM) {
        return new RustItemImpl(node);
      }
      else if (type == LET) {
        return new RustLetImpl(node);
      }
      else if (type == LET_ARGS) {
        return new RustLetArgsImpl(node);
      }
      else if (type == LET_BIND) {
        return new RustLetBindImpl(node);
      }
      else if (type == LET_SELF_ARG) {
        return new RustLetSelfArgImpl(node);
      }
      else if (type == LET_STRUCT_BIND) {
        return new RustLetStructBindImpl(node);
      }
      else if (type == LET_TUPLE_BIND) {
        return new RustLetTupleBindImpl(node);
      }
      else if (type == LET_UNIT_BIND) {
        return new RustLetUnitBindImpl(node);
      }
      else if (type == LET_VARIABLE_BIND) {
        return new RustLetVariableBindImpl(node);
      }
      else if (type == LIFETIME) {
        return new RustLifetimeImpl(node);
      }
      else if (type == MACRO_BODY) {
        return new RustMacroBodyImpl(node);
      }
      else if (type == MACRO_BRACE) {
        return new RustMacroBraceImpl(node);
      }
      else if (type == MACRO_BRACKET) {
        return new RustMacroBracketImpl(node);
      }
      else if (type == MACRO_PAREN) {
        return new RustMacroParenImpl(node);
      }
      else if (type == MACRO_RULES) {
        return new RustMacroRulesImpl(node);
      }
      else if (type == MATCH_ARM) {
        return new RustMatchArmImpl(node);
      }
      else if (type == MATCH_BLOCK) {
        return new RustMatchBlockImpl(node);
      }
      else if (type == MATCH_BODY) {
        return new RustMatchBodyImpl(node);
      }
      else if (type == MATCH_FILTER) {
        return new RustMatchFilterImpl(node);
      }
      else if (type == MATCH_IDENTIFIER) {
        return new RustMatchIdentifierImpl(node);
      }
      else if (type == MATCH_IF) {
        return new RustMatchIfImpl(node);
      }
      else if (type == MATCH_LABEL) {
        return new RustMatchLabelImpl(node);
      }
      else if (type == MATCH_PATTERN) {
        return new RustMatchPatternImpl(node);
      }
      else if (type == MOD_ITEM) {
        return new RustModItemImpl(node);
      }
      else if (type == PROTOTYPE_ARG) {
        return new RustPrototypeArgImpl(node);
      }
      else if (type == PROTOTYPE_ARGS) {
        return new RustPrototypeArgsImpl(node);
      }
      else if (type == PROTOTYPE_SELF_ARG) {
        return new RustPrototypeSelfArgImpl(node);
      }
      else if (type == PROTOTYPE_STRUCT_ARG) {
        return new RustPrototypeStructArgImpl(node);
      }
      else if (type == PROTOTYPE_TUPLE_ARG) {
        return new RustPrototypeTupleArgImpl(node);
      }
      else if (type == PROTOTYPE_VARIABLE_ARG) {
        return new RustPrototypeVariableArgImpl(node);
      }
      else if (type == RANGE_MATCH_PATTERN) {
        return new RustRangeMatchPatternImpl(node);
      }
      else if (type == REF) {
        return new RustRefImpl(node);
      }
      else if (type == REGION_BOUND) {
        return new RustRegionBoundImpl(node);
      }
      else if (type == RETURN_STATEMENT) {
        return new RustReturnStatementImpl(node);
      }
      else if (type == STATEMENT_BLOCK) {
        return new RustStatementBlockImpl(node);
      }
      else if (type == STATIC_ITEM) {
        return new RustStaticItemImpl(node);
      }
      else if (type == STRUCT_BODY) {
        return new RustStructBodyImpl(node);
      }
      else if (type == STRUCT_BODY_BLOCK) {
        return new RustStructBodyBlockImpl(node);
      }
      else if (type == STRUCT_BODY_EMPTY) {
        return new RustStructBodyEmptyImpl(node);
      }
      else if (type == STRUCT_BODY_TUPLE) {
        return new RustStructBodyTupleImpl(node);
      }
      else if (type == STRUCT_DEFAULT) {
        return new RustStructDefaultImpl(node);
      }
      else if (type == STRUCT_INITIALIZER_LIST) {
        return new RustStructInitializerListImpl(node);
      }
      else if (type == STRUCT_ITEM) {
        return new RustStructItemImpl(node);
      }
      else if (type == STRUCT_MATCH_PATTERN) {
        return new RustStructMatchPatternImpl(node);
      }
      else if (type == STRUCT_PROPERTY) {
        return new RustStructPropertyImpl(node);
      }
      else if (type == STRUCT_RECOVER) {
        return new RustStructRecoverImpl(node);
      }
      else if (type == STRUCT_TUPLE_PROPERTY) {
        return new RustStructTuplePropertyImpl(node);
      }
      else if (type == TRAIT_BOUNDS) {
        return new RustTraitBoundsImpl(node);
      }
      else if (type == TRAIT_FUNCTION_DECLARATION) {
        return new RustTraitFunctionDeclarationImpl(node);
      }
      else if (type == TRAIT_IMPLEMENTS) {
        return new RustTraitImplementsImpl(node);
      }
      else if (type == TRAIT_ITEM) {
        return new RustTraitItemImpl(node);
      }
      else if (type == TUPLE_MATCH_PATTERN) {
        return new RustTupleMatchPatternImpl(node);
      }
      else if (type == TYPE_BASIC) {
        return new RustTypeBasicImpl(node);
      }
      else if (type == TYPE_CLOSURE) {
        return new RustTypeClosureImpl(node);
      }
      else if (type == TYPE_ITEM) {
        return new RustTypeItemImpl(node);
      }
      else if (type == TYPE_PROC) {
        return new RustTypeProcImpl(node);
      }
      else if (type == TYPE_TUPLE) {
        return new RustTypeTupleImpl(node);
      }
      else if (type == TYPE_UNIT) {
        return new RustTypeUnitImpl(node);
      }
      else if (type == TYPE_VECTOR) {
        return new RustTypeVectorImpl(node);
      }
      else if (type == USE) {
        return new RustUseImpl(node);
      }
      else if (type == VECTOR_MATCH_PATTERN) {
        return new RustVectorMatchPatternImpl(node);
      }
      else if (type == VISIBILITY) {
        return new RustVisibilityImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
