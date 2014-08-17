/*
 * Copyright 2013-2014 must-be.org
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.mustbe.consulo.rust.ide.compiler;

import java.io.File;

import org.consulo.compiler.ModuleCompilerPathsManager;
import org.jetbrains.annotations.NotNull;
import org.mustbe.consulo.roots.impl.ProductionContentFolderTypeProvider;
import org.mustbe.consulo.rust.module.extension.RustModuleExtension;
import com.intellij.execution.ExecutionException;
import com.intellij.execution.configurations.GeneralCommandLine;
import com.intellij.execution.process.CapturingProcessHandler;
import com.intellij.execution.process.ProcessOutput;
import com.intellij.openapi.compiler.CompileContext;
import com.intellij.openapi.compiler.CompileScope;
import com.intellij.openapi.compiler.CompilerManager;
import com.intellij.openapi.compiler.CompilerMessageCategory;
import com.intellij.openapi.compiler.TranslatingCompiler;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.module.ModuleUtilCore;
import com.intellij.openapi.projectRoots.Sdk;
import com.intellij.openapi.util.SystemInfo;
import com.intellij.openapi.util.io.FileUtil;
import com.intellij.openapi.vfs.VfsUtil;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.util.Chunk;
import vektah.rust.RustFileType;
import vektah.rust.ide.sdk.RustSdkType;

/**
 * @author VISTALL
 * @since 05.08.14
 */
public class RustCompiler implements TranslatingCompiler
{
	@Override
	public boolean isCompilableFile(VirtualFile virtualFile, CompileContext compileContext)
	{
		return virtualFile.getFileType() == RustFileType.INSTANCE;
	}

	@Override
	public void compile(CompileContext compileContext, Chunk<Module> moduleChunk, VirtualFile[] virtualFiles, OutputSink outputSink)
	{
		Module next = moduleChunk.getNodes().iterator().next();

		Sdk sdk = ModuleUtilCore.getSdk(next, RustModuleExtension.class);

		GeneralCommandLine commandLine = new GeneralCommandLine();
		commandLine.setExePath(RustSdkType.getRustc(sdk.getHomePath()));

		ModuleCompilerPathsManager moduleCompilerPathsManager = ModuleCompilerPathsManager.getInstance(next);

		String compilerOutputUrl = moduleCompilerPathsManager.getCompilerOutputUrl(ProductionContentFolderTypeProvider.getInstance());

		commandLine.addParameter("-o");
		commandLine.addParameter(VfsUtil.urlToPath(compilerOutputUrl) + "/" + next.getName() + (SystemInfo.isWindows ? ".exe" : ""));

		FileUtil.createDirectory(new File(VfsUtil.urlToPath(compilerOutputUrl)));
		for(VirtualFile virtualFile : virtualFiles)
		{
			commandLine.addParameter(virtualFile.getPath());
		}
		try
		{
			CapturingProcessHandler processHandler = new CapturingProcessHandler(commandLine);
			processHandler.setShouldDestroyProcessRecursively(true);

			ProcessOutput processOutput = processHandler.runProcess();

			for(String o : processOutput.getStdoutLines())
			{
				compileContext.addMessage(CompilerMessageCategory.INFORMATION, o, null, -1, -1);
			}
			for(String o : processOutput.getStderrLines())
			{
				compileContext.addMessage(CompilerMessageCategory.ERROR, o, null, -1, -1);
			}
		}
		catch(ExecutionException e)
		{
			e.printStackTrace();
		}
	}

	@NotNull
	@Override
	public FileType[] getInputFileTypes()
	{
		return new FileType[0];
	}

	@NotNull
	@Override
	public FileType[] getOutputFileTypes()
	{
		return new FileType[0];
	}

	@NotNull
	@Override
	public String getDescription()
	{
		return "Rust compiler";
	}

	@Override
	public boolean validateConfiguration(CompileScope compileScope)
	{
		return true;
	}

	@Override
	public void init(@NotNull CompilerManager compilerManager)
	{

	}
}
