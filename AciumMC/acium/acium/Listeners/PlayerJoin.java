package dev.mannyyy.acium.Listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import dev.mannyyy.aciumtokens.Main;

public class PlayerJoin implements Listener{
	
	@EventHandler
	public void onJoin(PlayerJoinEvent e){
		Player p = e.getPlayer();
		if(Main.getPlugin().getConfig().contains("Tokens." + p.getName() + ".Balance")){
			return;
		}
		else{
			Main.getPlugin().getConfig().set("Tokens." + p.getName() + ".Balance", 0);
			Main.getPlugin().saveConfig();
		}
	}

}
