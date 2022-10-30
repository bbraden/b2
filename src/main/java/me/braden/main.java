package me.braden;

import me.braden.commands.command;
import me.braden.listeners.compass;
import me.braden.listeners.gun;
import me.braden.listeners.skin;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;

public final class main extends JavaPlugin {

    public static ArrayList<Player> trackers = new ArrayList<Player>();

    @Override
    public void onEnable() {

        Bukkit.getPluginManager().registerEvents(new gun(), this);
        //Bukkit.getPluginManager().registerEvents(new skin(), this);
        Bukkit.getPluginManager().registerEvents(new compass(), this);

        this.getCommand("addtracker").setExecutor(new command());

        System.out.println("[+] b2 enabled.");

    }

    @Override
    public void onDisable() {
        System.out.println("[-] b2 disabled.");
    }
}
