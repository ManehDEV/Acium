package dev.mannyyy.acium.Listeners;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.Sign;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.SignChangeEvent;
import org.bukkit.event.player.PlayerInteractEvent;

import dev.mannyyy.aciumtokens.Main;

public class SignChange implements Listener{
	
	@EventHandler
	public void signChange(SignChangeEvent e){
		Player p = e.getPlayer();
		if(e.getLine(0).contains("![AciumEnchant]!")){
			if(p.hasPermission("tokens.admin")){
			if(e.getLine(1).contains("Fortune")){
					e.setLine(0, ChatColor.BLUE + "[AciumEnchant]");
					e.setLine(1, "Right Click");
					e.setLine(2, ChatColor.RED +"Fortune");
			}
			if(e.getLine(1).contains("Efficiency")){
				e.setLine(0, ChatColor.BLUE + "[AciumEnchant]");
				e.setLine(1, "Right Click");
				e.setLine(2, ChatColor.RED +"Efficiency");
			}
			if(e.getLine(1).contains("Unbreaking")){
				e.setLine(0, ChatColor.BLUE + "[AciumEnchant]");
				e.setLine(1, "Right Click");
				e.setLine(2, ChatColor.RED +"Unbreaking");
			}
		}
	}
	}
	
	@EventHandler
	public void signClick(PlayerInteractEvent e){
		if(e.getClickedBlock().getState() instanceof Sign){
			if(e.getAction() == Action.RIGHT_CLICK_BLOCK){
				Sign s = (Sign) e.getClickedBlock().getState();
				if(s.getLine(0).contains("[AciumEnchant]")){
					if(s.getLocation().getWorld().getName().equals("spawnmap")){
						if(s.getLine(2).contains("Fortune")){
							if(Main.getTokens(e.getPlayer()) >= 1000){
								if(e.getPlayer().getItemInHand() != null){
								if(e.getPlayer().getItemInHand().getType() == Material.WOOD_PICKAXE ||
								   e.getPlayer().getItemInHand().getType() == Material.STONE_PICKAXE ||
								   e.getPlayer().getItemInHand().getType() == Material.IRON_PICKAXE ||
								   e.getPlayer().getItemInHand().getType() == Material.GOLD_PICKAXE ||
								   e.getPlayer().getItemInHand().getType() == Material.DIAMOND_PICKAXE){
									e.getPlayer().getItemInHand().addUnsafeEnchantment(Enchantment.LOOT_BONUS_BLOCKS, e.getPlayer().getItemInHand().getEnchantmentLevel(Enchantment.LOOT_BONUS_BLOCKS) +1);
									e.getPlayer().sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Your " + ChatColor.YELLOW + "Fortune " +ChatColor.GRAY +"level has been upgraded to " + ChatColor.YELLOW + e.getPlayer().getItemInHand().getEnchantmentLevel(Enchantment.LOOT_BONUS_BLOCKS) + ChatColor.GRAY + "!");
									Main.removeTokens(e.getPlayer(), 1000);
									return;
								}
								e.getPlayer().sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You must be holding a pickaxe to do this!");
								return;
							}
						}
							e.getPlayer().sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You don't have enough tokens! You need " + ChatColor.YELLOW + (1000 -Main.getTokens(e.getPlayer())) + ChatColor.GRAY + " more!");
							return;
					}
						if(s.getLine(2).contains("Efficiency")){
							if(Main.getTokens(e.getPlayer()) >= 750){
								if(e.getPlayer().getItemInHand() != null){
								if(e.getPlayer().getItemInHand().getType() == Material.WOOD_PICKAXE ||
								   e.getPlayer().getItemInHand().getType() == Material.STONE_PICKAXE ||
								   e.getPlayer().getItemInHand().getType() == Material.IRON_PICKAXE ||
								   e.getPlayer().getItemInHand().getType() == Material.GOLD_PICKAXE ||
								   e.getPlayer().getItemInHand().getType() == Material.DIAMOND_PICKAXE){
									e.getPlayer().getItemInHand().addUnsafeEnchantment(Enchantment.LOOT_BONUS_BLOCKS, e.getPlayer().getItemInHand().getEnchantmentLevel(Enchantment.DIG_SPEED) +1);
									e.getPlayer().sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Your " + ChatColor.YELLOW + "Efficiency " +ChatColor.GRAY +"level has been upgraded to " + ChatColor.YELLOW + e.getPlayer().getItemInHand().getEnchantmentLevel(Enchantment.DIG_SPEED) + ChatColor.GRAY + "!");
									Main.removeTokens(e.getPlayer(), 750);
									return;
								}
								e.getPlayer().sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You must be holding a pickaxe to do this!");
								return;
							}
						}
							e.getPlayer().sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You don't have enough tokens! You need " + ChatColor.YELLOW + (750 -Main.getTokens(e.getPlayer())) + ChatColor.GRAY + " more!");
							return;
					}
						if(s.getLine(2).contains("Unbreaking")){
							if(Main.getTokens(e.getPlayer()) >= 500){
								if(e.getPlayer().getItemInHand() != null){
								if(e.getPlayer().getItemInHand().getType() == Material.WOOD_PICKAXE ||
								   e.getPlayer().getItemInHand().getType() == Material.STONE_PICKAXE ||
								   e.getPlayer().getItemInHand().getType() == Material.IRON_PICKAXE ||
								   e.getPlayer().getItemInHand().getType() == Material.GOLD_PICKAXE ||
								   e.getPlayer().getItemInHand().getType() == Material.DIAMOND_PICKAXE){
									e.getPlayer().getItemInHand().addUnsafeEnchantment(Enchantment.LOOT_BONUS_BLOCKS, e.getPlayer().getItemInHand().getEnchantmentLevel(Enchantment.DURABILITY) +1);
									e.getPlayer().sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "Your " + ChatColor.YELLOW + "Unbreaking " +ChatColor.GRAY +"level has been upgraded to " + ChatColor.YELLOW + e.getPlayer().getItemInHand().getEnchantmentLevel(Enchantment.DURABILITY) + ChatColor.GRAY + "!");
									Main.removeTokens(e.getPlayer(), 500);
									return;
								}
								e.getPlayer().sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You must be holding a pickaxe to do this!");
								return;
							}
						}
							e.getPlayer().sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You don't have enough tokens! You need " + ChatColor.YELLOW + (500 -Main.getTokens(e.getPlayer())) + ChatColor.GRAY + " more!");
							return;
					}
				}
			}
		}
	}
}

}
