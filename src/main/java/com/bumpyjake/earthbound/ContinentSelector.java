package com.bumpyjake.earthbound;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import static sun.reflect.misc.FieldUtil.getField;

public class ContinentSelector implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player){

            Player p = (Player) sender;

            Inventory continentGUI = Bukkit.createInventory(p, 27, "\uE1CF " + ChatColor.AQUA + "Select your starting continent!");

            ItemStack na = new ItemStack(Material.LIGHT_BLUE_BANNER, 1);
            ItemMeta nameta = na.getItemMeta();
            nameta.setDisplayName(ChatColor.AQUA + "North America");
            na.setItemMeta(nameta);

            ItemStack europe = new ItemStack(Material.BLUE_BANNER, 1);
            ItemMeta europemeta = europe.getItemMeta();
            europemeta.setDisplayName(ChatColor.AQUA + "Europe");
            europe.setItemMeta(europemeta);

            ItemStack oce = new ItemStack(Material.CYAN_BANNER, 1);
            ItemMeta ocemeta = oce.getItemMeta();
            ocemeta.setDisplayName(ChatColor.AQUA + "Oceania");
            oce.setItemMeta(ocemeta);

            ItemStack ant = new ItemStack(Material.WHITE_BANNER, 1);
            ItemMeta antmeta = ant.getItemMeta();
            antmeta.setDisplayName(ChatColor.AQUA + "Antartica");
            ant.setItemMeta(antmeta);

            ItemStack asia = new ItemStack(Material.WHITE_BANNER, 1);
            ItemMeta asiameta = asia.getItemMeta();
            asiameta.setDisplayName(ChatColor.AQUA + "Antartica");
            asia.setItemMeta(asiameta);

            ItemStack sa = new ItemStack(Material.WHITE_BANNER, 1);
            ItemMeta sameta = sa.getItemMeta();
            sameta.setDisplayName(ChatColor.AQUA + "Antartica");
            sa.setItemMeta(sameta);

            ItemStack africa = new ItemStack(Material.WHITE_BANNER, 1);
            ItemMeta africameta = africa.getItemMeta();
            africameta.setDisplayName(ChatColor.AQUA + "Antartica");
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


