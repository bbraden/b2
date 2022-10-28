package me.braden.listeners;

import org.bukkit.Material;
import org.bukkit.entity.Egg;
import org.bukkit.entity.Fireball;
import org.bukkit.entity.Player;
import org.bukkit.entity.Snowball;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

public class gun implements Listener {

    @EventHandler
    public void onPlayerInteract(PlayerInteractEvent e) {

        if(e.hasItem()) {
            Player p = e.getPlayer();

            Material item = e.getItem().getType();

            Material netheriteGun = Material.NETHERITE_HOE;
            Material diamondGun = Material.DIAMOND_HOE;
            Material ironGun = Material.IRON_HOE;

            if(item.equals(netheriteGun)) {

                p.launchProjectile(Fireball.class);

            } else if(item.equals(diamondGun)) {

                p.launchProjectile(Snowball.class);

            } else if(item.equals(ironGun)) {

                p.launchProjectile(Egg.class);

            }
        }

    }
}
