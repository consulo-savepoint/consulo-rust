package vektah.rust.ide.sdk;

import java.io.File;

import javax.swing.Icon;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import com.intellij.openapi.projectRoots.SdkType;
import com.intellij.openapi.roots.OrderRootType;
import com.intellij.openapi.roots.types.BinariesOrderRootType;
import com.intellij.openapi.util.SystemInfo;
import vektah.rust.RustIcons;
import vektah.rust.i18n.RustBundle;

public class RustSdkType extends SdkType
{
	@NotNull
	public static String getRustc(String path)
	{
		return path + "/bin/rustc" + (SystemInfo.isWindows ? ".exe" : "");
	}

	@NotNull
	public static RustSdkType getInstance()
	{
		return EP_NAME.findExtension(RustSdkType.class);
	}

	public RustSdkType()
	{
		super(RustBundle.message("sdk.name.rust"));
	}

	@Nullable
	@Override
	public String getVersionString(String s)
	{
		return RustSdkUtil.getVersion(new File(getRustc(s)));
	}

	@Override
	public boolean isValidSdkHome(String path)
	{
		return getVersionString(path) != null;
	}

	@Override
	public String suggestSdkName(String currentSdkName, String sdkHome)
	{
		return getPresentableName();
	}

	@NotNull
	@Override
	public String getPresentableName()
	{
		return RustBundle.message("sdk.name.rust");
	}

	@Override
	public Icon getIcon()
	{
		return RustIcons.Rust;
	}

	@Override
	public boolean isRootTypeApplicable(OrderRootType type)
	{
		return type == BinariesOrderRootType.getInstance();
	}
}
