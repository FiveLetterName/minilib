package minigame.utils;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

import minigame.Minigame;

public interface Utils {

	public default String cc(String message) {
		return ChatColor.translateAlternateColorCodes('&', message);
	}
	
	public default void send(Player player, String message) {
		player.sendMessage(cc("&8[&c" + Minigame.name + "&8] " + message));
	}

	public default void status(String message) {
		Minigame.cs.sendMessage(Minigame.name + " | Status: " + message);
	}

	public default void log(String message) {
		Minigame.cs.sendMessage(Minigame.name + " | " + message);
	}

	public default void error(String message) {
		Minigame.cs.sendMessage(Minigame.name + " Error | " + message);
	}

	public default void warning(String message) {
		Minigame.cs.sendMessage(Minigame.name + " Warning | " + message);
	}

}
