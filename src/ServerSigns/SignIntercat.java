package ServerSigns;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import org.bukkit.block.Sign;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

import de.BukkitFabo.YouTube.Main;

public class SignIntercat implements Listener {
	
	@EventHandler
	public void onIntercat(PlayerInteractEvent e) {
		Player p = e.getPlayer();
		
		if(e.getAction() == Action.RIGHT_CLICK_BLOCK) {
			if(e.getClickedBlock().getState() instanceof Sign) {
				Sign s = (Sign) e.getClickedBlock().getState();
				
				//§a[Join]
				//Servername
				//MOTD
				//OnlinePlayer/MaxPlayers

				if(s.getLine(0).equalsIgnoreCase("§a[Join]")) {
					if(s.getLine(2).equalsIgnoreCase("§c§lOFFLIE")) {
						p.sendMessage(ServerSigns.prefix + "§cDieser Server ist leider gerade offline.");
					} else {
						connect(s.getLine(1), p);
					}
				}
			}
			
			
		}
		
	}
	
	public void connect(String Server, Player p) {
		
		ByteArrayOutputStream b = new ByteArrayOutputStream();
		DataOutputStream out = new DataOutputStream(b);
		try {
			out.writeUTF("Connect");
			out.writeUTF(Server);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		p.sendPluginMessage(Main.plugin, "BungeeCord", b.toByteArray());
	}

}
