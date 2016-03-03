package io.github.dbjorge1.MCDominion;

import org.bukkit.entity.Player;

public class TeamMember {

	private Player player;

	  public TeamMember(Player p){
	    this.player = p;
	  }

	  public Player getPlayer(){
	    return this.player;
	  }
}
