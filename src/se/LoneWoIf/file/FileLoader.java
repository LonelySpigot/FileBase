package se.LoneWoIf.file;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;

public class FileLoader {

    public static File MAIN_FOLDER;

    FileLoader() {
        MAIN_FOLDER = new File("./plugins");
    }

    FileLoader(String mainDir) {
        MAIN_FOLDER = new File("." + mainDir);
    }

    private File getFile(String relPath) {
        File file = new File(MAIN_FOLDER.getPath() + "/" + relPath);
        if (!file.exists()) {
            file.getParentFile().mkdirs();
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return file;
    }

    public FileConfiguration getConfiguration(String relPath) {
        File configurationFile = getFile(relPath);
        return YamlConfiguration.loadConfiguration(configurationFile);
    }

    public void setConfiguration(String relPath, FileConfiguration configuration) {
        try {
            configuration.save(getFile(relPath));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
