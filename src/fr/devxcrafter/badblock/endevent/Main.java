package fr.devxcrafter.badblock.endevent;

import fr.devxcrafter.badblock.endevent.listeners.PlayerDeath;
import fr.devxcrafter.badblock.endevent.listeners.PlayerJoin;
import fr.devxcrafter.badblock.endevent.listeners.PlayerQuit;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable(){
        saveDefaultConfig();

        Bukkit.getConsoleSender().sendMessage("§6§lLes events vont pouvoir commencer");

        Bukkit.getPluginManager().registerEvents(new PlayerJoin(this), this);
        Bukkit.getPluginManager().registerEvents(new PlayerDeath(this), this);
        Bukkit.getPluginManager().registerEvents(new PlayerQuit(this), this);
    }



    @Override
    public void onDisable(){
        Bukkit.getConsoleSender().sendMessage("§6§lLes events sont a presents terminés");
    }



}
