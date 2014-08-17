package vektah.rust;

import javax.swing.Icon;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import com.intellij.openapi.fileTypes.LanguageFileType;
import vektah.rust.i18n.RustBundle;

public class RustFileType extends LanguageFileType
{
	public static final RustFileType INSTANCE = new RustFileType();

	private RustFileType()
	{
		super(RustLanguage.INSTANCE);
	}

	@NotNull
	@Override
	public String getName()
	{
		return RustBundle.message("file.type.name.rust");
	}

	@NotNull
	@Override
	public String getDescription()
	{
		return RustBundle.message("file.type.description.rust");
	}

	@NotNull
	@Override
	public String getDefaultExtension()
	{
		return "rs";
	}

	@Nullable
	@Override
	public Icon getIcon()
	{
		return RustIcons.Rust;
	}
}
