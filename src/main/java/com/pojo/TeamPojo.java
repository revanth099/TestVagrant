package com.pojo;

import java.util.*;

public class TeamPojo {
	String name;
	String location;
	List<PlayersPojo> player;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public List<PlayersPojo> getPlayer() {
		return player;
	}
	public void setPlayer(List<PlayersPojo> player) {
		this.player = player;
	}
	

}
