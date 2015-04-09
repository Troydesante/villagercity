package io.github.troydesante.villagercity;

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
			// doSomething
			return true;
		} //If this has happened the function will return true. 
	        // If this hasn't happened the value of false will be returned.
		return false; 
	}
}