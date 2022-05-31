package com.bumpyjake.earthbound;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;


public class ContinentSelector implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player){

            Player p = (Player) sender;

            Inventory continentGUI = Bukkit.createInventory(p, 27, ChatColor.WHITE + "\uE1CF " + ChatColor.BLUE + "Select your continent!");

            ItemStack na = new ItemStack(Material.LIGHT_BLUE_BANNER, 1);
            ItemMeta nameta = na.getItemMeta();
            nameta.setDisplayName(ChatColor.GREEN + "North America");
            na.setItemMeta(nameta);

            ItemStack europe = new ItemStack(Material.BLUE_BANNER, 1);
            ItemMeta europemeta = europe.getItemMeta();
            europemeta.setDisplayName(ChatColor.GREEN + "Europe");
            europe.setItemMeta(europemeta);

            ItemStack oce = new ItemStack(Material.CYAN_BANNER, 1);
            ItemMeta ocemeta = oce.getItemMeta();
            ocemeta.setDisplayName(ChatColor.GREEN + "Oceania");
            oce.setItemMeta(ocemeta);

            ItemStack ant = new ItemStack(Material.WHITE_BANNER, 1);
            ItemMeta antmeta = ant.getItemMeta();
            antmeta.setDisplayName(ChatColor.GREEN + "Antartica");
            ant.setItemMeta(antmeta);

            ItemStack asia = new ItemStack(Material.RED_BANNER, 1);
            ItemMeta asiameta = asia.getItemMeta();
            asiameta.setDisplayName(ChatColor.GREEN + "Asia");
            asia.setItemMeta(asiameta);

            ItemStack sa = new ItemStack(Material.YELLOW_BANNER, 1);
            ItemMeta sameta = sa.getItemMeta();
            sameta.setDisplayName(ChatColor.GREEN + "South America");
            sa.setItemMeta(sameta);

            ItemStack africa = new ItemStack(Material.GREEN_BANNER, 1);
            ItemMeta africameta = africa.getItemMeta();
            africameta.setDisplayName(ChatColor.GREEN + "Africa");
            africa.setItemMeta(africameta);

            continentGUI.setItem(2, na);
            continentGUI.setItem(6, europe);
            continentGUI.setItem(9, oce);
            continentGUI.setItem(13, ant);
            continentGUI.setItem(17, asia);
            continentGUI.setItem(20, sa);
            continentGUI.setItem(24, africa);

            p.openInventory(continentGUI);

        }


        return true;
    }
}


