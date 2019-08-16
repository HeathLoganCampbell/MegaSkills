package com.bevelio.megaskills;

import java.util.HashMap;

import org.bukkit.ChatColor;

public class Settings 
{
	public static final String NAME = "MegaSkills"
							 , PREFIX = ChatColor.BOLD + NAME + ChatColor.RESET + " "
							 , BUYER = "%%__USER__%%";
	
	public static HashMap<String, String> MESSAGES = new HashMap<>();
	
	public void initLanguage()
	{
		Settings.MESSAGES.put("example.text", "pong");
	}
}
