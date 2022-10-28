package me.braden.listeners;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;
import com.mojang.authlib.properties.PropertyMap;
import net.minecraft.server.level.EntityPlayer;
import org.bukkit.Location;
import org.bukkit.craftbukkit.v1_19_R1.entity.CraftPlayer;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class skin implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e) {

        setSkin(e.getPlayer());

    }

    private void setSkin(Player player) {

        String value = "ewogICJ0aW1lc3RhbXAiIDogMTU4ODMxOTk0OTYxOCwKICAicHJvZmlsZUlkIiA6ICI4NjY3YmE3MWI4NWE0MDA0YWY1NDQ1N2E5NzM0ZWVkNyIsCiAgInByb2ZpbGVOYW1lIiA6ICJTdGV2ZSIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS82MGE1YmQwMTZiM2M5YTFiOTI3MmU0OTI5ZTMwODI3YTY3YmU0ZWJiMjE5MDE3YWRiYmM0YTRkMjJlYmQ1YjEiCiAgICB9LAogICAgIkNBUEUiIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzk1M2NhYzhiNzc5ZmU0MTM4M2U2NzVlZTJiODYwNzFhNzE2NThmMjE4MGY1NmZiY2U4YWEzMTVlYTcwZTJlZDYiCiAgICB9CiAgfQp9";
        String signature = "nnrOYOn+NAPTnHP3jZi+OYfVhAzrnewC2oHuybjUMpeOHs99/qaoKAPA2QjAa/QG2mJy6lQXhMPwOWuYMWUJBY47jptQWlpdfiYRYJxqniUMM8x6zV2bSwfujgZfpnP92L5Mm746uRsRP4LYGCB0HT3oCscdgpX+RdJ8y4t+l3RwVZdXKljnO+L6QBZ9ZENGOqD/W40s4pQMC/NMuGsRTsdwQrRI/ps8mHmfAM+SiNk04SGUyQ3HzDVlQWdJSRyhNxkwQWOz6bCQwlIj3HRF7xzmUMd2ZmF/LO88aVmdSgPKtlzEZVaYdZ/egEZqrmWNk7AGBBQZwQBxzK+GozZNH4Gc/xZlnBJRhRw3LIv/R2jTAxj4qbXBPp8DTNQPbPW1qhw5OILYnWIK/PPwdafCHl09BhZzoBBxPYcb2uqFH3obOG0zUulthRHD9Tx07h61RmaCt9Ge4DbyJXaCp9VTfS1cgj63w5y2pZf2D5TZ0IJrEHmxZPvR3pv2parJMKxiE+4ozikmfvhm8ERkPns/0VXo2D2pSOlYHWHxA13xHuFo+zXV2k/dZmGP/zRrok8xbq2qMZ+J43BC4KB+qyfogQY++dbATELX9SsQiBZuKkk9P9BvYvVSg1oHDE4rmTSkjkb4hvNUKXlCNZYkVN8u3tbFo/SnMePYA26XRp1b+HE=";

        EntityPlayer ep = ((CraftPlayer) player).getHandle();
        GameProfile gp = ep.getBukkitEntity().getProfile();
        PropertyMap pm = gp.getProperties();
        Property property = pm.get("textures").iterator().next();
        pm.remove("textures", property);
        pm.put("textures", new Property("textures", value, signature));
        System.out.println(player.getDisplayName() + " skin changed.");

    }
}

