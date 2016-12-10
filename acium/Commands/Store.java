package dev.mannyyy.acium.Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Store implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player p = (Player) sender;
		if(cmd.getName().equalsIgnoreCase("buy")){
			p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Check out our webstore at " + ChatColor.YELLOW + ChatColor.UNDERLINE + "http://store.aciummc.com");
		}
		return false;
	}
	

}
