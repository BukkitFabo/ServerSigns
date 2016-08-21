package de.BukkitFabo.YouTube;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import ru.tehkode.permissions.PermissionUser;
import ru.tehkode.permissions.bukkit.PermissionsEx;

public class GroupCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
			if(sender instanceof Player){
				Player p = (Player)sender;
				
				if(args.length == 2){
					
					if(Bukkit.getPlayer(args[0]) != null){
						PermissionUser target = PermissionsEx.getUser(args[0]);
						
						target.addGroup(args[1]);
						p.sendMessage("§aDu hast den Spieler §6" + args[0] + " §aerfolgreich in die Gruppe §6" + args[1] + " §agesetzt!");
						
					}else {
						p.sendMessage("§cDieser Spieler §6" + args[0] + " §cist nicht online!");
					}
					
				}
				
				//group Admiral_Zott Admin
					
			}
		
		return false;
	}

}
