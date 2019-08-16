package com.bevelio.megaskills.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerKickEvent;
import org.bukkit.event.player.PlayerQuitEvent;

import com.bevelio.megaskills.MegaSkillsPlugin;
import com.bevelio.megaskills.client.ClientManager;

public class JoinQuitListener implements Listener
{
	private ClientManager cm = MegaSkillsPlugin.getClientManager();
	
	@EventHandler
	public void onJoin(PlayerJoinEvent e)
	{
		Player player = e.getPlayer();
		cm.registerClient(player);
	}
	
	@EventHandler
	public void onQuit(PlayerQuitEvent e)
	{
		Player player = e.getPlayer();
		cm.unregisterClient(player);
	}
	
	@EventHandler
	public void onKick(PlayerKickEvent e)
	{
		Player player = e.getPlayer();
		cm.unregisterClient(player);
	}
}
