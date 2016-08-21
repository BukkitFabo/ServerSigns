package de.BukkitFabo.YouTube;

import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import ServerSigns.ServerSigns;

public class Main extends JavaPlugin{
	
	public static Plugin plugin;
	
	public void onEnable(){
		plugin = this;
		
		getServer().getMessenger().registerOutgoingPluginChannel(this, "BungeeCord");
		
		getCommand("info").setExecutor(new InfoCommand());
		getCommand("Group").setExecutor(new GroupCommand());
		//Bukkit.getPluginManager().registerEvents(new PlayerJoinListener(), this);
		
		new ServerSigns();
		
	}
	
	public static Plugin getPlugin(){
		return plugin;
	}

}
