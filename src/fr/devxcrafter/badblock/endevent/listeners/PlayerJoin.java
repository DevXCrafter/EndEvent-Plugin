package fr.devxcrafter.badblock.endevent.listeners;

import fr.devxcrafter.badblock.endevent.Main;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoin implements Listener  {

    private Main main;
    public PlayerJoin(Main main) {
        this.main = main;
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent e){
        Player p = e.getPlayer();
        e.setJoinMessage(main.getConfig().getString("messages.joinmessage").replace("<player>", p.getName()));
        p.sendMessage("§6Salut, bienvenue dans l'end, ta mission est simple");
        p.sendMessage("§cTue le dragon pour gagner l'event");
        p.sendMessage("§4Attention, le pvp est actif, toute mort sera definitif sur le serveur Faction");
        p.sendMessage("§eJe te souhaite un bon jeux !");
    }

}
