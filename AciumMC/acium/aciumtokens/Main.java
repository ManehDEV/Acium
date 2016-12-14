package dev.mannyyy.aciumtokens;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import dev.mannyyy.acium.Commands.Tokens;
import dev.mannyyy.acium.Listeners.Click;
import dev.mannyyy.acium.Listeners.PlayerJoin;
import dev.mannyyy.acium.Listeners.SignChange;
import dev.mannyyy.acium.Listeners.SignInteract;
import dev.mannyyy.acium.Utils.Placeholders;

public class Main extends JavaPlugin{
	static Main plugin;
	
	public void onEnable(){
		if(Bukkit.getPluginManager().isPluginEnabled("PlaceholderAPI")){
			new Placeholders(this).hook();
		}
		plugin = this;
		Bukkit.getLogger().info("[ACIUM TOKENS] Core has been enabled successfully.");
		getCommand("tokens").setExecutor(new Tokens());
		getServer().getPluginManager().registerEvents(new PlayerJoin(), this);
		getServer().getPluginManager().registerEvents(new Click(), this);
		getServer().getPluginManager().registerEvents(new SignChange(), this);
		getServer().getPluginManager().registerEvents(new SignInteract(), this);
		getConfig().options().copyDefaults(true);
		config();
	}
	public static Main getPlugin(){
		return plugin;
	}
	private void config(){
		Bukkit.getScheduler().scheduleSyncRepeatingTask(this, new Runnable()
		{
			public void run()
			{
				reloadConfig();
			}
		}, 0, 20L);
	}
	public static int getTokens(Player p){
		return Main.getPlugin().getConfig().getInt("Tokens." + p.getName() + ".Balance");
	}
	
	public static void setTokens(Player p, int s){
		Main.getPlugin().getConfig().set("Tokens." + p.getName() + ".Balance", s);
		Main.getPlugin().saveConfig();
	}
	
	public static void removeTokens(Player p, int s){
		Main.getPlugin().getConfig().set("Tokens." + p.getName() + ".Balance", Main.getPlugin().getConfig().getInt("Tokens." + p.getName() + ".Balance") - s);
		Main.getPlugin().saveConfig();
	}
	public static void addTokens(Player p, int s) {
		Main.getPlugin().getConfig().set("Tokens." + p.getName() + ".Balance", Main.getPlugin().getConfig().getInt("Tokens." + p.getName() + ".Balance") + s);
		Main.getPlugin().saveConfig();
	}



}
