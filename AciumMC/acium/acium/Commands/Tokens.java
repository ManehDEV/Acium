package dev.mannyyy.acium.Commands;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import dev.mannyyy.aciumtokens.Main;


public class Tokens implements CommandExecutor{
	
	ArrayList<String> resetallconf = new ArrayList<>();

	@SuppressWarnings("deprecation")
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player p = (Player) sender;
		if(cmd.getName().equalsIgnoreCase("tokens")){
			if(args.length < 1){
        		p.sendMessage("");
        		p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "*** ACIUM TOKENS ***");
        		p.sendMessage("");
        		p.sendMessage(ChatColor.GRAY + "You currently have " + ChatColor.YELLOW + Main.getTokens(p) + ChatColor.GRAY + " tokens");
        		p.sendMessage("");
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.YELLOW + "/tokens" + ChatColor.GRAY + " - Shows your current tokens");
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.YELLOW + "/tokens withdraw" + ChatColor.GRAY + " - Withdraw tokens to items");
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.YELLOW + "/tokens deposit" + ChatColor.GRAY + " - Deposit tokens into your balance");
				p.sendMessage("");
				return true;
			}
			if(args.length == 1){
				if(args[0].equalsIgnoreCase("withdraw")){
					p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Invalid Syntax: " + ChatColor.YELLOW + "/tokens withdraw <amount>");
					return true;
				}
				if(args[0].equalsIgnoreCase("set")){
					p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Invalid Syntax: " + ChatColor.YELLOW + "/tokens set <player> <amount>");
					return true;
				}
				if(args[0].equalsIgnoreCase("remove")){
					p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Invalid Syntax: " + ChatColor.YELLOW + "/tokens remove <player> <amount>");
					return true;
				}
				if(args[0].equalsIgnoreCase("reset")){
					p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Invalid Syntax: " + ChatColor.YELLOW + "/tokens reset <player>");
					return true;
				}
				if(args[0].equalsIgnoreCase("resetall")){
					if(!resetallconf.contains(p.getName())){
						if(p.hasPermission("tokens.admin")){
						p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Are you sure you want to reset all players' token balance?");
						p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "If you wish to continue type /tokens confirm");
						resetallconf.add(p.getName());
						return true;
					}
						p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Not enough permissions!");
						return true;
					}
					else {
						p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Type /tokens confirm to confirm global token balance reset!");
						return true;
					}
				}
				if(args[0].equalsIgnoreCase("confirm")){
					if(resetallconf.contains(p.getName())){
						Main.getPlugin().getConfig().set("Tokens", "");;
						Main.getPlugin().saveConfig();
						Bukkit.getServer().broadcastMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "All token balances have been reset by " + ChatColor.YELLOW +p.getName());
						resetallconf.remove(p.getName());
						return true;
					}
					else{
						p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Nothing to confirm!");
						return true;
					}
				}
				else {
	        		p.sendMessage("");
	        		p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "*** ACIUM TOKENS ***");
	        		p.sendMessage("");
	        		p.sendMessage(ChatColor.GRAY + "You currently have " + ChatColor.YELLOW + Main.getTokens(p) + ChatColor.GRAY + " tokens");
	        		p.sendMessage("");
					p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.YELLOW + "/tokens" + ChatColor.GRAY + " - Shows your current tokens");
					p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.YELLOW + "/tokens withdraw" + ChatColor.GRAY + " - Withdraw tokens to items");
					p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.YELLOW + "/tokens deposit" + ChatColor.GRAY + " - Deposit tokens into your balance");
					p.sendMessage("");
					return true;
				}
			}
			if(args.length == 2){
				if(args[0].equalsIgnoreCase("deposit")){
					try{
						int token = Integer.parseInt(args[1]);
						int count = 0;
						ItemStack[] inv = p.getInventory().getContents();
					    for(int i = 0; i < inv.length; i++) {
					        if(inv[i] != null){
					            if(inv[i].getType() == Material.MAGMA_CREAM){
					            	if(inv[i].hasItemMeta()){
					            		if(inv[i].getItemMeta().getDisplayName().contains("Acium Token")){
					            			int co = inv[i].getAmount();
					            			count= count + co;
					            	}
					            	}
					            }
					        }
					    }
					    if(count <= 0){
							p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You have deposited " + ChatColor.YELLOW + count + ChatColor.GRAY + " tokens!");
							return true;
					    }
						if(token > count){
							ItemStack is = new ItemStack(Material.MAGMA_CREAM, (count));
							ItemMeta im = is.getItemMeta();
							im.setDisplayName(ChatColor.GOLD + "Acium Token");
					        ArrayList<String> Lore= new ArrayList<>();
					        Lore.clear();
					        Lore.add("" + ChatColor.GRAY + "Click to gain an extra token to");
					        Lore.add("" + ChatColor.GRAY + "your current balance " + ChatColor.YELLOW + "/token");
					        im.setLore(Lore);
					        is.setItemMeta(im);
					        p.getInventory().removeItem(is);
							p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You have deposited " + ChatColor.YELLOW + count + ChatColor.GRAY + " tokens!");
							Main.addTokens(p, count);
							p.updateInventory();
							return true;
						}
						if(count <= token){
							ItemStack is = new ItemStack(Material.MAGMA_CREAM, (token));
							ItemMeta im = is.getItemMeta();
							im.setDisplayName(ChatColor.GOLD + "Acium Token");
					        ArrayList<String> Lore= new ArrayList<>();
					        Lore.clear();
					        Lore.add("" + ChatColor.GRAY + "Click to gain an extra token to");
					        Lore.add("" + ChatColor.GRAY + "your current balance " + ChatColor.YELLOW + "/token");
					        im.setLore(Lore);
					        is.setItemMeta(im);
					        p.getInventory().removeItem(is);
					        p.updateInventory();
							p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You have deposited " + ChatColor.YELLOW + token + ChatColor.GRAY + " tokens!");
							Main.addTokens(p, token);
							return true;
						}
						else{
							p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "There was an error!");
							p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Please report this on the forums with the command you did!");
							return true;
						}
					} catch (Exception e){
					    	p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "The amount you entered is invalid!");
					    	return true;
					}
				}
				if(args[0].equalsIgnoreCase("withdraw")){
					try{
						int token = Integer.parseInt(args[1]);
								int gottokens = Main.getTokens(p);
								int count = 0;
								for(ItemStack i : p.getInventory()){
									if (i == null) {
										count++;
										}
								}
								if(gottokens == 0){
									p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You have withdrawn " + ChatColor.YELLOW + gottokens + ChatColor.GRAY + " tokens!");
									return true;
								}
								if(token > gottokens){ //If they withdraw more than they have
									if(gottokens > count * 64){ //If got tokens is more than count
										ItemStack is = new ItemStack(Material.MAGMA_CREAM, (count*64));
										ItemMeta im = is.getItemMeta();
										im.setDisplayName(ChatColor.GOLD + "Acium Token");
								        ArrayList<String> Lore= new ArrayList<>();
								        Lore.clear();
								        Lore.add("" + ChatColor.GRAY + "Click to gain an extra token to");
								        Lore.add("" + ChatColor.GRAY + "your current balance " + ChatColor.YELLOW + "/token");
								        im.setLore(Lore);
								        is.setItemMeta(im);
								        p.getInventory().addItem(is);
								        p.updateInventory();
										p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You have withdrawn " + ChatColor.YELLOW +(count*64) + ChatColor.GRAY + " tokens!");
										Main.removeTokens(p, count*64);
										return true;
									}
									if(!(gottokens > count * 64)){
										ItemStack is = new ItemStack(Material.MAGMA_CREAM, (gottokens));
										ItemMeta im = is.getItemMeta();
										im.setDisplayName(ChatColor.GOLD + "Acium Token");
								        ArrayList<String> Lore= new ArrayList<>();
								        Lore.clear();
								        Lore.add("" + ChatColor.GRAY + "Click to gain an extra token to");
								        Lore.add("" + ChatColor.GRAY + "your current balance " + ChatColor.YELLOW + "/token");
								        im.setLore(Lore);
								        is.setItemMeta(im);
								        p.getInventory().addItem(is);
								        p.updateInventory();
										p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You have withdrawn " + ChatColor.YELLOW + gottokens + ChatColor.GRAY + " tokens!");
										Main.removeTokens(p, gottokens);
										return true;
									}
									else{
										ItemStack is = new ItemStack(Material.MAGMA_CREAM, (gottokens));
										ItemMeta im = is.getItemMeta();
										im.setDisplayName(ChatColor.GOLD + "Acium Token");
								        ArrayList<String> Lore= new ArrayList<>();
								        Lore.clear();
								        Lore.add("" + ChatColor.GRAY + "Click to gain an extra token to");
								        Lore.add("" + ChatColor.GRAY + "your current balance " + ChatColor.YELLOW + "/token");
								        im.setLore(Lore);
								        is.setItemMeta(im);
								        p.getInventory().addItem(is);
								        p.updateInventory();
										p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You have withdrawn " + ChatColor.YELLOW + gottokens + ChatColor.GRAY + " tokens!");
										Main.removeTokens(p, gottokens);
										return true;
									}
								}
								if(token > count * 64){
									ItemStack is = new ItemStack(Material.MAGMA_CREAM, (count*64));
									ItemMeta im = is.getItemMeta();
									im.setDisplayName(ChatColor.GOLD + "Acium Token");
							        ArrayList<String> Lore= new ArrayList<>();
							        Lore.clear();
							        Lore.add("" + ChatColor.GRAY + "Click to gain an extra token to");
							        Lore.add("" + ChatColor.GRAY + "your current balance " + ChatColor.YELLOW + "/token");
							        im.setLore(Lore);
							        is.setItemMeta(im);
							        p.getInventory().addItem(is);
							        p.updateInventory();
									p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You have withdrawn " + ChatColor.YELLOW +(count*64) + ChatColor.GRAY + " tokens!");
									Main.removeTokens(p, count*64);
									return true;
								}
								if(!(token > count * 64)){
									ItemStack is = new ItemStack(Material.MAGMA_CREAM, (token));
									ItemMeta im = is.getItemMeta();
									im.setDisplayName(ChatColor.GOLD + "Acium Token");
							        ArrayList<String> Lore= new ArrayList<>();
							        Lore.clear();
							        Lore.add("" + ChatColor.GRAY + "Click to gain an extra token to");
							        Lore.add("" + ChatColor.GRAY + "your current balance " + ChatColor.YELLOW + "/token");
							        im.setLore(Lore);
							        is.setItemMeta(im);
							        p.getInventory().addItem(is);
							        p.updateInventory();
									p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You have withdrawn " + ChatColor.YELLOW +(token) + ChatColor.GRAY + " tokens!");
									Main.removeTokens(p, token);
									return true;
								}
								else {
									p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "There was an error!");
									p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Please report this on the forums with the command you did!");
									return true;
								}
					} catch (Exception e){
					    	p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "The amount you entered is invalid!");
					    	return true;
					}
				}
				if(args[0].equalsIgnoreCase("set")){
					p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Invalid Syntax: " + ChatColor.YELLOW + "/tokens set <player> <amount>");
					return true;
				}
				if(args[0].equalsIgnoreCase("remove")){
					p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Invalid Syntax: " + ChatColor.YELLOW + "/tokens remove <player> <amount>");
					return true;
				}
				if(args[0].equalsIgnoreCase("reset")){
					Player target = Bukkit.getServer().getPlayer(args[1]);
					if(p.hasPermission("tokens.admin")){
						p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You reset " + ChatColor.YELLOW + target.getName() + "'s " + ChatColor.GRAY + "token balance to " + ChatColor.YELLOW + "0" + ChatColor.GRAY + " tokens!");
						target.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Your token balance has been updated!");
						Main.setTokens(target, 0);
						return true;
					}
					else{
						p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Not enough permissions!");
						return true;
					}
				}
				else {
	        		p.sendMessage("");
	        		p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "*** ACIUM TOKENS ***");
	        		p.sendMessage("");
	        		p.sendMessage(ChatColor.GRAY + "You currently have " + ChatColor.YELLOW + Main.getTokens(p) + ChatColor.GRAY + " tokens");
	        		p.sendMessage("");
					p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.YELLOW + "/tokens" + ChatColor.GRAY + " - Shows your current tokens");
					p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.YELLOW + "/tokens withdraw" + ChatColor.GRAY + " - Withdraw tokens to items");
					p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.YELLOW + "/tokens deposit" + ChatColor.GRAY + " - Deposit tokens into your balance");
					p.sendMessage("");
					return true;
				}
			}
			if(args.length == 3){
				if(args[0].equalsIgnoreCase("set")){
					try{
						int token = Integer.parseInt(args[2]);
						Player target = Bukkit.getServer().getPlayer(args[1]);
						if(p.hasPermission("tokens.admin")){
						if(target != null){
							p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You set " + ChatColor.YELLOW + target.getName() + "'s " + ChatColor.GRAY + "token balance to " + ChatColor.YELLOW + token + ChatColor.GRAY + " tokens!");
							target.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Your token balance has been updated!");
							Main.setTokens(target, token);
							return true;
						}
						if(target == null){
							p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "That player is offline!");
							return true;
						}
						}
						p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Not enough permissions!");
					} catch (Exception e){
					    	p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "The amount you entered is invalid!");
					    	return true;
					}
				}
				if(args[0].equalsIgnoreCase("remove")){
					try{
						int token = Integer.parseInt(args[2]);
						Player target = Bukkit.getServer().getPlayer(args[1]);
						if(p.hasPermission("tokens.admin")){
						if(target != null){
							if(token >= Main.getTokens(target)){
								p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You took " + ChatColor.YELLOW + Main.getTokens(target) + ChatColor.GRAY + " tokens from " + ChatColor.YELLOW + target.getName());
								target.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Your token balance has been updated!");
								Main.setTokens(target, 0);
								return true;
							}
							p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You took " + ChatColor.YELLOW + token + ChatColor.GRAY + " tokens from " + ChatColor.YELLOW + target.getName());
							target.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Your token balance has been updated!");
							Main.removeTokens(target, token);
							return true;
						}
						
						if(target == null){
							p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "That player is offline!");
							return true;
						}
						}
						p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Not enough permissions!");
					} catch (Exception e){
					    	p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "The amount you entered is invalid!");
					    	return true;
					}
					}
				else {
	        		p.sendMessage("");
	        		p.sendMessage("" +ChatColor.YELLOW + ChatColor.BOLD + "*** ACIUM TOKENS ***");
	        		p.sendMessage("");
	        		p.sendMessage(ChatColor.GRAY + "You currently have " + ChatColor.YELLOW + Main.getTokens(p) + ChatColor.GRAY + " tokens");
	        		p.sendMessage("");
					p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.YELLOW + "/tokens" + ChatColor.GRAY + " - Shows your current tokens");
					p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.YELLOW + "/tokens withdraw" + ChatColor.GRAY + " - Withdraw tokens to items");
					p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.YELLOW + "/tokens deposit" + ChatColor.GRAY + " - Deposit tokens into your balance");
					p.sendMessage("");
					return true;
				}
			}
		}
		return false;
	}
	

}
