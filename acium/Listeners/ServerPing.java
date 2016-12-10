package dev.mannyyy.acium.Listeners;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.server.ServerListPingEvent;

public class ServerPing implements Listener{
	
	@EventHandler
	public void onPing(ServerListPingEvent e){
		e.setMotd(ChatColor.translateAlternateColorCodes('&', "&6&l                 ACIUM PRISON &b[1.8-1.10]\n&f&l              &e&l50% CHRISTMAS SALE &c(/buy)"));
	}

}
