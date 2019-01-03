package se.LoneWoIf.file;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;

public class FileLoader {

    private static File PLUGINS_FOLDER = new File("./plugins");

    private File getFile(String relPath) {
        File file = new File(PLUGINS_FOLDER.getPath() + "/" + relPath);
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
