package FastRod;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

	public void onEnable() {
		getServer().getConsoleSender().sendMessage("§8[§bFastRod§8]§a has been enabled!");
		getServer().getPluginManager().registerEvents(new Rod(this), this);
		getCommand("rodreload").setExecutor(new ReloadCMD(this));
		getCommand("rreload").setExecutor(new ReloadCMD(this));
		saveDefaultConfig();
	}
	
	public void onDisable() {
		getServer().getConsoleSender().sendMessage("§8[§bFastRod§8]§4 has been disabled!");
		
	}
}
