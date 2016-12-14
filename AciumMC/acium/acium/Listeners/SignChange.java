package dev.mannyyy.acium.Listeners;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.SignChangeEvent;
public class SignChange implements Listener{
	
	@EventHandler
	public void signChange(SignChangeEvent e){
		if(e.getLine(0).contains("![AciumEnchant]!")){
			if(e.getPlayer().getName().contains("FranixTV") || e.getPlayer().getName().contains("Mannyyy") || e.getPlayer().getName().contains("Maneh")){
				if(e.getLine(1).contains("Fortune")){
					e.setLine(0, "" +ChatColor.BLUE + ChatColor.BOLD + "[AciumEnchant]");
					e.setLine(1, "Right Click");
					e.setLine(2, ChatColor.DARK_RED +"Fortune");
					e.setLine(3, "5000 Tokens");
				}
				if(e.getLine(1).contains("Efficiency")){
					e.setLine(0, "" +ChatColor.BLUE + ChatColor.BOLD + "[AciumEnchant]");
					e.setLine(1, "Right Click");
					e.setLine(2, ChatColor.DARK_RED +"Efficiency");
					e.setLine(3, "2500 Tokens");
				}
				if(e.getLine(1).contains("Unbreaking")){
					e.setLine(0, "" +ChatColor.BLUE + ChatColor.BOLD + "[AciumEnchant]");
					e.setLine(1, "Right Click");
					e.setLine(2, ChatColor.DARK_RED +"Unbreaking");
					e.setLine(3, "1000 Tokens");
				}
			}
		}
		if(!(e.getPlayer().getName().contains("FranixTV") || e.getPlayer().getName().contains("Mannyyy") || e.getPlayer().getName().contains("Maneh"))){
		if(e.getLine(0).contains("[AciumEnchant]")){
			if(e.getLine(1).contains("Right Click")){
				if(e.getLine(2).contains("Fortune") || e.getLine(2).contains("Unbreaking") || e.getLine(2).contains("Efficiency") || e.getLine(2).contains("Explosion")){
					e.setLine(0, "null");
					e.setLine(1, "null");
					e.setLine(2, "null");
					e.setLine(3, "null");
				}
			}
			}
		}
	}
}

