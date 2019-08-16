package com.bevelio.megaskills.skill;

import org.bukkit.event.Listener;

public class Skill implements Listener 
{
	private String name
				 , desc;
	
	public Skill(String name, String desc)
	{
		this.name = name;
		this.desc = desc;
	}

	public String getName() {
		return name;
	}

	public String getDesc() {
		return desc;
	}
}
