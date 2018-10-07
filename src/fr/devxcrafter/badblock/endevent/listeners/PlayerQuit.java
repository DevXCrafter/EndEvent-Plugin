package fr.devxcrafter.badblock.endevent.listeners;

import fr.devxcrafter.badblock.endevent.Main;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class PlayerQuit implements Listener {
    private Main main;

    public PlayerQuit(Main main) {
        this.main = main;
    }

    @EventHandler
    public void onQuit(PlayerQuitEvent e){
        Player p = e.getPlayer();
        e.setQuitMessage(main.getConfig().getString("messages.quitmessage").replace("<player>", p.getName()));
    }

}
