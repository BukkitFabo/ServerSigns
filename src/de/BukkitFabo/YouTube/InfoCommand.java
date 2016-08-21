package de.BukkitFabo.YouTube;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class InfoCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
			
			if(args.length == 0){
				
				sender.sendMessage("§7Plugin Name: §6" + Main.getPlugin().getDescription().getName());
				sender.sendMessage("§7Plugin Version: §6" + Main.getPlugin().getDescription().getVersion());
				sender.sendMessage("§7Plugin Author: §6" + Main.getPlugin().getDescription().getAuthors());
				sender.sendMessage("§7Plugin Website: §6" + Main.getPlugin().getDescription().getWebsite());
				sender.sendMessage("§7Plugin Prefix: §6" + Main.getPlugin().getDescription().getPrefix());
				sender.sendMessage("§7Plugin Description: §6" + Main.getPlugin().getDescription().getDescription());
				return true;
			}
		
		return false;
	}

}
