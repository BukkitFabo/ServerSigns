package de.BukkitFabo.YouTube;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import ru.tehkode.permissions.PermissionUser;
import ru.tehkode.permissions.bukkit.PermissionsEx;

public class PlayerJoinListener implements Listener {

	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent e){
		Player p = e.getPlayer();
		PermissionUser user = PermissionsEx.getUser(p);
		
		if(user.inGroup("Admin")){
			
			p.sendMessage("§7Du bist in der Gruppe §cAdmin§7.");
			
		}
		
	}
	
}
