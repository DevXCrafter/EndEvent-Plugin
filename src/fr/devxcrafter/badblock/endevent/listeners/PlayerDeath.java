package fr.devxcrafter.badblock.endevent.listeners;


import fr.devxcrafter.badblock.endevent.Main;
import org.bukkit.ChatColor;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class PlayerDeath implements Listener {

    private Main main;

    public PlayerDeath(Main main) {
        this.main = main;

    }

    @EventHandler
    public void onDeath(PlayerDeathEvent e){
        Player p = e.getEntity();
        e.setDeathMessage(main.getConfig().getString("messages.deathmessage").replace("<player>", p.getName()).replace("<damager>", p.getKiller().getName()));

    }


}
