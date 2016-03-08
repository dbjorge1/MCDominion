package io.github.dbjorge1.MCDominion;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Server;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class BlockListener implements Listener {
	
	CapturePoint cp;
	TeamMember tm;

	@EventHandler
	public void capturingPoint(BlockBreakEvent event) {
		Player p = event.getPlayer();
		tm = new TeamMember(p);
		
			
 		if(event.getBlock() == CapturePoint.getCaptureBlock()){
 			if(tm.getTeam().equals(this)){
 				cp.setCaptureBlockMaterial(Material.GOLD_BLOCK);
 				Bukkit.broadcastMessage(ChatColor.RED + p.getName() + " has captured a point "
 						+ "for team 1");
 	 		} else if(tm.getTeam().equals(this)){
 	 			cp.setCaptureBlockMaterial(Material.DIAMOND_BLOCK);
 	 			Bukkit.broadcastMessage(ChatColor.RED + p.getName() + " has captured a point "
 						+ "for team: 2");
 	 		}
 			else{
 				event.setCancelled(true);
 			}
			}
		
 		
        // Some code here
    }
	
	
	
}
