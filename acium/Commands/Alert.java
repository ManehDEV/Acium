package dev.mannyyy.acium.Commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class Alert implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (cmd.getName().equalsIgnoreCase("broadcast")){
			if(args.length <1){
				sender.sendMessage(ChatColor.RED + "/broadcast <message>");
				return true;
			}
			String message = "";
			for (String part : args) {
			    if (message != "") message += " ";
			    message += part;
			}
			Bukkit.getServer().broadcastMessage(ChatColor.translateAlternateColorCodes( '&' , ChatColor.DARK_GRAY + "[" + ChatColor.DARK_RED + "Alert" + ChatColor.DARK_GRAY + "] " + ChatColor.GREEN + message));
			return true;
		}
		if (cmd.getName().equalsIgnoreCase("buycraftbroadcast")){
			if(args.length <1){
				sender.sendMessage(ChatColor.RED + "/broadcast <message>");
				return true;
			}
			String message = "";
			for (String part : args) {
				if (message != "") message += " ";
				message += part;
			}
			Bukkit.getServer().broadcastMessage(ChatColor.translateAlternateColorCodes( '&' , ChatColor.GREEN + message));
			return true;
			
		}
		return false;
	}

}
