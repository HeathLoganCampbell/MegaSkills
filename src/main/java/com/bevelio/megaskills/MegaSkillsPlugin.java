package com.bevelio.megaskills;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

import com.bevelio.megaskills.client.ClientManager;
import com.bevelio.megaskills.listeners.JoinQuitListener;
import com.bevelio.megaskills.utils.Utils;

public class MegaSkillsPlugin extends JavaPlugin
{
	private static MegaSkillsPlugin instance;
	private static ClientManager clientManager;
	
	@Override
	public void onEnable()
	{
		instance = this;
		clientManager = new ClientManager();
		
		registerListeners();
		
		PluginDescriptionFile pluginYml = this.getDescription();
		if(!(pluginYml.getName().equals("MegaSkills") 
			|| pluginYml.getAuthors().contains("Bevelio")))
		{
			Utils.messageConsole(ChatColor.RED + "Please do not edit the plugin.yml!");
			this.getPluginLoader().disablePlugin(this);
			return;
		}
	}
	
	public void registerListeners()
	{
		Bukkit.getPluginManager().registerEvents(new JoinQuitListener(), this);
	}
	
	public static MegaSkillsPlugin getInstance()
	{
		return instance;
	}
	
	public static ClientManager getClientManager()
	{
		return clientManager;
	}
}
