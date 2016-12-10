package dev.mannyyy.acium.Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import dev.mannyyy.acium.Main;
import ru.tehkode.permissions.PermissionUser;
import ru.tehkode.permissions.bukkit.PermissionsEx;

public class Rankup implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player p = (Player) sender;
		PermissionUser user = PermissionsEx.getUser(p);
		if(cmd.getName().equalsIgnoreCase("rankup")){
			double dbalance = Main.getPlugin().econ.getBalance(p);
			int balance = (int) dbalance;
			
			
			
			if(user.inGroup("A")){
				String currentGroup = "A";
				String group = "B";
				int amountNeed = Main.getPlugin().getConfig().getInt("Rankups." + currentGroup);
				int differnce = amountNeed - balance;
				if(balance >= amountNeed){
					user.addGroup(group);
					user.removeGroup(currentGroup);
					Main.getPlugin().econ.withdrawPlayer(p, Main.getPlugin().getConfig().getInt("Rankups." + currentGroup));
					p.sendMessage("");
					p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "*** SUCCESSFUL RANKUP ***");
					p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You have ranked up to " + ChatColor.YELLOW + group);
					p.sendMessage("");
					return true;
				}
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Sorry, you need " + ChatColor.YELLOW + "$" + differnce + ChatColor.GRAY + " more to rankup to "+ ChatColor.YELLOW + group);
				return true;
			}
			
			
			if(user.inGroup("B")){
				String currentGroup = "B";
				String group = "C";
				int amountNeed = Main.getPlugin().getConfig().getInt("Rankups." + currentGroup);
				int differnce = amountNeed - balance;
				if(balance >= amountNeed){
					user.addGroup(group);
					user.removeGroup(currentGroup);
					Main.getPlugin().econ.withdrawPlayer(p, Main.getPlugin().getConfig().getInt("Rankups." + currentGroup));
					p.sendMessage("");
					p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "*** SUCCESSFUL RANKUP ***");
					p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You have ranked up to " + ChatColor.YELLOW + group);
					p.sendMessage("");
					return true;

				}
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Sorry, you need " + ChatColor.YELLOW + "$" + differnce + ChatColor.GRAY + " more to rankup to "+ ChatColor.YELLOW + group);
				return true;
			}
			
			
			if(user.inGroup("C")){
				String currentGroup = "C";
				String group = "D";
				int amountNeed = Main.getPlugin().getConfig().getInt("Rankups." + currentGroup);
				int differnce = amountNeed - balance;
				if(balance >= amountNeed){
					user.addGroup(group);
					user.removeGroup(currentGroup);
					Main.getPlugin().econ.withdrawPlayer(p, Main.getPlugin().getConfig().getInt("Rankups." + currentGroup));
					p.sendMessage("");
					p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "*** SUCCESSFUL RANKUP ***");
					p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You have ranked up to " + ChatColor.YELLOW + group);
					p.sendMessage("");
					return true;
				}
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Sorry, you need " + ChatColor.YELLOW + "$" + differnce + ChatColor.GRAY + " more to rankup to "+ ChatColor.YELLOW + group);
				return true;
			}
			
			
			if(user.inGroup("D")){
				String currentGroup = "D";
				String group = "E";
				int amountNeed = Main.getPlugin().getConfig().getInt("Rankups." + currentGroup);
				int differnce = amountNeed - balance;
				if(balance >= amountNeed){
					user.addGroup(group);
					user.removeGroup(currentGroup);
					Main.getPlugin().econ.withdrawPlayer(p, Main.getPlugin().getConfig().getInt("Rankups." + currentGroup));
					p.sendMessage("");
					p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "*** SUCCESSFUL RANKUP ***");
					p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You have ranked up to " + ChatColor.YELLOW + group);
					p.sendMessage("");
					return true;
				}
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Sorry, you need " + ChatColor.YELLOW + "$" + differnce + ChatColor.GRAY + " more to rankup to "+ ChatColor.YELLOW + group);
				return true;
			}
			
			
			if(user.inGroup("E")){
				String currentGroup = "E";
				String group = "F";
				int amountNeed = Main.getPlugin().getConfig().getInt("Rankups." + currentGroup);
				int differnce = amountNeed - balance;
				if(balance >= amountNeed){
					user.addGroup(group);
					user.removeGroup(currentGroup);
					Main.getPlugin().econ.withdrawPlayer(p, Main.getPlugin().getConfig().getInt("Rankups." + currentGroup));
					p.sendMessage("");
					p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "*** SUCCESSFUL RANKUP ***");
					p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You have ranked up to " + ChatColor.YELLOW + group);
					p.sendMessage("");
					return true;
				}
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Sorry, you need " + ChatColor.YELLOW + "$" + differnce + ChatColor.GRAY + " more to rankup to "+ ChatColor.YELLOW + group);
				return true;
			}
			
			
			if(user.inGroup("F")){
				String currentGroup = "F";
				String group = "G";
				int amountNeed = Main.getPlugin().getConfig().getInt("Rankups." + currentGroup);
				int differnce = amountNeed - balance;
				if(balance >= amountNeed){
					user.addGroup(group);
					user.removeGroup(currentGroup);
					Main.getPlugin().econ.withdrawPlayer(p, Main.getPlugin().getConfig().getInt("Rankups." + currentGroup));
					p.sendMessage("");
					p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "*** SUCCESSFUL RANKUP ***");
					p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You have ranked up to " + ChatColor.YELLOW + group);
					p.sendMessage("");
					return true;
				}
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Sorry, you need " + ChatColor.YELLOW + "$" + differnce + ChatColor.GRAY + " more to rankup to "+ ChatColor.YELLOW + group);
				return true;
			}
			
			
			if(user.inGroup("G")){
				String currentGroup = "G";
				String group = "H";
				int amountNeed = Main.getPlugin().getConfig().getInt("Rankups." + currentGroup);
				int differnce = amountNeed - balance;
				if(balance >= amountNeed){
					user.addGroup(group);
					user.removeGroup(currentGroup);
					Main.getPlugin().econ.withdrawPlayer(p, Main.getPlugin().getConfig().getInt("Rankups." + currentGroup));
					p.sendMessage("");
					p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "*** SUCCESSFUL RANKUP ***");
					p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You have ranked up to " + ChatColor.YELLOW + group);
					p.sendMessage("");
					return true;
				}
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Sorry, you need " + ChatColor.YELLOW + "$" + differnce + ChatColor.GRAY + " more to rankup to "+ ChatColor.YELLOW + group);
				return true;
			}
			
			
			if(user.inGroup("H")){
				String currentGroup = "H";
				String group = "I";
				int amountNeed = Main.getPlugin().getConfig().getInt("Rankups." + currentGroup);
				int differnce = amountNeed - balance;
				if(balance >= amountNeed){
					user.addGroup(group);
					user.removeGroup(currentGroup);
					Main.getPlugin().econ.withdrawPlayer(p, Main.getPlugin().getConfig().getInt("Rankups." + currentGroup));
					p.sendMessage("");
					p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "*** SUCCESSFUL RANKUP ***");
					p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You have ranked up to " + ChatColor.YELLOW + group);
					p.sendMessage("");
					return true;
				}
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Sorry, you need " + ChatColor.YELLOW + "$" + differnce + ChatColor.GRAY + " more to rankup to "+ ChatColor.YELLOW + group);
				return true;
			}
			
			
			if(user.inGroup("I")){
				String currentGroup = "I";
				String group = "J";
				int amountNeed = Main.getPlugin().getConfig().getInt("Rankups." + currentGroup);
				int differnce = amountNeed - balance;
				if(balance >= amountNeed){
					user.addGroup(group);
					user.removeGroup(currentGroup);
					Main.getPlugin().econ.withdrawPlayer(p, Main.getPlugin().getConfig().getInt("Rankups." + currentGroup));
					p.sendMessage("");
					p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "*** SUCCESSFUL RANKUP ***");
					p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You have ranked up to " + ChatColor.YELLOW + group);
					p.sendMessage("");
					return true;
				}
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Sorry, you need " + ChatColor.YELLOW + "$" + differnce + ChatColor.GRAY + " more to rankup to "+ ChatColor.YELLOW + group);
				return true;
			}
			
			
			if(user.inGroup("J")){
				String currentGroup = "J";
				String group = "K";
				int amountNeed = Main.getPlugin().getConfig().getInt("Rankups." + currentGroup);
				int differnce = amountNeed - balance;
				if(balance >= amountNeed){
					user.addGroup(group);
					user.removeGroup(currentGroup);
					Main.getPlugin().econ.withdrawPlayer(p, Main.getPlugin().getConfig().getInt("Rankups." + currentGroup));
					p.sendMessage("");
					p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "*** SUCCESSFUL RANKUP ***");
					p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You have ranked up to " + ChatColor.YELLOW + group);
					p.sendMessage("");
					return true;
				}
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Sorry, you need " + ChatColor.YELLOW + "$" + differnce + ChatColor.GRAY + " more to rankup to "+ ChatColor.YELLOW + group);
				return true;
			}
			
			
			if(user.inGroup("K")){
				String currentGroup = "K";
				String group = "L";
				int amountNeed = Main.getPlugin().getConfig().getInt("Rankups." + currentGroup);
				int differnce = amountNeed - balance;
				if(balance >= amountNeed){
					user.addGroup(group);
					user.removeGroup(currentGroup);
					Main.getPlugin().econ.withdrawPlayer(p, Main.getPlugin().getConfig().getInt("Rankups." + currentGroup));
					p.sendMessage("");
					p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "*** SUCCESSFUL RANKUP ***");
					p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You have ranked up to " + ChatColor.YELLOW + group);
					p.sendMessage("");
					return true;
				}
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Sorry, you need " + ChatColor.YELLOW + "$" + differnce + ChatColor.GRAY + " more to rankup to "+ ChatColor.YELLOW + group);
				return true;
			}
			
			
			if(user.inGroup("L")){
				String currentGroup = "L";
				String group = "M";
				int amountNeed = Main.getPlugin().getConfig().getInt("Rankups." + currentGroup);
				int differnce = amountNeed - balance;
				if(balance >= amountNeed){
					user.addGroup(group);
					user.removeGroup(currentGroup);
					Main.getPlugin().econ.withdrawPlayer(p, Main.getPlugin().getConfig().getInt("Rankups." + currentGroup));
					p.sendMessage("");
					p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "*** SUCCESSFUL RANKUP ***");
					p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You have ranked up to " + ChatColor.YELLOW + group);
					p.sendMessage("");
					return true;
				}
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Sorry, you need " + ChatColor.YELLOW + "$" + differnce + ChatColor.GRAY + " more to rankup to "+ ChatColor.YELLOW + group);
				return true;
			}
			
			
			if(user.inGroup("M")){
				String currentGroup = "M";
				String group = "N";
				int amountNeed = Main.getPlugin().getConfig().getInt("Rankups." + currentGroup);
				int differnce = amountNeed - balance;
				if(balance >= amountNeed){
					user.addGroup(group);
					user.removeGroup(currentGroup);
					Main.getPlugin().econ.withdrawPlayer(p, Main.getPlugin().getConfig().getInt("Rankups." + currentGroup));
					p.sendMessage("");
					p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "*** SUCCESSFUL RANKUP ***");
					p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You have ranked up to " + ChatColor.YELLOW + group);
					p.sendMessage("");
					return true;
				}
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Sorry, you need " + ChatColor.YELLOW + "$" + differnce + ChatColor.GRAY + " more to rankup to "+ ChatColor.YELLOW + group);
				return true;
			}
			
			
			if(user.inGroup("N")){
				String currentGroup = "N";
				String group = "O";
				int amountNeed = Main.getPlugin().getConfig().getInt("Rankups." + currentGroup);
				int differnce = amountNeed - balance;
				if(balance >= amountNeed){
					user.addGroup(group);
					user.removeGroup(currentGroup);
					Main.getPlugin().econ.withdrawPlayer(p, Main.getPlugin().getConfig().getInt("Rankups." + currentGroup));
					p.sendMessage("");
					p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "*** SUCCESSFUL RANKUP ***");
					p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You have ranked up to " + ChatColor.YELLOW + group);
					p.sendMessage("");
					return true;
				}
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Sorry, you need " + ChatColor.YELLOW + "$" + differnce + ChatColor.GRAY + " more to rankup to "+ ChatColor.YELLOW + group);
				return true;
			}
			
			
			if(user.inGroup("O")){
				String currentGroup = "O";
				String group = "P";
				int amountNeed = Main.getPlugin().getConfig().getInt("Rankups." + currentGroup);
				int differnce = amountNeed - balance;
				if(balance >= amountNeed){
					user.addGroup(group);
					user.removeGroup(currentGroup);
					Main.getPlugin().econ.withdrawPlayer(p, Main.getPlugin().getConfig().getInt("Rankups." + currentGroup));
					p.sendMessage("");
					p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "*** SUCCESSFUL RANKUP ***");
					p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You have ranked up to " + ChatColor.YELLOW + group);
					p.sendMessage("");
					return true;
				}
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Sorry, you need " + ChatColor.YELLOW + "$" + differnce + ChatColor.GRAY + " more to rankup to "+ ChatColor.YELLOW + group);
				return true;
			}
			
			
			if(user.inGroup("P")){
				String currentGroup = "P";
				String group = "Q";
				int amountNeed = Main.getPlugin().getConfig().getInt("Rankups." + currentGroup);
				int differnce = amountNeed - balance;
				if(balance >= amountNeed){
					user.addGroup(group);
					user.removeGroup(currentGroup);
					Main.getPlugin().econ.withdrawPlayer(p, Main.getPlugin().getConfig().getInt("Rankups." + currentGroup));
					p.sendMessage("");
					p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "*** SUCCESSFUL RANKUP ***");
					p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You have ranked up to " + ChatColor.YELLOW + group);
					p.sendMessage("");
					return true;
				}
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Sorry, you need " + ChatColor.YELLOW + "$" + differnce + ChatColor.GRAY + " more to rankup to "+ ChatColor.YELLOW + group);
				return true;
			}
			
			
			if(user.inGroup("Q")){
				String currentGroup = "Q";
				String group = "R";
				int amountNeed = Main.getPlugin().getConfig().getInt("Rankups." + currentGroup);
				int differnce = amountNeed - balance;
				if(balance >= amountNeed){
					user.addGroup(group);
					user.removeGroup(currentGroup);
					Main.getPlugin().econ.withdrawPlayer(p, Main.getPlugin().getConfig().getInt("Rankups." + currentGroup));
					p.sendMessage("");
					p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "*** SUCCESSFUL RANKUP ***");
					p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You have ranked up to " + ChatColor.YELLOW + group);
					p.sendMessage("");
					return true;
				}
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Sorry, you need " + ChatColor.YELLOW + "$" + differnce + ChatColor.GRAY + " more to rankup to "+ ChatColor.YELLOW + group);
				return true;
			}
			
			
			if(user.inGroup("R")){
				String currentGroup = "R";
				String group = "S";
				int amountNeed = Main.getPlugin().getConfig().getInt("Rankups." + currentGroup);
				int differnce = amountNeed - balance;
				if(balance >= amountNeed){
					user.addGroup(group);
					user.removeGroup(currentGroup);
					Main.getPlugin().econ.withdrawPlayer(p, Main.getPlugin().getConfig().getInt("Rankups." + currentGroup));
					p.sendMessage("");
					p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "*** SUCCESSFUL RANKUP ***");
					p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You have ranked up to " + ChatColor.YELLOW + group);
					p.sendMessage("");
					return true;
				}
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Sorry, you need " + ChatColor.YELLOW + "$" + differnce + ChatColor.GRAY + " more to rankup to "+ ChatColor.YELLOW + group);
				return true;
			}
			
			
			if(user.inGroup("S")){
				String currentGroup = "S";
				String group = "T";
				int amountNeed = Main.getPlugin().getConfig().getInt("Rankups." + currentGroup);
				int differnce = amountNeed - balance;
				if(balance >= amountNeed){
					user.addGroup(group);
					user.removeGroup(currentGroup);
					Main.getPlugin().econ.withdrawPlayer(p, Main.getPlugin().getConfig().getInt("Rankups." + currentGroup));
					p.sendMessage("");
					p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "*** SUCCESSFUL RANKUP ***");
					p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You have ranked up to " + ChatColor.YELLOW + group);
					p.sendMessage("");
					return true;
				}
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Sorry, you need " + ChatColor.YELLOW + "$" + differnce + ChatColor.GRAY + " more to rankup to "+ ChatColor.YELLOW + group);
				return true;
			}
			
			
			if(user.inGroup("T")){
				String currentGroup = "T";
				String group = "U";
				int amountNeed = Main.getPlugin().getConfig().getInt("Rankups." + currentGroup);
				int differnce = amountNeed - balance;
				if(balance >= amountNeed){
					user.addGroup(group);
					user.removeGroup(currentGroup);
					Main.getPlugin().econ.withdrawPlayer(p, Main.getPlugin().getConfig().getInt("Rankups." + currentGroup));
					p.sendMessage("");
					p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "*** SUCCESSFUL RANKUP ***");
					p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You have ranked up to " + ChatColor.YELLOW + group);
					p.sendMessage("");
					return true;
				}
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Sorry, you need " + ChatColor.YELLOW + "$" + differnce + ChatColor.GRAY + " more to rankup to "+ ChatColor.YELLOW + group);
				return true;
			}
			
			
			if(user.inGroup("U")){
				String currentGroup = "U";
				String group = "V";
				int amountNeed = Main.getPlugin().getConfig().getInt("Rankups." + currentGroup);
				int differnce = amountNeed - balance;
				if(balance >= amountNeed){
					user.addGroup(group);
					user.removeGroup(currentGroup);
					Main.getPlugin().econ.withdrawPlayer(p, Main.getPlugin().getConfig().getInt("Rankups." + currentGroup));
					p.sendMessage("");
					p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "*** SUCCESSFUL RANKUP ***");
					p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You have ranked up to " + ChatColor.YELLOW + group);
					p.sendMessage("");
					return true;
				}
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Sorry, you need " + ChatColor.YELLOW + "$" + differnce + ChatColor.GRAY + " more to rankup to "+ ChatColor.YELLOW + group);
				return true;
			}
			
			
			if(user.inGroup("V")){
				String currentGroup = "V";
				String group = "W";
				int amountNeed = Main.getPlugin().getConfig().getInt("Rankups." + currentGroup);
				int differnce = amountNeed - balance;
				if(balance >= amountNeed){
					user.addGroup(group);
					user.removeGroup(currentGroup);
					Main.getPlugin().econ.withdrawPlayer(p, Main.getPlugin().getConfig().getInt("Rankups." + currentGroup));
					p.sendMessage("");
					p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "*** SUCCESSFUL RANKUP ***");
					p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You have ranked up to " + ChatColor.YELLOW + group);
					p.sendMessage("");
					return true;
				}
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Sorry, you need " + ChatColor.YELLOW + "$" + differnce + ChatColor.GRAY + " more to rankup to "+ ChatColor.YELLOW + group);
				return true;
			}
			
			
			if(user.inGroup("W")){
				String currentGroup = "W";
				String group = "X";
				int amountNeed = Main.getPlugin().getConfig().getInt("Rankups." + currentGroup);
				int differnce = amountNeed - balance;
				if(balance >= amountNeed){
					user.addGroup(group);
					user.removeGroup(currentGroup);
					Main.getPlugin().econ.withdrawPlayer(p, Main.getPlugin().getConfig().getInt("Rankups." + currentGroup));
					p.sendMessage("");
					p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "*** SUCCESSFUL RANKUP ***");
					p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You have ranked up to " + ChatColor.YELLOW + group);
					p.sendMessage("");
					return true;
				}
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Sorry, you need " + ChatColor.YELLOW + "$" + differnce + ChatColor.GRAY + " more to rankup to "+ ChatColor.YELLOW + group);
				return true;
			}
			
			
			if(user.inGroup("X")){
				String currentGroup = "X";
				String group = "Y";
				int amountNeed = Main.getPlugin().getConfig().getInt("Rankups." + currentGroup);
				int differnce = amountNeed - balance;
				if(balance >= amountNeed){
					user.addGroup(group);
					user.removeGroup(currentGroup);
					Main.getPlugin().econ.withdrawPlayer(p, Main.getPlugin().getConfig().getInt("Rankups." + currentGroup));
					p.sendMessage("");
					p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "*** SUCCESSFUL RANKUP ***");
					p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You have ranked up to " + ChatColor.YELLOW + group);
					p.sendMessage("");
					return true;
				}
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Sorry, you need " + ChatColor.YELLOW + "$" + differnce + ChatColor.GRAY + " more to rankup to "+ ChatColor.YELLOW + group);
				return true;
			}
			
			
			if(user.inGroup("Y")){
				String currentGroup = "Y";
				String group = "Z";
				int amountNeed = Main.getPlugin().getConfig().getInt("Rankups." + currentGroup);
				int differnce = amountNeed - balance;
				if(balance >= amountNeed){
					user.addGroup(group);
					user.removeGroup(currentGroup);
					Main.getPlugin().econ.withdrawPlayer(p, Main.getPlugin().getConfig().getInt("Rankups." + currentGroup));
					p.sendMessage("");
					p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "*** SUCCESSFUL RANKUP ***");
					p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You have ranked up to " + ChatColor.YELLOW + group);
					p.sendMessage("");
					return true;
				}
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Sorry, you need " + ChatColor.YELLOW + "$" + differnce + ChatColor.GRAY + " more to rankup to "+ ChatColor.YELLOW + group);
				return true;
			}
			
			
			if(user.inGroup("Z")){
				//String currentGroup = "Z";
				//String group = "";
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Sorry, you cannot rankup as you are the last rank!");
				return true;
			}
			
			
			
		}
		return false;
	}
	

}
