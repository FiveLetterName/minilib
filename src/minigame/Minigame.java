package minigame;

import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.plugin.java.JavaPlugin;

import minigame.utils.Utils;

public class Minigame extends JavaPlugin implements Utils {

	public static Minigame plugin;
	public static ConsoleCommandSender cs;
	public static String name; 
	
	@Override
	public void onEnable() {
		status("Initializing Variables");
		plugin = this;
		cs = getServer().getConsoleSender();
		name = "Minigame";
		
		registerCommands();
		registerListeners();
		
		status("Online");
	}
	
	public void registerCommands() {
		status("Registering Commands");
	}
	
	public void registerListeners() {
		status("Registering Events");
	}
	
}
