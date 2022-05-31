package com.bumpyjake.earthbound;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class MenuHandler implements Listener {

    @EventHandler
    public void onMenuClick(InventoryClickEvent e){
        Player p = (Player) e.getWhoClicked();

        if (e.getView().getTitle().equalsIgnoreCase(ChatColor.WHITE + "\uE15E " + ChatColor.BLUE + "Select your continent!")){

            if (e.getCurrentItem().getType().equals((Material.LIGHT_BLUE_BANNER))){
                p.sendMessage("North America");
            }else if (e.getCurrentItem().getType().equals((Material.BLUE_BANNER))) {
                p.sendMessage("Europe");
            }else if (e.getCurrentItem().getType().equals((Material.CYAN_BANNER))) {
                p.sendMessage("Oceania");
            }else if (e.getCurrentItem().getType().equals((Material.WHITE_BANNER))) {
                p.sendMessage("Antartica");
            }else if (e.getCurrentItem().getType().equals((Material.RED_BANNER))) {
                p.sendMessage("Asia");
            }else if (e.getCurrentItem().getType().equals((Material.YELLOW_BANNER))) {
                p.sendMessage("South America");
            }else if (e.getCurrentItem().getType().equals((Material.GREEN_BANNER))) {
                p.sendMessage("Africa");
            }

        }

    }

}
