package com.bumpyjake.earthbound;

import org.bukkit.plugin.java.JavaPlugin;

public final class Earthbound extends JavaPlugin {

    @Override
    public void onEnable() {

        getCommand("continentselector").setExecutor(new ContinentSelector());

    }
}
