package Bigs.BigsEntertainment.TheCube.config;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Material;

public class Configuration extends SimpleConfig {

	private Configuration(String fileName) {
		super(fileName);

		setHeader(new String[] {
				"--------------------------------------------------------",
				" Your configuration file got updated automatically!",
				" ",
				" Unfortunately, due to how Bukkit saves .yml files,",
				" all comments in your file were lost. Please open",
				" " + fileName + " directly to browse the default values.",
				"--------------------------------------------------------"
		});
	}

	public static String WIN_MESSAGE;

	private void onLoad() {
		WIN_MESSAGE = getString("Winmsg");
	}

	// End of added

	public static void init() {
		new Configuration("Configuration.yml").onLoad();
	}
}
