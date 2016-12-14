package dev.mannyyy.acium.Listeners;

import java.util.ArrayList;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import dev.mannyyy.aciumtokens.Main;
public class Click implements Listener{
	
	@SuppressWarnings("deprecation")
	@EventHandler
	public void onClick(PlayerInteractEvent e){
		Player p = e.getPlayer();
		if(e.getAction() == Action.RIGHT_CLICK_AIR || e.getAction() == Action.RIGHT_CLICK_BLOCK){
		if(p.getItemInHand() != null){
		if(p.getItemInHand().getType() == Material.MAGMA_CREAM){
		if(p.getItemInHand().hasItemMeta()){
		if(p.getItemInHand().getItemMeta().getDisplayName().contains("Acium Token")){
		try{
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
				return;
		    }
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
		        p.updateInventory();
				p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "You have deposited " + ChatColor.YELLOW + count + ChatColor.GRAY + " tokens!");
				Main.addTokens(p, count);
				return;
		} catch (Exception e1){
		    	p.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "(!) " + ChatColor.GRAY + "The amount you entered is invalid!");
		    	return;
		}
		}
		}
		}
		}
		}
	}

}
