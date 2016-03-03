package io.github.dbjorge1.MCDominion;

import java.util.ArrayList;

import org.bukkit.entity.Player;

public class Team {

	private TeamMember tm;
	private int numOfPlayers;
	private int kills;
	private int deaths;
	private ArrayList <TeamMember> players;
	
	
		
	
	public Team(){
		setPlayerCap(5);
		
	}
	
	public void setPlayerCap(int e){
		players = new ArrayList<>(e);
	}
	
	public void addPlayer(TeamMember tm) {
		players.add(tm);
		numOfPlayers++;
		tm.setTeam(this);
		
	}
	
	public void removePlayer(String pName){
		for(int i=0;i<players.size();i++){
			if(players.get(i).getPlayer().getName().equalsIgnoreCase(pName)){
				players.remove(i);
			}
		}
	}
}
