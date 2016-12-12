package dev.mannyyy.acium.Utils;

import org.bukkit.entity.Player;

import dev.mannyyy.aciumtokens.Main;
import me.clip.placeholderapi.external.EZPlaceholderHook;

public class Placeholders extends EZPlaceholderHook{
	
	
	public Placeholders(Main m){
		super(m, "tokens");
	}

	@Override
	public String onPlaceholderRequest(Player p, String indentifier) {
		if(indentifier.equals("tokens_count")){
			return String.valueOf(Main.getTokens(p));
		}
		return null;
	}
}
