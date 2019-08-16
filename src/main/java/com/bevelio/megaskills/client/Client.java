package com.bevelio.megaskills.client;

import java.util.HashMap;
import java.util.UUID;

public class Client 
{
	private String name;
	private UUID uuid;
	
	private HashMap<String, Integer> skills;
	
	public Client(String name, UUID uuid)
	{
		this.name = name;
		this.uuid = uuid;
		
		this.skills = new HashMap<String, Integer>();
	}

	public HashMap<String, Integer> getSkills() {
		return skills;
	}

	public String getName() {
		return name;
	}

	public UUID getUuid() {
		return uuid;
	}
}
