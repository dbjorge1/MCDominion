package io.github.dbjorge1.MCDominion;



import java.io.File;
import java.io.IOException;
import java.util.List;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginLogger;
import org.bukkit.plugin.java.JavaPlugin;

import io.github.dbjorge1.MCDominion.Team1;
import io.github.dbjorge1.MCDominion.Team2;



public final class MCDominion extends JavaPlugin {

	CapturePoint cp;
	Team1 t1 = new Team1();
	Team2 t2 = new Team2();
	
	Plugin plugin = getProvidingPlugin(this.getClass());
	@Override
    public void onEnable() {
		getLogger().info("onEnable has been invoked!");
		getServer().getPluginManager().registerEvents(new PlayerListener(), this);
    }
    
    

	@Override
    public void onDisable() {
        
    }
    
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
    	if (cmd.getName().equalsIgnoreCase("addPlayer")) { 
    		if (args.length != 2){
    			sender.sendMessage("Incorrect amount of args, usage: /addPlayer <playerName><team>");
    		}
    		if (!(sender instanceof Player)) {
    			sender.sendMessage("This command can only be run by a player.");
    		} else {
    			Player player = (Player) sender;
    			if(args[1].equalsIgnoreCase("team1")){
    				t1.addPlayer(player);
    			} else if(args[1].equalsIgnoreCase("team2")){
    				t2.addPlayer(player);
    			} else{
    				player.sendMessage("Wrong team argument, choose <team1> or <team2>");
    			}
    		}
    		return true;
    		
    	}else if (cmd.getName().equalsIgnoreCase("removePlayer")) {
    		if (args.length != 2){
    			sender.sendMessage("Incorrect amount of args, usage: /removePlayer <name><team>");
    		}
    		if (!(sender instanceof Player)) {
    			sender.sendMessage("This command can only be run by a player.");
    		} else {
    			Player player = (Player) sender;
    			if(args[1].equalsIgnoreCase("team1")){t1.removePlayer(args[0]);}
    			else if(args[1].equalsIgnoreCase("team2")){t2.removePlayer(args[0]);}
    			else{player.sendMessage("Wrong name or team, <name> | <team1> or <team2>");}
    		}
    		return true;
    	} 
    	else if (cmd.getName().equalsIgnoreCase("setCapturePoint")) {
    		if (args.length != 2){
    			sender.sendMessage("Incorrect amount of args, usage: /setCapturePoint <size>");
    		}
    		if (!(sender instanceof Player)) {
    			sender.sendMessage("This command can only be run by a player.");
    		} else {
    			Player player = (Player) sender;
    			CapturePoint cp = new CapturePoint(args[0], args[1], player.getLocation());
    		}
    		return true;
    	} 
    	return false;
    }
    
    	
    
    public void setCapturePoint(Player player){
    	Location loc = player.getLocation();
    	loc.setY(loc.getY()-1);
    	
    }
    @EventHandler
    public void onLogin(){
    	
    	
    }



    public void saveInventory(Player p) throws IOException {
        File f = new File(plugin.getDataFolder().getAbsolutePath(), p.getName() + ".yml");
        FileConfiguration c = YamlConfiguration.loadConfiguration(f);
        c.set("inventory.armor", p.getInventory().getArmorContents());
        c.set("inventory.content", p.getInventory().getContents());
        c.save(f);
    }

    @SuppressWarnings("unchecked")
    public void restoreInventory(Player p) throws IOException {
        File f = new File(plugin.getDataFolder().getAbsolutePath(), p.getName() + ".yml");
        FileConfiguration c = YamlConfiguration.loadConfiguration(f);
        ItemStack[] content = ((List<ItemStack>) c.get("inventory.armor")).toArray(new ItemStack[0]);
        p.getInventory().setArmorContents(content);
        content = ((List<ItemStack>) c.get("inventory.content")).toArray(new ItemStack[0]);
        p.getInventory().setContents(content);
    }
    
    public void setKnight(Player player) throws IOException{
		this.saveInventory(player);
		Inventory inv = player.getInventory();
		ItemStack sword = new ItemStack(Material.IRON_SWORD);
		ItemStack pick = new ItemStack(Material.IRON_PICKAXE);
		ItemStack helm = new ItemStack(Material.IRON_HELMET);
		ItemStack cPlate = new ItemStack(Material.IRON_CHESTPLATE);
		ItemStack leg = new ItemStack(Material.IRON_LEGGINGS);
		ItemStack boots = new ItemStack(Material.IRON_BOOTS);
		inv.setItem(103, helm);
		inv.setItem(102, cPlate);
		inv.setItem(101, leg);
		inv.setItem(100, boots);
		inv.addItem(sword, pick);
	}
	
	public void setBrawler(Player player){
		
	}
	
	public void setTank(Player player){
		
	}
	
	public void setArcher(Player player){
		
	}
	
	
    
	
}

