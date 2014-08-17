package vektah.rust.ide.sdk;

import java.io.File;
import java.nio.charset.Charset;

import com.intellij.execution.configurations.GeneralCommandLine;
import com.intellij.execution.process.CapturingProcessHandler;
import com.intellij.execution.process.ProcessOutput;
import com.intellij.openapi.diagnostic.Logger;

public class RustSdkUtil
{
	private static final Logger LOG = Logger.getInstance(RustSdkUtil.class.getName());

	public static String getVersion(File rustc)
	{
		try
		{
			GeneralCommandLine command = new GeneralCommandLine();
			command.setExePath(rustc.getAbsolutePath());
			command.addParameter("--version");
			command.setWorkDirectory(rustc.getParent());

			ProcessOutput output = new CapturingProcessHandler(command.createProcess(), Charset.defaultCharset(),
					command.getCommandLineString()).runProcess();

			if(output.getExitCode() != 0)
			{
				LOG.error("rustc exited with invalid exit code: " +
						output.getExitCode() + "\n" +
						output.getStdout());
				return null;
			}

			String[] lines = output.getStdout().split("\n");
			if(lines.length > 2 || lines.length == 0)
			{
				LOG.error("invalid rustc output: expected 1 or 2 lines, got " + lines.length);
				return null;
			}
			String[] line1 = lines[0].split(" ");
			if(!line1[0].equals("rustc"))
			{
				LOG.error("invalid rustc output: expected 'rustc', got " + line1[0]);
				return null;
			}
			return line1[1];
		}
		catch(Exception e)
		{
			LOG.error("Exception while executing the process:", e);
			return null;
		}
	}
}
