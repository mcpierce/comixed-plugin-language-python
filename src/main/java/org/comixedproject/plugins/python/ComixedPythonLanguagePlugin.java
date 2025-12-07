package org.comixedproject.plugins.python;

import org.comixedproject.model.net.plugin.PluginLanguage;

/**
 * <code>ComixedPythonLanguagePlugin</code> provides the {@link PluginLanguage} that executes Python
 * code.
 *
 * @author Darryl L. Pierce
 */
public class ComixedPythonLanguagePlugin extends PluginLanguage {
  private static final String LANGUAGE_NAME = "Python";

  public ComixedPythonLanguagePlugin() {
    super(LANGUAGE_NAME);
  }
}
