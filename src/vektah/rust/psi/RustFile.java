package vektah.rust.psi;

import org.jetbrains.annotations.NotNull;
import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import vektah.rust.RustFileType;
import vektah.rust.RustLanguage;
import vektah.rust.i18n.RustBundle;

public class RustFile extends PsiFileBase
{
	public RustFile(@NotNull FileViewProvider fileViewProvider)
	{
		super(fileViewProvider, RustLanguage.INSTANCE);
	}

	@NotNull
	@Override
	public FileType getFileType()
	{
		return RustFileType.INSTANCE;
	}

	@Override
	public String toString()
	{
		return RustBundle.message("file.name.rust");
	}
}
