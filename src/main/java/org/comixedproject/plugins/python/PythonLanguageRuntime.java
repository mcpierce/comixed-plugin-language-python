package org.comixedproject.plugins.python;

import java.util.List;
import org.comixedproject.model.plugin.LibraryPlugin;
import org.comixedproject.model.plugin.LibraryPluginProperty;
import org.comixedproject.plugins.AbstractPluginRuntime;

public class PythonLanguageRuntime extends AbstractPluginRuntime {
  @Override
  public String getName(final String filename) {
    return "The Name";
  }

  @Override
  public String getVersion(final String filename) {
    return "The version";
  }

  @Override
  public List<LibraryPluginProperty> getProperties(final String filename) {
    return List.of();
  }

  @Override
  public Boolean execute(final LibraryPlugin libraryPlugin) {
    return true;
  }
}
