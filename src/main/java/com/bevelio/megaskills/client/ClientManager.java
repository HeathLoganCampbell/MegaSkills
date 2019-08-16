package com.bevelio.megaskills.client;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;

import org.bukkit.entity.Player;

import com.a.a.Skills;
import com.a.a.consts.SkillProfile.SkillProfile;
import com.bevelio.megaskills.utils.libs.dynamicconfig.DynamicConfig;

public class ClientManager 
{
	private HashMap<UUID, Client> clients = new HashMap<UUID, Client>();
	
	public ClientManager()
	{
		
	}
	
	public Client registerClient(String name, UUID uuid)
	{
		Client client = new Client(name, uuid);
		this.clients.put(uuid, client);
		return client;
	}
	
	public Client registerClient(Player player)
	{
		return this.registerClient(player.getName(), player.getUniqueId());
	}
	
	public Client getClient(UUID uuid)
	{
		return this.clients.get(uuid);
	}
	
	public Client getClient(Player player)
	{
		return this.getClient(player.getUniqueId());
	}
	
	public Client unregisterClient(UUID uuid)
	{
		return this.clients.remove(uuid);
	}
	
	public Client unregisterClient(Player player)
	{
		return this.unregisterClient(player.getUniqueId());
	}
	
	public void create(UUID uuid)
	{
		DynamicConfig dynamicConfig = new DynamicConfig(uuid);
		if (!dynamicConfig.exists()) 
		{
			 dynamicConfig.getDynamicConfig().set("Base.profile.UUID", uuid.toString());
			 dynamicConfig.getDynamicConfig().set("Base.profile.Points", 0);
			 dynamicConfig.getDynamicConfig().set("Base.profile.Level", 1);
			 dynamicConfig.getDynamicConfig().set("Base.profile.Exp", 0);
			 
			 ArrayList<String> unlocked = new ArrayList<String>();
	         dynamicConfig.getDynamicConfig().set("profile.Skills.UnlockedSuperSkills", unlocked);
	         dynamicConfig.saveDynamicConfig();
		} 
		else
		{
			this.load(uuid);
		}
	}
	
	public void load(UUID uuid)
	{
		DynamicConfig dynamicConfig = new DynamicConfig(uuid);
        if (dynamicConfig.exists()) 
        {
        }
	}
}
