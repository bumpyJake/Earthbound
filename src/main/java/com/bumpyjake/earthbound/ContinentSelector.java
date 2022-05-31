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
            nameta.addEnchant(Enchantment.DURABILITY, 1, true);
            na.setItemMeta(nameta);

            ItemStack europe = new ItemStack(Material.BLUE_BANNER, 1);
            ItemMeta europemeta = europe.getItemMeta();
            europemeta.setDisplayName(ChatColor.AQUA + "North America");
            europemeta.addEnchant(Enchantment.DURABILITY, 1, true);
            europe.setItemMeta(nameta);


            p.openInventory(continentGUI);

        }


        return true;
    }


}


