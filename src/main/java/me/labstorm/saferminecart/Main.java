package me.labstorm.saferminecart;

import me.labstorm.saferminecart.listeners.EntityDamageEventListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        PluginManager pluginManager = Bukkit.getServer().getPluginManager();
        pluginManager.registerEvents(new EntityDamageEventListener(), this);
    }
}
