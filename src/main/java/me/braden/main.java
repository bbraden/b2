package me.braden;

import me.braden.listeners.compass;
import me.braden.listeners.gun;
import me.braden.listeners.skin;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class main extends JavaPlugin {

    @Override
    public void onEnable() {

        Bukkit.getPluginManager().registerEvents(new gun(), this);
        Bukkit.getPluginManager().registerEvents(new skin(), this);
        Bukkit.getPluginManager().registerEvents(new compass(), this);

        System.out.println("[+] b2 enabled.");

    }

    @Override
    public void onDisable() {
        System.out.println("[-] b2 disabled.");
    }
}
