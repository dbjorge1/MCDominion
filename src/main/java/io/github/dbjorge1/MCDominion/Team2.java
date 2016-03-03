package io.github.dbjorge1.MCDominion;

import java.util.ArrayList;

import org.bukkit.entity.Player;

public class Team2{
	private int numOfPlayers;
	private int kills;
	private int deaths;
	private ArrayList <Player> players;
	

	public Team2(){
		setPlayerCap(5);
		
	}
	
	public void setPlayerCap(int e){
		players = new ArrayList<Player>(e);
	}
	
	public void addPlayer(Player player) {
		players.add(player);
		numOfPlayers++;
		
	}
	
	public void removePlayer(String pName){
		for(int i=0;i<players.size();i++){
			if(players.get(i).getName().equalsIgnoreCase(pName)){
				players.remove(i);
			}
		}
	}
}