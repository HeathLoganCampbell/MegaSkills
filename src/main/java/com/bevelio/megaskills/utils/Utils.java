package com.bevelio.megaskills.utils;

import org.bukkit.Bukkit;

import com.bevelio.megaskills.Settings;

public class Utils 
{
	public static void messageConsole(String message)
	{
		Bukkit.getConsoleSender().sendMessage(Settings.PREFIX + message);
	}
}
