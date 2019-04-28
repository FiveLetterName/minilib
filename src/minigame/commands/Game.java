package minigame.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import minigame.events.GameEnd;
import minigame.events.GameStart;
import minigame.utils.Utils;

public class Game implements CommandExecutor, Utils {

	private boolean status;
	private GameStart gstart;
	private GameEnd gend;

	public void start() {
		gstart.onGameStart();
		status = true;
	}

	public void end() {
		gend.onGameEnd();
		status = false;
	}

	public boolean status() {
		return status;
	}

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		Player player = (Player) sender;
		
		if (args.length == 0) {
			// Your help menu
		} else if (args.length == 1) {
			if (args[0].equalsIgnoreCase("start")) {
				start();
				send(player, "Game Started");
			} else if (args[0].equalsIgnoreCase("stop")) {
				end();
				send(player, "Game Ended");
			}
			
			// All Subcommands for /game
		}

		return true;
	}

}
