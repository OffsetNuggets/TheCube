package Bigs.BigsEntertainment.TheCube.events;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class RightClick implements Listener {
	
	@EventHandler
	public void onClick(PlayerInteractEvent e) {
		Player p = e.getPlayer();
		Action a = e.getAction();
		if (a == Action.RIGHT_CLICK_BLOCK) {
			Block b = p.getEyeLocation().add(p.getEyeLocation().getDirection()).getBlock();
			if (b.getType().equals(Material.GOLD_BLOCK)) {
				for (BlockFace blockface : BlockFace.values()) {
		            if (b.getRelative(blockface).getType() == Material.IRON_BLOCK) {
		                    Bukkit.broadcastMessage("true");
		            } else {
		            	Bukkit.broadcastMessage("false");
		            }
				}
			} else {
				Bukkit.broadcastMessage("Not gold block");
			}
		} else {
		Bukkit.broadcastMessage("Not a right click");
		}
	}
	
}
