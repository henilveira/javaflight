package com.henrique.testeplugin;

import org.bukkit.*;
import org.bukkit.block.Block;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.player.PlayerItemBreakEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.util.Vector;

import java.util.Stack;

public final class Main extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getCommand("fly").setExecutor(new Fly(this));

        Bukkit.getPluginManager().registerEvents(this, this);

        System.out.println(ChatColor.AQUA + "Seu Plugin foi iniciado com sucesso!");
    }

    @Override
    public void onDisable() {

    }
}



