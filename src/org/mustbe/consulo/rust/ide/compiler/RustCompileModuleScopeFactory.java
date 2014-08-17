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

import org.consulo.compiler.impl.CompileModuleScopeFactory;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.mustbe.consulo.rust.module.extension.RustModuleExtension;
import com.intellij.compiler.impl.ModuleRootCompileScope;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.module.ModuleUtilCore;

/**
 * @author VISTALL
 * @since 17.08.14
 * <c
 */
public class RustCompileModuleScopeFactory implements CompileModuleScopeFactory
{
	@Nullable
	@Override
	public com.intellij.compiler.impl.FileIndexCompileScope createScope(@NotNull Module module, boolean b)
	{
		RustModuleExtension extension = ModuleUtilCore.getExtension(module, RustModuleExtension.class);
		if(extension != null)
		{
			return new ModuleRootCompileScope(module, b);
		}
		return null;
	}
}
