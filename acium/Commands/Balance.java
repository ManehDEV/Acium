package dev.mannyyy.acium.Commands;

import java.text.DecimalFormat;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.OfflinePlayer;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import dev.mannyyy.acium.Main;

public class Balance implements CommandExecutor{

	@SuppressWarnings({"deprecation"})
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player p = (Player) sender;
		DecimalFormat f = new DecimalFormat("0.00");
		if(cmd.getName().equalsIgnoreCase("balance")){
			if(args.length < 1){
				String balance = String.valueOf(Main.getPlugin().econ.getBalance(p));
				if(balance.contains(".0")||balance.contains(".1")||balance.contains(".2")||balance.contains(".3")||balance.contains(".4")||balance.contains(".5")||balance.contains(".6")||balance.contains(".7")||balance.contains(".8")||balance.contains(".9")){
					double fdbalance = (double) Main.getPlugin().econ.getBalance(p);
					String dbalance = f.format(fdbalance);
					p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Your current balance is " + ChatColor.YELLOW + "$"+ dbalance);
				}
				if(!(balance.contains(".0")||balance.contains(".1")||balance.contains(".2")||balance.contains(".3")||balance.contains(".4")||balance.contains(".5")||balance.contains(".6")||balance.contains(".7")||balance.contains(".8")||balance.contains(".9"))){
					int ibalance = (int) Main.getPlugin().econ.getBalance(p);
					p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Your current balance is " + ChatColor.YELLOW + "$"+ ibalance);
				}
			}
			if(args.length == 1){
				Player target = Bukkit.getPlayerExact(args[0]);
				OfflinePlayer targetoff = Bukkit.getOfflinePlayer(args[0]);
				if(target != null){
					String balance = String.valueOf(Main.getPlugin().econ.getBalance(target));
					if(balance.contains(".0")||balance.contains(".1")||balance.contains(".2")||balance.contains(".3")||balance.contains(".4")||balance.contains(".5")||balance.contains(".6")||balance.contains(".7")||balance.contains(".8")||balance.contains(".9")){
						double fdbalance = (double) Main.getPlugin().econ.getBalance(target);
						String dbalance = f.format(fdbalance);
						p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + target.getName() +"'s current balance is " + ChatColor.YELLOW + "$"+ dbalance);
					}
					if(!(balance.contains(".0")||balance.contains(".1")||balance.contains(".2")||balance.contains(".3")||balance.contains(".4")||balance.contains(".5")||balance.contains(".6")||balance.contains(".7")||balance.contains(".8")||balance.contains(".9"))){
						int ibalance = (int) Main.getPlugin().econ.getBalance(target);
						p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + target.getName() +"'s current balance is " + ChatColor.YELLOW + "$"+ ibalance);
					}
				}
				else {
					String balance = String.valueOf(Main.getPlugin().econ.getBalance(targetoff));
					if(balance.contains(".0")||balance.contains(".1")||balance.contains(".2")||balance.contains(".3")||balance.contains(".4")||balance.contains(".5")||balance.contains(".6")||balance.contains(".7")||balance.contains(".8")||balance.contains(".9")){
						double fdbalance = (double) Main.getPlugin().econ.getBalance(targetoff);
						String dbalance = f.format(fdbalance);
						p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + targetoff.getName() +"'s current balance is " + ChatColor.YELLOW + "$"+ dbalance);
					}
					if(!(balance.contains(".0")||balance.contains(".1")||balance.contains(".2")||balance.contains(".3")||balance.contains(".4")||balance.contains(".5")||balance.contains(".6")||balance.contains(".7")||balance.contains(".8")||balance.contains(".9"))){
						int ibalance = (int) Main.getPlugin().econ.getBalance(targetoff);
						p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + targetoff.getName() +"'s current balance is " + ChatColor.YELLOW + "$"+ ibalance);
					}
				}
			}
			if(args.length > 1){
				String balance = String.valueOf(Main.getPlugin().econ.getBalance(p));
				if(balance.contains(".0")||balance.contains(".1")||balance.contains(".2")||balance.contains(".3")||balance.contains(".4")||balance.contains(".5")||balance.contains(".6")||balance.contains(".7")||balance.contains(".8")||balance.contains(".9")){
					double fdbalance = (double) Main.getPlugin().econ.getBalance(p);
					String dbalance = f.format(fdbalance);
					p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Your current balance is " + ChatColor.YELLOW + "$"+ dbalance);
				}
				if(!(balance.contains(".0")||balance.contains(".1")||balance.contains(".2")||balance.contains(".3")||balance.contains(".4")||balance.contains(".5")||balance.contains(".6")||balance.contains(".7")||balance.contains(".8")||balance.contains(".9"))){
					int ibalance = (int) Main.getPlugin().econ.getBalance(p);
					p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Your current balance is " + ChatColor.YELLOW + "$"+ ibalance);
				}
			}
			return true;
		}
		return false;
	}
	

}
