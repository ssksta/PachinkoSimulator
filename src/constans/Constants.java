package constans;

import java.nio.file.FileSystems;

public class Constants {

    public static final String ABSOLUTE_PATH = FileSystems.getDefault().getPath("").toAbsolutePath().toString();
}
