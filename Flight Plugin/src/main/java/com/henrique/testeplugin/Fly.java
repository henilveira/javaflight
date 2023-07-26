package com.henrique.testeplugin;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import static jdk.javadoc.internal.doclets.formats.html.markup.HtmlStyle.block;

public class Fly implements CommandExecutor {

    private Main main;

    public Fly(Main main) {
        this.main = main;
    }
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player p = (Player) sender;

        if (sender instanceof Player) {
        }

        if(!p.hasPermission("fly.perm")) {
            p.sendMessage(main.getConfig().getString("fly.perm"));
            return true;

        }
        if (p.getAllowFlight()) {
            p.sendMessage(ChatColor.RED + "Você desativou o modo fly.");
            p.setAllowFlight(false);

        } else {
            p.sendMessage(ChatColor.GREEN + "Você ativou o modo fly!");
            p.setAllowFlight(true);

        }

        return false;
    }




}
