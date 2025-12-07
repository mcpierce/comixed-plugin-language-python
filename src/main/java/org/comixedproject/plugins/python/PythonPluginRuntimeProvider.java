package org.comixedproject.plugins.python;

import java.util.List;
import java.util.Objects;
import org.comixedproject.model.plugin.LibraryPlugin;
import org.comixedproject.model.plugin.LibraryPluginProperty;
import org.comixedproject.plugins.AbstractPluginRuntime;
import org.comixedproject.plugins.PluginRuntimeProvider;
import org.python.util.PythonInterpreter;

/**
 * <code>PythonPluginRuntimeProvider</code> defines a {@link PluginRuntimeProvider} for Python.
 *
 * @author Darryl L. Pierce
 */
public class PythonPluginRuntimeProvider extends AbstractPluginRuntime {
  private static final String PLUGIN_NAME = "ComiXedPythonLanguagePlugin";
  private static final String PLUGIN_VERSION = "0.1-SNAPSHOT";

  @Override
  public String getName(final String filename) {
    return PLUGIN_NAME;
  }

  @Override
  public String getVersion(final String filename) {
    return PLUGIN_VERSION;
  }

  @Override
  public List<LibraryPluginProperty> getProperties(final String filename) {
    return List.of();
  }

  @Override
  public Boolean execute(final LibraryPlugin libraryPlugin) {
    final PythonInterpreter interpreter = new PythonInterpreter();
    return Objects.nonNull(interpreter);
  }
}
