package com.bevelio.megaskills.utils.libs.dynamicconfig;

import java.io.File;
import java.util.UUID;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import com.a.a.Skills;

public class DynamicConfig {
    Skills p;
    UUID u;
    File userFile;
    FileConfiguration userConfig;

    public DynamicConfig(UUID u) {
        this.u = u;
        this.userFile = new File(Skills.getInstance().getDataFolder(), "users" + File.separator + u + ".yml");
        this.userConfig = YamlConfiguration.loadConfiguration((File)this.userFile);
    }

    public FileConfiguration getDynamicConfig() {
        return this.userConfig;
    }

    public boolean exists() {
        return this.userFile.exists();
    }

    public void saveDynamicConfig() {
        try {
            this.getDynamicConfig().save(this.userFile);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}

