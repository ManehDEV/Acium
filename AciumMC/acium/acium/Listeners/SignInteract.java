package dev.mannyyy.acium.Listeners;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.Sign;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

import dev.mannyyy.aciumtokens.Main;

public class SignInteract implements Listener{
	
	@EventHandler
	public void signClick(PlayerInteractEvent e){
		Player p = (Player) e.getPlayer();
		if(e.getClickedBlock().getState() instanceof Sign){
			if(e.getAction() == Action.RIGHT_CLICK_BLOCK || e.getAction() == Action.RIGHT_CLICK_AIR || e.getAction() == Action.PHYSICAL){
				Sign s = (Sign) e.getClickedBlock().getState();
				if(s.getLine(0).contains("[AciumEnchant]")){
					if(s.getLocation().getWorld().getName().equals("spawnmap")){
						if(s.getLine(2).contains("Fortune")){
							if(p.getItemInHand() != null ){
								if(p.getItemInHand().getType() == Material.WOOD_PICKAXE ||
										   p.getItemInHand().getType() == Material.STONE_PICKAXE ||
										   p.getItemInHand().getType() == Material.IRON_PICKAXE ||
										   p.getItemInHand().getType() == Material.GOLD_PICKAXE ||
										   p.getItemInHand().getType() == Material.DIAMOND_PICKAXE){
							if(Main.getTokens(p) >= 5000){
									p.getItemInHand().addUnsafeEnchantment(Enchantment.LOOT_BONUS_BLOCKS, p.getItemInHand().getEnchantmentLevel(Enchantment.LOOT_BONUS_BLOCKS) +1);
									p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Your " + ChatColor.YELLOW + "Fortune " +ChatColor.GRAY +"level has been upgraded to " + ChatColor.YELLOW + p.getItemInHand().getEnchantmentLevel(Enchantment.LOOT_BONUS_BLOCKS) + ChatColor.GRAY + "!");
									Main.removeTokens(p, 5000);
									return;
								}
								p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You don't have enough tokens! You need " + ChatColor.YELLOW + (5000 -Main.getTokens(p)) + ChatColor.GRAY + " more!");
								return;
							}
								p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You must be holding a pickaxe to do this!");
								return;
						}
							p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You must be holding a pickaxe to do this!");
							return;
					}
						if(s.getLine(2).contains("Efficiency")){
							if(p.getItemInHand() != null){
								if(p.getItemInHand().getType() == Material.WOOD_PICKAXE ||
										   p.getItemInHand().getType() == Material.STONE_PICKAXE ||
										   p.getItemInHand().getType() == Material.IRON_PICKAXE ||
										   p.getItemInHand().getType() == Material.GOLD_PICKAXE ||
										   p.getItemInHand().getType() == Material.DIAMOND_PICKAXE){
							if(Main.getTokens(p) >= 2500){
									p.getItemInHand().addUnsafeEnchantment(Enchantment.DIG_SPEED, p.getItemInHand().getEnchantmentLevel(Enchantment.DIG_SPEED) +1);
									p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Your " + ChatColor.YELLOW + "Efficiency " +ChatColor.GRAY +"level has been upgraded to " + ChatColor.YELLOW + p.getItemInHand().getEnchantmentLevel(Enchantment.DIG_SPEED) + ChatColor.GRAY + "!");
									Main.removeTokens(p, 2500);
									return;
								}
								p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You don't have enough tokens! You need " + ChatColor.YELLOW + (2500 -Main.getTokens(p)) + ChatColor.GRAY + " more!");
								return;
							}
								p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You must be holding a pickaxe to do this!");
								return;
						}
							p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You must be holding a pickaxe to do this!");
							return;
							
					}
						if(s.getLine(2).contains("Unbreaking")){
							if(p.getItemInHand() != null){
								if(p.getItemInHand().getType() == Material.WOOD_PICKAXE ||
										   p.getItemInHand().getType() == Material.STONE_PICKAXE ||
										   p.getItemInHand().getType() == Material.IRON_PICKAXE ||
										   p.getItemInHand().getType() == Material.GOLD_PICKAXE ||
										   p.getItemInHand().getType() == Material.DIAMOND_PICKAXE){
							if(Main.getTokens(p) >= 1000){
									p.getItemInHand().addUnsafeEnchantment(Enchantment.DURABILITY, p.getItemInHand().getEnchantmentLevel(Enchantment.DURABILITY) +1);
									p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Your " + ChatColor.YELLOW + "Unbreaking " +ChatColor.GRAY +"level has been upgraded to " + ChatColor.YELLOW + p.getItemInHand().getEnchantmentLevel(Enchantment.DURABILITY) + ChatColor.GRAY + "!");
									Main.removeTokens(p, 1000);
									return;
								}
								p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You don't have enough tokens! You need " + ChatColor.YELLOW + (1000 -Main.getTokens(p)) + ChatColor.GRAY + " more!");
								return;
							}
								p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You must be holding a pickaxe to do this!");
								return;
						}
							p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You must be holding a pickaxe to do this!");
							return;
						}
			}
		}
		}
	}
}

}
