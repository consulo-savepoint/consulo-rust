package vektah.rust;

import java.io.Reader;

import org.jetbrains.annotations.NotNull;
import com.intellij.lang.ASTNode;
import com.intellij.lang.Language;
import com.intellij.lang.LanguageVersion;
import com.intellij.lang.ParserDefinition;
import com.intellij.lang.PsiParser;
import com.intellij.lexer.FlexAdapter;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.TokenSet;
import vektah.rust.psi.RustFile;
import vektah.rust.psi.RustTokens;

public class RustParserDefinition implements ParserDefinition
{
	public static final TokenSet WHITE_SPACES = TokenSet.create(TokenType.WHITE_SPACE);
	public static final TokenSet COMMENTS = TokenSet.create(RustTokens.BLOCK_COMMENT, RustTokens.LINE_COMMENT);
	public static final IFileElementType FILE = new IFileElementType(Language.findInstance(RustLanguage.class));

	@NotNull
	@Override
	public Lexer createLexer(Project project, @NotNull LanguageVersion languageVersion)
	{
		return new FlexAdapter(new RustLexer((Reader) null));
	}

	@NotNull
	@Override
	public PsiParser createParser(Project project, @NotNull LanguageVersion languageVersion)
	{
		return new RustParser();
	}

	@NotNull
	@Override
	public IFileElementType getFileNodeType()
	{
		return FILE;
	}

	@NotNull
	@Override
	public TokenSet getWhitespaceTokens(@NotNull LanguageVersion languageVersion)
	{
		return WHITE_SPACES;
	}

	@NotNull
	@Override
	public TokenSet getCommentTokens(@NotNull LanguageVersion languageVersion)
	{
		return COMMENTS;
	}

	@NotNull
	@Override
	public TokenSet getStringLiteralElements(@NotNull LanguageVersion languageVersion)
	{
		return TokenSet.EMPTY;
	}

	@NotNull
	@Override
	public PsiElement createElement(ASTNode astNode)
	{
		return RustTokens.Factory.createElement(astNode);
	}

	@Override
	public PsiFile createFile(FileViewProvider fileViewProvider)
	{
		return new RustFile(fileViewProvider);
	}

	@NotNull
	@Override
	public SpaceRequirements spaceExistanceTypeBetweenTokens(ASTNode astNode, ASTNode astNode2)
	{
		return SpaceRequirements.MAY;
	}
}
