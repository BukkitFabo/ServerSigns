package ServerSigns;

import java.io.IOException;
import java.util.List;

import org.bukkit.block.Sign;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class SignBreak implements Listener {
	
	@EventHandler
	public void onSignBreak(BlockBreakEvent e) {
		
		if(e.getBlock().getState() instanceof Sign) {
			Sign s = (Sign) e.getBlock().getState();
			
			if(s.getLine(0).equalsIgnoreCase("�a[Join]")) {
				List<String> signs = ServerSigns.sign.getStringList("Signs");
				
				String world = e.getBlock().getWorld().getName();
				double x = e.getBlock().getX();
				double y = e.getBlock().getY();
				double z = e.getBlock().getZ();
				
				
				if(signs.contains(s.getLine(1) + "," + world + "," + x + "," + y + "," + z)) {
					
					signs.remove(s.getLine(1) + "," + world + "," + x + "," + y + "," + z);
					ServerSigns.sign.set("Signs", signs);
					try {
						ServerSigns.sign.save(ServerSigns.singfile);
						e.getPlayer().sendMessage(ServerSigns.prefix + "�cDu hast erflogreich das Schild zerst�rt.");
					} catch (IOException ex) {
						ex.printStackTrace();
					}
					
				}
				
			}
			
		}
		
	}

}
