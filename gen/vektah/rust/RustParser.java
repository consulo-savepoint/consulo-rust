// This is a generated file. Not intended for manual editing.
package vektah.rust;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import com.intellij.lang.LanguageVersion;
import com.intellij.openapi.diagnostic.Logger;
import static vektah.rust.psi.RustTokens.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.lang.LighterASTNode;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class RustParser implements PsiParser {

  public static final Logger LOG_ = Logger.getInstance("vektah.rust.RustParser");

  public ASTNode parse(IElementType root_, PsiBuilder builder_, LanguageVersion _languageVersion) {
    boolean result_;
    builder_ = adapt_builder_(root_, builder_, this, EXTENDS_SETS_);
    Marker marker_ = enter_section_(builder_, 0, _COLLAPSE_, null);
    if (root_ == ATTRIBUTE) {
      result_ = attribute(builder_, 0);
    }
    else if (root_ == ATTRIBUTE_ARG) {
      result_ = attribute_arg(builder_, 0);
    }
    else if (root_ == BASIC_MATCH_PATTERN) {
      result_ = basic_match_pattern(builder_, 0);
    }
    else if (root_ == BLOCK_FOR) {
      result_ = block_for(builder_, 0);
    }
    else if (root_ == BLOCK_IF) {
      result_ = block_if(builder_, 0);
    }
    else if (root_ == BLOCK_LOOP) {
      result_ = block_loop(builder_, 0);
    }
    else if (root_ == BLOCK_MATCH) {
      result_ = block_match(builder_, 0);
    }
    else if (root_ == BLOCK_UNSAFE) {
      result_ = block_unsafe(builder_, 0);
    }
    else if (root_ == BLOCK_WHILE) {
      result_ = block_while(builder_, 0);
    }
    else if (root_ == CALL_PARAMS) {
      result_ = call_params(builder_, 0);
    }
    else if (root_ == CLOSURE_BODY) {
      result_ = closure_body(builder_, 0);
    }
    else if (root_ == CLOSURE_EXPR_ARGS) {
      result_ = closure_expr_args(builder_, 0);
    }
    else if (root_ == CLOSURE_PROTOTYPE_ARGS) {
      result_ = closure_prototype_args(builder_, 0);
    }
    else if (root_ == EMPTY_STATEMENT) {
      result_ = empty_statement(builder_, 0);
    }
    else if (root_ == ENUM_BODY) {
      result_ = enum_body(builder_, 0);
    }
    else if (root_ == ENUM_ITEM) {
      result_ = enum_item(builder_, 0);
    }
    else if (root_ == ENUM_VARIANT) {
      result_ = enum_variant(builder_, 0);
    }
    else if (root_ == ENUM_VARIANT_NULLARY) {
      result_ = enum_variant_nullary(builder_, 0);
    }
    else if (root_ == ENUM_VARIANT_STRUCT) {
      result_ = enum_variant_struct(builder_, 0);
    }
    else if (root_ == ENUM_VARIANT_STRUCT_MEMBER) {
      result_ = enum_variant_struct_member(builder_, 0);
    }
    else if (root_ == ENUM_VARIANT_TUPLE) {
      result_ = enum_variant_tuple(builder_, 0);
    }
    else if (root_ == EXPR) {
      result_ = expr(builder_, 0, -1);
    }
    else if (root_ == EXPR_AS) {
      result_ = expr(builder_, 0, 13);
    }
    else if (root_ == EXPR_ASSIGN) {
      result_ = expr(builder_, 0, 3);
    }
    else if (root_ == EXPR_ASSIGN_AND) {
      result_ = expr(builder_, 0, 3);
    }
    else if (root_ == EXPR_ASSIGN_DECREMENT) {
      result_ = expr(builder_, 0, 3);
    }
    else if (root_ == EXPR_ASSIGN_DIVIDE) {
      result_ = expr(builder_, 0, 3);
    }
    else if (root_ == EXPR_ASSIGN_INCREMENT) {
      result_ = expr(builder_, 0, 3);
    }
    else if (root_ == EXPR_ASSIGN_LEFT_SHIFT) {
      result_ = expr(builder_, 0, 3);
    }
    else if (root_ == EXPR_ASSIGN_MODULO) {
      result_ = expr(builder_, 0, 3);
    }
    else if (root_ == EXPR_ASSIGN_MULTIPLY) {
      result_ = expr(builder_, 0, 3);
    }
    else if (root_ == EXPR_ASSIGN_NOT) {
      result_ = expr(builder_, 0, 3);
    }
    else if (root_ == EXPR_ASSIGN_OR) {
      result_ = expr(builder_, 0, 3);
    }
    else if (root_ == EXPR_ASSIGN_RIGHT_SHIFT) {
      result_ = expr(builder_, 0, 3);
    }
    else if (root_ == EXPR_BITWISE_AND) {
      result_ = expr(builder_, 0, 10);
    }
    else if (root_ == EXPR_BITWISE_OR) {
      result_ = expr(builder_, 0, 8);
    }
    else if (root_ == EXPR_BITWISE_XOR) {
      result_ = expr(builder_, 0, 9);
    }
    else if (root_ == EXPR_BLOCK) {
      result_ = expr_block(builder_, 0);
    }
    else if (root_ == EXPR_BORROW) {
      result_ = expr_borrow(builder_, 0);
    }
    else if (root_ == EXPR_BOX) {
      result_ = expr_box(builder_, 0);
    }
    else if (root_ == EXPR_BREAK) {
      result_ = expr_break(builder_, 0);
    }
    else if (root_ == EXPR_CALL) {
      result_ = expr(builder_, 0, 1);
    }
    else if (root_ == EXPR_CLOSURE) {
      result_ = expr_closure(builder_, 0);
    }
    else if (root_ == EXPR_CONTINUE) {
      result_ = expr_continue(builder_, 0);
    }
    else if (root_ == EXPR_DEREF) {
      result_ = expr_deref(builder_, 0);
    }
    else if (root_ == EXPR_DIVIDE) {
      result_ = expr(builder_, 0, 14);
    }
    else if (root_ == EXPR_EQUAL_TO) {
      result_ = expr(builder_, 0, 6);
    }
    else if (root_ == EXPR_FIELD) {
      result_ = expr(builder_, 0, 18);
    }
    else if (root_ == EXPR_GREATER_OR_EQUAL) {
      result_ = expr(builder_, 0, 7);
    }
    else if (root_ == EXPR_GREATER_THAN) {
      result_ = expr(builder_, 0, 7);
    }
    else if (root_ == EXPR_IDENTIFIER) {
      result_ = expr_identifier(builder_, 0);
    }
    else if (root_ == EXPR_INDEX) {
      result_ = expr(builder_, 0, 17);
    }
    else if (root_ == EXPR_LEFT_SHIFT) {
      result_ = expr(builder_, 0, 11);
    }
    else if (root_ == EXPR_LESS_OR_EQUAL) {
      result_ = expr(builder_, 0, 7);
    }
    else if (root_ == EXPR_LESS_THAN) {
      result_ = expr(builder_, 0, 7);
    }
    else if (root_ == EXPR_LOGICAL_AND) {
      result_ = expr(builder_, 0, 5);
    }
    else if (root_ == EXPR_LOGICAL_OR) {
      result_ = expr(builder_, 0, 4);
    }
    else if (root_ == EXPR_MACRO) {
      result_ = expr_macro(builder_, 0);
    }
    else if (root_ == EXPR_MANAGED_BOX) {
      result_ = expr_managed_box(builder_, 0);
    }
    else if (root_ == EXPR_MINUS) {
      result_ = expr(builder_, 0, 12);
    }
    else if (root_ == EXPR_MODULO) {
      result_ = expr(builder_, 0, 14);
    }
    else if (root_ == EXPR_MULTIPLY) {
      result_ = expr(builder_, 0, 14);
    }
    else if (root_ == EXPR_NOT_EQUAL_TO) {
      result_ = expr(builder_, 0, 6);
    }
    else if (root_ == EXPR_OLD_BOX) {
      result_ = expr_old_box(builder_, 0);
    }
    else if (root_ == EXPR_PAREN) {
      result_ = expr_paren(builder_, 0);
    }
    else if (root_ == EXPR_PATH) {
      result_ = expr_path(builder_, 0);
    }
    else if (root_ == EXPR_PLUS) {
      result_ = expr(builder_, 0, 12);
    }
    else if (root_ == EXPR_PROC) {
      result_ = expr_proc(builder_, 0);
    }
    else if (root_ == EXPR_RIGHT_SHIFT) {
      result_ = expr(builder_, 0, 11);
    }
    else if (root_ == EXPR_STRUCT_INITIALIZER) {
      result_ = expr(builder_, 0, 19);
    }
    else if (root_ == EXPR_TUPLE_BODY) {
      result_ = expr_tuple_body(builder_, 0);
    }
    else if (root_ == EXPR_UNARY_MINUS) {
      result_ = expr_unary_minus(builder_, 0);
    }
    else if (root_ == EXPR_UNARY_NOT) {
      result_ = expr_unary_not(builder_, 0);
    }
    else if (root_ == EXPR_UNARY_PLUS) {
      result_ = expr_unary_plus(builder_, 0);
    }
    else if (root_ == EXPR_VALUE) {
      result_ = expr_value(builder_, 0);
    }
    else if (root_ == EXPR_VECTOR) {
      result_ = expr_vector(builder_, 0);
    }
    else if (root_ == EXTERN_BLOCK) {
      result_ = extern_block(builder_, 0);
    }
    else if (root_ == EXTERN_CRATE) {
      result_ = extern_crate(builder_, 0);
    }
    else if (root_ == EXTERN_FUNCTION) {
      result_ = extern_function(builder_, 0);
    }
    else if (root_ == EXTERN_ITEM) {
      result_ = extern_item(builder_, 0);
    }
    else if (root_ == EXTERN_VARIABLE) {
      result_ = extern_variable(builder_, 0);
    }
    else if (root_ == FN_ARGS) {
      result_ = fn_args(builder_, 0);
    }
    else if (root_ == FN_DECLARATION) {
      result_ = fn_declaration(builder_, 0);
    }
    else if (root_ == FN_ITEM) {
      result_ = fn_item(builder_, 0);
    }
    else if (root_ == FN_PROTOTYPE_ARGS) {
      result_ = fn_prototype_args(builder_, 0);
    }
    else if (root_ == FUNCTION_TYPE) {
      result_ = function_type(builder_, 0);
    }
    else if (root_ == GENERIC) {
      result_ = generic(builder_, 0);
    }
    else if (root_ == GENERIC_PARAMS) {
      result_ = generic_params(builder_, 0);
    }
    else if (root_ == IF_TAIL) {
      result_ = if_tail(builder_, 0);
    }
    else if (root_ == IMPL_BLOCK) {
      result_ = impl_block(builder_, 0);
    }
    else if (root_ == IMPL_BODY) {
      result_ = impl_body(builder_, 0);
    }
    else if (root_ == IMPL_FOR) {
      result_ = impl_for(builder_, 0);
    }
    else if (root_ == IMPL_ITEM) {
      result_ = impl_item(builder_, 0);
    }
    else if (root_ == INDEX_EXPR) {
      result_ = index_expr(builder_, 0);
    }
    else if (root_ == ITEM) {
      result_ = item(builder_, 0);
    }
    else if (root_ == LET) {
      result_ = let(builder_, 0);
    }
    else if (root_ == LET_ARGS) {
      result_ = let_args(builder_, 0);
    }
    else if (root_ == LET_BIND) {
      result_ = let_bind(builder_, 0);
    }
    else if (root_ == LET_SELF_ARG) {
      result_ = let_self_arg(builder_, 0);
    }
    else if (root_ == LET_STRUCT_BIND) {
      result_ = let_struct_bind(builder_, 0);
    }
    else if (root_ == LET_TUPLE_BIND) {
      result_ = let_tuple_bind(builder_, 0);
    }
    else if (root_ == LET_UNIT_BIND) {
      result_ = let_unit_bind(builder_, 0);
    }
    else if (root_ == LET_VARIABLE_BIND) {
      result_ = let_variable_bind(builder_, 0);
    }
    else if (root_ == LIFETIME) {
      result_ = lifetime(builder_, 0);
    }
    else if (root_ == MACRO_BODY) {
      result_ = macro_body(builder_, 0);
    }
    else if (root_ == MACRO_BRACE) {
      result_ = macro_brace(builder_, 0);
    }
    else if (root_ == MACRO_BRACKET) {
      result_ = macro_bracket(builder_, 0);
    }
    else if (root_ == MACRO_PAREN) {
      result_ = macro_paren(builder_, 0);
    }
    else if (root_ == MACRO_RULES) {
      result_ = macro_rules(builder_, 0);
    }
    else if (root_ == MATCH_ARM) {
      result_ = match_arm(builder_, 0);
    }
    else if (root_ == MATCH_BLOCK) {
      result_ = match_block(builder_, 0);
    }
    else if (root_ == MATCH_BODY) {
      result_ = match_body(builder_, 0);
    }
    else if (root_ == MATCH_FILTER) {
      result_ = match_filter(builder_, 0);
    }
    else if (root_ == MATCH_IDENTIFIER) {
      result_ = match_identifier(builder_, 0);
    }
    else if (root_ == MATCH_IF) {
      result_ = match_if(builder_, 0);
    }
    else if (root_ == MATCH_LABEL) {
      result_ = match_label(builder_, 0);
    }
    else if (root_ == MATCH_PATTERN) {
      result_ = match_pattern(builder_, 0);
    }
    else if (root_ == MOD_ITEM) {
      result_ = mod_item(builder_, 0);
    }
    else if (root_ == PROTOTYPE_ARG) {
      result_ = prototype_arg(builder_, 0);
    }
    else if (root_ == PROTOTYPE_ARGS) {
      result_ = prototype_args(builder_, 0);
    }
    else if (root_ == PROTOTYPE_SELF_ARG) {
      result_ = prototype_self_arg(builder_, 0);
    }
    else if (root_ == PROTOTYPE_STRUCT_ARG) {
      result_ = prototype_struct_arg(builder_, 0);
    }
    else if (root_ == PROTOTYPE_TUPLE_ARG) {
      result_ = prototype_tuple_arg(builder_, 0);
    }
    else if (root_ == PROTOTYPE_VARIABLE_ARG) {
      result_ = prototype_variable_arg(builder_, 0);
    }
    else if (root_ == RANGE_MATCH_PATTERN) {
      result_ = range_match_pattern(builder_, 0);
    }
    else if (root_ == REF) {
      result_ = ref(builder_, 0);
    }
    else if (root_ == REGION_BOUND) {
      result_ = region_bound(builder_, 0);
    }
    else if (root_ == RETURN_STATEMENT) {
      result_ = return_statement(builder_, 0);
    }
    else if (root_ == STATEMENT_BLOCK) {
      result_ = statement_block(builder_, 0);
    }
    else if (root_ == STATIC_ITEM) {
      result_ = static_item(builder_, 0);
    }
    else if (root_ == STRUCT_BODY) {
      result_ = struct_body(builder_, 0);
    }
    else if (root_ == STRUCT_BODY_BLOCK) {
      result_ = struct_body_block(builder_, 0);
    }
    else if (root_ == STRUCT_BODY_EMPTY) {
      result_ = struct_body_empty(builder_, 0);
    }
    else if (root_ == STRUCT_BODY_TUPLE) {
      result_ = struct_body_tuple(builder_, 0);
    }
    else if (root_ == STRUCT_DEFAULT) {
      result_ = struct_default(builder_, 0);
    }
    else if (root_ == STRUCT_INITIALIZER_LIST) {
      result_ = struct_initializer_list(builder_, 0);
    }
    else if (root_ == STRUCT_ITEM) {
      result_ = struct_item(builder_, 0);
    }
    else if (root_ == STRUCT_MATCH_PATTERN) {
      result_ = struct_match_pattern(builder_, 0);
    }
    else if (root_ == STRUCT_PROPERTY) {
      result_ = struct_property(builder_, 0);
    }
    else if (root_ == STRUCT_RECOVER) {
      result_ = struct_recover(builder_, 0);
    }
    else if (root_ == STRUCT_TUPLE_PROPERTY) {
      result_ = struct_tuple_property(builder_, 0);
    }
    else if (root_ == TRAIT_BOUNDS) {
      result_ = trait_bounds(builder_, 0);
    }
    else if (root_ == TRAIT_FUNCTION_DECLARATION) {
      result_ = trait_function_declaration(builder_, 0);
    }
    else if (root_ == TRAIT_IMPLEMENTS) {
      result_ = trait_implements(builder_, 0);
    }
    else if (root_ == TRAIT_ITEM) {
      result_ = trait_item(builder_, 0);
    }
    else if (root_ == TUPLE_MATCH_PATTERN) {
      result_ = tuple_match_pattern(builder_, 0);
    }
    else if (root_ == TYPE_BASIC) {
      result_ = type_basic(builder_, 0);
    }
    else if (root_ == TYPE_CLOSURE) {
      result_ = type_closure(builder_, 0);
    }
    else if (root_ == TYPE_ITEM) {
      result_ = type_item(builder_, 0);
    }
    else if (root_ == TYPE_PROC) {
      result_ = type_proc(builder_, 0);
    }
    else if (root_ == TYPE_TUPLE) {
      result_ = type_tuple(builder_, 0);
    }
    else if (root_ == TYPE_UNIT) {
      result_ = type_unit(builder_, 0);
    }
    else if (root_ == TYPE_VECTOR) {
      result_ = type_vector(builder_, 0);
    }
    else if (root_ == USE) {
      result_ = use(builder_, 0);
    }
    else if (root_ == VECTOR_MATCH_PATTERN) {
      result_ = vector_match_pattern(builder_, 0);
    }
    else if (root_ == VISIBILITY) {
      result_ = visibility(builder_, 0);
    }
    else {
      result_ = parse_root_(root_, builder_, 0);
    }
    exit_section_(builder_, 0, marker_, root_, result_, true, TRUE_CONDITION);
    return builder_.getTreeBuilt();
  }

  protected boolean parse_root_(final IElementType root_, final PsiBuilder builder_, final int level_) {
    return file(builder_, level_ + 1);
  }

  public static final TokenSet[] EXTENDS_SETS_ = new TokenSet[] {
    create_token_set_(ENUM_VARIANT, ENUM_VARIANT_NULLARY, ENUM_VARIANT_STRUCT, ENUM_VARIANT_STRUCT_MEMBER,
      ENUM_VARIANT_TUPLE),
    create_token_set_(BLOCK_FOR, BLOCK_IF, BLOCK_LOOP, BLOCK_MATCH,
      BLOCK_UNSAFE, BLOCK_WHILE, EXPR, EXPR_AS,
      EXPR_ASSIGN, EXPR_ASSIGN_AND, EXPR_ASSIGN_DECREMENT, EXPR_ASSIGN_DIVIDE,
      EXPR_ASSIGN_INCREMENT, EXPR_ASSIGN_LEFT_SHIFT, EXPR_ASSIGN_MODULO, EXPR_ASSIGN_MULTIPLY,
      EXPR_ASSIGN_NOT, EXPR_ASSIGN_OR, EXPR_ASSIGN_RIGHT_SHIFT, EXPR_BITWISE_AND,
      EXPR_BITWISE_OR, EXPR_BITWISE_XOR, EXPR_BLOCK, EXPR_BORROW,
      EXPR_BOX, EXPR_BREAK, EXPR_CALL, EXPR_CLOSURE,
      EXPR_CONTINUE, EXPR_DEREF, EXPR_DIVIDE, EXPR_EQUAL_TO,
      EXPR_FIELD, EXPR_GREATER_OR_EQUAL, EXPR_GREATER_THAN, EXPR_IDENTIFIER,
      EXPR_INDEX, EXPR_LEFT_SHIFT, EXPR_LESS_OR_EQUAL, EXPR_LESS_THAN,
      EXPR_LOGICAL_AND, EXPR_LOGICAL_OR, EXPR_MACRO, EXPR_MANAGED_BOX,
      EXPR_MINUS, EXPR_MODULO, EXPR_MULTIPLY, EXPR_NOT_EQUAL_TO,
      EXPR_OLD_BOX, EXPR_PAREN, EXPR_PATH, EXPR_PLUS,
      EXPR_PROC, EXPR_RIGHT_SHIFT, EXPR_STRUCT_INITIALIZER, EXPR_TUPLE_BODY,
      EXPR_UNARY_MINUS, EXPR_UNARY_NOT, EXPR_UNARY_PLUS, EXPR_VALUE,
      EXPR_VECTOR),
    create_token_set_(BLOCK_FOR, BLOCK_IF, BLOCK_LOOP, BLOCK_MATCH,
      BLOCK_UNSAFE, BLOCK_WHILE, EXPR_BLOCK),
    create_token_set_(ENUM_ITEM, EXTERN_ITEM, FN_ITEM, IMPL_ITEM,
      ITEM, MOD_ITEM, STATIC_ITEM, STRUCT_ITEM,
      TRAIT_ITEM, TYPE_ITEM),
    create_token_set_(LET_BIND, LET_STRUCT_BIND, LET_TUPLE_BIND, LET_UNIT_BIND,
      LET_VARIABLE_BIND),
    create_token_set_(BASIC_MATCH_PATTERN, MATCH_PATTERN, RANGE_MATCH_PATTERN, STRUCT_MATCH_PATTERN,
      TUPLE_MATCH_PATTERN, VECTOR_MATCH_PATTERN),
    create_token_set_(STRUCT_BODY, STRUCT_BODY_BLOCK, STRUCT_BODY_EMPTY, STRUCT_BODY_TUPLE),
  };

  /* ********************************************************** */
  // !(']' | ';')
  static boolean attrib_recover(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "attrib_recover")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NOT_, null);
    result_ = !attrib_recover_0(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, null, result_, false, null);
    return result_;
  }

  // ']' | ';'
  private static boolean attrib_recover_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "attrib_recover_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, CLOSE_SQUARE_BRACKET);
    if (!result_) result_ = consumeToken(builder_, SEMICOLON);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // attribute_internal ']'
  public static boolean attribute(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "attribute")) return false;
    if (!nextTokenIs(builder_, HASH)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = attribute_internal(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, CLOSE_SQUARE_BRACKET);
    exit_section_(builder_, marker_, ATTRIBUTE, result_);
    return result_;
  }

  /* ********************************************************** */
  // IDENTIFIER [ '=' literal | '(' attribute_list ')' ]
  public static boolean attribute_arg(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "attribute_arg")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, IDENTIFIER);
    result_ = result_ && attribute_arg_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, ATTRIBUTE_ARG, result_);
    return result_;
  }

  // [ '=' literal | '(' attribute_list ')' ]
  private static boolean attribute_arg_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "attribute_arg_1")) return false;
    attribute_arg_1_0(builder_, level_ + 1);
    return true;
  }

  // '=' literal | '(' attribute_list ')'
  private static boolean attribute_arg_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "attribute_arg_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = attribute_arg_1_0_0(builder_, level_ + 1);
    if (!result_) result_ = attribute_arg_1_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '=' literal
  private static boolean attribute_arg_1_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "attribute_arg_1_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, ASSIGN);
    result_ = result_ && literal(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '(' attribute_list ')'
  private static boolean attribute_arg_1_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "attribute_arg_1_0_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, OPEN_PAREN);
    result_ = result_ && attribute_list(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, CLOSE_PAREN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // '#' '!'? '[' attribute_list
  static boolean attribute_internal(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "attribute_internal")) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, HASH);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, attribute_internal_1(builder_, level_ + 1));
    result_ = pinned_ && report_error_(builder_, consumeToken(builder_, OPEN_SQUARE_BRACKET)) && result_;
    result_ = pinned_ && attribute_list(builder_, level_ + 1) && result_;
    exit_section_(builder_, level_, marker_, null, result_, pinned_, attrib_recover_parser_);
    return result_ || pinned_;
  }

  // '!'?
  private static boolean attribute_internal_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "attribute_internal_1")) return false;
    consumeToken(builder_, NOT);
    return true;
  }

  /* ********************************************************** */
  // attribute_arg ( ',' attribute_arg )*
  static boolean attribute_list(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "attribute_list")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = attribute_arg(builder_, level_ + 1);
    result_ = result_ && attribute_list_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ( ',' attribute_arg )*
  private static boolean attribute_list_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "attribute_list_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!attribute_list_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "attribute_list_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // ',' attribute_arg
  private static boolean attribute_list_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "attribute_list_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && attribute_arg(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // match_label? ('&'? 'box'? literal | type | match_identifier )
  public static boolean basic_match_pattern(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "basic_match_pattern")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _COLLAPSE_, "<basic match pattern>");
    result_ = basic_match_pattern_0(builder_, level_ + 1);
    result_ = result_ && basic_match_pattern_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, BASIC_MATCH_PATTERN, result_, false, null);
    return result_;
  }

  // match_label?
  private static boolean basic_match_pattern_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "basic_match_pattern_0")) return false;
    match_label(builder_, level_ + 1);
    return true;
  }

  // '&'? 'box'? literal | type | match_identifier
  private static boolean basic_match_pattern_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "basic_match_pattern_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = basic_match_pattern_1_0(builder_, level_ + 1);
    if (!result_) result_ = type(builder_, level_ + 1);
    if (!result_) result_ = match_identifier(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '&'? 'box'? literal
  private static boolean basic_match_pattern_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "basic_match_pattern_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = basic_match_pattern_1_0_0(builder_, level_ + 1);
    result_ = result_ && basic_match_pattern_1_0_1(builder_, level_ + 1);
    result_ = result_ && literal(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '&'?
  private static boolean basic_match_pattern_1_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "basic_match_pattern_1_0_0")) return false;
    consumeToken(builder_, BITWISE_AND);
    return true;
  }

  // 'box'?
  private static boolean basic_match_pattern_1_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "basic_match_pattern_1_0_1")) return false;
    consumeToken(builder_, KW_BOX);
    return true;
  }

  /* ********************************************************** */
  // 'for' let_bind 'in' expr statement_block
  public static boolean block_for(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "block_for")) return false;
    if (!nextTokenIs(builder_, KW_FOR)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, KW_FOR);
    result_ = result_ && let_bind(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, KW_IN);
    result_ = result_ && expr(builder_, level_ + 1, -1);
    result_ = result_ && statement_block(builder_, level_ + 1);
    exit_section_(builder_, marker_, BLOCK_FOR, result_);
    return result_;
  }

  /* ********************************************************** */
  // 'if' expr statement_block if_tail
  public static boolean block_if(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "block_if")) return false;
    if (!nextTokenIs(builder_, KW_IF)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, KW_IF);
    result_ = result_ && expr(builder_, level_ + 1, -1);
    result_ = result_ && statement_block(builder_, level_ + 1);
    result_ = result_ && if_tail(builder_, level_ + 1);
    exit_section_(builder_, marker_, BLOCK_IF, result_);
    return result_;
  }

  /* ********************************************************** */
  // [lifetime ':'] 'loop' statement_block
  public static boolean block_loop(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "block_loop")) return false;
    if (!nextTokenIs(builder_, "<block loop>", SINGLE_QUOTE, KW_LOOP)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<block loop>");
    result_ = block_loop_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, KW_LOOP);
    result_ = result_ && statement_block(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, BLOCK_LOOP, result_, false, null);
    return result_;
  }

  // [lifetime ':']
  private static boolean block_loop_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "block_loop_0")) return false;
    block_loop_0_0(builder_, level_ + 1);
    return true;
  }

  // lifetime ':'
  private static boolean block_loop_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "block_loop_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = lifetime(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, COLON);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // 'match' expr match_block
  public static boolean block_match(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "block_match")) return false;
    if (!nextTokenIs(builder_, KW_MATCH)) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, KW_MATCH);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, expr(builder_, level_ + 1, -1));
    result_ = pinned_ && match_block(builder_, level_ + 1) && result_;
    exit_section_(builder_, level_, marker_, BLOCK_MATCH, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // 'unsafe' statement_block
  public static boolean block_unsafe(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "block_unsafe")) return false;
    if (!nextTokenIs(builder_, KW_UNSAFE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, KW_UNSAFE);
    result_ = result_ && statement_block(builder_, level_ + 1);
    exit_section_(builder_, marker_, BLOCK_UNSAFE, result_);
    return result_;
  }

  /* ********************************************************** */
  // 'while' expr statement_block
  public static boolean block_while(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "block_while")) return false;
    if (!nextTokenIs(builder_, KW_WHILE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, KW_WHILE);
    result_ = result_ && expr(builder_, level_ + 1, -1);
    result_ = result_ && statement_block(builder_, level_ + 1);
    exit_section_(builder_, marker_, BLOCK_WHILE, result_);
    return result_;
  }

  /* ********************************************************** */
  // expr? (',' expr)* ','?
  public static boolean call_params(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "call_params")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<call params>");
    result_ = call_params_0(builder_, level_ + 1);
    result_ = result_ && call_params_1(builder_, level_ + 1);
    result_ = result_ && call_params_2(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, CALL_PARAMS, result_, false, null);
    return result_;
  }

  // expr?
  private static boolean call_params_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "call_params_0")) return false;
    expr(builder_, level_ + 1, -1);
    return true;
  }

  // (',' expr)*
  private static boolean call_params_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "call_params_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!call_params_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "call_params_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // ',' expr
  private static boolean call_params_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "call_params_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && expr(builder_, level_ + 1, -1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ','?
  private static boolean call_params_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "call_params_2")) return false;
    consumeToken(builder_, COMMA);
    return true;
  }

  /* ********************************************************** */
  // ['->' type] (statement | expr | statement_block)
  public static boolean closure_body(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "closure_body")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<closure body>");
    result_ = closure_body_0(builder_, level_ + 1);
    result_ = result_ && closure_body_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, CLOSURE_BODY, result_, false, null);
    return result_;
  }

  // ['->' type]
  private static boolean closure_body_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "closure_body_0")) return false;
    closure_body_0_0(builder_, level_ + 1);
    return true;
  }

  // '->' type
  private static boolean closure_body_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "closure_body_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, THIN_ARROW);
    result_ = result_ && type(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // statement | expr | statement_block
  private static boolean closure_body_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "closure_body_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = statement(builder_, level_ + 1);
    if (!result_) result_ = expr(builder_, level_ + 1, -1);
    if (!result_) result_ = statement_block(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // '|' let_args '|'
  public static boolean closure_expr_args(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "closure_expr_args")) return false;
    if (!nextTokenIs(builder_, BITWISE_OR)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, BITWISE_OR);
    result_ = result_ && let_args(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, BITWISE_OR);
    exit_section_(builder_, marker_, CLOSURE_EXPR_ARGS, result_);
    return result_;
  }

  /* ********************************************************** */
  // '|' prototype_args '|'
  public static boolean closure_prototype_args(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "closure_prototype_args")) return false;
    if (!nextTokenIs(builder_, BITWISE_OR)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, BITWISE_OR);
    result_ = result_ && prototype_args(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, BITWISE_OR);
    exit_section_(builder_, marker_, CLOSURE_PROTOTYPE_ARGS, result_);
    return result_;
  }

  /* ********************************************************** */
  // BLOCK_COMMENT|BLOCK_DOC_COMMENT|LINE_COMMENT|LINE_DOC_COMMENT
  static boolean comment(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "comment")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, BLOCK_COMMENT);
    if (!result_) result_ = consumeToken(builder_, BLOCK_DOC_COMMENT);
    if (!result_) result_ = consumeToken(builder_, LINE_COMMENT);
    if (!result_) result_ = consumeToken(builder_, LINE_DOC_COMMENT);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // ';'
  public static boolean empty_statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "empty_statement")) return false;
    if (!nextTokenIs(builder_, SEMICOLON)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, SEMICOLON);
    exit_section_(builder_, marker_, EMPTY_STATEMENT, result_);
    return result_;
  }

  /* ********************************************************** */
  // [ enum_variant (',' enum_variant)* ','? (comment | attribute)* ]
  public static boolean enum_body(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "enum_body")) return false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<enum body>");
    enum_body_0(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, ENUM_BODY, true, false, null);
    return true;
  }

  // enum_variant (',' enum_variant)* ','? (comment | attribute)*
  private static boolean enum_body_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "enum_body_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = enum_variant(builder_, level_ + 1);
    result_ = result_ && enum_body_0_1(builder_, level_ + 1);
    result_ = result_ && enum_body_0_2(builder_, level_ + 1);
    result_ = result_ && enum_body_0_3(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (',' enum_variant)*
  private static boolean enum_body_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "enum_body_0_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!enum_body_0_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "enum_body_0_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // ',' enum_variant
  private static boolean enum_body_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "enum_body_0_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && enum_variant(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ','?
  private static boolean enum_body_0_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "enum_body_0_2")) return false;
    consumeToken(builder_, COMMA);
    return true;
  }

  // (comment | attribute)*
  private static boolean enum_body_0_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "enum_body_0_3")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!enum_body_0_3_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "enum_body_0_3", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // comment | attribute
  private static boolean enum_body_0_3_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "enum_body_0_3_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = comment(builder_, level_ + 1);
    if (!result_) result_ = attribute(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // visibility? 'enum' IDENTIFIER generic_params? '{' enum_body '}'
  public static boolean enum_item(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "enum_item")) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<enum item>");
    result_ = enum_item_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, KW_ENUM);
    pinned_ = result_; // pin = 2
    result_ = result_ && report_error_(builder_, consumeToken(builder_, IDENTIFIER));
    result_ = pinned_ && report_error_(builder_, enum_item_3(builder_, level_ + 1)) && result_;
    result_ = pinned_ && report_error_(builder_, consumeToken(builder_, OPEN_BRACE)) && result_;
    result_ = pinned_ && report_error_(builder_, enum_body(builder_, level_ + 1)) && result_;
    result_ = pinned_ && consumeToken(builder_, CLOSE_BRACE) && result_;
    exit_section_(builder_, level_, marker_, ENUM_ITEM, result_, pinned_, null);
    return result_ || pinned_;
  }

  // visibility?
  private static boolean enum_item_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "enum_item_0")) return false;
    visibility(builder_, level_ + 1);
    return true;
  }

  // generic_params?
  private static boolean enum_item_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "enum_item_3")) return false;
    generic_params(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // enum_variant_nullary | enum_variant_tuple | enum_variant_struct
  public static boolean enum_variant(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "enum_variant")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _COLLAPSE_, "<enum variant>");
    result_ = enum_variant_nullary(builder_, level_ + 1);
    if (!result_) result_ = enum_variant_tuple(builder_, level_ + 1);
    if (!result_) result_ = enum_variant_struct(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, ENUM_VARIANT, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // (comment | attribute)* IDENTIFIER !('(' | '{') ['=' expr]
  public static boolean enum_variant_nullary(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "enum_variant_nullary")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<enum variant nullary>");
    result_ = enum_variant_nullary_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, IDENTIFIER);
    result_ = result_ && enum_variant_nullary_2(builder_, level_ + 1);
    result_ = result_ && enum_variant_nullary_3(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, ENUM_VARIANT_NULLARY, result_, false, null);
    return result_;
  }

  // (comment | attribute)*
  private static boolean enum_variant_nullary_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "enum_variant_nullary_0")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!enum_variant_nullary_0_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "enum_variant_nullary_0", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // comment | attribute
  private static boolean enum_variant_nullary_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "enum_variant_nullary_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = comment(builder_, level_ + 1);
    if (!result_) result_ = attribute(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // !('(' | '{')
  private static boolean enum_variant_nullary_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "enum_variant_nullary_2")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NOT_, null);
    result_ = !enum_variant_nullary_2_0(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, null, result_, false, null);
    return result_;
  }

  // '(' | '{'
  private static boolean enum_variant_nullary_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "enum_variant_nullary_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, OPEN_PAREN);
    if (!result_) result_ = consumeToken(builder_, OPEN_BRACE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ['=' expr]
  private static boolean enum_variant_nullary_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "enum_variant_nullary_3")) return false;
    enum_variant_nullary_3_0(builder_, level_ + 1);
    return true;
  }

  // '=' expr
  private static boolean enum_variant_nullary_3_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "enum_variant_nullary_3_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, ASSIGN);
    result_ = result_ && expr(builder_, level_ + 1, -1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // (comment | attribute)* IDENTIFIER '{' enum_variant_struct_member (',' enum_variant_struct_member)* ','? '}'
  public static boolean enum_variant_struct(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "enum_variant_struct")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<enum variant struct>");
    result_ = enum_variant_struct_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, IDENTIFIER);
    result_ = result_ && consumeToken(builder_, OPEN_BRACE);
    result_ = result_ && enum_variant_struct_member(builder_, level_ + 1);
    result_ = result_ && enum_variant_struct_4(builder_, level_ + 1);
    result_ = result_ && enum_variant_struct_5(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, CLOSE_BRACE);
    exit_section_(builder_, level_, marker_, ENUM_VARIANT_STRUCT, result_, false, null);
    return result_;
  }

  // (comment | attribute)*
  private static boolean enum_variant_struct_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "enum_variant_struct_0")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!enum_variant_struct_0_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "enum_variant_struct_0", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // comment | attribute
  private static boolean enum_variant_struct_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "enum_variant_struct_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = comment(builder_, level_ + 1);
    if (!result_) result_ = attribute(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (',' enum_variant_struct_member)*
  private static boolean enum_variant_struct_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "enum_variant_struct_4")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!enum_variant_struct_4_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "enum_variant_struct_4", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // ',' enum_variant_struct_member
  private static boolean enum_variant_struct_4_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "enum_variant_struct_4_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && enum_variant_struct_member(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ','?
  private static boolean enum_variant_struct_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "enum_variant_struct_5")) return false;
    consumeToken(builder_, COMMA);
    return true;
  }

  /* ********************************************************** */
  // visibility? IDENTIFIER ':' type
  public static boolean enum_variant_struct_member(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "enum_variant_struct_member")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<enum variant struct member>");
    result_ = enum_variant_struct_member_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, IDENTIFIER);
    result_ = result_ && consumeToken(builder_, COLON);
    result_ = result_ && type(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, ENUM_VARIANT_STRUCT_MEMBER, result_, false, null);
    return result_;
  }

  // visibility?
  private static boolean enum_variant_struct_member_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "enum_variant_struct_member_0")) return false;
    visibility(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // (comment | attribute)* IDENTIFIER '(' type (',' type)* ')'
  public static boolean enum_variant_tuple(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "enum_variant_tuple")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<enum variant tuple>");
    result_ = enum_variant_tuple_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, IDENTIFIER);
    result_ = result_ && consumeToken(builder_, OPEN_PAREN);
    result_ = result_ && type(builder_, level_ + 1);
    result_ = result_ && enum_variant_tuple_4(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, CLOSE_PAREN);
    exit_section_(builder_, level_, marker_, ENUM_VARIANT_TUPLE, result_, false, null);
    return result_;
  }

  // (comment | attribute)*
  private static boolean enum_variant_tuple_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "enum_variant_tuple_0")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!enum_variant_tuple_0_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "enum_variant_tuple_0", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // comment | attribute
  private static boolean enum_variant_tuple_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "enum_variant_tuple_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = comment(builder_, level_ + 1);
    if (!result_) result_ = attribute(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (',' type)*
  private static boolean enum_variant_tuple_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "enum_variant_tuple_4")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!enum_variant_tuple_4_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "enum_variant_tuple_4", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // ',' type
  private static boolean enum_variant_tuple_4_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "enum_variant_tuple_4_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && type(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // ',' [expr (',' expr)*]
  public static boolean expr_tuple_body(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_tuple_body")) return false;
    if (!nextTokenIsFast(builder_, COMMA)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokenFast(builder_, COMMA);
    result_ = result_ && expr_tuple_body_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, EXPR_TUPLE_BODY, result_);
    return result_;
  }

  // [expr (',' expr)*]
  private static boolean expr_tuple_body_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_tuple_body_1")) return false;
    expr_tuple_body_1_0(builder_, level_ + 1);
    return true;
  }

  // expr (',' expr)*
  private static boolean expr_tuple_body_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_tuple_body_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = expr(builder_, level_ + 1, -1);
    result_ = result_ && expr_tuple_body_1_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (',' expr)*
  private static boolean expr_tuple_body_1_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_tuple_body_1_0_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!expr_tuple_body_1_0_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "expr_tuple_body_1_0_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // ',' expr
  private static boolean expr_tuple_body_1_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_tuple_body_1_0_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokenFast(builder_, COMMA);
    result_ = result_ && expr(builder_, level_ + 1, -1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // STRING_LIT? '{' (attribute | extern_variable ';' | trait_function_declaration ';')*
  public static boolean extern_block(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "extern_block")) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<extern block>");
    result_ = extern_block_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, OPEN_BRACE);
    pinned_ = result_; // pin = 2
    result_ = result_ && extern_block_2(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, EXTERN_BLOCK, result_, pinned_, not_close_brace_parser_);
    return result_ || pinned_;
  }

  // STRING_LIT?
  private static boolean extern_block_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "extern_block_0")) return false;
    consumeToken(builder_, STRING_LIT);
    return true;
  }

  // (attribute | extern_variable ';' | trait_function_declaration ';')*
  private static boolean extern_block_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "extern_block_2")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!extern_block_2_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "extern_block_2", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // attribute | extern_variable ';' | trait_function_declaration ';'
  private static boolean extern_block_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "extern_block_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = attribute(builder_, level_ + 1);
    if (!result_) result_ = extern_block_2_0_1(builder_, level_ + 1);
    if (!result_) result_ = extern_block_2_0_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // extern_variable ';'
  private static boolean extern_block_2_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "extern_block_2_0_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = extern_variable(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, SEMICOLON);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // trait_function_declaration ';'
  private static boolean extern_block_2_0_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "extern_block_2_0_2")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = trait_function_declaration(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, SEMICOLON);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // 'crate' IDENTIFIER ['=' STRING_LIT]
  public static boolean extern_crate(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "extern_crate")) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<extern crate>");
    result_ = consumeToken(builder_, KW_CRATE);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, consumeToken(builder_, IDENTIFIER));
    result_ = pinned_ && extern_crate_2(builder_, level_ + 1) && result_;
    exit_section_(builder_, level_, marker_, EXTERN_CRATE, result_, pinned_, not_semicolon_parser_);
    return result_ || pinned_;
  }

  // ['=' STRING_LIT]
  private static boolean extern_crate_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "extern_crate_2")) return false;
    extern_crate_2_0(builder_, level_ + 1);
    return true;
  }

  // '=' STRING_LIT
  private static boolean extern_crate_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "extern_crate_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, ASSIGN);
    result_ = result_ && consumeToken(builder_, STRING_LIT);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // STRING_LIT? fn_item
  public static boolean extern_function(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "extern_function")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<extern function>");
    result_ = extern_function_0(builder_, level_ + 1);
    result_ = result_ && fn_item(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, EXTERN_FUNCTION, result_, false, null);
    return result_;
  }

  // STRING_LIT?
  private static boolean extern_function_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "extern_function_0")) return false;
    consumeToken(builder_, STRING_LIT);
    return true;
  }

  /* ********************************************************** */
  // visibility? 'unsafe'? 'extern' (extern_crate ';' | extern_block '}' | extern_function)
  public static boolean extern_item(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "extern_item")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<extern item>");
    result_ = extern_item_0(builder_, level_ + 1);
    result_ = result_ && extern_item_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, KW_EXTERN);
    result_ = result_ && extern_item_3(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, EXTERN_ITEM, result_, false, null);
    return result_;
  }

  // visibility?
  private static boolean extern_item_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "extern_item_0")) return false;
    visibility(builder_, level_ + 1);
    return true;
  }

  // 'unsafe'?
  private static boolean extern_item_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "extern_item_1")) return false;
    consumeToken(builder_, KW_UNSAFE);
    return true;
  }

  // extern_crate ';' | extern_block '}' | extern_function
  private static boolean extern_item_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "extern_item_3")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = extern_item_3_0(builder_, level_ + 1);
    if (!result_) result_ = extern_item_3_1(builder_, level_ + 1);
    if (!result_) result_ = extern_function(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // extern_crate ';'
  private static boolean extern_item_3_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "extern_item_3_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = extern_crate(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, SEMICOLON);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // extern_block '}'
  private static boolean extern_item_3_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "extern_item_3_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = extern_block(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, CLOSE_BRACE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // visibility? 'static'? 'ref'? ref? 'mut'? IDENTIFIER [':' type]
  public static boolean extern_variable(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "extern_variable")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<extern variable>");
    result_ = extern_variable_0(builder_, level_ + 1);
    result_ = result_ && extern_variable_1(builder_, level_ + 1);
    result_ = result_ && extern_variable_2(builder_, level_ + 1);
    result_ = result_ && extern_variable_3(builder_, level_ + 1);
    result_ = result_ && extern_variable_4(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, IDENTIFIER);
    result_ = result_ && extern_variable_6(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, EXTERN_VARIABLE, result_, false, null);
    return result_;
  }

  // visibility?
  private static boolean extern_variable_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "extern_variable_0")) return false;
    visibility(builder_, level_ + 1);
    return true;
  }

  // 'static'?
  private static boolean extern_variable_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "extern_variable_1")) return false;
    consumeToken(builder_, KW_STATIC);
    return true;
  }

  // 'ref'?
  private static boolean extern_variable_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "extern_variable_2")) return false;
    consumeToken(builder_, KW_REF);
    return true;
  }

  // ref?
  private static boolean extern_variable_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "extern_variable_3")) return false;
    ref(builder_, level_ + 1);
    return true;
  }

  // 'mut'?
  private static boolean extern_variable_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "extern_variable_4")) return false;
    consumeToken(builder_, KW_MUT);
    return true;
  }

  // [':' type]
  private static boolean extern_variable_6(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "extern_variable_6")) return false;
    extern_variable_6_0(builder_, level_ + 1);
    return true;
  }

  // ':' type
  private static boolean extern_variable_6_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "extern_variable_6_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COLON);
    result_ = result_ && type(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // mod_contents
  static boolean file(PsiBuilder builder_, int level_) {
    return mod_contents(builder_, level_ + 1);
  }

  /* ********************************************************** */
  // '(' let_args ')'
  public static boolean fn_args(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "fn_args")) return false;
    if (!nextTokenIs(builder_, OPEN_PAREN)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, OPEN_PAREN);
    result_ = result_ && let_args(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, CLOSE_PAREN);
    exit_section_(builder_, marker_, FN_ARGS, result_);
    return result_;
  }

  /* ********************************************************** */
  // visibility? 'unsafe'? 'fn' IDENTIFIER generic_params? fn_args ['->' return_type]
  public static boolean fn_declaration(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "fn_declaration")) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<fn declaration>");
    result_ = fn_declaration_0(builder_, level_ + 1);
    result_ = result_ && fn_declaration_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, KW_FN);
    pinned_ = result_; // pin = 3
    result_ = result_ && report_error_(builder_, consumeToken(builder_, IDENTIFIER));
    result_ = pinned_ && report_error_(builder_, fn_declaration_4(builder_, level_ + 1)) && result_;
    result_ = pinned_ && report_error_(builder_, fn_args(builder_, level_ + 1)) && result_;
    result_ = pinned_ && fn_declaration_6(builder_, level_ + 1) && result_;
    exit_section_(builder_, level_, marker_, FN_DECLARATION, result_, pinned_, function_recover_parser_);
    return result_ || pinned_;
  }

  // visibility?
  private static boolean fn_declaration_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "fn_declaration_0")) return false;
    visibility(builder_, level_ + 1);
    return true;
  }

  // 'unsafe'?
  private static boolean fn_declaration_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "fn_declaration_1")) return false;
    consumeToken(builder_, KW_UNSAFE);
    return true;
  }

  // generic_params?
  private static boolean fn_declaration_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "fn_declaration_4")) return false;
    generic_params(builder_, level_ + 1);
    return true;
  }

  // ['->' return_type]
  private static boolean fn_declaration_6(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "fn_declaration_6")) return false;
    fn_declaration_6_0(builder_, level_ + 1);
    return true;
  }

  // '->' return_type
  private static boolean fn_declaration_6_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "fn_declaration_6_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, THIN_ARROW);
    result_ = result_ && return_type(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // (comment | attribute)* fn_declaration statement_block
  public static boolean fn_item(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "fn_item")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<fn item>");
    result_ = fn_item_0(builder_, level_ + 1);
    result_ = result_ && fn_declaration(builder_, level_ + 1);
    result_ = result_ && statement_block(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, FN_ITEM, result_, false, null);
    return result_;
  }

  // (comment | attribute)*
  private static boolean fn_item_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "fn_item_0")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!fn_item_0_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "fn_item_0", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // comment | attribute
  private static boolean fn_item_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "fn_item_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = comment(builder_, level_ + 1);
    if (!result_) result_ = attribute(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // '(' prototype_args ')'
  public static boolean fn_prototype_args(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "fn_prototype_args")) return false;
    if (!nextTokenIs(builder_, OPEN_PAREN)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, OPEN_PAREN);
    result_ = result_ && prototype_args(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, CLOSE_PAREN);
    exit_section_(builder_, marker_, FN_PROTOTYPE_ARGS, result_);
    return result_;
  }

  /* ********************************************************** */
  // !('{'|';')
  static boolean function_recover(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "function_recover")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NOT_, null);
    result_ = !function_recover_0(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, null, result_, false, null);
    return result_;
  }

  // '{'|';'
  private static boolean function_recover_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "function_recover_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, OPEN_BRACE);
    if (!result_) result_ = consumeToken(builder_, SEMICOLON);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // ref? 'unsafe'? ['extern' STRING_LIT?] 'fn' trait_bounds? fn_prototype_args ['->' return_type]
  public static boolean function_type(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "function_type")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<function type>");
    result_ = function_type_0(builder_, level_ + 1);
    result_ = result_ && function_type_1(builder_, level_ + 1);
    result_ = result_ && function_type_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, KW_FN);
    result_ = result_ && function_type_4(builder_, level_ + 1);
    result_ = result_ && fn_prototype_args(builder_, level_ + 1);
    result_ = result_ && function_type_6(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, FUNCTION_TYPE, result_, false, null);
    return result_;
  }

  // ref?
  private static boolean function_type_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "function_type_0")) return false;
    ref(builder_, level_ + 1);
    return true;
  }

  // 'unsafe'?
  private static boolean function_type_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "function_type_1")) return false;
    consumeToken(builder_, KW_UNSAFE);
    return true;
  }

  // ['extern' STRING_LIT?]
  private static boolean function_type_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "function_type_2")) return false;
    function_type_2_0(builder_, level_ + 1);
    return true;
  }

  // 'extern' STRING_LIT?
  private static boolean function_type_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "function_type_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, KW_EXTERN);
    result_ = result_ && function_type_2_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // STRING_LIT?
  private static boolean function_type_2_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "function_type_2_0_1")) return false;
    consumeToken(builder_, STRING_LIT);
    return true;
  }

  // trait_bounds?
  private static boolean function_type_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "function_type_4")) return false;
    trait_bounds(builder_, level_ + 1);
    return true;
  }

  // ['->' return_type]
  private static boolean function_type_6(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "function_type_6")) return false;
    function_type_6_0(builder_, level_ + 1);
    return true;
  }

  // '->' return_type
  private static boolean function_type_6_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "function_type_6_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, THIN_ARROW);
    result_ = result_ && return_type(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // '<' (generic_without_lifetime | generic_with_lifetime) '>'
  public static boolean generic(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "generic")) return false;
    if (!nextTokenIs(builder_, LESS_THAN)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LESS_THAN);
    result_ = result_ && generic_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, GREATER_THAN);
    exit_section_(builder_, marker_, GENERIC, result_);
    return result_;
  }

  // generic_without_lifetime | generic_with_lifetime
  private static boolean generic_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "generic_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = generic_without_lifetime(builder_, level_ + 1);
    if (!result_) result_ = generic_with_lifetime(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // lifetime | IDENTIFIER  [(':' | '=') (type | region_bound) ('+' (type | region_bound))* ]
  static boolean generic_param(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "generic_param")) return false;
    if (!nextTokenIs(builder_, "", SINGLE_QUOTE, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = lifetime(builder_, level_ + 1);
    if (!result_) result_ = generic_param_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // IDENTIFIER  [(':' | '=') (type | region_bound) ('+' (type | region_bound))* ]
  private static boolean generic_param_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "generic_param_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, IDENTIFIER);
    result_ = result_ && generic_param_1_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [(':' | '=') (type | region_bound) ('+' (type | region_bound))* ]
  private static boolean generic_param_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "generic_param_1_1")) return false;
    generic_param_1_1_0(builder_, level_ + 1);
    return true;
  }

  // (':' | '=') (type | region_bound) ('+' (type | region_bound))*
  private static boolean generic_param_1_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "generic_param_1_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = generic_param_1_1_0_0(builder_, level_ + 1);
    result_ = result_ && generic_param_1_1_0_1(builder_, level_ + 1);
    result_ = result_ && generic_param_1_1_0_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ':' | '='
  private static boolean generic_param_1_1_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "generic_param_1_1_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COLON);
    if (!result_) result_ = consumeToken(builder_, ASSIGN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // type | region_bound
  private static boolean generic_param_1_1_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "generic_param_1_1_0_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = type(builder_, level_ + 1);
    if (!result_) result_ = region_bound(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ('+' (type | region_bound))*
  private static boolean generic_param_1_1_0_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "generic_param_1_1_0_2")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!generic_param_1_1_0_2_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "generic_param_1_1_0_2", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // '+' (type | region_bound)
  private static boolean generic_param_1_1_0_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "generic_param_1_1_0_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, PLUS);
    result_ = result_ && generic_param_1_1_0_2_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // type | region_bound
  private static boolean generic_param_1_1_0_2_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "generic_param_1_1_0_2_0_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = type(builder_, level_ + 1);
    if (!result_) result_ = region_bound(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // '<' generic_param (',' generic_param)* '>'
  public static boolean generic_params(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "generic_params")) return false;
    if (!nextTokenIs(builder_, LESS_THAN)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LESS_THAN);
    result_ = result_ && generic_param(builder_, level_ + 1);
    result_ = result_ && generic_params_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, GREATER_THAN);
    exit_section_(builder_, marker_, GENERIC_PARAMS, result_);
    return result_;
  }

  // (',' generic_param)*
  private static boolean generic_params_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "generic_params_2")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!generic_params_2_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "generic_params_2", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // ',' generic_param
  private static boolean generic_params_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "generic_params_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && generic_param(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // lifetime (',' lifetime)* (',' type)*
  static boolean generic_with_lifetime(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "generic_with_lifetime")) return false;
    if (!nextTokenIs(builder_, SINGLE_QUOTE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = lifetime(builder_, level_ + 1);
    result_ = result_ && generic_with_lifetime_1(builder_, level_ + 1);
    result_ = result_ && generic_with_lifetime_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (',' lifetime)*
  private static boolean generic_with_lifetime_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "generic_with_lifetime_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!generic_with_lifetime_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "generic_with_lifetime_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // ',' lifetime
  private static boolean generic_with_lifetime_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "generic_with_lifetime_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && lifetime(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (',' type)*
  private static boolean generic_with_lifetime_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "generic_with_lifetime_2")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!generic_with_lifetime_2_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "generic_with_lifetime_2", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // ',' type
  private static boolean generic_with_lifetime_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "generic_with_lifetime_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && type(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // type ( ',' type)*
  static boolean generic_without_lifetime(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "generic_without_lifetime")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = type(builder_, level_ + 1);
    result_ = result_ && generic_without_lifetime_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ( ',' type)*
  private static boolean generic_without_lifetime_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "generic_without_lifetime_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!generic_without_lifetime_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "generic_without_lifetime_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // ',' type
  private static boolean generic_without_lifetime_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "generic_without_lifetime_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && type(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // ('else' 'if' expr statement_block)* ['else' statement_block]
  public static boolean if_tail(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "if_tail")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<if tail>");
    result_ = if_tail_0(builder_, level_ + 1);
    result_ = result_ && if_tail_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, IF_TAIL, result_, false, null);
    return result_;
  }

  // ('else' 'if' expr statement_block)*
  private static boolean if_tail_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "if_tail_0")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!if_tail_0_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "if_tail_0", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // 'else' 'if' expr statement_block
  private static boolean if_tail_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "if_tail_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, KW_ELSE);
    result_ = result_ && consumeToken(builder_, KW_IF);
    result_ = result_ && expr(builder_, level_ + 1, -1);
    result_ = result_ && statement_block(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ['else' statement_block]
  private static boolean if_tail_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "if_tail_1")) return false;
    if_tail_1_0(builder_, level_ + 1);
    return true;
  }

  // 'else' statement_block
  private static boolean if_tail_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "if_tail_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, KW_ELSE);
    result_ = result_ && statement_block(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // '{' impl_body '}'
  public static boolean impl_block(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "impl_block")) return false;
    if (!nextTokenIs(builder_, OPEN_BRACE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, OPEN_BRACE);
    result_ = result_ && impl_body(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, CLOSE_BRACE);
    exit_section_(builder_, marker_, IMPL_BLOCK, result_);
    return result_;
  }

  /* ********************************************************** */
  // fn_item*
  public static boolean impl_body(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "impl_body")) return false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<impl body>");
    int pos_ = current_position_(builder_);
    while (true) {
      if (!fn_item(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "impl_body", pos_)) break;
      pos_ = current_position_(builder_);
    }
    exit_section_(builder_, level_, marker_, IMPL_BODY, true, false, not_close_brace_parser_);
    return true;
  }

  /* ********************************************************** */
  // 'for' type
  public static boolean impl_for(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "impl_for")) return false;
    if (!nextTokenIs(builder_, KW_FOR)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, KW_FOR);
    result_ = result_ && type(builder_, level_ + 1);
    exit_section_(builder_, marker_, IMPL_FOR, result_);
    return result_;
  }

  /* ********************************************************** */
  // 'impl' generic_params? type impl_for? impl_block
  public static boolean impl_item(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "impl_item")) return false;
    if (!nextTokenIs(builder_, KW_IMPL)) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, KW_IMPL);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, impl_item_1(builder_, level_ + 1));
    result_ = pinned_ && report_error_(builder_, type(builder_, level_ + 1)) && result_;
    result_ = pinned_ && report_error_(builder_, impl_item_3(builder_, level_ + 1)) && result_;
    result_ = pinned_ && impl_block(builder_, level_ + 1) && result_;
    exit_section_(builder_, level_, marker_, IMPL_ITEM, result_, pinned_, null);
    return result_ || pinned_;
  }

  // generic_params?
  private static boolean impl_item_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "impl_item_1")) return false;
    generic_params(builder_, level_ + 1);
    return true;
  }

  // impl_for?
  private static boolean impl_item_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "impl_item_3")) return false;
    impl_for(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // expr
  public static boolean index_expr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "index_expr")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<index expr>");
    result_ = expr(builder_, level_ + 1, -1);
    exit_section_(builder_, level_, marker_, INDEX_EXPR, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // mod_item
  // 	| fn_item
  // 	| type_item
  // 	| struct_item
  // 	| enum_item
  // 	| static_item
  // 	| trait_item
  // 	| impl_item
  // 	| extern_item
  public static boolean item(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "item")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _COLLAPSE_, "<item>");
    result_ = mod_item(builder_, level_ + 1);
    if (!result_) result_ = fn_item(builder_, level_ + 1);
    if (!result_) result_ = type_item(builder_, level_ + 1);
    if (!result_) result_ = struct_item(builder_, level_ + 1);
    if (!result_) result_ = enum_item(builder_, level_ + 1);
    if (!result_) result_ = static_item(builder_, level_ + 1);
    if (!result_) result_ = trait_item(builder_, level_ + 1);
    if (!result_) result_ = impl_item(builder_, level_ + 1);
    if (!result_) result_ = extern_item(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, ITEM, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // 'let' let_bind ['=' (expr | statement_block)] ';'?
  public static boolean let(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "let")) return false;
    if (!nextTokenIs(builder_, KW_LET)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, KW_LET);
    result_ = result_ && let_bind(builder_, level_ + 1);
    result_ = result_ && let_2(builder_, level_ + 1);
    result_ = result_ && let_3(builder_, level_ + 1);
    exit_section_(builder_, marker_, LET, result_);
    return result_;
  }

  // ['=' (expr | statement_block)]
  private static boolean let_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "let_2")) return false;
    let_2_0(builder_, level_ + 1);
    return true;
  }

  // '=' (expr | statement_block)
  private static boolean let_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "let_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, ASSIGN);
    result_ = result_ && let_2_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // expr | statement_block
  private static boolean let_2_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "let_2_0_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = expr(builder_, level_ + 1, -1);
    if (!result_) result_ = statement_block(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ';'?
  private static boolean let_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "let_3")) return false;
    consumeToken(builder_, SEMICOLON);
    return true;
  }

  /* ********************************************************** */
  // [ let_bind ( ',' let_bind)* ','? ]
  public static boolean let_args(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "let_args")) return false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<let args>");
    let_args_0(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, LET_ARGS, true, false, null);
    return true;
  }

  // let_bind ( ',' let_bind)* ','?
  private static boolean let_args_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "let_args_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = let_bind(builder_, level_ + 1);
    result_ = result_ && let_args_0_1(builder_, level_ + 1);
    result_ = result_ && let_args_0_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ( ',' let_bind)*
  private static boolean let_args_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "let_args_0_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!let_args_0_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "let_args_0_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // ',' let_bind
  private static boolean let_args_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "let_args_0_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && let_bind(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ','?
  private static boolean let_args_0_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "let_args_0_2")) return false;
    consumeToken(builder_, COMMA);
    return true;
  }

  /* ********************************************************** */
  // let_tuple_bind | let_struct_bind | let_variable_bind | let_unit_bind | let_self_arg
  public static boolean let_bind(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "let_bind")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _COLLAPSE_, "<let bind>");
    result_ = let_tuple_bind(builder_, level_ + 1);
    if (!result_) result_ = let_struct_bind(builder_, level_ + 1);
    if (!result_) result_ = let_variable_bind(builder_, level_ + 1);
    if (!result_) result_ = let_unit_bind(builder_, level_ + 1);
    if (!result_) result_ = let_self_arg(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, LET_BIND, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // ref? 'mut'? '~'? 'self'
  public static boolean let_self_arg(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "let_self_arg")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<let self arg>");
    result_ = let_self_arg_0(builder_, level_ + 1);
    result_ = result_ && let_self_arg_1(builder_, level_ + 1);
    result_ = result_ && let_self_arg_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, KW_SELF);
    exit_section_(builder_, level_, marker_, LET_SELF_ARG, result_, false, null);
    return result_;
  }

  // ref?
  private static boolean let_self_arg_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "let_self_arg_0")) return false;
    ref(builder_, level_ + 1);
    return true;
  }

  // 'mut'?
  private static boolean let_self_arg_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "let_self_arg_1")) return false;
    consumeToken(builder_, KW_MUT);
    return true;
  }

  // '~'?
  private static boolean let_self_arg_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "let_self_arg_2")) return false;
    consumeToken(builder_, BOX);
    return true;
  }

  /* ********************************************************** */
  // type '{' struct_bind_member (',' struct_bind_member )* ','? '..'? ','? '}' [':' type]
  public static boolean let_struct_bind(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "let_struct_bind")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<let struct bind>");
    result_ = type(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, OPEN_BRACE);
    result_ = result_ && struct_bind_member(builder_, level_ + 1);
    result_ = result_ && let_struct_bind_3(builder_, level_ + 1);
    result_ = result_ && let_struct_bind_4(builder_, level_ + 1);
    result_ = result_ && let_struct_bind_5(builder_, level_ + 1);
    result_ = result_ && let_struct_bind_6(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, CLOSE_BRACE);
    result_ = result_ && let_struct_bind_8(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, LET_STRUCT_BIND, result_, false, null);
    return result_;
  }

  // (',' struct_bind_member )*
  private static boolean let_struct_bind_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "let_struct_bind_3")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!let_struct_bind_3_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "let_struct_bind_3", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // ',' struct_bind_member
  private static boolean let_struct_bind_3_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "let_struct_bind_3_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && struct_bind_member(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ','?
  private static boolean let_struct_bind_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "let_struct_bind_4")) return false;
    consumeToken(builder_, COMMA);
    return true;
  }

  // '..'?
  private static boolean let_struct_bind_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "let_struct_bind_5")) return false;
    consumeToken(builder_, DOUBLE_DOT);
    return true;
  }

  // ','?
  private static boolean let_struct_bind_6(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "let_struct_bind_6")) return false;
    consumeToken(builder_, COMMA);
    return true;
  }

  // [':' type]
  private static boolean let_struct_bind_8(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "let_struct_bind_8")) return false;
    let_struct_bind_8_0(builder_, level_ + 1);
    return true;
  }

  // ':' type
  private static boolean let_struct_bind_8_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "let_struct_bind_8_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COLON);
    result_ = result_ && type(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // ref* type_basic? '(' let_bind (',' let_bind)* ','? ')' [':' type]
  public static boolean let_tuple_bind(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "let_tuple_bind")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<let tuple bind>");
    result_ = let_tuple_bind_0(builder_, level_ + 1);
    result_ = result_ && let_tuple_bind_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, OPEN_PAREN);
    result_ = result_ && let_bind(builder_, level_ + 1);
    result_ = result_ && let_tuple_bind_4(builder_, level_ + 1);
    result_ = result_ && let_tuple_bind_5(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, CLOSE_PAREN);
    result_ = result_ && let_tuple_bind_7(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, LET_TUPLE_BIND, result_, false, null);
    return result_;
  }

  // ref*
  private static boolean let_tuple_bind_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "let_tuple_bind_0")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!ref(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "let_tuple_bind_0", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // type_basic?
  private static boolean let_tuple_bind_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "let_tuple_bind_1")) return false;
    type_basic(builder_, level_ + 1);
    return true;
  }

  // (',' let_bind)*
  private static boolean let_tuple_bind_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "let_tuple_bind_4")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!let_tuple_bind_4_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "let_tuple_bind_4", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // ',' let_bind
  private static boolean let_tuple_bind_4_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "let_tuple_bind_4_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && let_bind(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ','?
  private static boolean let_tuple_bind_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "let_tuple_bind_5")) return false;
    consumeToken(builder_, COMMA);
    return true;
  }

  // [':' type]
  private static boolean let_tuple_bind_7(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "let_tuple_bind_7")) return false;
    let_tuple_bind_7_0(builder_, level_ + 1);
    return true;
  }

  // ':' type
  private static boolean let_tuple_bind_7_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "let_tuple_bind_7_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COLON);
    result_ = result_ && type(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // '(' ')'
  public static boolean let_unit_bind(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "let_unit_bind")) return false;
    if (!nextTokenIs(builder_, OPEN_PAREN)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, OPEN_PAREN);
    result_ = result_ && consumeToken(builder_, CLOSE_PAREN);
    exit_section_(builder_, marker_, LET_UNIT_BIND, result_);
    return result_;
  }

  /* ********************************************************** */
  // variable_signature [':' type]
  public static boolean let_variable_bind(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "let_variable_bind")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<let variable bind>");
    result_ = variable_signature(builder_, level_ + 1);
    result_ = result_ && let_variable_bind_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, LET_VARIABLE_BIND, result_, false, null);
    return result_;
  }

  // [':' type]
  private static boolean let_variable_bind_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "let_variable_bind_1")) return false;
    let_variable_bind_1_0(builder_, level_ + 1);
    return true;
  }

  // ':' type
  private static boolean let_variable_bind_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "let_variable_bind_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COLON);
    result_ = result_ && type(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // "'" (IDENTIFIER | 'static')
  public static boolean lifetime(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "lifetime")) return false;
    if (!nextTokenIs(builder_, SINGLE_QUOTE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, SINGLE_QUOTE);
    result_ = result_ && lifetime_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, LIFETIME, result_);
    return result_;
  }

  // IDENTIFIER | 'static'
  private static boolean lifetime_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "lifetime_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, IDENTIFIER);
    if (!result_) result_ = consumeToken(builder_, KW_STATIC);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // string_literal | numeric_literal | 'true' | 'false' | 'self' | unit
  static boolean literal(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "literal")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = string_literal(builder_, level_ + 1);
    if (!result_) result_ = numeric_literal(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, KW_TRUE);
    if (!result_) result_ = consumeToken(builder_, KW_FALSE);
    if (!result_) result_ = consumeToken(builder_, KW_SELF);
    if (!result_) result_ = unit(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // macro_body_internal
  public static boolean macro_body(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "macro_body")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<macro body>");
    result_ = macro_body_internal(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, MACRO_BODY, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // (macro_paren | macro_brace | macro_bracket | macro_wildcard)*
  static boolean macro_body_internal(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "macro_body_internal")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!macro_body_internal_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "macro_body_internal", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // macro_paren | macro_brace | macro_bracket | macro_wildcard
  private static boolean macro_body_internal_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "macro_body_internal_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = macro_paren(builder_, level_ + 1);
    if (!result_) result_ = macro_brace(builder_, level_ + 1);
    if (!result_) result_ = macro_bracket(builder_, level_ + 1);
    if (!result_) result_ = macro_wildcard(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // '{' macro_body '}'
  public static boolean macro_brace(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "macro_brace")) return false;
    if (!nextTokenIs(builder_, OPEN_BRACE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, OPEN_BRACE);
    result_ = result_ && macro_body(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, CLOSE_BRACE);
    exit_section_(builder_, marker_, MACRO_BRACE, result_);
    return result_;
  }

  /* ********************************************************** */
  // '[' macro_body ']'
  public static boolean macro_bracket(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "macro_bracket")) return false;
    if (!nextTokenIs(builder_, OPEN_SQUARE_BRACKET)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, OPEN_SQUARE_BRACKET);
    result_ = result_ && macro_body(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, CLOSE_SQUARE_BRACKET);
    exit_section_(builder_, marker_, MACRO_BRACKET, result_);
    return result_;
  }

  /* ********************************************************** */
  // '(' macro_body ')'
  public static boolean macro_paren(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "macro_paren")) return false;
    if (!nextTokenIs(builder_, OPEN_PAREN)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, OPEN_PAREN);
    result_ = result_ && macro_body(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, CLOSE_PAREN);
    exit_section_(builder_, marker_, MACRO_PAREN, result_);
    return result_;
  }

  /* ********************************************************** */
  // 'macro_rules!' IDENTIFIER (macro_paren | macro_bracket | macro_brace)
  public static boolean macro_rules(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "macro_rules")) return false;
    if (!nextTokenIs(builder_, KW_MACRO_RULES)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, KW_MACRO_RULES);
    result_ = result_ && consumeToken(builder_, IDENTIFIER);
    result_ = result_ && macro_rules_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, MACRO_RULES, result_);
    return result_;
  }

  // macro_paren | macro_bracket | macro_brace
  private static boolean macro_rules_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "macro_rules_2")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = macro_paren(builder_, level_ + 1);
    if (!result_) result_ = macro_bracket(builder_, level_ + 1);
    if (!result_) result_ = macro_brace(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // KW_AS | KW_BREAK | KW_CRATE | KW_ELSE | KW_ENUM | KW_EXTERN | KW_FALSE | KW_FN | KW_FOR
  // 	| KW_IF | KW_IMPL | KW_IN | KW_LET | KW_LOOP | KW_MATCH | KW_MOD | KW_MUT | KW_PRIV | KW_PROC | KW_PUB | KW_REF
  // 	| KW_RETURN | KW_SELF | KW_STATIC | KW_STRUCT | KW_SUPER | KW_TRUE | KW_TRAIT | KW_TYPE | KW_UNSAFE | KW_USE
  // 	| KW_WHILE | KW_CONTINUE | KW_BOX | LINE_DOC_COMMENT | LINE_COMMENT | CHAR_LIT | STRING_LIT | SEMICOLON
  // 	| BIN_LIT | OCT_LIT | HEX_LIT | DEC_LIT | IDENTIFIER | FAT_ARROW | THIN_ARROW | DOT | BITWISE_AND | BITWISE_OR
  // 	| BITWISE_XOR | DOUBLE_COLON | COLON | PLUS | MINUS | MULTIPLY | DIVIDE | REMAINDER | EQUAL | ASSIGN | NOT_EQUAL
  // 	| LESS_THAN_OR_EQUAL | LESS_THAN | GREATER_THAN_OR_EQUAL | GREATER_THAN | NOT | BOX | AT | SINGLE_QUOTE | DOLLAR
  // 	| HASH | COMMA | BAD_CHARACTER | RAW_STRING_LIT | ASSIGN_RIGHT_SHIFT | ASSIGN_LEFT_SHIFT | DOUBLE_DOT | TRIPLE_DOT
  // 	| BLOCK_COMMENT | BLOCK_DOC_COMMENT
  static boolean macro_wildcard(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "macro_wildcard")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, KW_AS);
    if (!result_) result_ = consumeToken(builder_, KW_BREAK);
    if (!result_) result_ = consumeToken(builder_, KW_CRATE);
    if (!result_) result_ = consumeToken(builder_, KW_ELSE);
    if (!result_) result_ = consumeToken(builder_, KW_ENUM);
    if (!result_) result_ = consumeToken(builder_, KW_EXTERN);
    if (!result_) result_ = consumeToken(builder_, KW_FALSE);
    if (!result_) result_ = consumeToken(builder_, KW_FN);
    if (!result_) result_ = consumeToken(builder_, KW_FOR);
    if (!result_) result_ = consumeToken(builder_, KW_IF);
    if (!result_) result_ = consumeToken(builder_, KW_IMPL);
    if (!result_) result_ = consumeToken(builder_, KW_IN);
    if (!result_) result_ = consumeToken(builder_, KW_LET);
    if (!result_) result_ = consumeToken(builder_, KW_LOOP);
    if (!result_) result_ = consumeToken(builder_, KW_MATCH);
    if (!result_) result_ = consumeToken(builder_, KW_MOD);
    if (!result_) result_ = consumeToken(builder_, KW_MUT);
    if (!result_) result_ = consumeToken(builder_, KW_PRIV);
    if (!result_) result_ = consumeToken(builder_, KW_PROC);
    if (!result_) result_ = consumeToken(builder_, KW_PUB);
    if (!result_) result_ = consumeToken(builder_, KW_REF);
    if (!result_) result_ = consumeToken(builder_, KW_RETURN);
    if (!result_) result_ = consumeToken(builder_, KW_SELF);
    if (!result_) result_ = consumeToken(builder_, KW_STATIC);
    if (!result_) result_ = consumeToken(builder_, KW_STRUCT);
    if (!result_) result_ = consumeToken(builder_, KW_SUPER);
    if (!result_) result_ = consumeToken(builder_, KW_TRUE);
    if (!result_) result_ = consumeToken(builder_, KW_TRAIT);
    if (!result_) result_ = consumeToken(builder_, KW_TYPE);
    if (!result_) result_ = consumeToken(builder_, KW_UNSAFE);
    if (!result_) result_ = consumeToken(builder_, KW_USE);
    if (!result_) result_ = consumeToken(builder_, KW_WHILE);
    if (!result_) result_ = consumeToken(builder_, KW_CONTINUE);
    if (!result_) result_ = consumeToken(builder_, KW_BOX);
    if (!result_) result_ = consumeToken(builder_, LINE_DOC_COMMENT);
    if (!result_) result_ = consumeToken(builder_, LINE_COMMENT);
    if (!result_) result_ = consumeToken(builder_, CHAR_LIT);
    if (!result_) result_ = consumeToken(builder_, STRING_LIT);
    if (!result_) result_ = consumeToken(builder_, SEMICOLON);
    if (!result_) result_ = consumeToken(builder_, BIN_LIT);
    if (!result_) result_ = consumeToken(builder_, OCT_LIT);
    if (!result_) result_ = consumeToken(builder_, HEX_LIT);
    if (!result_) result_ = consumeToken(builder_, DEC_LIT);
    if (!result_) result_ = consumeToken(builder_, IDENTIFIER);
    if (!result_) result_ = consumeToken(builder_, FAT_ARROW);
    if (!result_) result_ = consumeToken(builder_, THIN_ARROW);
    if (!result_) result_ = consumeToken(builder_, DOT);
    if (!result_) result_ = consumeToken(builder_, BITWISE_AND);
    if (!result_) result_ = consumeToken(builder_, BITWISE_OR);
    if (!result_) result_ = consumeToken(builder_, BITWISE_XOR);
    if (!result_) result_ = consumeToken(builder_, DOUBLE_COLON);
    if (!result_) result_ = consumeToken(builder_, COLON);
    if (!result_) result_ = consumeToken(builder_, PLUS);
    if (!result_) result_ = consumeToken(builder_, MINUS);
    if (!result_) result_ = consumeToken(builder_, MULTIPLY);
    if (!result_) result_ = consumeToken(builder_, DIVIDE);
    if (!result_) result_ = consumeToken(builder_, REMAINDER);
    if (!result_) result_ = consumeToken(builder_, EQUAL);
    if (!result_) result_ = consumeToken(builder_, ASSIGN);
    if (!result_) result_ = consumeToken(builder_, NOT_EQUAL);
    if (!result_) result_ = consumeToken(builder_, LESS_THAN_OR_EQUAL);
    if (!result_) result_ = consumeToken(builder_, LESS_THAN);
    if (!result_) result_ = consumeToken(builder_, GREATER_THAN_OR_EQUAL);
    if (!result_) result_ = consumeToken(builder_, GREATER_THAN);
    if (!result_) result_ = consumeToken(builder_, NOT);
    if (!result_) result_ = consumeToken(builder_, BOX);
    if (!result_) result_ = consumeToken(builder_, AT);
    if (!result_) result_ = consumeToken(builder_, SINGLE_QUOTE);
    if (!result_) result_ = consumeToken(builder_, DOLLAR);
    if (!result_) result_ = consumeToken(builder_, HASH);
    if (!result_) result_ = consumeToken(builder_, COMMA);
    if (!result_) result_ = consumeToken(builder_, BAD_CHARACTER);
    if (!result_) result_ = consumeToken(builder_, RAW_STRING_LIT);
    if (!result_) result_ = consumeToken(builder_, ASSIGN_RIGHT_SHIFT);
    if (!result_) result_ = consumeToken(builder_, ASSIGN_LEFT_SHIFT);
    if (!result_) result_ = consumeToken(builder_, DOUBLE_DOT);
    if (!result_) result_ = consumeToken(builder_, TRIPLE_DOT);
    if (!result_) result_ = consumeToken(builder_, BLOCK_COMMENT);
    if (!result_) result_ = consumeToken(builder_, BLOCK_DOC_COMMENT);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // match_filter ('|' match_filter)* '=>' (statement_block | statement | expr) ','?
  public static boolean match_arm(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "match_arm")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<match arm>");
    result_ = match_filter(builder_, level_ + 1);
    result_ = result_ && match_arm_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, FAT_ARROW);
    result_ = result_ && match_arm_3(builder_, level_ + 1);
    result_ = result_ && match_arm_4(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, MATCH_ARM, result_, false, null);
    return result_;
  }

  // ('|' match_filter)*
  private static boolean match_arm_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "match_arm_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!match_arm_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "match_arm_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // '|' match_filter
  private static boolean match_arm_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "match_arm_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, BITWISE_OR);
    result_ = result_ && match_filter(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // statement_block | statement | expr
  private static boolean match_arm_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "match_arm_3")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = statement_block(builder_, level_ + 1);
    if (!result_) result_ = statement(builder_, level_ + 1);
    if (!result_) result_ = expr(builder_, level_ + 1, -1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ','?
  private static boolean match_arm_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "match_arm_4")) return false;
    consumeToken(builder_, COMMA);
    return true;
  }

  /* ********************************************************** */
  // '{' match_body '}'
  public static boolean match_block(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "match_block")) return false;
    if (!nextTokenIs(builder_, OPEN_BRACE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, OPEN_BRACE);
    result_ = result_ && match_body(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, CLOSE_BRACE);
    exit_section_(builder_, marker_, MATCH_BLOCK, result_);
    return result_;
  }

  /* ********************************************************** */
  // match_arm*
  public static boolean match_body(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "match_body")) return false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<match body>");
    int pos_ = current_position_(builder_);
    while (true) {
      if (!match_arm(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "match_body", pos_)) break;
      pos_ = current_position_(builder_);
    }
    exit_section_(builder_, level_, marker_, MATCH_BODY, true, false, not_close_brace_parser_);
    return true;
  }

  /* ********************************************************** */
  // match_pattern match_if?
  public static boolean match_filter(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "match_filter")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<match filter>");
    result_ = match_pattern(builder_, level_ + 1);
    result_ = result_ && match_filter_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, MATCH_FILTER, result_, false, null);
    return result_;
  }

  // match_if?
  private static boolean match_filter_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "match_filter_1")) return false;
    match_if(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // 'box'? ref? 'ref'? 'mut'? IDENTIFIER
  public static boolean match_identifier(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "match_identifier")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<match identifier>");
    result_ = match_identifier_0(builder_, level_ + 1);
    result_ = result_ && match_identifier_1(builder_, level_ + 1);
    result_ = result_ && match_identifier_2(builder_, level_ + 1);
    result_ = result_ && match_identifier_3(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, IDENTIFIER);
    exit_section_(builder_, level_, marker_, MATCH_IDENTIFIER, result_, false, null);
    return result_;
  }

  // 'box'?
  private static boolean match_identifier_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "match_identifier_0")) return false;
    consumeToken(builder_, KW_BOX);
    return true;
  }

  // ref?
  private static boolean match_identifier_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "match_identifier_1")) return false;
    ref(builder_, level_ + 1);
    return true;
  }

  // 'ref'?
  private static boolean match_identifier_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "match_identifier_2")) return false;
    consumeToken(builder_, KW_REF);
    return true;
  }

  // 'mut'?
  private static boolean match_identifier_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "match_identifier_3")) return false;
    consumeToken(builder_, KW_MUT);
    return true;
  }

  /* ********************************************************** */
  // 'if' expr
  public static boolean match_if(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "match_if")) return false;
    if (!nextTokenIs(builder_, KW_IF)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, KW_IF);
    result_ = result_ && expr(builder_, level_ + 1, -1);
    exit_section_(builder_, marker_, MATCH_IF, result_);
    return result_;
  }

  /* ********************************************************** */
  // match_identifier '@'
  public static boolean match_label(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "match_label")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<match label>");
    result_ = match_identifier(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, AT);
    exit_section_(builder_, level_, marker_, MATCH_LABEL, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // tuple_match_pattern | struct_match_pattern | vector_match_pattern | range_match_pattern | basic_match_pattern
  public static boolean match_pattern(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "match_pattern")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _COLLAPSE_, "<match pattern>");
    result_ = tuple_match_pattern(builder_, level_ + 1);
    if (!result_) result_ = struct_match_pattern(builder_, level_ + 1);
    if (!result_) result_ = vector_match_pattern(builder_, level_ + 1);
    if (!result_) result_ = range_match_pattern(builder_, level_ + 1);
    if (!result_) result_ = basic_match_pattern(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, MATCH_PATTERN, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // ( use
  //     | item
  //     | attribute
  //     | comment
  //     | expr_macro
  //     | macro_rules
  // )*
  static boolean mod_contents(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "mod_contents")) return false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    int pos_ = current_position_(builder_);
    while (true) {
      if (!mod_contents_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "mod_contents", pos_)) break;
      pos_ = current_position_(builder_);
    }
    exit_section_(builder_, level_, marker_, null, true, false, not_close_brace_parser_);
    return true;
  }

  // use
  //     | item
  //     | attribute
  //     | comment
  //     | expr_macro
  //     | macro_rules
  private static boolean mod_contents_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "mod_contents_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = use(builder_, level_ + 1);
    if (!result_) result_ = item(builder_, level_ + 1);
    if (!result_) result_ = attribute(builder_, level_ + 1);
    if (!result_) result_ = comment(builder_, level_ + 1);
    if (!result_) result_ = expr_macro(builder_, level_ + 1);
    if (!result_) result_ = macro_rules(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // (comment | attribute)* visibility? 'mod' type_path (';' | '{' mod_contents '}')
  public static boolean mod_item(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "mod_item")) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<mod item>");
    result_ = mod_item_0(builder_, level_ + 1);
    result_ = result_ && mod_item_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, KW_MOD);
    pinned_ = result_; // pin = 3
    result_ = result_ && report_error_(builder_, type_path(builder_, level_ + 1));
    result_ = pinned_ && mod_item_4(builder_, level_ + 1) && result_;
    exit_section_(builder_, level_, marker_, MOD_ITEM, result_, pinned_, null);
    return result_ || pinned_;
  }

  // (comment | attribute)*
  private static boolean mod_item_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "mod_item_0")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!mod_item_0_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "mod_item_0", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // comment | attribute
  private static boolean mod_item_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "mod_item_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = comment(builder_, level_ + 1);
    if (!result_) result_ = attribute(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // visibility?
  private static boolean mod_item_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "mod_item_1")) return false;
    visibility(builder_, level_ + 1);
    return true;
  }

  // ';' | '{' mod_contents '}'
  private static boolean mod_item_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "mod_item_4")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, SEMICOLON);
    if (!result_) result_ = mod_item_4_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '{' mod_contents '}'
  private static boolean mod_item_4_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "mod_item_4_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, OPEN_BRACE);
    result_ = result_ && mod_contents(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, CLOSE_BRACE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // !'}'
  static boolean not_close_brace(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "not_close_brace")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NOT_, null);
    result_ = !consumeToken(builder_, CLOSE_BRACE);
    exit_section_(builder_, level_, marker_, null, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // !'{'
  static boolean not_open_brace(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "not_open_brace")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NOT_, null);
    result_ = !consumeToken(builder_, OPEN_BRACE);
    exit_section_(builder_, level_, marker_, null, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // !';'
  static boolean not_semicolon(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "not_semicolon")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NOT_, null);
    result_ = !consumeToken(builder_, SEMICOLON);
    exit_section_(builder_, level_, marker_, null, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // !('{' | ';')
  static boolean not_semicolon_or_open_brace(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "not_semicolon_or_open_brace")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NOT_, null);
    result_ = !not_semicolon_or_open_brace_0(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, null, result_, false, null);
    return result_;
  }

  // '{' | ';'
  private static boolean not_semicolon_or_open_brace_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "not_semicolon_or_open_brace_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, OPEN_BRACE);
    if (!result_) result_ = consumeToken(builder_, SEMICOLON);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // '-'? (BIN_LIT | OCT_LIT | HEX_LIT | DEC_LIT)
  static boolean numeric_literal(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "numeric_literal")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = numeric_literal_0(builder_, level_ + 1);
    result_ = result_ && numeric_literal_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '-'?
  private static boolean numeric_literal_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "numeric_literal_0")) return false;
    consumeToken(builder_, MINUS);
    return true;
  }

  // BIN_LIT | OCT_LIT | HEX_LIT | DEC_LIT
  private static boolean numeric_literal_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "numeric_literal_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, BIN_LIT);
    if (!result_) result_ = consumeToken(builder_, OCT_LIT);
    if (!result_) result_ = consumeToken(builder_, HEX_LIT);
    if (!result_) result_ = consumeToken(builder_, DEC_LIT);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // prototype_tuple_arg | prototype_struct_arg | prototype_variable_arg | prototype_self_arg
  public static boolean prototype_arg(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "prototype_arg")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<prototype arg>");
    result_ = prototype_tuple_arg(builder_, level_ + 1);
    if (!result_) result_ = prototype_struct_arg(builder_, level_ + 1);
    if (!result_) result_ = prototype_variable_arg(builder_, level_ + 1);
    if (!result_) result_ = prototype_self_arg(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, PROTOTYPE_ARG, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // [ prototype_arg ( ',' prototype_arg)* ]
  public static boolean prototype_args(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "prototype_args")) return false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<prototype args>");
    prototype_args_0(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, PROTOTYPE_ARGS, true, false, null);
    return true;
  }

  // prototype_arg ( ',' prototype_arg)*
  private static boolean prototype_args_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "prototype_args_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = prototype_arg(builder_, level_ + 1);
    result_ = result_ && prototype_args_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ( ',' prototype_arg)*
  private static boolean prototype_args_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "prototype_args_0_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!prototype_args_0_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "prototype_args_0_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // ',' prototype_arg
  private static boolean prototype_args_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "prototype_args_0_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && prototype_arg(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // ref? 'mut'? '~'? 'self'
  public static boolean prototype_self_arg(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "prototype_self_arg")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<prototype self arg>");
    result_ = prototype_self_arg_0(builder_, level_ + 1);
    result_ = result_ && prototype_self_arg_1(builder_, level_ + 1);
    result_ = result_ && prototype_self_arg_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, KW_SELF);
    exit_section_(builder_, level_, marker_, PROTOTYPE_SELF_ARG, result_, false, null);
    return result_;
  }

  // ref?
  private static boolean prototype_self_arg_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "prototype_self_arg_0")) return false;
    ref(builder_, level_ + 1);
    return true;
  }

  // 'mut'?
  private static boolean prototype_self_arg_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "prototype_self_arg_1")) return false;
    consumeToken(builder_, KW_MUT);
    return true;
  }

  // '~'?
  private static boolean prototype_self_arg_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "prototype_self_arg_2")) return false;
    consumeToken(builder_, BOX);
    return true;
  }

  /* ********************************************************** */
  // type '{' struct_bind_member (',' struct_bind_member )* ','? '..'? ','? '}' [':' type]
  public static boolean prototype_struct_arg(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "prototype_struct_arg")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<prototype struct arg>");
    result_ = type(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, OPEN_BRACE);
    result_ = result_ && struct_bind_member(builder_, level_ + 1);
    result_ = result_ && prototype_struct_arg_3(builder_, level_ + 1);
    result_ = result_ && prototype_struct_arg_4(builder_, level_ + 1);
    result_ = result_ && prototype_struct_arg_5(builder_, level_ + 1);
    result_ = result_ && prototype_struct_arg_6(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, CLOSE_BRACE);
    result_ = result_ && prototype_struct_arg_8(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, PROTOTYPE_STRUCT_ARG, result_, false, null);
    return result_;
  }

  // (',' struct_bind_member )*
  private static boolean prototype_struct_arg_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "prototype_struct_arg_3")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!prototype_struct_arg_3_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "prototype_struct_arg_3", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // ',' struct_bind_member
  private static boolean prototype_struct_arg_3_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "prototype_struct_arg_3_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && struct_bind_member(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ','?
  private static boolean prototype_struct_arg_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "prototype_struct_arg_4")) return false;
    consumeToken(builder_, COMMA);
    return true;
  }

  // '..'?
  private static boolean prototype_struct_arg_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "prototype_struct_arg_5")) return false;
    consumeToken(builder_, DOUBLE_DOT);
    return true;
  }

  // ','?
  private static boolean prototype_struct_arg_6(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "prototype_struct_arg_6")) return false;
    consumeToken(builder_, COMMA);
    return true;
  }

  // [':' type]
  private static boolean prototype_struct_arg_8(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "prototype_struct_arg_8")) return false;
    prototype_struct_arg_8_0(builder_, level_ + 1);
    return true;
  }

  // ':' type
  private static boolean prototype_struct_arg_8_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "prototype_struct_arg_8_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COLON);
    result_ = result_ && type(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // ref* type_basic? '(' prototype_arg (',' prototype_arg)* ','? ')' [':' type]
  public static boolean prototype_tuple_arg(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "prototype_tuple_arg")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<prototype tuple arg>");
    result_ = prototype_tuple_arg_0(builder_, level_ + 1);
    result_ = result_ && prototype_tuple_arg_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, OPEN_PAREN);
    result_ = result_ && prototype_arg(builder_, level_ + 1);
    result_ = result_ && prototype_tuple_arg_4(builder_, level_ + 1);
    result_ = result_ && prototype_tuple_arg_5(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, CLOSE_PAREN);
    result_ = result_ && prototype_tuple_arg_7(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, PROTOTYPE_TUPLE_ARG, result_, false, null);
    return result_;
  }

  // ref*
  private static boolean prototype_tuple_arg_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "prototype_tuple_arg_0")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!ref(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "prototype_tuple_arg_0", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // type_basic?
  private static boolean prototype_tuple_arg_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "prototype_tuple_arg_1")) return false;
    type_basic(builder_, level_ + 1);
    return true;
  }

  // (',' prototype_arg)*
  private static boolean prototype_tuple_arg_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "prototype_tuple_arg_4")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!prototype_tuple_arg_4_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "prototype_tuple_arg_4", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // ',' prototype_arg
  private static boolean prototype_tuple_arg_4_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "prototype_tuple_arg_4_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && prototype_arg(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ','?
  private static boolean prototype_tuple_arg_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "prototype_tuple_arg_5")) return false;
    consumeToken(builder_, COMMA);
    return true;
  }

  // [':' type]
  private static boolean prototype_tuple_arg_7(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "prototype_tuple_arg_7")) return false;
    prototype_tuple_arg_7_0(builder_, level_ + 1);
    return true;
  }

  // ':' type
  private static boolean prototype_tuple_arg_7_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "prototype_tuple_arg_7_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COLON);
    result_ = result_ && type(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // variable_signature ':' type | type
  public static boolean prototype_variable_arg(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "prototype_variable_arg")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<prototype variable arg>");
    result_ = prototype_variable_arg_0(builder_, level_ + 1);
    if (!result_) result_ = type(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, PROTOTYPE_VARIABLE_ARG, result_, false, null);
    return result_;
  }

  // variable_signature ':' type
  private static boolean prototype_variable_arg_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "prototype_variable_arg_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = variable_signature(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, COLON);
    result_ = result_ && type(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // match_label? (literal | match_identifier) '..' (literal | match_identifier)
  public static boolean range_match_pattern(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "range_match_pattern")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<range match pattern>");
    result_ = range_match_pattern_0(builder_, level_ + 1);
    result_ = result_ && range_match_pattern_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, DOUBLE_DOT);
    result_ = result_ && range_match_pattern_3(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, RANGE_MATCH_PATTERN, result_, false, null);
    return result_;
  }

  // match_label?
  private static boolean range_match_pattern_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "range_match_pattern_0")) return false;
    match_label(builder_, level_ + 1);
    return true;
  }

  // literal | match_identifier
  private static boolean range_match_pattern_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "range_match_pattern_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = literal(builder_, level_ + 1);
    if (!result_) result_ = match_identifier(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // literal | match_identifier
  private static boolean range_match_pattern_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "range_match_pattern_3")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = literal(builder_, level_ + 1);
    if (!result_) result_ = match_identifier(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // '&'+ lifetime?
  public static boolean ref(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ref")) return false;
    if (!nextTokenIs(builder_, BITWISE_AND)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = ref_0(builder_, level_ + 1);
    result_ = result_ && ref_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, REF, result_);
    return result_;
  }

  // '&'+
  private static boolean ref_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ref_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, BITWISE_AND);
    int pos_ = current_position_(builder_);
    while (result_) {
      if (!consumeToken(builder_, BITWISE_AND)) break;
      if (!empty_element_parsed_guard_(builder_, "ref_0", pos_)) break;
      pos_ = current_position_(builder_);
    }
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // lifetime?
  private static boolean ref_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ref_1")) return false;
    lifetime(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // "'" 'static'
  public static boolean region_bound(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "region_bound")) return false;
    if (!nextTokenIs(builder_, SINGLE_QUOTE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, SINGLE_QUOTE);
    result_ = result_ && consumeToken(builder_, KW_STATIC);
    exit_section_(builder_, marker_, REGION_BOUND, result_);
    return result_;
  }

  /* ********************************************************** */
  // 'return' expr? ';'?
  public static boolean return_statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "return_statement")) return false;
    if (!nextTokenIs(builder_, KW_RETURN)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, KW_RETURN);
    result_ = result_ && return_statement_1(builder_, level_ + 1);
    result_ = result_ && return_statement_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, RETURN_STATEMENT, result_);
    return result_;
  }

  // expr?
  private static boolean return_statement_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "return_statement_1")) return false;
    expr(builder_, level_ + 1, -1);
    return true;
  }

  // ';'?
  private static boolean return_statement_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "return_statement_2")) return false;
    consumeToken(builder_, SEMICOLON);
    return true;
  }

  /* ********************************************************** */
  // type | '!'
  static boolean return_type(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "return_type")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = type(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, NOT);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // expr ';'?
  // 	| use
  // 	| let
  // 	| item
  // 	| macro_rules
  // 	| return_statement
  // 	| empty_statement
  // 	| comment
  // 	| attribute
  static boolean statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "statement")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = statement_0(builder_, level_ + 1);
    if (!result_) result_ = use(builder_, level_ + 1);
    if (!result_) result_ = let(builder_, level_ + 1);
    if (!result_) result_ = item(builder_, level_ + 1);
    if (!result_) result_ = macro_rules(builder_, level_ + 1);
    if (!result_) result_ = return_statement(builder_, level_ + 1);
    if (!result_) result_ = empty_statement(builder_, level_ + 1);
    if (!result_) result_ = comment(builder_, level_ + 1);
    if (!result_) result_ = attribute(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // expr ';'?
  private static boolean statement_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "statement_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = expr(builder_, level_ + 1, -1);
    result_ = result_ && statement_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ';'?
  private static boolean statement_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "statement_0_1")) return false;
    consumeToken(builder_, SEMICOLON);
    return true;
  }

  /* ********************************************************** */
  // '{' statement_block_internal '}'
  public static boolean statement_block(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "statement_block")) return false;
    if (!nextTokenIs(builder_, OPEN_BRACE)) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, OPEN_BRACE);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, statement_block_internal(builder_, level_ + 1));
    result_ = pinned_ && consumeToken(builder_, CLOSE_BRACE) && result_;
    exit_section_(builder_, level_, marker_, STATEMENT_BLOCK, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // (statement)*
  static boolean statement_block_internal(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "statement_block_internal")) return false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    int pos_ = current_position_(builder_);
    while (true) {
      if (!statement_block_internal_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "statement_block_internal", pos_)) break;
      pos_ = current_position_(builder_);
    }
    exit_section_(builder_, level_, marker_, null, true, false, not_close_brace_parser_);
    return true;
  }

  // (statement)
  private static boolean statement_block_internal_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "statement_block_internal_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = statement(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // (comment | attribute)* visibility? 'static' 'mut'? IDENTIFIER ':' type '=' expr ';'
  public static boolean static_item(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_item")) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<static item>");
    result_ = static_item_0(builder_, level_ + 1);
    result_ = result_ && static_item_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, KW_STATIC);
    pinned_ = result_; // pin = 3
    result_ = result_ && report_error_(builder_, static_item_3(builder_, level_ + 1));
    result_ = pinned_ && report_error_(builder_, consumeToken(builder_, IDENTIFIER)) && result_;
    result_ = pinned_ && report_error_(builder_, consumeToken(builder_, COLON)) && result_;
    result_ = pinned_ && report_error_(builder_, type(builder_, level_ + 1)) && result_;
    result_ = pinned_ && report_error_(builder_, consumeToken(builder_, ASSIGN)) && result_;
    result_ = pinned_ && report_error_(builder_, expr(builder_, level_ + 1, -1)) && result_;
    result_ = pinned_ && consumeToken(builder_, SEMICOLON) && result_;
    exit_section_(builder_, level_, marker_, STATIC_ITEM, result_, pinned_, null);
    return result_ || pinned_;
  }

  // (comment | attribute)*
  private static boolean static_item_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_item_0")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!static_item_0_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "static_item_0", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // comment | attribute
  private static boolean static_item_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_item_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = comment(builder_, level_ + 1);
    if (!result_) result_ = attribute(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // visibility?
  private static boolean static_item_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_item_1")) return false;
    visibility(builder_, level_ + 1);
    return true;
  }

  // 'mut'?
  private static boolean static_item_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_item_3")) return false;
    consumeToken(builder_, KW_MUT);
    return true;
  }

  /* ********************************************************** */
  // STRING_LIT | RAW_STRING_LIT | CHAR_LIT
  static boolean string_literal(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "string_literal")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, STRING_LIT);
    if (!result_) result_ = consumeToken(builder_, RAW_STRING_LIT);
    if (!result_) result_ = consumeToken(builder_, CHAR_LIT);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // IDENTIFIER ':' variable_signature | variable_signature
  static boolean struct_bind_member(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "struct_bind_member")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = struct_bind_member_0(builder_, level_ + 1);
    if (!result_) result_ = variable_signature(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // IDENTIFIER ':' variable_signature
  private static boolean struct_bind_member_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "struct_bind_member_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, IDENTIFIER);
    result_ = result_ && consumeToken(builder_, COLON);
    result_ = result_ && variable_signature(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // struct_body_empty | struct_body_block | struct_body_tuple
  public static boolean struct_body(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "struct_body")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _COLLAPSE_, "<struct body>");
    result_ = struct_body_empty(builder_, level_ + 1);
    if (!result_) result_ = struct_body_block(builder_, level_ + 1);
    if (!result_) result_ = struct_body_tuple(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, STRUCT_BODY, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // '{' [struct_property (',' struct_property)* ','? (comment | attribute)*] '}'
  public static boolean struct_body_block(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "struct_body_block")) return false;
    if (!nextTokenIs(builder_, OPEN_BRACE)) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, OPEN_BRACE);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, struct_body_block_1(builder_, level_ + 1));
    result_ = pinned_ && consumeToken(builder_, CLOSE_BRACE) && result_;
    exit_section_(builder_, level_, marker_, STRUCT_BODY_BLOCK, result_, pinned_, null);
    return result_ || pinned_;
  }

  // [struct_property (',' struct_property)* ','? (comment | attribute)*]
  private static boolean struct_body_block_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "struct_body_block_1")) return false;
    struct_body_block_1_0(builder_, level_ + 1);
    return true;
  }

  // struct_property (',' struct_property)* ','? (comment | attribute)*
  private static boolean struct_body_block_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "struct_body_block_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = struct_property(builder_, level_ + 1);
    result_ = result_ && struct_body_block_1_0_1(builder_, level_ + 1);
    result_ = result_ && struct_body_block_1_0_2(builder_, level_ + 1);
    result_ = result_ && struct_body_block_1_0_3(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (',' struct_property)*
  private static boolean struct_body_block_1_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "struct_body_block_1_0_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!struct_body_block_1_0_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "struct_body_block_1_0_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // ',' struct_property
  private static boolean struct_body_block_1_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "struct_body_block_1_0_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && struct_property(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ','?
  private static boolean struct_body_block_1_0_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "struct_body_block_1_0_2")) return false;
    consumeToken(builder_, COMMA);
    return true;
  }

  // (comment | attribute)*
  private static boolean struct_body_block_1_0_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "struct_body_block_1_0_3")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!struct_body_block_1_0_3_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "struct_body_block_1_0_3", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // comment | attribute
  private static boolean struct_body_block_1_0_3_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "struct_body_block_1_0_3_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = comment(builder_, level_ + 1);
    if (!result_) result_ = attribute(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // ';'
  public static boolean struct_body_empty(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "struct_body_empty")) return false;
    if (!nextTokenIs(builder_, SEMICOLON)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, SEMICOLON);
    exit_section_(builder_, marker_, STRUCT_BODY_EMPTY, result_);
    return result_;
  }

  /* ********************************************************** */
  // '(' struct_tuple_property (',' struct_tuple_property)* ')' ';'
  public static boolean struct_body_tuple(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "struct_body_tuple")) return false;
    if (!nextTokenIs(builder_, OPEN_PAREN)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, OPEN_PAREN);
    result_ = result_ && struct_tuple_property(builder_, level_ + 1);
    result_ = result_ && struct_body_tuple_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, CLOSE_PAREN);
    result_ = result_ && consumeToken(builder_, SEMICOLON);
    exit_section_(builder_, marker_, STRUCT_BODY_TUPLE, result_);
    return result_;
  }

  // (',' struct_tuple_property)*
  private static boolean struct_body_tuple_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "struct_body_tuple_2")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!struct_body_tuple_2_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "struct_body_tuple_2", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // ',' struct_tuple_property
  private static boolean struct_body_tuple_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "struct_body_tuple_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && struct_tuple_property(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // '..' expr
  public static boolean struct_default(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "struct_default")) return false;
    if (!nextTokenIs(builder_, DOUBLE_DOT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, DOUBLE_DOT);
    result_ = result_ && expr(builder_, level_ + 1, -1);
    exit_section_(builder_, marker_, STRUCT_DEFAULT, result_);
    return result_;
  }

  /* ********************************************************** */
  // IDENTIFIER ':' expr (',' IDENTIFIER ':' expr)*
  public static boolean struct_initializer_list(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "struct_initializer_list")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, IDENTIFIER);
    result_ = result_ && consumeToken(builder_, COLON);
    result_ = result_ && expr(builder_, level_ + 1, -1);
    result_ = result_ && struct_initializer_list_3(builder_, level_ + 1);
    exit_section_(builder_, marker_, STRUCT_INITIALIZER_LIST, result_);
    return result_;
  }

  // (',' IDENTIFIER ':' expr)*
  private static boolean struct_initializer_list_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "struct_initializer_list_3")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!struct_initializer_list_3_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "struct_initializer_list_3", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // ',' IDENTIFIER ':' expr
  private static boolean struct_initializer_list_3_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "struct_initializer_list_3_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && consumeToken(builder_, IDENTIFIER);
    result_ = result_ && consumeToken(builder_, COLON);
    result_ = result_ && expr(builder_, level_ + 1, -1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // visibility? 'struct' IDENTIFIER generic_params? struct_body
  public static boolean struct_item(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "struct_item")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<struct item>");
    result_ = struct_item_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, KW_STRUCT);
    result_ = result_ && consumeToken(builder_, IDENTIFIER);
    result_ = result_ && struct_item_3(builder_, level_ + 1);
    result_ = result_ && struct_body(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, STRUCT_ITEM, result_, false, null);
    return result_;
  }

  // visibility?
  private static boolean struct_item_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "struct_item_0")) return false;
    visibility(builder_, level_ + 1);
    return true;
  }

  // generic_params?
  private static boolean struct_item_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "struct_item_3")) return false;
    generic_params(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // 'box'? 'ref'? type '{' (struct_match_pattern_argument (',' struct_match_pattern_argument)* [',' '..'] | '..') '}'
  public static boolean struct_match_pattern(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "struct_match_pattern")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<struct match pattern>");
    result_ = struct_match_pattern_0(builder_, level_ + 1);
    result_ = result_ && struct_match_pattern_1(builder_, level_ + 1);
    result_ = result_ && type(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, OPEN_BRACE);
    result_ = result_ && struct_match_pattern_4(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, CLOSE_BRACE);
    exit_section_(builder_, level_, marker_, STRUCT_MATCH_PATTERN, result_, false, null);
    return result_;
  }

  // 'box'?
  private static boolean struct_match_pattern_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "struct_match_pattern_0")) return false;
    consumeToken(builder_, KW_BOX);
    return true;
  }

  // 'ref'?
  private static boolean struct_match_pattern_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "struct_match_pattern_1")) return false;
    consumeToken(builder_, KW_REF);
    return true;
  }

  // struct_match_pattern_argument (',' struct_match_pattern_argument)* [',' '..'] | '..'
  private static boolean struct_match_pattern_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "struct_match_pattern_4")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = struct_match_pattern_4_0(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, DOUBLE_DOT);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // struct_match_pattern_argument (',' struct_match_pattern_argument)* [',' '..']
  private static boolean struct_match_pattern_4_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "struct_match_pattern_4_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = struct_match_pattern_argument(builder_, level_ + 1);
    result_ = result_ && struct_match_pattern_4_0_1(builder_, level_ + 1);
    result_ = result_ && struct_match_pattern_4_0_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (',' struct_match_pattern_argument)*
  private static boolean struct_match_pattern_4_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "struct_match_pattern_4_0_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!struct_match_pattern_4_0_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "struct_match_pattern_4_0_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // ',' struct_match_pattern_argument
  private static boolean struct_match_pattern_4_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "struct_match_pattern_4_0_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && struct_match_pattern_argument(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [',' '..']
  private static boolean struct_match_pattern_4_0_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "struct_match_pattern_4_0_2")) return false;
    struct_match_pattern_4_0_2_0(builder_, level_ + 1);
    return true;
  }

  // ',' '..'
  private static boolean struct_match_pattern_4_0_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "struct_match_pattern_4_0_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && consumeToken(builder_, DOUBLE_DOT);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // match_identifier [':' match_pattern]
  static boolean struct_match_pattern_argument(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "struct_match_pattern_argument")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = match_identifier(builder_, level_ + 1);
    result_ = result_ && struct_match_pattern_argument_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [':' match_pattern]
  private static boolean struct_match_pattern_argument_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "struct_match_pattern_argument_1")) return false;
    struct_match_pattern_argument_1_0(builder_, level_ + 1);
    return true;
  }

  // ':' match_pattern
  private static boolean struct_match_pattern_argument_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "struct_match_pattern_argument_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COLON);
    result_ = result_ && match_pattern(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // (comment | attribute)* visibility? let_variable_bind
  public static boolean struct_property(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "struct_property")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<struct property>");
    result_ = struct_property_0(builder_, level_ + 1);
    result_ = result_ && struct_property_1(builder_, level_ + 1);
    result_ = result_ && let_variable_bind(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, STRUCT_PROPERTY, result_, false, struct_recover_parser_);
    return result_;
  }

  // (comment | attribute)*
  private static boolean struct_property_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "struct_property_0")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!struct_property_0_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "struct_property_0", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // comment | attribute
  private static boolean struct_property_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "struct_property_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = comment(builder_, level_ + 1);
    if (!result_) result_ = attribute(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // visibility?
  private static boolean struct_property_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "struct_property_1")) return false;
    visibility(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // !('}' | ',')
  public static boolean struct_recover(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "struct_recover")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NOT_, "<struct recover>");
    result_ = !struct_recover_0(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, STRUCT_RECOVER, result_, false, null);
    return result_;
  }

  // '}' | ','
  private static boolean struct_recover_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "struct_recover_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, CLOSE_BRACE);
    if (!result_) result_ = consumeToken(builder_, COMMA);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // visibility? type
  public static boolean struct_tuple_property(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "struct_tuple_property")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<struct tuple property>");
    result_ = struct_tuple_property_0(builder_, level_ + 1);
    result_ = result_ && type(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, STRUCT_TUPLE_PROPERTY, result_, false, null);
    return result_;
  }

  // visibility?
  private static boolean struct_tuple_property_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "struct_tuple_property_0")) return false;
    visibility(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // ':' (IDENTIFIER | region_bound)?
  public static boolean trait_bounds(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "trait_bounds")) return false;
    if (!nextTokenIs(builder_, COLON)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COLON);
    result_ = result_ && trait_bounds_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, TRAIT_BOUNDS, result_);
    return result_;
  }

  // (IDENTIFIER | region_bound)?
  private static boolean trait_bounds_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "trait_bounds_1")) return false;
    trait_bounds_1_0(builder_, level_ + 1);
    return true;
  }

  // IDENTIFIER | region_bound
  private static boolean trait_bounds_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "trait_bounds_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, IDENTIFIER);
    if (!result_) result_ = region_bound(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // (comment | attribute)* visibility? 'unsafe'? 'fn' IDENTIFIER generic_params? '(' prototype_args ','? '...'? ')' ['->' return_type]
  public static boolean trait_function_declaration(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "trait_function_declaration")) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<trait function declaration>");
    result_ = trait_function_declaration_0(builder_, level_ + 1);
    result_ = result_ && trait_function_declaration_1(builder_, level_ + 1);
    result_ = result_ && trait_function_declaration_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, KW_FN);
    pinned_ = result_; // pin = 4
    result_ = result_ && report_error_(builder_, consumeToken(builder_, IDENTIFIER));
    result_ = pinned_ && report_error_(builder_, trait_function_declaration_5(builder_, level_ + 1)) && result_;
    result_ = pinned_ && report_error_(builder_, consumeToken(builder_, OPEN_PAREN)) && result_;
    result_ = pinned_ && report_error_(builder_, prototype_args(builder_, level_ + 1)) && result_;
    result_ = pinned_ && report_error_(builder_, trait_function_declaration_8(builder_, level_ + 1)) && result_;
    result_ = pinned_ && report_error_(builder_, trait_function_declaration_9(builder_, level_ + 1)) && result_;
    result_ = pinned_ && report_error_(builder_, consumeToken(builder_, CLOSE_PAREN)) && result_;
    result_ = pinned_ && trait_function_declaration_11(builder_, level_ + 1) && result_;
    exit_section_(builder_, level_, marker_, TRAIT_FUNCTION_DECLARATION, result_, pinned_, not_semicolon_or_open_brace_parser_);
    return result_ || pinned_;
  }

  // (comment | attribute)*
  private static boolean trait_function_declaration_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "trait_function_declaration_0")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!trait_function_declaration_0_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "trait_function_declaration_0", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // comment | attribute
  private static boolean trait_function_declaration_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "trait_function_declaration_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = comment(builder_, level_ + 1);
    if (!result_) result_ = attribute(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // visibility?
  private static boolean trait_function_declaration_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "trait_function_declaration_1")) return false;
    visibility(builder_, level_ + 1);
    return true;
  }

  // 'unsafe'?
  private static boolean trait_function_declaration_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "trait_function_declaration_2")) return false;
    consumeToken(builder_, KW_UNSAFE);
    return true;
  }

  // generic_params?
  private static boolean trait_function_declaration_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "trait_function_declaration_5")) return false;
    generic_params(builder_, level_ + 1);
    return true;
  }

  // ','?
  private static boolean trait_function_declaration_8(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "trait_function_declaration_8")) return false;
    consumeToken(builder_, COMMA);
    return true;
  }

  // '...'?
  private static boolean trait_function_declaration_9(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "trait_function_declaration_9")) return false;
    consumeToken(builder_, TRIPLE_DOT);
    return true;
  }

  // ['->' return_type]
  private static boolean trait_function_declaration_11(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "trait_function_declaration_11")) return false;
    trait_function_declaration_11_0(builder_, level_ + 1);
    return true;
  }

  // '->' return_type
  private static boolean trait_function_declaration_11_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "trait_function_declaration_11_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, THIN_ARROW);
    result_ = result_ && return_type(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // ':' type ('+' type)*
  public static boolean trait_implements(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "trait_implements")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<trait implements>");
    result_ = consumeToken(builder_, COLON);
    result_ = result_ && type(builder_, level_ + 1);
    result_ = result_ && trait_implements_2(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, TRAIT_IMPLEMENTS, result_, false, not_open_brace_parser_);
    return result_;
  }

  // ('+' type)*
  private static boolean trait_implements_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "trait_implements_2")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!trait_implements_2_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "trait_implements_2", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // '+' type
  private static boolean trait_implements_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "trait_implements_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, PLUS);
    result_ = result_ && type(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // visibility? 'trait' generic_params? IDENTIFIER generic_params? trait_implements? '{' (trait_function_declaration (';' | statement_block) )* (comment|attribute)* '}'
  public static boolean trait_item(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "trait_item")) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<trait item>");
    result_ = trait_item_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, KW_TRAIT);
    pinned_ = result_; // pin = 2
    result_ = result_ && report_error_(builder_, trait_item_2(builder_, level_ + 1));
    result_ = pinned_ && report_error_(builder_, consumeToken(builder_, IDENTIFIER)) && result_;
    result_ = pinned_ && report_error_(builder_, trait_item_4(builder_, level_ + 1)) && result_;
    result_ = pinned_ && report_error_(builder_, trait_item_5(builder_, level_ + 1)) && result_;
    result_ = pinned_ && report_error_(builder_, consumeToken(builder_, OPEN_BRACE)) && result_;
    result_ = pinned_ && report_error_(builder_, trait_item_7(builder_, level_ + 1)) && result_;
    result_ = pinned_ && report_error_(builder_, trait_item_8(builder_, level_ + 1)) && result_;
    result_ = pinned_ && consumeToken(builder_, CLOSE_BRACE) && result_;
    exit_section_(builder_, level_, marker_, TRAIT_ITEM, result_, pinned_, null);
    return result_ || pinned_;
  }

  // visibility?
  private static boolean trait_item_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "trait_item_0")) return false;
    visibility(builder_, level_ + 1);
    return true;
  }

  // generic_params?
  private static boolean trait_item_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "trait_item_2")) return false;
    generic_params(builder_, level_ + 1);
    return true;
  }

  // generic_params?
  private static boolean trait_item_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "trait_item_4")) return false;
    generic_params(builder_, level_ + 1);
    return true;
  }

  // trait_implements?
  private static boolean trait_item_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "trait_item_5")) return false;
    trait_implements(builder_, level_ + 1);
    return true;
  }

  // (trait_function_declaration (';' | statement_block) )*
  private static boolean trait_item_7(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "trait_item_7")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!trait_item_7_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "trait_item_7", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // trait_function_declaration (';' | statement_block)
  private static boolean trait_item_7_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "trait_item_7_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = trait_function_declaration(builder_, level_ + 1);
    result_ = result_ && trait_item_7_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ';' | statement_block
  private static boolean trait_item_7_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "trait_item_7_0_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, SEMICOLON);
    if (!result_) result_ = statement_block(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (comment|attribute)*
  private static boolean trait_item_8(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "trait_item_8")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!trait_item_8_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "trait_item_8", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // comment|attribute
  private static boolean trait_item_8_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "trait_item_8_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = comment(builder_, level_ + 1);
    if (!result_) result_ = attribute(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // match_label? 'box'? '&'? type? '(' tuple_match_pattern_argument (',' tuple_match_pattern_argument)* ')'
  public static boolean tuple_match_pattern(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "tuple_match_pattern")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<tuple match pattern>");
    result_ = tuple_match_pattern_0(builder_, level_ + 1);
    result_ = result_ && tuple_match_pattern_1(builder_, level_ + 1);
    result_ = result_ && tuple_match_pattern_2(builder_, level_ + 1);
    result_ = result_ && tuple_match_pattern_3(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, OPEN_PAREN);
    result_ = result_ && tuple_match_pattern_argument(builder_, level_ + 1);
    result_ = result_ && tuple_match_pattern_6(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, CLOSE_PAREN);
    exit_section_(builder_, level_, marker_, TUPLE_MATCH_PATTERN, result_, false, null);
    return result_;
  }

  // match_label?
  private static boolean tuple_match_pattern_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "tuple_match_pattern_0")) return false;
    match_label(builder_, level_ + 1);
    return true;
  }

  // 'box'?
  private static boolean tuple_match_pattern_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "tuple_match_pattern_1")) return false;
    consumeToken(builder_, KW_BOX);
    return true;
  }

  // '&'?
  private static boolean tuple_match_pattern_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "tuple_match_pattern_2")) return false;
    consumeToken(builder_, BITWISE_AND);
    return true;
  }

  // type?
  private static boolean tuple_match_pattern_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "tuple_match_pattern_3")) return false;
    type(builder_, level_ + 1);
    return true;
  }

  // (',' tuple_match_pattern_argument)*
  private static boolean tuple_match_pattern_6(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "tuple_match_pattern_6")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!tuple_match_pattern_6_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "tuple_match_pattern_6", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // ',' tuple_match_pattern_argument
  private static boolean tuple_match_pattern_6_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "tuple_match_pattern_6_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && tuple_match_pattern_argument(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // match_pattern | '..'
  static boolean tuple_match_pattern_argument(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "tuple_match_pattern_argument")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = match_pattern(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, DOUBLE_DOT);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // type_basic | type_vector | type_tuple | type_closure | function_type | type_proc | type_unit
  static boolean type(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = type_basic(builder_, level_ + 1);
    if (!result_) result_ = type_vector(builder_, level_ + 1);
    if (!result_) result_ = type_tuple(builder_, level_ + 1);
    if (!result_) result_ = type_closure(builder_, level_ + 1);
    if (!result_) result_ = function_type(builder_, level_ + 1);
    if (!result_) result_ = type_proc(builder_, level_ + 1);
    if (!result_) result_ = type_unit(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // type_modifiers type_path
  public static boolean type_basic(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_basic")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<type basic>");
    result_ = type_modifiers(builder_, level_ + 1);
    result_ = result_ && type_path(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, TYPE_BASIC, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // ['<'lifetime'>'] closure_prototype_args [':' lifetime] ['->' return_type]
  public static boolean type_closure(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_closure")) return false;
    if (!nextTokenIs(builder_, "<type closure>", LESS_THAN, BITWISE_OR)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<type closure>");
    result_ = type_closure_0(builder_, level_ + 1);
    result_ = result_ && closure_prototype_args(builder_, level_ + 1);
    result_ = result_ && type_closure_2(builder_, level_ + 1);
    result_ = result_ && type_closure_3(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, TYPE_CLOSURE, result_, false, null);
    return result_;
  }

  // ['<'lifetime'>']
  private static boolean type_closure_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_closure_0")) return false;
    type_closure_0_0(builder_, level_ + 1);
    return true;
  }

  // '<'lifetime'>'
  private static boolean type_closure_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_closure_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LESS_THAN);
    result_ = result_ && lifetime(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, GREATER_THAN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [':' lifetime]
  private static boolean type_closure_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_closure_2")) return false;
    type_closure_2_0(builder_, level_ + 1);
    return true;
  }

  // ':' lifetime
  private static boolean type_closure_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_closure_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COLON);
    result_ = result_ && lifetime(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ['->' return_type]
  private static boolean type_closure_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_closure_3")) return false;
    type_closure_3_0(builder_, level_ + 1);
    return true;
  }

  // '->' return_type
  private static boolean type_closure_3_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_closure_3_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, THIN_ARROW);
    result_ = result_ && return_type(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // (comment | attribute)* visibility? 'type' IDENTIFIER generic_params? '=' type ';'
  public static boolean type_item(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_item")) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<type item>");
    result_ = type_item_0(builder_, level_ + 1);
    result_ = result_ && type_item_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, KW_TYPE);
    pinned_ = result_; // pin = 3
    result_ = result_ && report_error_(builder_, consumeToken(builder_, IDENTIFIER));
    result_ = pinned_ && report_error_(builder_, type_item_4(builder_, level_ + 1)) && result_;
    result_ = pinned_ && report_error_(builder_, consumeToken(builder_, ASSIGN)) && result_;
    result_ = pinned_ && report_error_(builder_, type(builder_, level_ + 1)) && result_;
    result_ = pinned_ && consumeToken(builder_, SEMICOLON) && result_;
    exit_section_(builder_, level_, marker_, TYPE_ITEM, result_, pinned_, null);
    return result_ || pinned_;
  }

  // (comment | attribute)*
  private static boolean type_item_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_item_0")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!type_item_0_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "type_item_0", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // comment | attribute
  private static boolean type_item_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_item_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = comment(builder_, level_ + 1);
    if (!result_) result_ = attribute(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // visibility?
  private static boolean type_item_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_item_1")) return false;
    visibility(builder_, level_ + 1);
    return true;
  }

  // generic_params?
  private static boolean type_item_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_item_4")) return false;
    generic_params(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // ( ref | lifetime | '*' | 'mut' | '*' 'mut' | '@' | '~' | '$' | 'box')*
  static boolean type_modifiers(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_modifiers")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!type_modifiers_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "type_modifiers", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // ref | lifetime | '*' | 'mut' | '*' 'mut' | '@' | '~' | '$' | 'box'
  private static boolean type_modifiers_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_modifiers_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = ref(builder_, level_ + 1);
    if (!result_) result_ = lifetime(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, MULTIPLY);
    if (!result_) result_ = consumeToken(builder_, KW_MUT);
    if (!result_) result_ = type_modifiers_0_4(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, AT);
    if (!result_) result_ = consumeToken(builder_, BOX);
    if (!result_) result_ = consumeToken(builder_, DOLLAR);
    if (!result_) result_ = consumeToken(builder_, KW_BOX);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '*' 'mut'
  private static boolean type_modifiers_0_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_modifiers_0_4")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, MULTIPLY);
    result_ = result_ && consumeToken(builder_, KW_MUT);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // '::'? ('self' '::' | 'super' '::')* IDENTIFIER ('::' IDENTIFIER)* '::'? generic? trait_bounds?
  static boolean type_path(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_path")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = type_path_0(builder_, level_ + 1);
    result_ = result_ && type_path_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, IDENTIFIER);
    result_ = result_ && type_path_3(builder_, level_ + 1);
    result_ = result_ && type_path_4(builder_, level_ + 1);
    result_ = result_ && type_path_5(builder_, level_ + 1);
    result_ = result_ && type_path_6(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '::'?
  private static boolean type_path_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_path_0")) return false;
    consumeToken(builder_, DOUBLE_COLON);
    return true;
  }

  // ('self' '::' | 'super' '::')*
  private static boolean type_path_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_path_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!type_path_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "type_path_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // 'self' '::' | 'super' '::'
  private static boolean type_path_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_path_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = type_path_1_0_0(builder_, level_ + 1);
    if (!result_) result_ = type_path_1_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // 'self' '::'
  private static boolean type_path_1_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_path_1_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, KW_SELF);
    result_ = result_ && consumeToken(builder_, DOUBLE_COLON);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // 'super' '::'
  private static boolean type_path_1_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_path_1_0_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, KW_SUPER);
    result_ = result_ && consumeToken(builder_, DOUBLE_COLON);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ('::' IDENTIFIER)*
  private static boolean type_path_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_path_3")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!type_path_3_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "type_path_3", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // '::' IDENTIFIER
  private static boolean type_path_3_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_path_3_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, DOUBLE_COLON);
    result_ = result_ && consumeToken(builder_, IDENTIFIER);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '::'?
  private static boolean type_path_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_path_4")) return false;
    consumeToken(builder_, DOUBLE_COLON);
    return true;
  }

  // generic?
  private static boolean type_path_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_path_5")) return false;
    generic(builder_, level_ + 1);
    return true;
  }

  // trait_bounds?
  private static boolean type_path_6(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_path_6")) return false;
    trait_bounds(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // 'proc' trait_bounds? fn_prototype_args trait_bounds? ['->' return_type]
  public static boolean type_proc(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_proc")) return false;
    if (!nextTokenIs(builder_, KW_PROC)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, KW_PROC);
    result_ = result_ && type_proc_1(builder_, level_ + 1);
    result_ = result_ && fn_prototype_args(builder_, level_ + 1);
    result_ = result_ && type_proc_3(builder_, level_ + 1);
    result_ = result_ && type_proc_4(builder_, level_ + 1);
    exit_section_(builder_, marker_, TYPE_PROC, result_);
    return result_;
  }

  // trait_bounds?
  private static boolean type_proc_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_proc_1")) return false;
    trait_bounds(builder_, level_ + 1);
    return true;
  }

  // trait_bounds?
  private static boolean type_proc_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_proc_3")) return false;
    trait_bounds(builder_, level_ + 1);
    return true;
  }

  // ['->' return_type]
  private static boolean type_proc_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_proc_4")) return false;
    type_proc_4_0(builder_, level_ + 1);
    return true;
  }

  // '->' return_type
  private static boolean type_proc_4_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_proc_4_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, THIN_ARROW);
    result_ = result_ && return_type(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // ref? '(' 'ref'? type (',' 'ref'? type)* ','? ')'
  public static boolean type_tuple(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_tuple")) return false;
    if (!nextTokenIs(builder_, "<type tuple>", BITWISE_AND, OPEN_PAREN)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<type tuple>");
    result_ = type_tuple_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, OPEN_PAREN);
    result_ = result_ && type_tuple_2(builder_, level_ + 1);
    result_ = result_ && type(builder_, level_ + 1);
    result_ = result_ && type_tuple_4(builder_, level_ + 1);
    result_ = result_ && type_tuple_5(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, CLOSE_PAREN);
    exit_section_(builder_, level_, marker_, TYPE_TUPLE, result_, false, null);
    return result_;
  }

  // ref?
  private static boolean type_tuple_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_tuple_0")) return false;
    ref(builder_, level_ + 1);
    return true;
  }

  // 'ref'?
  private static boolean type_tuple_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_tuple_2")) return false;
    consumeToken(builder_, KW_REF);
    return true;
  }

  // (',' 'ref'? type)*
  private static boolean type_tuple_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_tuple_4")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!type_tuple_4_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "type_tuple_4", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // ',' 'ref'? type
  private static boolean type_tuple_4_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_tuple_4_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && type_tuple_4_0_1(builder_, level_ + 1);
    result_ = result_ && type(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // 'ref'?
  private static boolean type_tuple_4_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_tuple_4_0_1")) return false;
    consumeToken(builder_, KW_REF);
    return true;
  }

  // ','?
  private static boolean type_tuple_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_tuple_5")) return false;
    consumeToken(builder_, COMMA);
    return true;
  }

  /* ********************************************************** */
  // ref? '*'? 'mut'? '@'? '(' ')'
  public static boolean type_unit(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_unit")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<type unit>");
    result_ = type_unit_0(builder_, level_ + 1);
    result_ = result_ && type_unit_1(builder_, level_ + 1);
    result_ = result_ && type_unit_2(builder_, level_ + 1);
    result_ = result_ && type_unit_3(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, OPEN_PAREN);
    result_ = result_ && consumeToken(builder_, CLOSE_PAREN);
    exit_section_(builder_, level_, marker_, TYPE_UNIT, result_, false, null);
    return result_;
  }

  // ref?
  private static boolean type_unit_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_unit_0")) return false;
    ref(builder_, level_ + 1);
    return true;
  }

  // '*'?
  private static boolean type_unit_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_unit_1")) return false;
    consumeToken(builder_, MULTIPLY);
    return true;
  }

  // 'mut'?
  private static boolean type_unit_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_unit_2")) return false;
    consumeToken(builder_, KW_MUT);
    return true;
  }

  // '@'?
  private static boolean type_unit_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_unit_3")) return false;
    consumeToken(builder_, AT);
    return true;
  }

  /* ********************************************************** */
  // type_modifiers '[' type [',' '..' expr] ']'
  public static boolean type_vector(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_vector")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<type vector>");
    result_ = type_modifiers(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, OPEN_SQUARE_BRACKET);
    result_ = result_ && type(builder_, level_ + 1);
    result_ = result_ && type_vector_3(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, CLOSE_SQUARE_BRACKET);
    exit_section_(builder_, level_, marker_, TYPE_VECTOR, result_, false, null);
    return result_;
  }

  // [',' '..' expr]
  private static boolean type_vector_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_vector_3")) return false;
    type_vector_3_0(builder_, level_ + 1);
    return true;
  }

  // ',' '..' expr
  private static boolean type_vector_3_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_vector_3_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && consumeToken(builder_, DOUBLE_DOT);
    result_ = result_ && expr(builder_, level_ + 1, -1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // ref? '(' ')'
  static boolean unit(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "unit")) return false;
    if (!nextTokenIs(builder_, "", BITWISE_AND, OPEN_PAREN)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = unit_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, OPEN_PAREN);
    result_ = result_ && consumeToken(builder_, CLOSE_PAREN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ref?
  private static boolean unit_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "unit_0")) return false;
    ref(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // use_internal ';'
  public static boolean use(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "use")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<use>");
    result_ = use_internal(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, SEMICOLON);
    exit_section_(builder_, level_, marker_, USE, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // '*' | '{' IDENTIFIER ( ',' IDENTIFIER )* ','? '}'
  static boolean use_glob(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "use_glob")) return false;
    if (!nextTokenIs(builder_, "", MULTIPLY, OPEN_BRACE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, MULTIPLY);
    if (!result_) result_ = use_glob_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '{' IDENTIFIER ( ',' IDENTIFIER )* ','? '}'
  private static boolean use_glob_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "use_glob_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, OPEN_BRACE);
    result_ = result_ && consumeToken(builder_, IDENTIFIER);
    result_ = result_ && use_glob_1_2(builder_, level_ + 1);
    result_ = result_ && use_glob_1_3(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, CLOSE_BRACE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ( ',' IDENTIFIER )*
  private static boolean use_glob_1_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "use_glob_1_2")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!use_glob_1_2_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "use_glob_1_2", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // ',' IDENTIFIER
  private static boolean use_glob_1_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "use_glob_1_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && consumeToken(builder_, IDENTIFIER);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ','?
  private static boolean use_glob_1_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "use_glob_1_3")) return false;
    consumeToken(builder_, COMMA);
    return true;
  }

  /* ********************************************************** */
  // visibility? 'use' (use_glob | use_part ('::' use_part)* ('::' use_glob | '=' expr_path)?)
  static boolean use_internal(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "use_internal")) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = use_internal_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, KW_USE);
    pinned_ = result_; // pin = 2
    result_ = result_ && use_internal_2(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, null, result_, pinned_, not_semicolon_parser_);
    return result_ || pinned_;
  }

  // visibility?
  private static boolean use_internal_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "use_internal_0")) return false;
    visibility(builder_, level_ + 1);
    return true;
  }

  // use_glob | use_part ('::' use_part)* ('::' use_glob | '=' expr_path)?
  private static boolean use_internal_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "use_internal_2")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = use_glob(builder_, level_ + 1);
    if (!result_) result_ = use_internal_2_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // use_part ('::' use_part)* ('::' use_glob | '=' expr_path)?
  private static boolean use_internal_2_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "use_internal_2_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = use_part(builder_, level_ + 1);
    result_ = result_ && use_internal_2_1_1(builder_, level_ + 1);
    result_ = result_ && use_internal_2_1_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ('::' use_part)*
  private static boolean use_internal_2_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "use_internal_2_1_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!use_internal_2_1_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "use_internal_2_1_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // '::' use_part
  private static boolean use_internal_2_1_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "use_internal_2_1_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, DOUBLE_COLON);
    result_ = result_ && use_part(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ('::' use_glob | '=' expr_path)?
  private static boolean use_internal_2_1_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "use_internal_2_1_2")) return false;
    use_internal_2_1_2_0(builder_, level_ + 1);
    return true;
  }

  // '::' use_glob | '=' expr_path
  private static boolean use_internal_2_1_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "use_internal_2_1_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = use_internal_2_1_2_0_0(builder_, level_ + 1);
    if (!result_) result_ = use_internal_2_1_2_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '::' use_glob
  private static boolean use_internal_2_1_2_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "use_internal_2_1_2_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, DOUBLE_COLON);
    result_ = result_ && use_glob(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '=' expr_path
  private static boolean use_internal_2_1_2_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "use_internal_2_1_2_0_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, ASSIGN);
    result_ = result_ && expr_path(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // IDENTIFIER | 'super' | 'self'
  static boolean use_part(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "use_part")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, IDENTIFIER);
    if (!result_) result_ = consumeToken(builder_, KW_SUPER);
    if (!result_) result_ = consumeToken(builder_, KW_SELF);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // 'ref'? ref? 'mut'? IDENTIFIER
  static boolean variable_signature(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "variable_signature")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = variable_signature_0(builder_, level_ + 1);
    result_ = result_ && variable_signature_1(builder_, level_ + 1);
    result_ = result_ && variable_signature_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, IDENTIFIER);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // 'ref'?
  private static boolean variable_signature_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "variable_signature_0")) return false;
    consumeToken(builder_, KW_REF);
    return true;
  }

  // ref?
  private static boolean variable_signature_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "variable_signature_1")) return false;
    ref(builder_, level_ + 1);
    return true;
  }

  // 'mut'?
  private static boolean variable_signature_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "variable_signature_2")) return false;
    consumeToken(builder_, KW_MUT);
    return true;
  }

  /* ********************************************************** */
  // '..' IDENTIFIER? | match_pattern
  static boolean vector_match_identifier(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "vector_match_identifier")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = vector_match_identifier_0(builder_, level_ + 1);
    if (!result_) result_ = match_pattern(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '..' IDENTIFIER?
  private static boolean vector_match_identifier_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "vector_match_identifier_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, DOUBLE_DOT);
    result_ = result_ && vector_match_identifier_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // IDENTIFIER?
  private static boolean vector_match_identifier_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "vector_match_identifier_0_1")) return false;
    consumeToken(builder_, IDENTIFIER);
    return true;
  }

  /* ********************************************************** */
  // 'box'? 'ref'? '&'? '[' [vector_match_identifier (',' vector_match_identifier)* ] ']'
  public static boolean vector_match_pattern(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "vector_match_pattern")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<vector match pattern>");
    result_ = vector_match_pattern_0(builder_, level_ + 1);
    result_ = result_ && vector_match_pattern_1(builder_, level_ + 1);
    result_ = result_ && vector_match_pattern_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, OPEN_SQUARE_BRACKET);
    result_ = result_ && vector_match_pattern_4(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, CLOSE_SQUARE_BRACKET);
    exit_section_(builder_, level_, marker_, VECTOR_MATCH_PATTERN, result_, false, null);
    return result_;
  }

  // 'box'?
  private static boolean vector_match_pattern_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "vector_match_pattern_0")) return false;
    consumeToken(builder_, KW_BOX);
    return true;
  }

  // 'ref'?
  private static boolean vector_match_pattern_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "vector_match_pattern_1")) return false;
    consumeToken(builder_, KW_REF);
    return true;
  }

  // '&'?
  private static boolean vector_match_pattern_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "vector_match_pattern_2")) return false;
    consumeToken(builder_, BITWISE_AND);
    return true;
  }

  // [vector_match_identifier (',' vector_match_identifier)* ]
  private static boolean vector_match_pattern_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "vector_match_pattern_4")) return false;
    vector_match_pattern_4_0(builder_, level_ + 1);
    return true;
  }

  // vector_match_identifier (',' vector_match_identifier)*
  private static boolean vector_match_pattern_4_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "vector_match_pattern_4_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = vector_match_identifier(builder_, level_ + 1);
    result_ = result_ && vector_match_pattern_4_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (',' vector_match_identifier)*
  private static boolean vector_match_pattern_4_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "vector_match_pattern_4_0_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!vector_match_pattern_4_0_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "vector_match_pattern_4_0_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // ',' vector_match_identifier
  private static boolean vector_match_pattern_4_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "vector_match_pattern_4_0_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && vector_match_identifier(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // 'priv' | 'pub'
  public static boolean visibility(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "visibility")) return false;
    if (!nextTokenIs(builder_, "<visibility>", KW_PRIV, KW_PUB)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<visibility>");
    result_ = consumeToken(builder_, KW_PRIV);
    if (!result_) result_ = consumeToken(builder_, KW_PUB);
    exit_section_(builder_, level_, marker_, VISIBILITY, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // Expression root: expr
  // Operator priority table:
  // 0: ATOM(expr_macro)
  // 1: PREFIX(expr_borrow)
  // 2: POSTFIX(expr_call)
  // 3: ATOM(expr_continue) ATOM(expr_break)
  // 4: BINARY(expr_assign) BINARY(expr_assign_increment) BINARY(expr_assign_decrement) BINARY(expr_assign_multiply) BINARY(expr_assign_divide) BINARY(expr_assign_modulo) BINARY(expr_assign_and) BINARY(expr_assign_or) BINARY(expr_assign_not) BINARY(expr_assign_left_shift) BINARY(expr_assign_right_shift)
  // 5: BINARY(expr_logical_or)
  // 6: BINARY(expr_logical_and)
  // 7: BINARY(expr_equal_to) BINARY(expr_not_equal_to)
  // 8: BINARY(expr_greater_than) BINARY(expr_less_than) BINARY(expr_greater_or_equal) BINARY(expr_less_or_equal)
  // 9: BINARY(expr_bitwise_or)
  // 10: BINARY(expr_bitwise_xor)
  // 11: BINARY(expr_bitwise_and)
  // 12: BINARY(expr_left_shift) BINARY(expr_right_shift)
  // 13: BINARY(expr_plus) BINARY(expr_minus)
  // 14: POSTFIX(expr_as)
  // 15: BINARY(expr_multiply) BINARY(expr_divide) BINARY(expr_modulo)
  // 16: PREFIX(expr_unary_plus) PREFIX(expr_unary_minus) PREFIX(expr_unary_not) PREFIX(expr_deref) PREFIX(expr_box) PREFIX(expr_old_box) PREFIX(expr_managed_box)
  // 17: ATOM(expr_closure) ATOM(expr_proc)
  // 18: POSTFIX(expr_index)
  // 19: BINARY(expr_field)
  // 20: ATOM(expr_block) ATOM(expr_paren) ATOM(expr_vector) POSTFIX(expr_struct_initializer) ATOM(expr_path) ATOM(expr_identifier) ATOM(expr_value)
  public static boolean expr(PsiBuilder builder_, int level_, int priority_) {
    if (!recursion_guard_(builder_, level_, "expr")) return false;
    addVariant(builder_, "<expr>");
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<expr>");
    result_ = expr_macro(builder_, level_ + 1);
    if (!result_) result_ = expr_borrow(builder_, level_ + 1);
    if (!result_) result_ = expr_continue(builder_, level_ + 1);
    if (!result_) result_ = expr_break(builder_, level_ + 1);
    if (!result_) result_ = expr_unary_plus(builder_, level_ + 1);
    if (!result_) result_ = expr_unary_minus(builder_, level_ + 1);
    if (!result_) result_ = expr_deref(builder_, level_ + 1);
    if (!result_) result_ = expr_unary_not(builder_, level_ + 1);
    if (!result_) result_ = expr_box(builder_, level_ + 1);
    if (!result_) result_ = expr_old_box(builder_, level_ + 1);
    if (!result_) result_ = expr_managed_box(builder_, level_ + 1);
    if (!result_) result_ = expr_closure(builder_, level_ + 1);
    if (!result_) result_ = expr_proc(builder_, level_ + 1);
    if (!result_) result_ = expr_block(builder_, level_ + 1);
    if (!result_) result_ = expr_paren(builder_, level_ + 1);
    if (!result_) result_ = expr_vector(builder_, level_ + 1);
    if (!result_) result_ = expr_path(builder_, level_ + 1);
    if (!result_) result_ = expr_identifier(builder_, level_ + 1);
    if (!result_) result_ = expr_value(builder_, level_ + 1);
    pinned_ = result_;
    result_ = result_ && expr_0(builder_, level_ + 1, priority_);
    exit_section_(builder_, level_, marker_, null, result_, pinned_, null);
    return result_ || pinned_;
  }

  public static boolean expr_0(PsiBuilder builder_, int level_, int priority_) {
    if (!recursion_guard_(builder_, level_, "expr_0")) return false;
    boolean result_ = true;
    while (true) {
      Marker left_marker_ = (Marker) builder_.getLatestDoneMarker();
      if (!invalid_left_marker_guard_(builder_, left_marker_, "expr_0")) return false;
      Marker marker_ = builder_.mark();
      if (priority_ < 2 && expr_call_0(builder_, level_ + 1)) {
        result_ = true;
        marker_.drop();
        left_marker_.precede().done(EXPR_CALL);
      }
      else if (priority_ < 4 && consumeTokenSmart(builder_, ASSIGN)) {
        result_ = report_error_(builder_, expr(builder_, level_, 3));
        marker_.drop();
        left_marker_.precede().done(EXPR_ASSIGN);
      }
      else if (priority_ < 4 && expr_assign_increment_0(builder_, level_ + 1)) {
        result_ = report_error_(builder_, expr(builder_, level_, 3));
        marker_.drop();
        left_marker_.precede().done(EXPR_ASSIGN_INCREMENT);
      }
      else if (priority_ < 4 && expr_assign_decrement_0(builder_, level_ + 1)) {
        result_ = report_error_(builder_, expr(builder_, level_, 3));
        marker_.drop();
        left_marker_.precede().done(EXPR_ASSIGN_DECREMENT);
      }
      else if (priority_ < 4 && expr_assign_multiply_0(builder_, level_ + 1)) {
        result_ = report_error_(builder_, expr(builder_, level_, 3));
        marker_.drop();
        left_marker_.precede().done(EXPR_ASSIGN_MULTIPLY);
      }
      else if (priority_ < 4 && expr_assign_divide_0(builder_, level_ + 1)) {
        result_ = report_error_(builder_, expr(builder_, level_, 3));
        marker_.drop();
        left_marker_.precede().done(EXPR_ASSIGN_DIVIDE);
      }
      else if (priority_ < 4 && expr_assign_modulo_0(builder_, level_ + 1)) {
        result_ = report_error_(builder_, expr(builder_, level_, 3));
        marker_.drop();
        left_marker_.precede().done(EXPR_ASSIGN_MODULO);
      }
      else if (priority_ < 4 && expr_assign_and_0(builder_, level_ + 1)) {
        result_ = report_error_(builder_, expr(builder_, level_, 3));
        marker_.drop();
        left_marker_.precede().done(EXPR_ASSIGN_AND);
      }
      else if (priority_ < 4 && expr_assign_or_0(builder_, level_ + 1)) {
        result_ = report_error_(builder_, expr(builder_, level_, 3));
        marker_.drop();
        left_marker_.precede().done(EXPR_ASSIGN_OR);
      }
      else if (priority_ < 4 && expr_assign_not_0(builder_, level_ + 1)) {
        result_ = report_error_(builder_, expr(builder_, level_, 3));
        marker_.drop();
        left_marker_.precede().done(EXPR_ASSIGN_NOT);
      }
      else if (priority_ < 4 && consumeTokenSmart(builder_, ASSIGN_LEFT_SHIFT)) {
        result_ = report_error_(builder_, expr(builder_, level_, 3));
        marker_.drop();
        left_marker_.precede().done(EXPR_ASSIGN_LEFT_SHIFT);
      }
      else if (priority_ < 4 && consumeTokenSmart(builder_, ASSIGN_RIGHT_SHIFT)) {
        result_ = report_error_(builder_, expr(builder_, level_, 3));
        marker_.drop();
        left_marker_.precede().done(EXPR_ASSIGN_RIGHT_SHIFT);
      }
      else if (priority_ < 5 && expr_logical_or_0(builder_, level_ + 1)) {
        result_ = report_error_(builder_, expr(builder_, level_, 5));
        marker_.drop();
        left_marker_.precede().done(EXPR_LOGICAL_OR);
      }
      else if (priority_ < 6 && expr_logical_and_0(builder_, level_ + 1)) {
        result_ = report_error_(builder_, expr(builder_, level_, 6));
        marker_.drop();
        left_marker_.precede().done(EXPR_LOGICAL_AND);
      }
      else if (priority_ < 7 && consumeTokenSmart(builder_, EQUAL)) {
        result_ = report_error_(builder_, expr(builder_, level_, 7));
        marker_.drop();
        left_marker_.precede().done(EXPR_EQUAL_TO);
      }
      else if (priority_ < 7 && consumeTokenSmart(builder_, NOT_EQUAL)) {
        result_ = report_error_(builder_, expr(builder_, level_, 7));
        marker_.drop();
        left_marker_.precede().done(EXPR_NOT_EQUAL_TO);
      }
      else if (priority_ < 8 && expr_greater_than_0(builder_, level_ + 1)) {
        result_ = report_error_(builder_, expr(builder_, level_, 8));
        marker_.drop();
        left_marker_.precede().done(EXPR_GREATER_THAN);
      }
      else if (priority_ < 8 && expr_less_than_0(builder_, level_ + 1)) {
        result_ = report_error_(builder_, expr(builder_, level_, 8));
        marker_.drop();
        left_marker_.precede().done(EXPR_LESS_THAN);
      }
      else if (priority_ < 8 && consumeTokenSmart(builder_, GREATER_THAN_OR_EQUAL)) {
        result_ = report_error_(builder_, expr(builder_, level_, 8));
        marker_.drop();
        left_marker_.precede().done(EXPR_GREATER_OR_EQUAL);
      }
      else if (priority_ < 8 && consumeTokenSmart(builder_, LESS_THAN_OR_EQUAL)) {
        result_ = report_error_(builder_, expr(builder_, level_, 8));
        marker_.drop();
        left_marker_.precede().done(EXPR_LESS_OR_EQUAL);
      }
      else if (priority_ < 9 && consumeTokenSmart(builder_, BITWISE_OR)) {
        result_ = report_error_(builder_, expr(builder_, level_, 9));
        marker_.drop();
        left_marker_.precede().done(EXPR_BITWISE_OR);
      }
      else if (priority_ < 10 && consumeTokenSmart(builder_, BITWISE_XOR)) {
        result_ = report_error_(builder_, expr(builder_, level_, 10));
        marker_.drop();
        left_marker_.precede().done(EXPR_BITWISE_XOR);
      }
      else if (priority_ < 11 && consumeTokenSmart(builder_, BITWISE_AND)) {
        result_ = report_error_(builder_, expr(builder_, level_, 11));
        marker_.drop();
        left_marker_.precede().done(EXPR_BITWISE_AND);
      }
      else if (priority_ < 12 && expr_left_shift_0(builder_, level_ + 1)) {
        result_ = report_error_(builder_, expr(builder_, level_, 12));
        marker_.drop();
        left_marker_.precede().done(EXPR_LEFT_SHIFT);
      }
      else if (priority_ < 12 && expr_right_shift_0(builder_, level_ + 1)) {
        result_ = report_error_(builder_, expr(builder_, level_, 12));
        marker_.drop();
        left_marker_.precede().done(EXPR_RIGHT_SHIFT);
      }
      else if (priority_ < 13 && consumeTokenSmart(builder_, PLUS)) {
        result_ = report_error_(builder_, expr(builder_, level_, 13));
        marker_.drop();
        left_marker_.precede().done(EXPR_PLUS);
      }
      else if (priority_ < 13 && consumeTokenSmart(builder_, MINUS)) {
        result_ = report_error_(builder_, expr(builder_, level_, 13));
        marker_.drop();
        left_marker_.precede().done(EXPR_MINUS);
      }
      else if (priority_ < 14 && expr_as_0(builder_, level_ + 1)) {
        result_ = true;
        marker_.drop();
        left_marker_.precede().done(EXPR_AS);
      }
      else if (priority_ < 15 && consumeTokenSmart(builder_, MULTIPLY)) {
        result_ = report_error_(builder_, expr(builder_, level_, 15));
        marker_.drop();
        left_marker_.precede().done(EXPR_MULTIPLY);
      }
      else if (priority_ < 15 && consumeTokenSmart(builder_, DIVIDE)) {
        result_ = report_error_(builder_, expr(builder_, level_, 15));
        marker_.drop();
        left_marker_.precede().done(EXPR_DIVIDE);
      }
      else if (priority_ < 15 && consumeTokenSmart(builder_, REMAINDER)) {
        result_ = report_error_(builder_, expr(builder_, level_, 15));
        marker_.drop();
        left_marker_.precede().done(EXPR_MODULO);
      }
      else if (priority_ < 18 && expr_index_0(builder_, level_ + 1)) {
        result_ = true;
        marker_.drop();
        left_marker_.precede().done(EXPR_INDEX);
      }
      else if (priority_ < 19 && consumeTokenSmart(builder_, DOT)) {
        result_ = report_error_(builder_, expr(builder_, level_, 19));
        marker_.drop();
        left_marker_.precede().done(EXPR_FIELD);
      }
      else if (priority_ < 20 && expr_struct_initializer_0(builder_, level_ + 1)) {
        result_ = true;
        marker_.drop();
        left_marker_.precede().done(EXPR_STRUCT_INITIALIZER);
      }
      else {
        exit_section_(builder_, marker_, null, false);
        break;
      }
    }
    return result_;
  }

  // IDENTIFIER '!' (macro_paren | macro_brace | macro_bracket)
  public static boolean expr_macro(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_macro")) return false;
    if (!nextTokenIsFast(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokenSmart(builder_, IDENTIFIER);
    result_ = result_ && consumeToken(builder_, NOT);
    result_ = result_ && expr_macro_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, EXPR_MACRO, result_);
    return result_;
  }

  // macro_paren | macro_brace | macro_bracket
  private static boolean expr_macro_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_macro_2")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = macro_paren(builder_, level_ + 1);
    if (!result_) result_ = macro_brace(builder_, level_ + 1);
    if (!result_) result_ = macro_bracket(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  public static boolean expr_borrow(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_borrow")) return false;
    if (!nextTokenIsFast(builder_, BITWISE_AND)) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = expr_borrow_0(builder_, level_ + 1);
    pinned_ = result_;
    result_ = pinned_ && expr(builder_, level_, 1);
    exit_section_(builder_, level_, marker_, EXPR_BORROW, result_, pinned_, null);
    return result_ || pinned_;
  }

  // '&' lifetime? 'mut'?
  private static boolean expr_borrow_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_borrow_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokenSmart(builder_, BITWISE_AND);
    result_ = result_ && expr_borrow_0_1(builder_, level_ + 1);
    result_ = result_ && expr_borrow_0_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // lifetime?
  private static boolean expr_borrow_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_borrow_0_1")) return false;
    lifetime(builder_, level_ + 1);
    return true;
  }

  // 'mut'?
  private static boolean expr_borrow_0_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_borrow_0_2")) return false;
    consumeTokenSmart(builder_, KW_MUT);
    return true;
  }

  // '(' call_params ')'
  private static boolean expr_call_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_call_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokenSmart(builder_, OPEN_PAREN);
    result_ = result_ && call_params(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, CLOSE_PAREN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // 'continue' lifetime?
  public static boolean expr_continue(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_continue")) return false;
    if (!nextTokenIsFast(builder_, KW_CONTINUE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokenSmart(builder_, KW_CONTINUE);
    result_ = result_ && expr_continue_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, EXPR_CONTINUE, result_);
    return result_;
  }

  // lifetime?
  private static boolean expr_continue_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_continue_1")) return false;
    lifetime(builder_, level_ + 1);
    return true;
  }

  // 'break' lifetime?
  public static boolean expr_break(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_break")) return false;
    if (!nextTokenIsFast(builder_, KW_BREAK)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokenSmart(builder_, KW_BREAK);
    result_ = result_ && expr_break_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, EXPR_BREAK, result_);
    return result_;
  }

  // lifetime?
  private static boolean expr_break_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_break_1")) return false;
    lifetime(builder_, level_ + 1);
    return true;
  }

  // '+' '='
  private static boolean expr_assign_increment_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_assign_increment_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokenSmart(builder_, PLUS);
    result_ = result_ && consumeToken(builder_, ASSIGN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '-' '='
  private static boolean expr_assign_decrement_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_assign_decrement_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokenSmart(builder_, MINUS);
    result_ = result_ && consumeToken(builder_, ASSIGN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '*' '='
  private static boolean expr_assign_multiply_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_assign_multiply_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokenSmart(builder_, MULTIPLY);
    result_ = result_ && consumeToken(builder_, ASSIGN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '/' '='
  private static boolean expr_assign_divide_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_assign_divide_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokenSmart(builder_, DIVIDE);
    result_ = result_ && consumeToken(builder_, ASSIGN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '%' '='
  private static boolean expr_assign_modulo_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_assign_modulo_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokenSmart(builder_, REMAINDER);
    result_ = result_ && consumeToken(builder_, ASSIGN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '&' '='
  private static boolean expr_assign_and_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_assign_and_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokenSmart(builder_, BITWISE_AND);
    result_ = result_ && consumeToken(builder_, ASSIGN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '|' '='
  private static boolean expr_assign_or_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_assign_or_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokenSmart(builder_, BITWISE_OR);
    result_ = result_ && consumeToken(builder_, ASSIGN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '^' '='
  private static boolean expr_assign_not_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_assign_not_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokenSmart(builder_, BITWISE_XOR);
    result_ = result_ && consumeToken(builder_, ASSIGN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '|' '|'
  private static boolean expr_logical_or_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_logical_or_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokenSmart(builder_, BITWISE_OR);
    result_ = result_ && consumeToken(builder_, BITWISE_OR);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '&' '&'
  private static boolean expr_logical_and_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_logical_and_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokenSmart(builder_, BITWISE_AND);
    result_ = result_ && consumeToken(builder_, BITWISE_AND);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '>' !'>'
  private static boolean expr_greater_than_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_greater_than_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokenSmart(builder_, GREATER_THAN);
    result_ = result_ && expr_greater_than_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // !'>'
  private static boolean expr_greater_than_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_greater_than_0_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NOT_, null);
    result_ = !consumeTokenSmart(builder_, GREATER_THAN);
    exit_section_(builder_, level_, marker_, null, result_, false, null);
    return result_;
  }

  // '<' !'<'
  private static boolean expr_less_than_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_less_than_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokenSmart(builder_, LESS_THAN);
    result_ = result_ && expr_less_than_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // !'<'
  private static boolean expr_less_than_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_less_than_0_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NOT_, null);
    result_ = !consumeTokenSmart(builder_, LESS_THAN);
    exit_section_(builder_, level_, marker_, null, result_, false, null);
    return result_;
  }

  // '<' '<'
  private static boolean expr_left_shift_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_left_shift_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokenSmart(builder_, LESS_THAN);
    result_ = result_ && consumeToken(builder_, LESS_THAN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '>' '>'
  private static boolean expr_right_shift_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_right_shift_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokenSmart(builder_, GREATER_THAN);
    result_ = result_ && consumeToken(builder_, GREATER_THAN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  public static boolean expr_unary_plus(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_unary_plus")) return false;
    if (!nextTokenIsFast(builder_, PLUS)) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeTokenSmart(builder_, PLUS);
    pinned_ = result_;
    result_ = pinned_ && expr(builder_, level_, 16);
    exit_section_(builder_, level_, marker_, EXPR_UNARY_PLUS, result_, pinned_, null);
    return result_ || pinned_;
  }

  public static boolean expr_unary_minus(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_unary_minus")) return false;
    if (!nextTokenIsFast(builder_, MINUS)) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeTokenSmart(builder_, MINUS);
    pinned_ = result_;
    result_ = pinned_ && expr(builder_, level_, 16);
    exit_section_(builder_, level_, marker_, EXPR_UNARY_MINUS, result_, pinned_, null);
    return result_ || pinned_;
  }

  // 'as' type
  private static boolean expr_as_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_as_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokenSmart(builder_, KW_AS);
    result_ = result_ && type(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  public static boolean expr_deref(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_deref")) return false;
    if (!nextTokenIsFast(builder_, MULTIPLY)) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeTokenSmart(builder_, MULTIPLY);
    pinned_ = result_;
    result_ = pinned_ && expr(builder_, level_, 16);
    exit_section_(builder_, level_, marker_, EXPR_DEREF, result_, pinned_, null);
    return result_ || pinned_;
  }

  public static boolean expr_unary_not(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_unary_not")) return false;
    if (!nextTokenIsFast(builder_, NOT)) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeTokenSmart(builder_, NOT);
    pinned_ = result_;
    result_ = pinned_ && expr(builder_, level_, 16);
    exit_section_(builder_, level_, marker_, EXPR_UNARY_NOT, result_, pinned_, null);
    return result_ || pinned_;
  }

  public static boolean expr_box(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_box")) return false;
    if (!nextTokenIsFast(builder_, KW_BOX)) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeTokenSmart(builder_, KW_BOX);
    pinned_ = result_;
    result_ = pinned_ && expr(builder_, level_, 16);
    exit_section_(builder_, level_, marker_, EXPR_BOX, result_, pinned_, null);
    return result_ || pinned_;
  }

  public static boolean expr_old_box(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_old_box")) return false;
    if (!nextTokenIsFast(builder_, BOX)) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeTokenSmart(builder_, BOX);
    pinned_ = result_;
    result_ = pinned_ && expr(builder_, level_, 16);
    exit_section_(builder_, level_, marker_, EXPR_OLD_BOX, result_, pinned_, null);
    return result_ || pinned_;
  }

  public static boolean expr_managed_box(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_managed_box")) return false;
    if (!nextTokenIsFast(builder_, AT)) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeTokenSmart(builder_, AT);
    pinned_ = result_;
    result_ = pinned_ && expr(builder_, level_, 16);
    exit_section_(builder_, level_, marker_, EXPR_MANAGED_BOX, result_, pinned_, null);
    return result_ || pinned_;
  }

  // closure_expr_args closure_body
  public static boolean expr_closure(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_closure")) return false;
    if (!nextTokenIsFast(builder_, BITWISE_OR)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = closure_expr_args(builder_, level_ + 1);
    result_ = result_ && closure_body(builder_, level_ + 1);
    exit_section_(builder_, marker_, EXPR_CLOSURE, result_);
    return result_;
  }

  // 'proc' fn_args closure_body
  public static boolean expr_proc(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_proc")) return false;
    if (!nextTokenIsFast(builder_, KW_PROC)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokenSmart(builder_, KW_PROC);
    result_ = result_ && fn_args(builder_, level_ + 1);
    result_ = result_ && closure_body(builder_, level_ + 1);
    exit_section_(builder_, marker_, EXPR_PROC, result_);
    return result_;
  }

  // '[' index_expr ']'
  private static boolean expr_index_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_index_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokenSmart(builder_, OPEN_SQUARE_BRACKET);
    result_ = result_ && index_expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, CLOSE_SQUARE_BRACKET);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // statement_block | block_for | block_if | block_while | block_loop | block_unsafe | block_match
  public static boolean expr_block(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_block")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _COLLAPSE_, "<expr block>");
    result_ = statement_block(builder_, level_ + 1);
    if (!result_) result_ = block_for(builder_, level_ + 1);
    if (!result_) result_ = block_if(builder_, level_ + 1);
    if (!result_) result_ = block_while(builder_, level_ + 1);
    if (!result_) result_ = block_loop(builder_, level_ + 1);
    if (!result_) result_ = block_unsafe(builder_, level_ + 1);
    if (!result_) result_ = block_match(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, EXPR_BLOCK, result_, false, null);
    return result_;
  }

  // '(' expr expr_tuple_body? ')'
  public static boolean expr_paren(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_paren")) return false;
    if (!nextTokenIsFast(builder_, OPEN_PAREN)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokenSmart(builder_, OPEN_PAREN);
    result_ = result_ && expr(builder_, level_ + 1, -1);
    result_ = result_ && expr_paren_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, CLOSE_PAREN);
    exit_section_(builder_, marker_, EXPR_PAREN, result_);
    return result_;
  }

  // expr_tuple_body?
  private static boolean expr_paren_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_paren_2")) return false;
    expr_tuple_body(builder_, level_ + 1);
    return true;
  }

  // '~'? '[' [(comment | attribute)* expr (',' (comment | attribute)* expr)*] (comment | attribute)* [',' '..' expr] ','?(comment | attribute)*']'
  public static boolean expr_vector(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_vector")) return false;
    if (!nextTokenIsFast(builder_, OPEN_SQUARE_BRACKET, BOX)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<expr vector>");
    result_ = expr_vector_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, OPEN_SQUARE_BRACKET);
    result_ = result_ && expr_vector_2(builder_, level_ + 1);
    result_ = result_ && expr_vector_3(builder_, level_ + 1);
    result_ = result_ && expr_vector_4(builder_, level_ + 1);
    result_ = result_ && expr_vector_5(builder_, level_ + 1);
    result_ = result_ && expr_vector_6(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, CLOSE_SQUARE_BRACKET);
    exit_section_(builder_, level_, marker_, EXPR_VECTOR, result_, false, null);
    return result_;
  }

  // '~'?
  private static boolean expr_vector_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_vector_0")) return false;
    consumeTokenSmart(builder_, BOX);
    return true;
  }

  // [(comment | attribute)* expr (',' (comment | attribute)* expr)*]
  private static boolean expr_vector_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_vector_2")) return false;
    expr_vector_2_0(builder_, level_ + 1);
    return true;
  }

  // (comment | attribute)* expr (',' (comment | attribute)* expr)*
  private static boolean expr_vector_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_vector_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = expr_vector_2_0_0(builder_, level_ + 1);
    result_ = result_ && expr(builder_, level_ + 1, -1);
    result_ = result_ && expr_vector_2_0_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (comment | attribute)*
  private static boolean expr_vector_2_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_vector_2_0_0")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!expr_vector_2_0_0_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "expr_vector_2_0_0", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // comment | attribute
  private static boolean expr_vector_2_0_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_vector_2_0_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = comment(builder_, level_ + 1);
    if (!result_) result_ = attribute(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (',' (comment | attribute)* expr)*
  private static boolean expr_vector_2_0_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_vector_2_0_2")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!expr_vector_2_0_2_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "expr_vector_2_0_2", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // ',' (comment | attribute)* expr
  private static boolean expr_vector_2_0_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_vector_2_0_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokenSmart(builder_, COMMA);
    result_ = result_ && expr_vector_2_0_2_0_1(builder_, level_ + 1);
    result_ = result_ && expr(builder_, level_ + 1, -1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (comment | attribute)*
  private static boolean expr_vector_2_0_2_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_vector_2_0_2_0_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!expr_vector_2_0_2_0_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "expr_vector_2_0_2_0_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // comment | attribute
  private static boolean expr_vector_2_0_2_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_vector_2_0_2_0_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = comment(builder_, level_ + 1);
    if (!result_) result_ = attribute(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (comment | attribute)*
  private static boolean expr_vector_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_vector_3")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!expr_vector_3_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "expr_vector_3", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // comment | attribute
  private static boolean expr_vector_3_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_vector_3_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = comment(builder_, level_ + 1);
    if (!result_) result_ = attribute(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [',' '..' expr]
  private static boolean expr_vector_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_vector_4")) return false;
    expr_vector_4_0(builder_, level_ + 1);
    return true;
  }

  // ',' '..' expr
  private static boolean expr_vector_4_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_vector_4_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokenSmart(builder_, COMMA);
    result_ = result_ && consumeToken(builder_, DOUBLE_DOT);
    result_ = result_ && expr(builder_, level_ + 1, -1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ','?
  private static boolean expr_vector_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_vector_5")) return false;
    consumeTokenSmart(builder_, COMMA);
    return true;
  }

  // (comment | attribute)*
  private static boolean expr_vector_6(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_vector_6")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!expr_vector_6_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "expr_vector_6", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // comment | attribute
  private static boolean expr_vector_6_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_vector_6_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = comment(builder_, level_ + 1);
    if (!result_) result_ = attribute(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '{' struct_initializer_list [',' struct_default?] "}"
  private static boolean expr_struct_initializer_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_struct_initializer_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokenSmart(builder_, OPEN_BRACE);
    result_ = result_ && struct_initializer_list(builder_, level_ + 1);
    result_ = result_ && expr_struct_initializer_0_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, CLOSE_BRACE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [',' struct_default?]
  private static boolean expr_struct_initializer_0_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_struct_initializer_0_2")) return false;
    expr_struct_initializer_0_2_0(builder_, level_ + 1);
    return true;
  }

  // ',' struct_default?
  private static boolean expr_struct_initializer_0_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_struct_initializer_0_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokenSmart(builder_, COMMA);
    result_ = result_ && expr_struct_initializer_0_2_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // struct_default?
  private static boolean expr_struct_initializer_0_2_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_struct_initializer_0_2_0_1")) return false;
    struct_default(builder_, level_ + 1);
    return true;
  }

  // '::'? ('self' '::' | 'super' '::')* IDENTIFIER ('::' (IDENTIFIER | generic))*
  public static boolean expr_path(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_path")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<expr path>");
    result_ = expr_path_0(builder_, level_ + 1);
    result_ = result_ && expr_path_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, IDENTIFIER);
    result_ = result_ && expr_path_3(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, EXPR_PATH, result_, false, null);
    return result_;
  }

  // '::'?
  private static boolean expr_path_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_path_0")) return false;
    consumeTokenSmart(builder_, DOUBLE_COLON);
    return true;
  }

  // ('self' '::' | 'super' '::')*
  private static boolean expr_path_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_path_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!expr_path_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "expr_path_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // 'self' '::' | 'super' '::'
  private static boolean expr_path_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_path_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = expr_path_1_0_0(builder_, level_ + 1);
    if (!result_) result_ = expr_path_1_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // 'self' '::'
  private static boolean expr_path_1_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_path_1_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokenSmart(builder_, KW_SELF);
    result_ = result_ && consumeToken(builder_, DOUBLE_COLON);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // 'super' '::'
  private static boolean expr_path_1_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_path_1_0_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokenSmart(builder_, KW_SUPER);
    result_ = result_ && consumeToken(builder_, DOUBLE_COLON);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ('::' (IDENTIFIER | generic))*
  private static boolean expr_path_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_path_3")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!expr_path_3_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "expr_path_3", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // '::' (IDENTIFIER | generic)
  private static boolean expr_path_3_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_path_3_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokenSmart(builder_, DOUBLE_COLON);
    result_ = result_ && expr_path_3_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // IDENTIFIER | generic
  private static boolean expr_path_3_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_path_3_0_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokenSmart(builder_, IDENTIFIER);
    if (!result_) result_ = generic(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // IDENTIFIER
  public static boolean expr_identifier(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_identifier")) return false;
    if (!nextTokenIsFast(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokenSmart(builder_, IDENTIFIER);
    exit_section_(builder_, marker_, EXPR_IDENTIFIER, result_);
    return result_;
  }

  // literal
  public static boolean expr_value(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_value")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _COLLAPSE_, "<expr value>");
    result_ = literal(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, EXPR_VALUE, result_, false, null);
    return result_;
  }

  final static Parser attrib_recover_parser_ = new Parser() {
    public boolean parse(PsiBuilder builder_, int level_) {
      return attrib_recover(builder_, level_ + 1);
    }
  };
  final static Parser function_recover_parser_ = new Parser() {
    public boolean parse(PsiBuilder builder_, int level_) {
      return function_recover(builder_, level_ + 1);
    }
  };
  final static Parser not_close_brace_parser_ = new Parser() {
    public boolean parse(PsiBuilder builder_, int level_) {
      return not_close_brace(builder_, level_ + 1);
    }
  };
  final static Parser not_open_brace_parser_ = new Parser() {
    public boolean parse(PsiBuilder builder_, int level_) {
      return not_open_brace(builder_, level_ + 1);
    }
  };
  final static Parser not_semicolon_or_open_brace_parser_ = new Parser() {
    public boolean parse(PsiBuilder builder_, int level_) {
      return not_semicolon_or_open_brace(builder_, level_ + 1);
    }
  };
  final static Parser not_semicolon_parser_ = new Parser() {
    public boolean parse(PsiBuilder builder_, int level_) {
      return not_semicolon(builder_, level_ + 1);
    }
  };
  final static Parser struct_recover_parser_ = new Parser() {
    public boolean parse(PsiBuilder builder_, int level_) {
      return struct_recover(builder_, level_ + 1);
    }
  };
}
