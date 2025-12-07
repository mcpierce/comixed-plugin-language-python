package org.comixedproject.plugins.python;

import org.comixedproject.plugins.PluginRuntime;
import org.comixedproject.plugins.PluginRuntimeProvider;

/**
 * <code>PythonPluginRuntimeProvider</code> defines a {@link PluginRuntimeProvider} for Python.
 *
 * @author Darryl L. Pierce
 */
public class PythonPluginRuntimeProvider implements PluginRuntimeProvider {
  private static final String PLUGIN_NAME = "ComiXedLanguagePluginPython";

  @Override
  public String getName() {
    return PLUGIN_NAME;
  }

  @Override
  public PluginRuntime create() {
    return new PythonLanguageRuntime();
  }
}
