package dev.mannyyy.acium.Commands;

import java.util.ArrayList;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import dev.mannyyy.acium.Main;
import net.milkbowl.vault.economy.Economy;

public class Sell implements CommandExecutor{

	public static Economy econ = null;
	
	ArrayList<String> stfu = new ArrayList<>();
	
	@SuppressWarnings({ "deprecation",})
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player p = (Player) sender;
		if(cmd.getName().equalsIgnoreCase("sellall")){
			if(args.length < 1){
				p.sendMessage("");
        		p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "*** ACIUM SELL ***");
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.YELLOW + "/sellall <shop>" + ChatColor.GRAY + " - Sell inventory items to specified shop");
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.YELLOW + "/sellall stfu" + ChatColor.GRAY + " - Stops messages being sent when selling");
				p.sendMessage("");
				return true;
			}
			if(args.length == 1){
				int quantityFound = 0;
				if(args[0].equalsIgnoreCase("stfu")){
					if(stfu.contains(p.getName())){
						p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Resuming sell messages");
						stfu.remove(p.getName());
						return true;
					}
					p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Stopping sell messages");
					stfu.add(p.getName());
					return true;
				}
				if(args[0].equalsIgnoreCase("A")){
					 if(!p.hasPermission("rank.A")){
						 p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Not enough permissions!");
					 }
					
					Material item = Material.STONE;
	                for (ItemStack is : p.getInventory()) {
	                    if (is == null || is.getType() != item) continue;
	                    quantityFound += is.getAmount();
	                }
	                if(quantityFound < 1){
	                	p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Sorry, you don't have enough items to sell!");
	                	return true;
	                }
	                int pricePer = Main.getPlugin().getConfig().getInt("Shops.A");
					int amountToGive = quantityFound * pricePer;
					int globalMult = Main.getPlugin().getConfig().getInt("Global_Multiplier");
	                int newAmountToGive = amountToGive;          
	                if (globalMult > 1) {
	                    newAmountToGive *= globalMult;
		                Main.getPlugin().econ.depositPlayer(p, newAmountToGive);
		                p.getInventory().remove(item);
		                p.updateInventory();
                		p.sendMessage("");
                		p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "*** SUCCESSFUL SELL ***");
                		p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You recieved " + ChatColor.YELLOW + "$" +newAmountToGive+ ChatColor.GRAY + " (In-Game Money)");
                		p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You sold " + ChatColor.YELLOW +quantityFound+ ChatColor.GRAY + " items!");
                		p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "There is currently a " + ChatColor.YELLOW + globalMult + "x" +ChatColor.GRAY + " Booster active!");
                		p.sendMessage("");
                		return true;
	                }
	                else {
	                	Main.getPlugin().econ.depositPlayer(p, newAmountToGive);
		                p.getInventory().remove(item);
	                	p.sendMessage("");
                		p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "*** SUCCESSFUL SELL ***");
                		p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You recieved " + ChatColor.YELLOW + "$" +newAmountToGive+ ChatColor.GRAY + " (In-Game Money)");
                		p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You sold " + ChatColor.YELLOW +quantityFound+ ChatColor.GRAY + " items!");
                		p.sendMessage("");
                		return true;
	                }
	                
	                
	                
	                
	                	
				}
				if(args[0].equalsIgnoreCase("B")){
					if(!p.hasPermission("rank.B")){
						 p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Not enough permissions!");
					 }
					
					Material item = Material.STONE;
	                for (ItemStack is : p.getInventory()) {
	                    if (is == null || is.getType() != item) continue;
	                    quantityFound += is.getAmount();
	                }
	                if(quantityFound < 1){
	                	p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Sorry, you don't have enough items to sell!");
	                	return true;
	                }
	                int pricePer = Main.getPlugin().getConfig().getInt("Shops.B");
					int amountToGive = quantityFound * pricePer;
					int globalMult = Main.getPlugin().getConfig().getInt("Global_Multiplier");
	                int newAmountToGive = amountToGive;          
	                if (globalMult > 1) {
	                    newAmountToGive *= globalMult;
		                Main.getPlugin().econ.depositPlayer(p, newAmountToGive);
		                p.getInventory().remove(item);
		                p.updateInventory();
                		p.sendMessage("");
                		p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "*** SUCCESSFUL SELL ***");
                		p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You recieved " + ChatColor.YELLOW + "$" +newAmountToGive+ ChatColor.GRAY + " (In-Game Money)");
                		p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You sold " + ChatColor.YELLOW +quantityFound+ ChatColor.GRAY + " items!");
                		p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "There is currently a " + ChatColor.YELLOW + globalMult + "x" +ChatColor.GRAY + " Booster active!");
                		p.sendMessage("");
                		return true;
	                }
	                else {
	                	Main.getPlugin().econ.depositPlayer(p, newAmountToGive);
		                p.getInventory().remove(item);
	                	p.sendMessage("");
                		p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "*** SUCCESSFUL SELL ***");
                		p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You recieved " + ChatColor.YELLOW + "$" +newAmountToGive+ ChatColor.GRAY + " (In-Game Money)");
                		p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You sold " + ChatColor.YELLOW +quantityFound+ ChatColor.GRAY + " items!");
                		p.sendMessage("");
                		return true;
	                }
	                
	                
	                
	                
	                	
				}
				if(args[0].equalsIgnoreCase("C")){
					if(!p.hasPermission("rank.C")){
						 p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Not enough permissions!");
					 }
					
					Material item = Material.STONE;
	                for (ItemStack is : p.getInventory()) {
	                    if (is == null || is.getType() != item) continue;
	                    quantityFound += is.getAmount();
	                }
	                if(quantityFound < 1){
	                	p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Sorry, you don't have enough items to sell!");
	                	return true;
	                }
	                int pricePer = Main.getPlugin().getConfig().getInt("Shops.C");
					int amountToGive = quantityFound * pricePer;
					int globalMult = Main.getPlugin().getConfig().getInt("Global_Multiplier");
	                int newAmountToGive = amountToGive;          
	                if (globalMult > 1) {
	                    newAmountToGive *= globalMult;
		                Main.getPlugin().econ.depositPlayer(p, newAmountToGive);
		                p.getInventory().remove(item);
		                p.updateInventory();
                		p.sendMessage("");
                		p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "*** SUCCESSFUL SELL ***");
                		p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You recieved " + ChatColor.YELLOW + "$" +newAmountToGive+ ChatColor.GRAY + " (In-Game Money)");
                		p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You sold " + ChatColor.YELLOW +quantityFound+ ChatColor.GRAY + " items!");
                		p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "There is currently a " + ChatColor.YELLOW + globalMult + "x" +ChatColor.GRAY + " Booster active!");
                		p.sendMessage("");
                		return true;
	                }
	                else {
	                	Main.getPlugin().econ.depositPlayer(p, newAmountToGive);
		                p.getInventory().remove(item);
	                	p.sendMessage("");
                		p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "*** SUCCESSFUL SELL ***");
                		p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You recieved " + ChatColor.YELLOW + "$" +newAmountToGive+ ChatColor.GRAY + " (In-Game Money)");
                		p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You sold " + ChatColor.YELLOW +quantityFound+ ChatColor.GRAY + " items!");
                		p.sendMessage("");
                		return true;
	                }
	                
	                
	                
	                
	                	
				}
				if(args[0].equalsIgnoreCase("D")){
					if(!p.hasPermission("rank.D")){
						 p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Not enough permissions!");
					 }
					
					Material item = Material.STONE;
	                for (ItemStack is : p.getInventory()) {
	                    if (is == null || is.getType() != item) continue;
	                    quantityFound += is.getAmount();
	                }
	                if(quantityFound < 1){
	                	p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Sorry, you don't have enough items to sell!");
	                	return true;
	                }
	                int pricePer = Main.getPlugin().getConfig().getInt("Shops.D");
					int amountToGive = quantityFound * pricePer;
					int globalMult = Main.getPlugin().getConfig().getInt("Global_Multiplier");
	                int newAmountToGive = amountToGive;          
	                if (globalMult > 1) {
	                    newAmountToGive *= globalMult;
		                Main.getPlugin().econ.depositPlayer(p, newAmountToGive);
		                p.getInventory().remove(item);
		                p.updateInventory();
                		p.sendMessage("");
                		p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "*** SUCCESSFUL SELL ***");
                		p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You recieved " + ChatColor.YELLOW + "$" +newAmountToGive+ ChatColor.GRAY + " (In-Game Money)");
                		p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You sold " + ChatColor.YELLOW +quantityFound+ ChatColor.GRAY + " items!");
                		p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "There is currently a " + ChatColor.YELLOW + globalMult + "x" +ChatColor.GRAY + " Booster active!");
                		p.sendMessage("");
                		return true;
	                }
	                else {
	                	Main.getPlugin().econ.depositPlayer(p, newAmountToGive);
		                p.getInventory().remove(item);
	                	p.sendMessage("");
                		p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "*** SUCCESSFUL SELL ***");
                		p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You recieved " + ChatColor.YELLOW + "$" +newAmountToGive+ ChatColor.GRAY + " (In-Game Money)");
                		p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You sold " + ChatColor.YELLOW +quantityFound+ ChatColor.GRAY + " items!");
                		p.sendMessage("");
                		return true;
	                }
	                
	                
	                
	                
	                	
				}
				if(args[0].equalsIgnoreCase("E")){
					if(!p.hasPermission("rank.E")){
						 p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Not enough permissions!");
					 }
					
					Material item = Material.COAL_ORE;
	                for (ItemStack is : p.getInventory()) {
	                    if (is == null || is.getType() != item) continue;
	                    quantityFound += is.getAmount();
	                }
	                if(quantityFound < 1){
	                	p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Sorry, you don't have enough items to sell!");
	                	return true;
	                }
	                int pricePer = Main.getPlugin().getConfig().getInt("Shops.E");
					int amountToGive = quantityFound * pricePer;
					int globalMult = Main.getPlugin().getConfig().getInt("Global_Multiplier");
	                int newAmountToGive = amountToGive;          
	                if (globalMult > 1) {
	                    newAmountToGive *= globalMult;
		                Main.getPlugin().econ.depositPlayer(p, newAmountToGive);
		                p.getInventory().remove(item);
		                p.updateInventory();
                		p.sendMessage("");
                		p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "*** SUCCESSFUL SELL ***");
                		p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You recieved " + ChatColor.YELLOW + "$" +newAmountToGive+ ChatColor.GRAY + " (In-Game Money)");
                		p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You sold " + ChatColor.YELLOW +quantityFound+ ChatColor.GRAY + " items!");
                		p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "There is currently a " + ChatColor.YELLOW + globalMult + "x" +ChatColor.GRAY + " Booster active!");
                		p.sendMessage("");
                		return true;
	                }
	                else {
	                	Main.getPlugin().econ.depositPlayer(p, newAmountToGive);
		                p.getInventory().remove(item);
	                	p.sendMessage("");
                		p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "*** SUCCESSFUL SELL ***");
                		p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You recieved " + ChatColor.YELLOW + "$" +newAmountToGive+ ChatColor.GRAY + " (In-Game Money)");
                		p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You sold " + ChatColor.YELLOW +quantityFound+ ChatColor.GRAY + " items!");
                		p.sendMessage("");
                		return true;
	                }
	                
	                
	                
	                
	                	
				}
				if(args[0].equalsIgnoreCase("F")){
					if(!p.hasPermission("rank.F")){
						 p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Not enough permissions!");
					 }
					
					Material item = Material.COAL_ORE;
	                for (ItemStack is : p.getInventory()) {
	                    if (is == null || is.getType() != item) continue;
	                    quantityFound += is.getAmount();
	                }
	                if(quantityFound < 1){
	                	p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Sorry, you don't have enough items to sell!");
	                	return true;
	                }
	                int pricePer = Main.getPlugin().getConfig().getInt("Shops.F");
					int amountToGive = quantityFound * pricePer;
					int globalMult = Main.getPlugin().getConfig().getInt("Global_Multiplier");
	                int newAmountToGive = amountToGive;          
	                if (globalMult > 1) {
	                    newAmountToGive *= globalMult;
		                Main.getPlugin().econ.depositPlayer(p, newAmountToGive);
		                p.getInventory().remove(item);
		                p.updateInventory();
                		p.sendMessage("");
                		p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "*** SUCCESSFUL SELL ***");
                		p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You recieved " + ChatColor.YELLOW + "$" +newAmountToGive+ ChatColor.GRAY + " (In-Game Money)");
                		p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You sold " + ChatColor.YELLOW +quantityFound+ ChatColor.GRAY + " items!");
                		p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "There is currently a " + ChatColor.YELLOW + globalMult + "x" +ChatColor.GRAY + " Booster active!");
                		p.sendMessage("");
                		return true;
	                }
	                else {
	                	Main.getPlugin().econ.depositPlayer(p, newAmountToGive);
		                p.getInventory().remove(item);
	                	p.sendMessage("");
                		p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "*** SUCCESSFUL SELL ***");
                		p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You recieved " + ChatColor.YELLOW + "$" +newAmountToGive+ ChatColor.GRAY + " (In-Game Money)");
                		p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You sold " + ChatColor.YELLOW +quantityFound+ ChatColor.GRAY + " items!");
                		p.sendMessage("");
                		return true;
	                }
	                
	                
	                
	                
	                	
				}
				if(args[0].equalsIgnoreCase("G")){
					if(!p.hasPermission("rank.G")){
						 p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Not enough permissions!");
					 }
					
					Material item = Material.IRON_ORE;
	                for (ItemStack is : p.getInventory()) {
	                    if (is == null || is.getType() != item) continue;
	                    quantityFound += is.getAmount();
	                }
	                if(quantityFound < 1){
	                	p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Sorry, you don't have enough items to sell!");
	                	return true;
	                }
	                int pricePer = Main.getPlugin().getConfig().getInt("Shops.G");
					int amountToGive = quantityFound * pricePer;
					int globalMult = Main.getPlugin().getConfig().getInt("Global_Multiplier");
	                int newAmountToGive = amountToGive;          
	                if (globalMult > 1) {
	                    newAmountToGive *= globalMult;
		                Main.getPlugin().econ.depositPlayer(p, newAmountToGive);
		                p.getInventory().remove(item);
		                p.updateInventory();
                		p.sendMessage("");
                		p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "*** SUCCESSFUL SELL ***");
                		p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You recieved " + ChatColor.YELLOW + "$" +newAmountToGive+ ChatColor.GRAY + " (In-Game Money)");
                		p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You sold " + ChatColor.YELLOW +quantityFound+ ChatColor.GRAY + " items!");
                		p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "There is currently a " + ChatColor.YELLOW + globalMult + "x" +ChatColor.GRAY + " Booster active!");
                		p.sendMessage("");
                		return true;
	                }
	                else {
	                	Main.getPlugin().econ.depositPlayer(p, newAmountToGive);
		                p.getInventory().remove(item);
	                	p.sendMessage("");
                		p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "*** SUCCESSFUL SELL ***");
                		p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You recieved " + ChatColor.YELLOW + "$" +newAmountToGive+ ChatColor.GRAY + " (In-Game Money)");
                		p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You sold " + ChatColor.YELLOW +quantityFound+ ChatColor.GRAY + " items!");
                		p.sendMessage("");
                		return true;
	                }
	                
	                
	                
	                
	                	
				}
				if(args[0].equalsIgnoreCase("H")){
					if(!p.hasPermission("rank.H")){
						 p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Not enough permissions!");
					 }
					
					Material item = Material.IRON_ORE;
	                for (ItemStack is : p.getInventory()) {
	                    if (is == null || is.getType() != item) continue;
	                    quantityFound += is.getAmount();
	                }
	                if(quantityFound < 1){
	                	p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Sorry, you don't have enough items to sell!");
	                	return true;
	                }
	                int pricePer = Main.getPlugin().getConfig().getInt("Shops.H");
					int amountToGive = quantityFound * pricePer;
					int globalMult = Main.getPlugin().getConfig().getInt("Global_Multiplier");
	                int newAmountToGive = amountToGive;          
	                if (globalMult > 1) {
	                    newAmountToGive *= globalMult;
		                Main.getPlugin().econ.depositPlayer(p, newAmountToGive);
		                p.getInventory().remove(item);
		                p.updateInventory();
                		p.sendMessage("");
                		p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "*** SUCCESSFUL SELL ***");
                		p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You recieved " + ChatColor.YELLOW + "$" +newAmountToGive+ ChatColor.GRAY + " (In-Game Money)");
                		p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You sold " + ChatColor.YELLOW +quantityFound+ ChatColor.GRAY + " items!");
                		p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "There is currently a " + ChatColor.YELLOW + globalMult + "x" +ChatColor.GRAY + " Booster active!");
                		p.sendMessage("");
                		return true;
	                }
	                else {
	                	Main.getPlugin().econ.depositPlayer(p, newAmountToGive);
		                p.getInventory().remove(item);
	                	p.sendMessage("");
                		p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "*** SUCCESSFUL SELL ***");
                		p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You recieved " + ChatColor.YELLOW + "$" +newAmountToGive+ ChatColor.GRAY + " (In-Game Money)");
                		p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You sold " + ChatColor.YELLOW +quantityFound+ ChatColor.GRAY + " items!");
                		p.sendMessage("");
                		return true;
	                }
	                
	                
	                
	                
	                	
				}
				if(args[0].equalsIgnoreCase("I")){
					if(!p.hasPermission("rank.I")){
						 p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Not enough permissions!");
					 }
					
					Material item = Material.IRON_ORE;
	                for (ItemStack is : p.getInventory()) {
	                    if (is == null || is.getType() != item) continue;
	                    quantityFound += is.getAmount();
	                }
	                if(quantityFound < 1){
	                	p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Sorry, you don't have enough items to sell!");
	                	return true;
	                }
	                int pricePer = Main.getPlugin().getConfig().getInt("Shops.I");
					int amountToGive = quantityFound * pricePer;
					int globalMult = Main.getPlugin().getConfig().getInt("Global_Multiplier");
	                int newAmountToGive = amountToGive;          
	                if (globalMult > 1) {
	                    newAmountToGive *= globalMult;
		                Main.getPlugin().econ.depositPlayer(p, newAmountToGive);
		                p.getInventory().remove(item);
		                p.updateInventory();
                		p.sendMessage("");
                		p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "*** SUCCESSFUL SELL ***");
                		p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You recieved " + ChatColor.YELLOW + "$" +newAmountToGive+ ChatColor.GRAY + " (In-Game Money)");
                		p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You sold " + ChatColor.YELLOW +quantityFound+ ChatColor.GRAY + " items!");
                		p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "There is currently a " + ChatColor.YELLOW + globalMult + "x" +ChatColor.GRAY + " Booster active!");
                		p.sendMessage("");
                		return true;
	                }
	                else {
	                	Main.getPlugin().econ.depositPlayer(p, newAmountToGive);
		                p.getInventory().remove(item);
	                	p.sendMessage("");
                		p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "*** SUCCESSFUL SELL ***");
                		p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You recieved " + ChatColor.YELLOW + "$" +newAmountToGive+ ChatColor.GRAY + " (In-Game Money)");
                		p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You sold " + ChatColor.YELLOW +quantityFound+ ChatColor.GRAY + " items!");
                		p.sendMessage("");
                		return true;
	                }
	                
	                
	                
	                
	                	
				}
				if(args[0].equalsIgnoreCase("J")){
					if(!p.hasPermission("rank.J")){
						 p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Not enough permissions!");
					 }
					
					Material item = Material.GOLD_ORE;
	                for (ItemStack is : p.getInventory()) {
	                    if (is == null || is.getType() != item) continue;
	                    quantityFound += is.getAmount();
	                }
	                if(quantityFound < 1){
	                	p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Sorry, you don't have enough items to sell!");
	                	return true;
	                }
	                int pricePer = Main.getPlugin().getConfig().getInt("Shops.J");
					int amountToGive = quantityFound * pricePer;
					int globalMult = Main.getPlugin().getConfig().getInt("Global_Multiplier");
	                int newAmountToGive = amountToGive;          
	                if (globalMult > 1) {
	                    newAmountToGive *= globalMult;
		                Main.getPlugin().econ.depositPlayer(p, newAmountToGive);
		                p.getInventory().remove(item);
		                p.updateInventory();
                		p.sendMessage("");
                		p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "*** SUCCESSFUL SELL ***");
                		p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You recieved " + ChatColor.YELLOW + "$" +newAmountToGive+ ChatColor.GRAY + " (In-Game Money)");
                		p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You sold " + ChatColor.YELLOW +quantityFound+ ChatColor.GRAY + " items!");
                		p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "There is currently a " + ChatColor.YELLOW + globalMult + "x" +ChatColor.GRAY + " Booster active!");
                		p.sendMessage("");
                		return true;
	                }
	                else {
	                	Main.getPlugin().econ.depositPlayer(p, newAmountToGive);
		                p.getInventory().remove(item);
	                	p.sendMessage("");
                		p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "*** SUCCESSFUL SELL ***");
                		p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You recieved " + ChatColor.YELLOW + "$" +newAmountToGive+ ChatColor.GRAY + " (In-Game Money)");
                		p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You sold " + ChatColor.YELLOW +quantityFound+ ChatColor.GRAY + " items!");
                		p.sendMessage("");
                		return true;
	                }
	                
	                
	                
	                
	                	
				}
				if(args[0].equalsIgnoreCase("K")){
					if(!p.hasPermission("rank.K")){
						 p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Not enough permissions!");
					 }
					
					Material item = Material.GOLD_ORE;
	                for (ItemStack is : p.getInventory()) {
	                    if (is == null || is.getType() != item) continue;
	                    quantityFound += is.getAmount();
	                }
	                if(quantityFound < 1){
	                	p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Sorry, you don't have enough items to sell!");
	                	return true;
	                }
	                int pricePer = Main.getPlugin().getConfig().getInt("Shops.K");
					int amountToGive = quantityFound * pricePer;
					int globalMult = Main.getPlugin().getConfig().getInt("Global_Multiplier");
	                int newAmountToGive = amountToGive;          
	                if (globalMult > 1) {
	                    newAmountToGive *= globalMult;
		                Main.getPlugin().econ.depositPlayer(p, newAmountToGive);
		                p.getInventory().remove(item);
		                p.updateInventory();
                		p.sendMessage("");
                		p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "*** SUCCESSFUL SELL ***");
                		p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You recieved " + ChatColor.YELLOW + "$" +newAmountToGive+ ChatColor.GRAY + " (In-Game Money)");
                		p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You sold " + ChatColor.YELLOW +quantityFound+ ChatColor.GRAY + " items!");
                		p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "There is currently a " + ChatColor.YELLOW + globalMult + "x" +ChatColor.GRAY + " Booster active!");
                		p.sendMessage("");
                		return true;
	                }
	                else {
	                	Main.getPlugin().econ.depositPlayer(p, newAmountToGive);
		                p.getInventory().remove(item);
	                	p.sendMessage("");
                		p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "*** SUCCESSFUL SELL ***");
                		p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You recieved " + ChatColor.YELLOW + "$" +newAmountToGive+ ChatColor.GRAY + " (In-Game Money)");
                		p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You sold " + ChatColor.YELLOW +quantityFound+ ChatColor.GRAY + " items!");
                		p.sendMessage("");
                		return true;
	                }
	                
	                
	                
	                
	                	
				}
				if(args[0].equalsIgnoreCase("L")){
					if(!p.hasPermission("rank.L")){
						 p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Not enough permissions!");
					 }
					
					Material item = Material.GOLD_ORE;
	                for (ItemStack is : p.getInventory()) {
	                    if (is == null || is.getType() != item) continue;
	                    quantityFound += is.getAmount();
	                }
	                if(quantityFound < 1){
	                	p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Sorry, you don't have enough items to sell!");
	                	return true;
	                }
	                int pricePer = Main.getPlugin().getConfig().getInt("Shops.L");
					int amountToGive = quantityFound * pricePer;
					int globalMult = Main.getPlugin().getConfig().getInt("Global_Multiplier");
	                int newAmountToGive = amountToGive;          
	                if (globalMult > 1) {
	                    newAmountToGive *= globalMult;
		                Main.getPlugin().econ.depositPlayer(p, newAmountToGive);
		                p.getInventory().remove(item);
		                p.updateInventory();
                		p.sendMessage("");
                		p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "*** SUCCESSFUL SELL ***");
                		p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You recieved " + ChatColor.YELLOW + "$" +newAmountToGive+ ChatColor.GRAY + " (In-Game Money)");
                		p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You sold " + ChatColor.YELLOW +quantityFound+ ChatColor.GRAY + " items!");
                		p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "There is currently a " + ChatColor.YELLOW + globalMult + "x" +ChatColor.GRAY + " Booster active!");
                		p.sendMessage("");
                		return true;
	                }
	                else {
	                	Main.getPlugin().econ.depositPlayer(p, newAmountToGive);
		                p.getInventory().remove(item);
	                	p.sendMessage("");
                		p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "*** SUCCESSFUL SELL ***");
                		p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You recieved " + ChatColor.YELLOW + "$" +newAmountToGive+ ChatColor.GRAY + " (In-Game Money)");
                		p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You sold " + ChatColor.YELLOW +quantityFound+ ChatColor.GRAY + " items!");
                		p.sendMessage("");
                		return true;
	                }
	                
	                
	                
	                
	                	
				}
				if(args[0].equalsIgnoreCase("M")){
					if(!p.hasPermission("rank.M")){
						 p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Not enough permissions!");
					 }
					
					Material item = Material.REDSTONE_ORE;
	                for (ItemStack is : p.getInventory()) {
	                    if (is == null || is.getType() != item) continue;
	                    quantityFound += is.getAmount();
	                }
	                if(quantityFound < 1){
	                	p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Sorry, you don't have enough items to sell!");
	                	return true;
	                }
	                int pricePer = Main.getPlugin().getConfig().getInt("Shops.M");
					int amountToGive = quantityFound * pricePer;
					int globalMult = Main.getPlugin().getConfig().getInt("Global_Multiplier");
	                int newAmountToGive = amountToGive;          
	                if (globalMult > 1) {
	                    newAmountToGive *= globalMult;
		                Main.getPlugin().econ.depositPlayer(p, newAmountToGive);
		                p.getInventory().remove(item);
		                p.updateInventory();
                		p.sendMessage("");
                		p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "*** SUCCESSFUL SELL ***");
                		p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You recieved " + ChatColor.YELLOW + "$" +newAmountToGive+ ChatColor.GRAY + " (In-Game Money)");
                		p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You sold " + ChatColor.YELLOW +quantityFound+ ChatColor.GRAY + " items!");
                		p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "There is currently a " + ChatColor.YELLOW + globalMult + "x" +ChatColor.GRAY + " Booster active!");
                		p.sendMessage("");
                		return true;
	                }
	                else {
	                	Main.getPlugin().econ.depositPlayer(p, newAmountToGive);
		                p.getInventory().remove(item);
	                	p.sendMessage("");
                		p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "*** SUCCESSFUL SELL ***");
                		p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You recieved " + ChatColor.YELLOW + "$" +newAmountToGive+ ChatColor.GRAY + " (In-Game Money)");
                		p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You sold " + ChatColor.YELLOW +quantityFound+ ChatColor.GRAY + " items!");
                		p.sendMessage("");
                		return true;
	                }
	                
	                
	                
	                
	                	
				}
				if(args[0].equalsIgnoreCase("N")){
					if(!p.hasPermission("rank.N")){
						 p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Not enough permissions!");
					 }
					
					Material item = Material.REDSTONE_ORE;
	                for (ItemStack is : p.getInventory()) {
	                    if (is == null || is.getType() != item) continue;
	                    quantityFound += is.getAmount();
	                }
	                if(quantityFound < 1){
	                	p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Sorry, you don't have enough items to sell!");
	                	return true;
	                }
	                int pricePer = Main.getPlugin().getConfig().getInt("Shops.N");
					int amountToGive = quantityFound * pricePer;
					int globalMult = Main.getPlugin().getConfig().getInt("Global_Multiplier");
	                int newAmountToGive = amountToGive;          
	                if (globalMult > 1) {
	                    newAmountToGive *= globalMult;
		                Main.getPlugin().econ.depositPlayer(p, newAmountToGive);
		                p.getInventory().remove(item);
		                p.updateInventory();
                		p.sendMessage("");
                		p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "*** SUCCESSFUL SELL ***");
                		p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You recieved " + ChatColor.YELLOW + "$" +newAmountToGive+ ChatColor.GRAY + " (In-Game Money)");
                		p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You sold " + ChatColor.YELLOW +quantityFound+ ChatColor.GRAY + " items!");
                		p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "There is currently a " + ChatColor.YELLOW + globalMult + "x" +ChatColor.GRAY + " Booster active!");
                		p.sendMessage("");
                		return true;
	                }
	                else {
	                	Main.getPlugin().econ.depositPlayer(p, newAmountToGive);
		                p.getInventory().remove(item);
	                	p.sendMessage("");
                		p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "*** SUCCESSFUL SELL ***");
                		p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You recieved " + ChatColor.YELLOW + "$" +newAmountToGive+ ChatColor.GRAY + " (In-Game Money)");
                		p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You sold " + ChatColor.YELLOW +quantityFound+ ChatColor.GRAY + " items!");
                		p.sendMessage("");
                		return true;
	                }
	                
	                
	                
	                
	                	
				}
				if(args[0].equalsIgnoreCase("O")){
					if(!p.hasPermission("rank.O")){
						 p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Not enough permissions!");
					 }
					
					Material item = Material.REDSTONE_ORE;
	                for (ItemStack is : p.getInventory()) {
	                    if (is == null || is.getType() != item) continue;
	                    quantityFound += is.getAmount();
	                }
	                if(quantityFound < 1){
	                	p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Sorry, you don't have enough items to sell!");
	                	return true;
	                }
	                int pricePer = Main.getPlugin().getConfig().getInt("Shops.O");
					int amountToGive = quantityFound * pricePer;
					int globalMult = Main.getPlugin().getConfig().getInt("Global_Multiplier");
	                int newAmountToGive = amountToGive;          
	                if (globalMult > 1) {
	                    newAmountToGive *= globalMult;
		                Main.getPlugin().econ.depositPlayer(p, newAmountToGive);
		                p.getInventory().remove(item);
		                p.updateInventory();
                		p.sendMessage("");
                		p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "*** SUCCESSFUL SELL ***");
                		p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You recieved " + ChatColor.YELLOW + "$" +newAmountToGive+ ChatColor.GRAY + " (In-Game Money)");
                		p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You sold " + ChatColor.YELLOW +quantityFound+ ChatColor.GRAY + " items!");
                		p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "There is currently a " + ChatColor.YELLOW + globalMult + "x" +ChatColor.GRAY + " Booster active!");
                		p.sendMessage("");
                		return true;
	                }
	                else {
	                	Main.getPlugin().econ.depositPlayer(p, newAmountToGive);
		                p.getInventory().remove(item);
	                	p.sendMessage("");
                		p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "*** SUCCESSFUL SELL ***");
                		p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You recieved " + ChatColor.YELLOW + "$" +newAmountToGive+ ChatColor.GRAY + " (In-Game Money)");
                		p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You sold " + ChatColor.YELLOW +quantityFound+ ChatColor.GRAY + " items!");
                		p.sendMessage("");
                		return true;
	                }
	                
	                
	                
	                
	                	
				}
				if(args[0].equalsIgnoreCase("P")){
					if(!p.hasPermission("rank.P")){
						 p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Not enough permissions!");
					 }
					
					Material item = Material.LAPIS_ORE;
	                for (ItemStack is : p.getInventory()) {
	                    if (is == null || is.getType() != item) continue;
	                    quantityFound += is.getAmount();
	                }
	                if(quantityFound < 1){
	                	p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Sorry, you don't have enough items to sell!");
	                	return true;
	                }
	                int pricePer = Main.getPlugin().getConfig().getInt("Shops.P");
					int amountToGive = quantityFound * pricePer;
					int globalMult = Main.getPlugin().getConfig().getInt("Global_Multiplier");
	                int newAmountToGive = amountToGive;          
	                if (globalMult > 1) {
	                    newAmountToGive *= globalMult;
		                Main.getPlugin().econ.depositPlayer(p, newAmountToGive);
		                p.getInventory().remove(item);
		                p.updateInventory();
                		p.sendMessage("");
                		p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "*** SUCCESSFUL SELL ***");
                		p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You recieved " + ChatColor.YELLOW + "$" +newAmountToGive+ ChatColor.GRAY + " (In-Game Money)");
                		p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You sold " + ChatColor.YELLOW +quantityFound+ ChatColor.GRAY + " items!");
                		p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "There is currently a " + ChatColor.YELLOW + globalMult + "x" +ChatColor.GRAY + " Booster active!");
                		p.sendMessage("");
                		return true;
	                }
	                else {
	                	Main.getPlugin().econ.depositPlayer(p, newAmountToGive);
		                p.getInventory().remove(item);
	                	p.sendMessage("");
                		p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "*** SUCCESSFUL SELL ***");
                		p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You recieved " + ChatColor.YELLOW + "$" +newAmountToGive+ ChatColor.GRAY + " (In-Game Money)");
                		p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You sold " + ChatColor.YELLOW +quantityFound+ ChatColor.GRAY + " items!");
                		p.sendMessage("");
                		return true;
	                }
	                
	                
	                
	                
	                	
				}
				if(args[0].equalsIgnoreCase("Q")){
					if(!p.hasPermission("rank.Q")){
						 p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Not enough permissions!");
					 }
					
					Material item = Material.LAPIS_ORE;
	                for (ItemStack is : p.getInventory()) {
	                    if (is == null || is.getType() != item) continue;
	                    quantityFound += is.getAmount();
	                }
	                if(quantityFound < 1){
	                	p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Sorry, you don't have enough items to sell!");
	                	return true;
	                }
	                int pricePer = Main.getPlugin().getConfig().getInt("Shops.Q");
					int amountToGive = quantityFound * pricePer;
					int globalMult = Main.getPlugin().getConfig().getInt("Global_Multiplier");
	                int newAmountToGive = amountToGive;          
	                if (globalMult > 1) {
	                    newAmountToGive *= globalMult;
		                Main.getPlugin().econ.depositPlayer(p, newAmountToGive);
		                p.getInventory().remove(item);
		                p.updateInventory();
                		p.sendMessage("");
                		p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "*** SUCCESSFUL SELL ***");
                		p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You recieved " + ChatColor.YELLOW + "$" +newAmountToGive+ ChatColor.GRAY + " (In-Game Money)");
                		p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You sold " + ChatColor.YELLOW +quantityFound+ ChatColor.GRAY + " items!");
                		p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "There is currently a " + ChatColor.YELLOW + globalMult + "x" +ChatColor.GRAY + " Booster active!");
                		p.sendMessage("");
                		return true;
	                }
	                else {
	                	Main.getPlugin().econ.depositPlayer(p, newAmountToGive);
		                p.getInventory().remove(item);
	                	p.sendMessage("");
                		p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "*** SUCCESSFUL SELL ***");
                		p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You recieved " + ChatColor.YELLOW + "$" +newAmountToGive+ ChatColor.GRAY + " (In-Game Money)");
                		p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You sold " + ChatColor.YELLOW +quantityFound+ ChatColor.GRAY + " items!");
                		p.sendMessage("");
                		return true;
	                }
	                
	                
	                
	                
	                	
				}
				if(args[0].equalsIgnoreCase("R")){
					if(!p.hasPermission("rank.R")){
						 p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Not enough permissions!");
					 }
					
					Material item = Material.LAPIS_ORE;
	                for (ItemStack is : p.getInventory()) {
	                    if (is == null || is.getType() != item) continue;
	                    quantityFound += is.getAmount();
	                }
	                if(quantityFound < 1){
	                	p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Sorry, you don't have enough items to sell!");
	                	return true;
	                }
	                int pricePer = Main.getPlugin().getConfig().getInt("Shops.R");
					int amountToGive = quantityFound * pricePer;
					int globalMult = Main.getPlugin().getConfig().getInt("Global_Multiplier");
	                int newAmountToGive = amountToGive;          
	                if (globalMult > 1) {
	                    newAmountToGive *= globalMult;
		                Main.getPlugin().econ.depositPlayer(p, newAmountToGive);
		                p.getInventory().remove(item);
		                p.updateInventory();
                		p.sendMessage("");
                		p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "*** SUCCESSFUL SELL ***");
                		p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You recieved " + ChatColor.YELLOW + "$" +newAmountToGive+ ChatColor.GRAY + " (In-Game Money)");
                		p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You sold " + ChatColor.YELLOW +quantityFound+ ChatColor.GRAY + " items!");
                		p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "There is currently a " + ChatColor.YELLOW + globalMult + "x" +ChatColor.GRAY + " Booster active!");
                		p.sendMessage("");
                		return true;
	                }
	                else {
	                	Main.getPlugin().econ.depositPlayer(p, newAmountToGive);
		                p.getInventory().remove(item);
	                	p.sendMessage("");
                		p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "*** SUCCESSFUL SELL ***");
                		p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You recieved " + ChatColor.YELLOW + "$" +newAmountToGive+ ChatColor.GRAY + " (In-Game Money)");
                		p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You sold " + ChatColor.YELLOW +quantityFound+ ChatColor.GRAY + " items!");
                		p.sendMessage("");
                		return true;
	                }
	                
	                
	                
	                
	                	
				}
				if(args[0].equalsIgnoreCase("S")){
					if(!p.hasPermission("rank.S")){
						 p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Not enough permissions!");
					 }
					
					Material item = Material.QUARTZ_ORE;
	                for (ItemStack is : p.getInventory()) {
	                    if (is == null || is.getType() != item) continue;
	                    quantityFound += is.getAmount();
	                }
	                if(quantityFound < 1){
	                	p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Sorry, you don't have enough items to sell!");
	                	return true;
	                }
	                int pricePer = Main.getPlugin().getConfig().getInt("Shops.S");
					int amountToGive = quantityFound * pricePer;
					int globalMult = Main.getPlugin().getConfig().getInt("Global_Multiplier");
	                int newAmountToGive = amountToGive;          
	                if (globalMult > 1) {
	                    newAmountToGive *= globalMult;
		                Main.getPlugin().econ.depositPlayer(p, newAmountToGive);
		                p.getInventory().remove(item);
		                p.updateInventory();
                		p.sendMessage("");
                		p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "*** SUCCESSFUL SELL ***");
                		p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You recieved " + ChatColor.YELLOW + "$" +newAmountToGive+ ChatColor.GRAY + " (In-Game Money)");
                		p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You sold " + ChatColor.YELLOW +quantityFound+ ChatColor.GRAY + " items!");
                		p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "There is currently a " + ChatColor.YELLOW + globalMult + "x" +ChatColor.GRAY + " Booster active!");
                		p.sendMessage("");
                		return true;
	                }
	                else {
	                	Main.getPlugin().econ.depositPlayer(p, newAmountToGive);
		                p.getInventory().remove(item);
	                	p.sendMessage("");
                		p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "*** SUCCESSFUL SELL ***");
                		p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You recieved " + ChatColor.YELLOW + "$" +newAmountToGive+ ChatColor.GRAY + " (In-Game Money)");
                		p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You sold " + ChatColor.YELLOW +quantityFound+ ChatColor.GRAY + " items!");
                		p.sendMessage("");
                		return true;
	                }
	                
	                
	                
	                
	                	
				}
				if(args[0].equalsIgnoreCase("T")){
					if(!p.hasPermission("rank.T")){
						 p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Not enough permissions!");
					 }
					
					Material item = Material.QUARTZ_ORE;
	                for (ItemStack is : p.getInventory()) {
	                    if (is == null || is.getType() != item) continue;
	                    quantityFound += is.getAmount();
	                }
	                if(quantityFound < 1){
	                	p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Sorry, you don't have enough items to sell!");
	                	return true;
	                }
	                int pricePer = Main.getPlugin().getConfig().getInt("Shops.T");
					int amountToGive = quantityFound * pricePer;
					int globalMult = Main.getPlugin().getConfig().getInt("Global_Multiplier");
	                int newAmountToGive = amountToGive;          
	                if (globalMult > 1) {
	                    newAmountToGive *= globalMult;
		                Main.getPlugin().econ.depositPlayer(p, newAmountToGive);
		                p.getInventory().remove(item);
		                p.updateInventory();
                		p.sendMessage("");
                		p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "*** SUCCESSFUL SELL ***");
                		p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You recieved " + ChatColor.YELLOW + "$" +newAmountToGive+ ChatColor.GRAY + " (In-Game Money)");
                		p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You sold " + ChatColor.YELLOW +quantityFound+ ChatColor.GRAY + " items!");
                		p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "There is currently a " + ChatColor.YELLOW + globalMult + "x" +ChatColor.GRAY + " Booster active!");
                		p.sendMessage("");
                		return true;
	                }
	                else {
	                	Main.getPlugin().econ.depositPlayer(p, newAmountToGive);
		                p.getInventory().remove(item);
	                	p.sendMessage("");
                		p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "*** SUCCESSFUL SELL ***");
                		p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You recieved " + ChatColor.YELLOW + "$" +newAmountToGive+ ChatColor.GRAY + " (In-Game Money)");
                		p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You sold " + ChatColor.YELLOW +quantityFound+ ChatColor.GRAY + " items!");
                		p.sendMessage("");
                		return true;
	                }
	                
	                
	                
	                
	                	
				}
				if(args[0].equalsIgnoreCase("U")){
					if(!p.hasPermission("rank.U")){
						 p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Not enough permissions!");
					 }
					
					Material item = Material.QUARTZ_ORE;
	                for (ItemStack is : p.getInventory()) {
	                    if (is == null || is.getType() != item) continue;
	                    quantityFound += is.getAmount();
	                }
	                if(quantityFound < 1){
	                	p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Sorry, you don't have enough items to sell!");
	                	return true;
	                }
	                int pricePer = Main.getPlugin().getConfig().getInt("Shops.U");
					int amountToGive = quantityFound * pricePer;
					int globalMult = Main.getPlugin().getConfig().getInt("Global_Multiplier");
	                int newAmountToGive = amountToGive;          
	                if (globalMult > 1) {
	                    newAmountToGive *= globalMult;
		                Main.getPlugin().econ.depositPlayer(p, newAmountToGive);
		                p.getInventory().remove(item);
		                p.updateInventory();
                		p.sendMessage("");
                		p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "*** SUCCESSFUL SELL ***");
                		p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You recieved " + ChatColor.YELLOW + "$" +newAmountToGive+ ChatColor.GRAY + " (In-Game Money)");
                		p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You sold " + ChatColor.YELLOW +quantityFound+ ChatColor.GRAY + " items!");
                		p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "There is currently a " + ChatColor.YELLOW + globalMult + "x" +ChatColor.GRAY + " Booster active!");
                		p.sendMessage("");
                		return true;
	                }
	                else {
	                	Main.getPlugin().econ.depositPlayer(p, newAmountToGive);
		                p.getInventory().remove(item);
	                	p.sendMessage("");
                		p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "*** SUCCESSFUL SELL ***");
                		p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You recieved " + ChatColor.YELLOW + "$" +newAmountToGive+ ChatColor.GRAY + " (In-Game Money)");
                		p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You sold " + ChatColor.YELLOW +quantityFound+ ChatColor.GRAY + " items!");
                		p.sendMessage("");
                		return true;
	                }
	                
	                
	                
	                
	                	
				}
				if(args[0].equalsIgnoreCase("V")){
					if(!p.hasPermission("rank.V")){
						 p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Not enough permissions!");
					 }
					
					Material item = Material.DIAMOND_ORE;
	                for (ItemStack is : p.getInventory()) {
	                    if (is == null || is.getType() != item) continue;
	                    quantityFound += is.getAmount();
	                }
	                if(quantityFound < 1){
	                	p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Sorry, you don't have enough items to sell!");
	                	return true;
	                }
	                int pricePer = Main.getPlugin().getConfig().getInt("Shops.V");
					int amountToGive = quantityFound * pricePer;
					int globalMult = Main.getPlugin().getConfig().getInt("Global_Multiplier");
	                int newAmountToGive = amountToGive;          
	                if (globalMult > 1) {
	                    newAmountToGive *= globalMult;
		                Main.getPlugin().econ.depositPlayer(p, newAmountToGive);
		                p.getInventory().remove(item);
		                p.updateInventory();
                		p.sendMessage("");
                		p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "*** SUCCESSFUL SELL ***");
                		p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You recieved " + ChatColor.YELLOW + "$" +newAmountToGive+ ChatColor.GRAY + " (In-Game Money)");
                		p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You sold " + ChatColor.YELLOW +quantityFound+ ChatColor.GRAY + " items!");
                		p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "There is currently a " + ChatColor.YELLOW + globalMult + "x" +ChatColor.GRAY + " Booster active!");
                		p.sendMessage("");
                		return true;
	                }
	                else {
	                	Main.getPlugin().econ.depositPlayer(p, newAmountToGive);
		                p.getInventory().remove(item);
	                	p.sendMessage("");
                		p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "*** SUCCESSFUL SELL ***");
                		p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You recieved " + ChatColor.YELLOW + "$" +newAmountToGive+ ChatColor.GRAY + " (In-Game Money)");
                		p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You sold " + ChatColor.YELLOW +quantityFound+ ChatColor.GRAY + " items!");
                		p.sendMessage("");
                		return true;
	                }
	                
	                
	                
	                
	                	
				}
				if(args[0].equalsIgnoreCase("W")){
					if(!p.hasPermission("rank.W")){
						 p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Not enough permissions!");
					 }
					
					Material item = Material.DIAMOND_ORE;
	                for (ItemStack is : p.getInventory()) {
	                    if (is == null || is.getType() != item) continue;
	                    quantityFound += is.getAmount();
	                }
	                if(quantityFound < 1){
	                	p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Sorry, you don't have enough items to sell!");
	                	return true;
	                }
	                int pricePer = Main.getPlugin().getConfig().getInt("Shops.W");
					int amountToGive = quantityFound * pricePer;
					int globalMult = Main.getPlugin().getConfig().getInt("Global_Multiplier");
	                int newAmountToGive = amountToGive;          
	                if (globalMult > 1) {
	                    newAmountToGive *= globalMult;
		                Main.getPlugin().econ.depositPlayer(p, newAmountToGive);
		                p.getInventory().remove(item);
		                p.updateInventory();
                		p.sendMessage("");
                		p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "*** SUCCESSFUL SELL ***");
                		p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You recieved " + ChatColor.YELLOW + "$" +newAmountToGive+ ChatColor.GRAY + " (In-Game Money)");
                		p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You sold " + ChatColor.YELLOW +quantityFound+ ChatColor.GRAY + " items!");
                		p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "There is currently a " + ChatColor.YELLOW + globalMult + "x" +ChatColor.GRAY + " Booster active!");
                		p.sendMessage("");
                		return true;
	                }
	                else {
	                	Main.getPlugin().econ.depositPlayer(p, newAmountToGive);
		                p.getInventory().remove(item);
	                	p.sendMessage("");
                		p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "*** SUCCESSFUL SELL ***");
                		p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You recieved " + ChatColor.YELLOW + "$" +newAmountToGive+ ChatColor.GRAY + " (In-Game Money)");
                		p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You sold " + ChatColor.YELLOW +quantityFound+ ChatColor.GRAY + " items!");
                		p.sendMessage("");
                		return true;
	                }
	                
	                
	                
	                
	                	
				}
				if(args[0].equalsIgnoreCase("X")){
					if(!p.hasPermission("rank.X")){
						 p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Not enough permissions!");
					 }
					
					Material item = Material.DIAMOND_ORE;
	                for (ItemStack is : p.getInventory()) {
	                    if (is == null || is.getType() != item) continue;
	                    quantityFound += is.getAmount();
	                }
	                if(quantityFound < 1){
	                	p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Sorry, you don't have enough items to sell!");
	                	return true;
	                }
	                int pricePer = Main.getPlugin().getConfig().getInt("Shops.X");
					int amountToGive = quantityFound * pricePer;
					int globalMult = Main.getPlugin().getConfig().getInt("Global_Multiplier");
	                int newAmountToGive = amountToGive;          
	                if (globalMult > 1) {
	                    newAmountToGive *= globalMult;
		                Main.getPlugin().econ.depositPlayer(p, newAmountToGive);
		                p.getInventory().remove(item);
		                p.updateInventory();
                		p.sendMessage("");
                		p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "*** SUCCESSFUL SELL ***");
                		p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You recieved " + ChatColor.YELLOW + "$" +newAmountToGive+ ChatColor.GRAY + " (In-Game Money)");
                		p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You sold " + ChatColor.YELLOW +quantityFound+ ChatColor.GRAY + " items!");
                		p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "There is currently a " + ChatColor.YELLOW + globalMult + "x" +ChatColor.GRAY + " Booster active!");
                		p.sendMessage("");
                		return true;
	                }
	                else {
	                	Main.getPlugin().econ.depositPlayer(p, newAmountToGive);
		                p.getInventory().remove(item);
	                	p.sendMessage("");
                		p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "*** SUCCESSFUL SELL ***");
                		p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You recieved " + ChatColor.YELLOW + "$" +newAmountToGive+ ChatColor.GRAY + " (In-Game Money)");
                		p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You sold " + ChatColor.YELLOW +quantityFound+ ChatColor.GRAY + " items!");
                		p.sendMessage("");
                		return true;
	                }
	                
	                
	                
	                
	                	
				}
				if(args[0].equalsIgnoreCase("Y")){
					if(!p.hasPermission("rank.Y")){
						 p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Not enough permissions!");
					 }
					
					Material item = Material.EMERALD_ORE;
	                for (ItemStack is : p.getInventory()) {
	                    if (is == null || is.getType() != item) continue;
	                    quantityFound += is.getAmount();
	                }
	                if(quantityFound < 1){
	                	p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Sorry, you don't have enough items to sell!");
	                	return true;
	                }
	                int pricePer = Main.getPlugin().getConfig().getInt("Shops.Y");
					int amountToGive = quantityFound * pricePer;
					int globalMult = Main.getPlugin().getConfig().getInt("Global_Multiplier");
	                int newAmountToGive = amountToGive;          
	                if (globalMult > 1) {
	                    newAmountToGive *= globalMult;
		                Main.getPlugin().econ.depositPlayer(p, newAmountToGive);
		                p.getInventory().remove(item);
		                p.updateInventory();
                		p.sendMessage("");
                		p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "*** SUCCESSFUL SELL ***");
                		p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You recieved " + ChatColor.YELLOW + "$" +newAmountToGive+ ChatColor.GRAY + " (In-Game Money)");
                		p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You sold " + ChatColor.YELLOW +quantityFound+ ChatColor.GRAY + " items!");
                		p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "There is currently a " + ChatColor.YELLOW + globalMult + "x" +ChatColor.GRAY + " Booster active!");
                		p.sendMessage("");
                		return true;
	                }
	                else {
	                	Main.getPlugin().econ.depositPlayer(p, newAmountToGive);
		                p.getInventory().remove(item);
	                	p.sendMessage("");
                		p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "*** SUCCESSFUL SELL ***");
                		p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You recieved " + ChatColor.YELLOW + "$" +newAmountToGive+ ChatColor.GRAY + " (In-Game Money)");
                		p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You sold " + ChatColor.YELLOW +quantityFound+ ChatColor.GRAY + " items!");
                		p.sendMessage("");
                		return true;
	                }
	                
	                
	                
	                
	                	
				}
				if(args[0].equalsIgnoreCase("Z")){
					if(!p.hasPermission("rank.Z")){
						 p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Not enough permissions!");
					 }
					
					Material item = Material.EMERALD_ORE;
	                for (ItemStack is : p.getInventory()) {
	                    if (is == null || is.getType() != item) continue;
	                    quantityFound += is.getAmount();
	                }
	                if(quantityFound < 1){
	                	p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Sorry, you don't have enough items to sell!");
	                	return true;
	                }
	                int pricePer = Main.getPlugin().getConfig().getInt("Shops.Z");
					int amountToGive = quantityFound * pricePer;
					int globalMult = Main.getPlugin().getConfig().getInt("Global_Multiplier");
	                int newAmountToGive = amountToGive;          
	                if (globalMult > 1) {
	                    newAmountToGive *= globalMult;
		                Main.getPlugin().econ.depositPlayer(p, newAmountToGive);
		                p.getInventory().remove(item);
		                p.updateInventory();
                		p.sendMessage("");
                		p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "*** SUCCESSFUL SELL ***");
                		p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You recieved " + ChatColor.YELLOW + "$" +newAmountToGive+ ChatColor.GRAY + " (In-Game Money)");
                		p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You sold " + ChatColor.YELLOW +quantityFound+ ChatColor.GRAY + " items!");
                		p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "There is currently a " + ChatColor.YELLOW + globalMult + "x" +ChatColor.GRAY + " Booster active!");
                		p.sendMessage("");
                		return true;
	                }
	                else {
	                	Main.getPlugin().econ.depositPlayer(p, newAmountToGive);
		                p.getInventory().remove(item);
	                	p.sendMessage("");
                		p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "*** SUCCESSFUL SELL ***");
                		p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You recieved " + ChatColor.YELLOW + "$" +newAmountToGive+ ChatColor.GRAY + " (In-Game Money)");
                		p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You sold " + ChatColor.YELLOW +quantityFound+ ChatColor.GRAY + " items!");
                		p.sendMessage("");
                		return true;
	                }
	                
	                
	                
	                
	                	
				}
				else{
					p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Sorry, the shop you entered is not valid!");
				}
			}
			if(args.length > 1){
				p.sendMessage("");
        		p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "*** ACIUM SELL ***");
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.YELLOW + "/sellall <shop>" + ChatColor.GRAY + " - Sell inventory items to specified shop");
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.YELLOW + "/sellall stfu" + ChatColor.GRAY + " - Stops messages being sent when selling");
				p.sendMessage("");
				return true;
			}
		}
		return false;
	}
}
