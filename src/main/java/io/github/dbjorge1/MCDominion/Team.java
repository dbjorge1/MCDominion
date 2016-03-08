package io.github.dbjorge1.MCDominion;

import java.util.ArrayList;

import org.bukkit.entity.Player;

public class Team {

	private String teamName;
	private TeamMember tm;
	private int numOfPlayers;
	private int kills;
	private int deaths;
	private ArrayList <TeamMember> players;
	
	
		
	
	public Team(){
		this.teamName = teamName;
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
	


	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((teamName == null) ? 0 : teamName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Team other = (Team) obj;
		if (teamName == null) {
			if (other.teamName != null)
				return false;
		} else if (!teamName.equals(other.teamName))
			return false;
		return true;
	}
}

