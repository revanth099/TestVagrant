package com.classes;


import java.util.List;
import com.pojo.PlayersPojo;
import com.pojo.TeamPojo;

/**
 * 
 * @author Revanth Kumar
 * 
 *  The purpose of the class is to extract and return the data
 *  from the JSON based upon the test case requirement.
 */
public class ValidationHelper {
	TeamInfo teamInfo;
	TeamPojo teamDetails;

	public ValidationHelper(String filePath) {
		teamInfo = new TeamInfo();
		teamDetails = teamInfo.readData(filePath);
		
	}
	
	public int getForeignPlayersCount() {
		
		List<PlayersPojo> players = teamDetails.getPlayer(); 
		int foreignPlayers=0;
		for(PlayersPojo player :players) {
			if(!player.getCountry().equalsIgnoreCase("India")) {
				foreignPlayers++;
			}
		}	
		System.out.println("Number of foreign players present in the team are "+foreignPlayers);
		return foreignPlayers;
		
	}
	
	public int getWicketKeeperCount() {
		int wicketKeepers=0;
		List<PlayersPojo> players = teamDetails.getPlayer();
		for(PlayersPojo player :players) {
			if(player.getRole().equalsIgnoreCase("Wicket-keeper")) {
				wicketKeepers++;
			}
		}	
		System.out.println("Number of wicker keepers present in the team are "+wicketKeepers);
		return wicketKeepers;
	}

}
