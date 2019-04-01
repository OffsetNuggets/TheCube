package Bigs.BigsEntertainment.TheCube.events;

import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class RightClick implements Listener {
	
	public void onClick(PlayerInteractEvent e) {
		Player p = e.getPlayer();
		Action a = e.getAction();
		if (a == Action.RIGHT_CLICK_BLOCK) {
			Block b = p.getEyeLocation().add(p.getEyeLocation().getDirection()).getBlock();
			if (b.getType().equals("GOLD_BLOCK")) {
				
			}
		}
	}
	
}
