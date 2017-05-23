import org.apache.commons.io.FileUtils;
import org.openqa.selenium.firefox.internal.Extension;

import java.io.File;
import java.io.IOException;

/**
 * Created by markus.hartung on 19.05.2017.
 */
public class UnpackedExtension implements Extension {
  private final String id;
  private final File toInstall;

  public UnpackedExtension(String id, File toInstall) {
    this.id = id;
    this.toInstall = toInstall;
  }

  public String getId() {
    return id;
  }

  public void writeTo(File extensionsDir) throws IOException {
    if (!extensionsDir.exists()) {
      extensionsDir.mkdirs();
    }

    File src = toInstall;
    File dest = new File(extensionsDir.getAbsolutePath(), id);

    FileUtils.copyDirectory(src, dest);

  }
}
