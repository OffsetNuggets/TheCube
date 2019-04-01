package Bigs.BigsEntertainment.TheCube;

import org.bukkit.plugin.java.JavaPlugin;

import Bigs.BigsEntertainment.TheCube.config.Configuration;
import Bigs.BigsEntertainment.TheCube.events.RightClick;

public class TheCube extends JavaPlugin {
	
	private static TheCube instance;
	
	public void onEnable() {
		instance = this;
		Configuration.init();
		getServer().getPluginManager().registerEvents(new RightClick(), this);
	}
	
	public void onDisable() {
		instance = null;
	}
	
	public static TheCube getInstance() {
		return instance;
	}

}
