package fpackage;

import java.util.ArrayList;

public class Squad {
	
	int MAX_SIZE = 15;
	int totalSquadPoints = 0;
	int actualNumOfPlayers = 0;
	
	ArrayList <Player> squad = new ArrayList<Player>(MAX_SIZE);

	public int calcPoints()
	{
		totalSquadPoints = 0;
		for(int i=0; i<actualNumOfPlayers ;i++)
			totalSquadPoints+=squad.get(i).getPoints();
		return totalSquadPoints;
	}

	public boolean isFull()
	{
		if(actualNumOfPlayers<MAX_SIZE)
			return false;
		return true;
	}
	
	public void AddPLayerToSquad(Player player)
	{
		if(!isFull())
		{
			squad.add(player);
			actualNumOfPlayers++;
		}
		else
			System.out.println("Your squad is full!..");
	}
	
	public int getNumOfPlayersInSquad()
	{
		return actualNumOfPlayers;
	}
	
}
