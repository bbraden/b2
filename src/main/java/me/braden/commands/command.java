package me.braden.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import static me.braden.main.trackers;

public class command implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;

            try {
                String pName = args[0];
                Player tracker = Bukkit.getPlayer(pName);

                trackers.clear();
                trackers.add(tracker);

                player.sendMessage(tracker.getDisplayName() + " is the new tracker.");
            } catch (Error error) {
                player.sendMessage("[+] Code error, check console.");
            }
        }

        // If the player (or console) uses our command correct, we can return true
        return true;
    }
}
