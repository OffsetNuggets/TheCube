package Bigs.BigsEntertainment.TheCube;

import java.lang.reflect.Field;

import org.bukkit.plugin.java.JavaPlugin;

import Bigs.BigsEntertainment.TheCube.config.Configuration;

public class TheCube extends JavaPlugin {
	
	private static TheCube instance;
	
	public void onEnable() {
		instance = this;
		Configuration.init();
	}
	
	public void onDisable() {
		instance = null;
	}
	
	public static TheCube getInstance() {
		return instance;
	}

}
