package me.braden.listeners;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

import java.util.ArrayList;
import java.util.List;

public class compass implements Listener {

    //not working rn, fix

    @EventHandler
    public void compassTrackPlayer(PlayerMoveEvent e) {
        // players being tracked
        List<String> trackingPlayers = new ArrayList<>();
        trackingPlayers.add("btcbraden");
        Player mover = e.getPlayer();

        // see if players to track are the one moving
        if(trackingPlayers.contains(mover.getDisplayName())) {

            Player tracker = Bukkit.getServer().getPlayer("vhs2");
            if(tracker != null) {
                Location compassTarget = tracker.getCompassTarget();
                Location moverLoc = mover.getLocation();

                compassTarget.setX(moverLoc.getX());
                compassTarget.setY(moverLoc.getY());
                compassTarget.setZ(moverLoc.getZ());
            } else {
                System.out.println("[!] Tracker null!");
            }
        }

    }
}
