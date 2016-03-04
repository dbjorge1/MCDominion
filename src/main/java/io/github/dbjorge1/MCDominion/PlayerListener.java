package io.github.dbjorge1.MCDominion;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.player.PlayerEggThrowEvent;
import org.bukkit.event.player.PlayerLoginEvent;
import org.bukkit.plugin.Plugin;

import io.github.dbjorge1.MCDominion.Team;


public class PlayerListener implements Listener {
	
	
	
	
	@EventHandler
	public void eggThrow(PlayerEggThrowEvent e){
		Player p = e.getPlayer();
		e.setNumHatches((byte) 40);
		//p.getWorld().strikeLightning(p.getLocation());
		//p.sendMessage(ChatColor.RED +"THROW ANOTHER EGG AND I WILL FUCKING HANG YOU BY YOUR ENTRAILS");
		
	}

/*
	CapturePoint point = MCDominion.getCapturePoint();
 	@EventHandler
    public void normalLogin(PlayerLoginEvent event) {
        // Some code here
    }

    @EventHandler(priority = EventPriority.HIGH)
    public void highLogin(PlayerLoginEvent event) {
        // Some code here
    }
    

 	@EventHandler
    public void capturingPoint(BlockBreakEvent event) {
 		if(event.getBlock() == CapturePoint.getCaptureBlock()){
 			if(event.getPlayer() instanceof Team1){
 				point.setCaptureBlockMaterial(Material.GOLD_BLOCK);
 	 		}
 			else{
 				point.setCaptureBlockMaterial(Material.OBSIDIAN);
 			}
			}
 		
        // Some code here
    }

    @EventHandler(priority = EventPriority.HIGH)
    public void capturingPointHigh(PlayerLoginEvent event) {
        // Some code here
    }
    */
}
