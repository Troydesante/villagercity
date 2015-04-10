package io.github.troydesante.villagercity;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public final class Villagercity extends JavaPlugin {
	@Override
	public void onEnable() {
		getLogger().info("onEnable has been invoked!");
	}
 
	@Override
	public void onDisable() {
		getLogger().info("onDisable has been invoked!");
	}
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (cmd.getName().equalsIgnoreCase("villagercity")) { // If the player typed /villagercity then do the following...
			//VillagerCity INFO
			//Villagercity is gestart op 01/01/2015 en opgericht door Troydesante
			//Met dank aan ansofie5 voor het ingame bouwen aan de server!
			return true;
		} //If this has happened the function will return true. 
	        // If this hasn't happened the value of false will be returned.
		return false; 
	}
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player target = (Bukkit.getServer().getPlayer(args[0]));
	        if (target == null) {
	           sender.sendMessage(args[0] + " is niet online!");
	           return false;
	        }
	        return false;
	}
}