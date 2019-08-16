package com.bevelio.jumpcompass;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.plugin.java.JavaPlugin;

import com.bevelio.jumpcompass.utils.ItemBuilder;

public class JumpCompassPlugin extends JavaPlugin
{
	@Override
	public void onEnable()
	{
		this.getConfig();
	}
	
	
}
