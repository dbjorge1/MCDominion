package io.github.dbjorge1.MCDominion;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.world.WorldEvent;

public class CapturePoint {

	private static Block captureBlock;
	private int x,y,z;
	private Block[] blocks;
	private int points;
	private boolean isCaptured;
	private double pointState;
	private String size;
	private Location loc;
	public Block[] getBlocks() {
		return blocks;
	}
	public void setBlocks(Block[] blocks) {
		this.blocks = blocks;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	public boolean isCaptured() {
		return isCaptured;
	}
	public void setCaptured(boolean isCaptured) {
		this.isCaptured = isCaptured;
	}
	public double getPointState() {
		return pointState;
	}
	public String getSize(){
		return size;
	}
	public CapturePoint(String size, String team, Location loc) {
		this.loc = loc;
		if(size.equalsIgnoreCase("small")){
			blocks = new Block[7];
			x = loc.getBlockX();
			y = loc.getBlockY();
			z = loc.getBlockZ();
			blocks[0] = loc.getWorld().getBlockAt(x+1, y, z);
			blocks[0].setType(Material.BEDROCK);
			blocks[1] = loc.getWorld().getBlockAt(x-1, y, z);
			blocks[1].setType(Material.BEDROCK);
			blocks[2] = loc.getWorld().getBlockAt(x, y+1, z);
			blocks[2].setType(Material.BEDROCK);
			blocks[3] = loc.getWorld().getBlockAt(x, y-1, z);
			blocks[3].setType(Material.BEDROCK);
			for(int i=0;i<2;i++){
				Block cb = loc.getWorld().getBlockAt(x, y, z+i);
				cb.setType(Material.BEDROCK);
			}
			blocks[6].setType(Material.OBSIDIAN);
			captureBlock = blocks[6];
			if(captureBlock.isEmpty()){
				
			}
			}
		else if(size.equalsIgnoreCase("medium")){
			blocks = new Block[10];
			x = loc.getBlockX();
			y = loc.getBlockY();
			z = loc.getBlockZ();
			blocks[0] = loc.getWorld().getBlockAt(x+1, y, z);
			blocks[0].setType(Material.DIAMOND_BLOCK);
			blocks[1] = loc.getWorld().getBlockAt(x-1, y, z);
			blocks[1].setType(Material.DIAMOND_BLOCK);
			blocks[2] = loc.getWorld().getBlockAt(x, y+1, z);
			blocks[2].setType(Material.DIAMOND_BLOCK);
			blocks[3] = loc.getWorld().getBlockAt(x, y-1, z);
			blocks[3].setType(Material.DIAMOND_BLOCK);
			for(int i=0;i<6;i++){
				Block cb = loc.getWorld().getBlockAt(x, y, z+i);
				cb.setType(Material.DIAMOND_BLOCK);
			}
		}
		else if(size.equalsIgnoreCase("large")){
			blocks = new Block[15];
			x = loc.getBlockX();
			y = loc.getBlockY();
			z = loc.getBlockZ();
			blocks[0] = loc.getWorld().getBlockAt(x+1, y, z);
			blocks[0].setType(Material.DIAMOND_BLOCK);
			blocks[1] = loc.getWorld().getBlockAt(x-1, y, z);
			blocks[1].setType(Material.DIAMOND_BLOCK);
			blocks[2] = loc.getWorld().getBlockAt(x, y+1, z);
			blocks[2].setType(Material.DIAMOND_BLOCK);
			blocks[3] = loc.getWorld().getBlockAt(x, y-1, z);
			blocks[3].setType(Material.DIAMOND_BLOCK);
			for(int i=0;i<11;i++){
				Block cb = loc.getWorld().getBlockAt(x, y, z+i);
				cb.setType(Material.DIAMOND_BLOCK);
			}
		}
		
		}
	public static Block getCaptureBlock() {
		return captureBlock;
	}
	public void setCaptureBlockMaterial(Material material) {
		captureBlock.setType(material);
	}
	
	
	
		
		
	
	
	
}
