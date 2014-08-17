package vektah.rust.ide.runner;

import javax.swing.JComponent;
import javax.swing.JPanel;

import org.jetbrains.annotations.NotNull;
import com.intellij.application.options.ModuleListCellRenderer;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.options.ConfigurationException;
import com.intellij.openapi.options.SettingsEditor;
import com.intellij.openapi.ui.ComboBox;
import com.intellij.openapi.ui.LabeledComponent;
import com.intellij.openapi.ui.VerticalFlowLayout;
import vektah.rust.ide.ui.RustParametersPanel;

public class RustRunSettingsEditor extends SettingsEditor<RustConfiguration>
{
	private JPanel myRootPanel;

	private RustParametersPanel myRustParametersPanel;
	private ComboBox myModuleBox;

	public RustRunSettingsEditor()
	{

		myRootPanel = new JPanel(new VerticalFlowLayout(VerticalFlowLayout.TOP));
		myRustParametersPanel = new RustParametersPanel();
		myRootPanel.add(myRustParametersPanel);

		myModuleBox = new ComboBox();
		myModuleBox.setRenderer(new ModuleListCellRenderer());
		myRootPanel.add(LabeledComponent.left(myModuleBox, "Module: "));
	}

	@Override
	protected void resetEditorFrom(RustConfiguration configuration)
	{
		myRustParametersPanel.reset(configuration);

		myModuleBox.removeAllItems();
		for(Module module : configuration.getValidModules())
		{
			myModuleBox.addItem(module);
		}
		myModuleBox.setSelectedItem(configuration.getConfigurationModule().getModule());
	}

	@Override
	protected void applyEditorTo(RustConfiguration configuration) throws ConfigurationException
	{
		myRustParametersPanel.applyTo(configuration);
		configuration.getConfigurationModule().setModule((Module) myModuleBox.getSelectedItem());
	}

	@NotNull
	@Override
	protected JComponent createEditor()
	{
		return myRootPanel;
	}
}
