package io.github.dbjorge1.MCDominion;

import org.bukkit.entity.Player;

public class TeamMember {

	private Player player;
	private Team team;
	
	  public TeamMember(Player p) {
			this.player = p;
		}


	  public TeamMember(Player p, Team t){
	    this.player = p;
	  
	  }

	
	public Player getPlayer(){
	    return this.player;
	  }
	  
	public Team getTeam(){
		  return this.team;  
	  }


	public void setTeam(Team t) {
		this.team = t;
		
	}
	

}
