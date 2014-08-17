package vektah.rust.ide.runner;

import org.jetbrains.annotations.NotNull;
import org.mustbe.consulo.compiler.roots.CompilerPathsImpl;
import org.mustbe.consulo.rust.module.extension.RustModuleExtension;
import com.intellij.execution.CantRunException;
import com.intellij.execution.ExecutionException;
import com.intellij.execution.configurations.CommandLineState;
import com.intellij.execution.configurations.GeneralCommandLine;
import com.intellij.execution.configurations.SimpleProgramParameters;
import com.intellij.execution.process.ProcessHandler;
import com.intellij.execution.runners.ExecutionEnvironment;
import com.intellij.execution.util.ProgramParametersUtil;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.module.ModuleUtilCore;
import com.intellij.openapi.projectRoots.Sdk;
import com.intellij.openapi.util.SystemInfo;

public class RustRunProfileState extends CommandLineState
{
	protected RustRunProfileState(ExecutionEnvironment environment)
	{
		super(environment);
	}

	@NotNull
	@Override
	protected ProcessHandler startProcess() throws ExecutionException
	{
		ExecutionEnvironment environment = getEnvironment();

		RustConfiguration rustConfiguration = (RustConfiguration) environment.getRunProfile();

		Module module = rustConfiguration.getConfigurationModule().getModule();
		if(module == null)
		{
			throw new CantRunException("Not module");
		}

		Sdk sdk = ModuleUtilCore.getSdk(module, RustModuleExtension.class);
		if(sdk == null)
		{
			throw new CantRunException("No Rust sdk defined for this project");
		}

		final SimpleProgramParameters params = new SimpleProgramParameters();
		ProgramParametersUtil.configureConfiguration(params, rustConfiguration);

		String outputPath = CompilerPathsImpl.getModuleOutputPath(module, false);
		if(outputPath == null)
		{
			throw new CantRunException("Could not retrieve the output directory");
		}

		// Build and run
		String execName = outputPath.concat("/").concat(module.getName());

		if(SystemInfo.isWindows)
		{
			execName = execName.concat(".exe");
		}

		// Now run the build
		GeneralCommandLine commandLine = new GeneralCommandLine();

		commandLine.setExePath(execName);
		commandLine.addParameters(params.getProgramParametersList().getParameters());
		commandLine.getEnvironment().putAll(params.getEnv());
		commandLine.setWorkDirectory(params.getWorkingDirectory());

		return RustProcessHandler.runCommandLine(commandLine);
	}
}
