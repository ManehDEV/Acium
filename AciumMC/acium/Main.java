package dev.mannyyy.acium;

import org.bukkit.Bukkit;
import org.bukkit.plugin.RegisteredServiceProvider;
import org.bukkit.plugin.java.JavaPlugin;

import dev.mannyyy.acium.Commands.Alert;
import dev.mannyyy.acium.Commands.Balance;
import dev.mannyyy.acium.Commands.Ranks;
import dev.mannyyy.acium.Commands.Rankup;
import dev.mannyyy.acium.Commands.Sell;
import dev.mannyyy.acium.Commands.Store;
import dev.mannyyy.acium.Listeners.ServerPing;
import dev.mannyyy.acium.Listeners.WeatherChange;
import net.milkbowl.vault.economy.Economy;

public class Main extends JavaPlugin{
	
	public Economy econ = null;
	
	static Main plugin;
	
	public void onEnable(){
		plugin = this;
		if (!setupEconomy() ) {
            getLogger().severe(String.format("[%s] - Disabled due to no Vault dependency found!", getDescription().getName()));
            getServer().getPluginManager().disablePlugin(this);
            return;
        }
		Bukkit.getLogger().info("[ACIUM DEVELOPMENT] Core has been enabled successfully.");
		getCommand("buy").setExecutor(new Store());
		getCommand("buycraftbroadcast").setExecutor(new Alert());
		getCommand("broadcast").setExecutor(new Alert());
		getCommand("sellall").setExecutor(new Sell());
		getCommand("rankup").setExecutor(new Rankup());
		getCommand("ranks").setExecutor(new Ranks());
		getCommand("balance").setExecutor(new Balance());
		getServer().getPluginManager().registerEvents(new WeatherChange(), this);
		getServer().getPluginManager().registerEvents(new ServerPing(), this);
		getConfig().options().copyDefaults(true);
		saveConfig();
		config();
	}
	public static Main getPlugin(){
		return plugin;
	}
	private boolean setupEconomy() {
        if (getServer().getPluginManager().getPlugin("Vault") == null) {
            return false;
        }
        RegisteredServiceProvider<Economy> rsp = getServer().getServicesManager().getRegistration(Economy.class);
        if (rsp == null) {
            return false;
        }
        econ = rsp.getProvider();
        return econ != null;
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

}
