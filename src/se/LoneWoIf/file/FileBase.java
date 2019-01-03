package se.LoneWoIf.file;

import org.bukkit.plugin.java.JavaPlugin;

public class FileBase extends JavaPlugin {

    public static FileLoader FILE_LOADER;

    @Override
    public void onLoad() {
        getLogger().info("FileBase for easy acessible file-based plugins. Made with <3 by LoneWoIf.");
        FILE_LOADER = new FileLoader();
    }

}

