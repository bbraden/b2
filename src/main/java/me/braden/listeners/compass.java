package me.braden.listeners;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerMoveEvent;

import java.util.ArrayList;
import java.util.List;

import static me.braden.main.trackers;

public class compass implements Listener {

    //not working rn, fix

    @EventHandler
    public void compassTrackPlayer(PlayerInteractEvent e) {

        Player rightClicker = e.getPlayer();

        if(rightClicker.getInventory().getItemInMainHand().getType() == Material.COMPASS) {
            try {

                rightClicker.setCompassTarget(trackers.get(0).getLocation());
                System.out.println("[+] " + trackers.get(0).getDisplayName() + " tracked.");

            } catch (Error error) {

                System.out.println("[+] Error!");
                System.out.println(error);

            }

        }

    }
}
