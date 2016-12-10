package dev.mannyyy.acium.Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import dev.mannyyy.acium.Main;
import ru.tehkode.permissions.PermissionUser;
import ru.tehkode.permissions.bukkit.PermissionsEx;

public class Ranks implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player p = (Player) sender;
		PermissionUser user = PermissionsEx.getUser(p);
		if(cmd.getName().equalsIgnoreCase("ranks")){
			if(user.inGroup("A")){
				String currentGroup = "A";
				String amountNeed = Main.getPlugin().getConfig().getString("RankStatus." + currentGroup);
				p.sendMessage("");
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "*** RANK STATUS ***");
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You are rank " + ChatColor.YELLOW + currentGroup);
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Your rank status is " + ChatColor.YELLOW + "1/26");
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Your next rank up will be to rank " + ChatColor.YELLOW + "B");
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "This rank will cost you " + ChatColor.YELLOW + "$" + amountNeed);
				p.sendMessage("");
			}
			if(user.inGroup("B")){
				String currentGroup = "B";
				int amountNeed = Main.getPlugin().getConfig().getInt("Rankups." + currentGroup);
				p.sendMessage("");
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "*** RANK STATUS ***");
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You are rank " + ChatColor.YELLOW + currentGroup);
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Your rank status is " + ChatColor.YELLOW + "2/26");
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Your next rank up will be to rank " + ChatColor.YELLOW + "C");
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "This rank will cost you " + ChatColor.YELLOW + "$" + amountNeed);
				p.sendMessage("");
			}
			if(user.inGroup("C")){
				String currentGroup = "C";
				int amountNeed = Main.getPlugin().getConfig().getInt("Rankups." + currentGroup);
				p.sendMessage("");
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "*** RANK STATUS ***");
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You are rank " + ChatColor.YELLOW + currentGroup);
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Your rank status is " + ChatColor.YELLOW + "3/26");
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Your next rank up will be to rank " + ChatColor.YELLOW + "D");
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "This rank will cost you " + ChatColor.YELLOW + "$" + amountNeed);
				p.sendMessage("");
			}
			if(user.inGroup("D")){
				String currentGroup = "D";
				int amountNeed = Main.getPlugin().getConfig().getInt("Rankups." + currentGroup);
				p.sendMessage("");
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "*** RANK STATUS ***");
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You are rank " + ChatColor.YELLOW + currentGroup);
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Your rank status is " + ChatColor.YELLOW + "4/26");
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Your next rank up will be to rank " + ChatColor.YELLOW + "E");
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "This rank will cost you " + ChatColor.YELLOW + "$" + amountNeed);
				p.sendMessage("");
			}
			if(user.inGroup("E")){
				String currentGroup = "E";
				int amountNeed = Main.getPlugin().getConfig().getInt("Rankups." + currentGroup);
				p.sendMessage("");
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "*** RANK STATUS ***");
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You are rank " + ChatColor.YELLOW + currentGroup);
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Your rank status is " + ChatColor.YELLOW + "5/26");
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Your next rank up will be to rank " + ChatColor.YELLOW + "F");
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "This rank will cost you " + ChatColor.YELLOW + "$" + amountNeed);
				p.sendMessage("");
			}
			if(user.inGroup("F")){
				String currentGroup = "F";
				int amountNeed = Main.getPlugin().getConfig().getInt("Rankups." + currentGroup);
				p.sendMessage("");
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "*** RANK STATUS ***");
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You are rank " + ChatColor.YELLOW + currentGroup);
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Your rank status is " + ChatColor.YELLOW + "6/26");
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Your next rank up will be to rank " + ChatColor.YELLOW + "F");
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "This rank will cost you " + ChatColor.YELLOW + "$" + amountNeed);
				p.sendMessage("");
			}
			if(user.inGroup("G")){
				String currentGroup = "G";
				int amountNeed = Main.getPlugin().getConfig().getInt("Rankups." + currentGroup);
				p.sendMessage("");
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "*** RANK STATUS ***");
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You are rank " + ChatColor.YELLOW + currentGroup);
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Your rank status is " + ChatColor.YELLOW + "7/26");
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Your next rank up will be to rank " + ChatColor.YELLOW + "H");
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "This rank will cost you " + ChatColor.YELLOW + "$" + amountNeed);
				p.sendMessage("");
			}
			if(user.inGroup("H")){
				String currentGroup = "H";
				int amountNeed = Main.getPlugin().getConfig().getInt("Rankups." + currentGroup);
				p.sendMessage("");
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "*** RANK STATUS ***");
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You are rank " + ChatColor.YELLOW + currentGroup);
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Your rank status is " + ChatColor.YELLOW + "8/26");
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Your next rank up will be to rank " + ChatColor.YELLOW + "I");
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "This rank will cost you " + ChatColor.YELLOW + "$" + amountNeed);
				p.sendMessage("");
			}
			if(user.inGroup("I")){
				String currentGroup = "I";
				int amountNeed = Main.getPlugin().getConfig().getInt("Rankups." + currentGroup);
				p.sendMessage("");
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "*** RANK STATUS ***");
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You are rank " + ChatColor.YELLOW + currentGroup);
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Your rank status is " + ChatColor.YELLOW + "9/26");
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Your next rank up will be to rank " + ChatColor.YELLOW + "J");
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "This rank will cost you " + ChatColor.YELLOW + "$" + amountNeed);
				p.sendMessage("");
			}
			if(user.inGroup("J")){
				String currentGroup = "J";
				int amountNeed = Main.getPlugin().getConfig().getInt("Rankups." + currentGroup);
				p.sendMessage("");
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "*** RANK STATUS ***");
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You are rank " + ChatColor.YELLOW + currentGroup);
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Your rank status is " + ChatColor.YELLOW + "10/26");
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Your next rank up will be to rank " + ChatColor.YELLOW + "K");
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "This rank will cost you " + ChatColor.YELLOW + "$" + amountNeed);
				p.sendMessage("");
			}
			if(user.inGroup("K")){
				String currentGroup = "K";
				int amountNeed = Main.getPlugin().getConfig().getInt("Rankups." + currentGroup);
				p.sendMessage("");
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "*** RANK STATUS ***");
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You are rank " + ChatColor.YELLOW + currentGroup);
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Your rank status is " + ChatColor.YELLOW + "11/26");
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Your next rank up will be to rank " + ChatColor.YELLOW + "L");
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "This rank will cost you " + ChatColor.YELLOW + "$" + amountNeed);
				p.sendMessage("");
			}
			if(user.inGroup("L")){
				String currentGroup = "L";
				int amountNeed = Main.getPlugin().getConfig().getInt("Rankups." + currentGroup);
				p.sendMessage("");
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "*** RANK STATUS ***");
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You are rank " + ChatColor.YELLOW + currentGroup);
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Your rank status is " + ChatColor.YELLOW + "12/26");
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Your next rank up will be to rank " + ChatColor.YELLOW + "M");
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "This rank will cost you " + ChatColor.YELLOW + "$" + amountNeed);
				p.sendMessage("");
			}
			if(user.inGroup("M")){
				String currentGroup = "M";
				int amountNeed = Main.getPlugin().getConfig().getInt("Rankups." + currentGroup);
				p.sendMessage("");
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "*** RANK STATUS ***");
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You are rank " + ChatColor.YELLOW + currentGroup);
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Your rank status is " + ChatColor.YELLOW + "13/26");
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Your next rank up will be to rank " + ChatColor.YELLOW + "N");
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "This rank will cost you " + ChatColor.YELLOW + "$" + amountNeed);
				p.sendMessage("");
			}
			if(user.inGroup("N")){
				String currentGroup = "N";
				int amountNeed = Main.getPlugin().getConfig().getInt("Rankups." + currentGroup);
				p.sendMessage("");
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "*** RANK STATUS ***");
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You are rank " + ChatColor.YELLOW + currentGroup);
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Your rank status is " + ChatColor.YELLOW + "14/26");
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Your next rank up will be to rank " + ChatColor.YELLOW + "O");
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "This rank will cost you " + ChatColor.YELLOW + "$" + amountNeed);
				p.sendMessage("");
			}
			if(user.inGroup("O")){
				String currentGroup = "O";
				int amountNeed = Main.getPlugin().getConfig().getInt("Rankups." + currentGroup);
				p.sendMessage("");
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "*** RANK STATUS ***");
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You are rank " + ChatColor.YELLOW + currentGroup);
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Your rank status is " + ChatColor.YELLOW + "15/26");
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Your next rank up will be to rank " + ChatColor.YELLOW + "P");
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "This rank will cost you " + ChatColor.YELLOW + "$" + amountNeed);
				p.sendMessage("");
			}
			if(user.inGroup("P")){
				String currentGroup = "P";
				int amountNeed = Main.getPlugin().getConfig().getInt("Rankups." + currentGroup);
				p.sendMessage("");
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "*** RANK STATUS ***");
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You are rank " + ChatColor.YELLOW + currentGroup);
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Your rank status is " + ChatColor.YELLOW + "16/26");
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Your next rank up will be to rank " + ChatColor.YELLOW + "Q");
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "This rank will cost you " + ChatColor.YELLOW + "$" + amountNeed);
				p.sendMessage("");
			}
			if(user.inGroup("Q")){
				String currentGroup = "Q";
				int amountNeed = Main.getPlugin().getConfig().getInt("Rankups." + currentGroup);
				p.sendMessage("");
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "*** RANK STATUS ***");
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You are rank " + ChatColor.YELLOW + currentGroup);
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Your rank status is " + ChatColor.YELLOW + "17/26");
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Your next rank up will be to rank " + ChatColor.YELLOW + "R");
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "This rank will cost you " + ChatColor.YELLOW + "$" + amountNeed);
				p.sendMessage("");
			}
			if(user.inGroup("R")){
				String currentGroup = "R";
				int amountNeed = Main.getPlugin().getConfig().getInt("Rankups." + currentGroup);
				p.sendMessage("");
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "*** RANK STATUS ***");
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You are rank " + ChatColor.YELLOW + currentGroup);
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Your rank status is " + ChatColor.YELLOW + "18/26");
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Your next rank up will be to rank " + ChatColor.YELLOW + "S");
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "This rank will cost you " + ChatColor.YELLOW + "$" + amountNeed);
				p.sendMessage("");
			}
			if(user.inGroup("S")){
				String currentGroup = "S";
				int amountNeed = Main.getPlugin().getConfig().getInt("Rankups." + currentGroup);
				p.sendMessage("");
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "*** RANK STATUS ***");
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You are rank " + ChatColor.YELLOW + currentGroup);
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Your rank status is " + ChatColor.YELLOW + "19/26");
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Your next rank up will be to rank " + ChatColor.YELLOW + "T");
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "This rank will cost you " + ChatColor.YELLOW + "$" + amountNeed);
				p.sendMessage("");
			}
			if(user.inGroup("T")){
				String currentGroup = "T";
				int amountNeed = Main.getPlugin().getConfig().getInt("Rankups." + currentGroup);
				p.sendMessage("");
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "*** RANK STATUS ***");
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You are rank " + ChatColor.YELLOW + currentGroup);
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Your rank status is " + ChatColor.YELLOW + "20/26");
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Your next rank up will be to rank " + ChatColor.YELLOW + "U");
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "This rank will cost you " + ChatColor.YELLOW + "$" + amountNeed);
				p.sendMessage("");
			}
			if(user.inGroup("U")){
				String currentGroup = "U";
				int amountNeed = Main.getPlugin().getConfig().getInt("Rankups." + currentGroup);
				p.sendMessage("");
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "*** RANK STATUS ***");
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You are rank " + ChatColor.YELLOW + currentGroup);
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Your rank status is " + ChatColor.YELLOW + "21/26");
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Your next rank up will be to rank " + ChatColor.YELLOW + "V");
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "This rank will cost you " + ChatColor.YELLOW + "$" + amountNeed);
				p.sendMessage("");
			}
			if(user.inGroup("V")){
				String currentGroup = "V";
				int amountNeed = Main.getPlugin().getConfig().getInt("Rankups." + currentGroup);
				p.sendMessage("");
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "*** RANK STATUS ***");
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You are rank " + ChatColor.YELLOW + currentGroup);
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Your rank status is " + ChatColor.YELLOW + "22/26");
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Your next rank up will be to rank " + ChatColor.YELLOW + "W");
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "This rank will cost you " + ChatColor.YELLOW + "$" + amountNeed);
				p.sendMessage("");
			}
			if(user.inGroup("W")){
				String currentGroup = "W";
				int amountNeed = Main.getPlugin().getConfig().getInt("Rankups." + currentGroup);
				p.sendMessage("");
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "*** RANK STATUS ***");
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You are rank " + ChatColor.YELLOW + currentGroup);
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Your rank status is " + ChatColor.YELLOW + "23/26");
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Your next rank up will be to rank " + ChatColor.YELLOW + "X");
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "This rank will cost you " + ChatColor.YELLOW + "$" + amountNeed);
				p.sendMessage("");
			}
			if(user.inGroup("X")){
				String currentGroup = "X";
				int amountNeed = Main.getPlugin().getConfig().getInt("Rankups." + currentGroup);
				p.sendMessage("");
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "*** RANK STATUS ***");
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You are rank " + ChatColor.YELLOW + currentGroup);
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Your rank status is " + ChatColor.YELLOW + "24/26");
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Your next rank up will be to rank " + ChatColor.YELLOW + "Y");
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "This rank will cost you " + ChatColor.YELLOW + "$" + amountNeed);
				p.sendMessage("");
			}
			if(user.inGroup("Y")){
				String currentGroup = "Y";
				int amountNeed = Main.getPlugin().getConfig().getInt("Rankups." + currentGroup);
				p.sendMessage("");
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "*** RANK STATUS ***");
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You are rank " + ChatColor.YELLOW + currentGroup);
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Your rank status is " + ChatColor.YELLOW + "25/26");
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Your next rank up will be to rank " + ChatColor.YELLOW + "Z");
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "This rank will cost you " + ChatColor.YELLOW + "$" + amountNeed);
				p.sendMessage("");
			}
			if(user.inGroup("Z")){
				String currentGroup = "Z";
				//int amountNeed = Main.getPlugin().getConfig().getInt("Rankups." + currentGroup);
				p.sendMessage("");
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "*** RANK STATUS ***");
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You are rank " + ChatColor.YELLOW + currentGroup);
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Your rank status is " + ChatColor.YELLOW + "26/26");
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You are the " + ChatColor.YELLOW + "last rank");
				p.sendMessage("");
			}
		}
		return false;
	}
	

}
