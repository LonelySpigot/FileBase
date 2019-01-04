package se.LoneWoIf.file;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public class FileBase extends JavaPlugin {

    public static FileLoader FILE_LOADER;

    @Override
    public void onLoad() {
        getLogger().info("FileBase for easy acessible file-based plugins. Made with <3 by LoneWoIf.");
        FILE_LOADER = new FileLoader();
        FileConfiguration settings = FILE_LOADER.getConfiguration("FileLoaderConfig.yml");
        if (!settings.isSet("main_directory")) {
            settings.set("main_directory", "/plugins");
            FILE_LOADER.setConfiguration("FileLoaderConfig.yml", settings);
        }
        if (!settings.getString("main_directory").equals("/plugins")) {
            FILE_LOADER = new FileLoader(settings.getString("main_directory"));
        }
        getLogger().info("FileBase plugin started at " + FileLoader.MAIN_FOLDER.getAbsolutePath() + ".");
    }

}

