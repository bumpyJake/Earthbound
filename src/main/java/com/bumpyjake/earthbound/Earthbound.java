package com.bumpyjake.earthbound;

import org.bukkit.*;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class Earthbound extends JavaPlugin implements Listener{

    @Override
    public void onEnable() {

        getConfig().options().copyDefaults();
        saveDefaultConfig();

        getCommand("continentselector").setExecutor(new ContinentSelector());
        getCommand("live").setExecutor(new LiveCommand());
        getCommand("set").setExecutor(new SetContinentSpawns(this));
        this.getServer().getPluginManager().registerEvents(this, this);

    }

    @EventHandler
    public void onMenuClick(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();

        if (e.getView().getTitle().equalsIgnoreCase(ChatColor.WHITE + "\uE15E " + ChatColor.BLUE + "Select your continent!")) {
            e.setCancelled(true);

            if (e.getCurrentItem() == null) {
                return;
            }
            if (e.getCurrentItem().getType().equals((Material.LIGHT_BLUE_BANNER))) {
                p.closeInventory();
                ConsoleCommandSender console = Bukkit.getServer().getConsoleSender();
                String command = ("screeneffect fullscreen #000000 20 40 20 nofreeze " + p.getName() + " &aTeleporting... ");
                Bukkit.dispatchCommand(console, command);
                Location ploc = p.getLocation();
                p.playSound(ploc, Sound.BLOCK_PORTAL_TRAVEL, 0.5f, 1.0f);
                Bukkit.getScheduler().runTaskLater(this, new Runnable() {
                    @Override
                    public void run() {
                        Location NAloc = getConfig().getLocation("NorthAmerica");
                        if (NAloc != null){
                            p.teleport(NAloc);
                        }else{
                            p.sendMessage("NAloc is not set.");
                        }
                    }
                }, 30L);
            } else if (e.getCurrentItem().getType().equals((Material.BLUE_BANNER))) {
                p.closeInventory();
                ConsoleCommandSender console = Bukkit.getServer().getConsoleSender();
                String command = ("screeneffect fullscreen #000000 20 40 20 nofreeze " + p.getName() + " &aTeleporting... ");
                Bukkit.dispatchCommand(console, command);
                Location ploc = p.getLocation();
                p.playSound(ploc, Sound.BLOCK_PORTAL_TRAVEL, 0.5f, 1.0f);
                Bukkit.getScheduler().runTaskLater(this, new Runnable() {
                    @Override
                    public void run() {
                        Location Europeloc = getConfig().getLocation("Europe");
                        if (Europeloc != null){
                            p.teleport(Europeloc);
                        }else{
                            p.sendMessage("Europeloc is not set.");
                        }
                    }
                }, 30L);
            } else if (e.getCurrentItem().getType().equals((Material.CYAN_BANNER))) {
                p.closeInventory();
                ConsoleCommandSender console = Bukkit.getServer().getConsoleSender();
                String command = ("screeneffect fullscreen #000000 20 40 20 nofreeze " + p.getName() + " &aTeleporting... ");
                Bukkit.dispatchCommand(console, command);
                Location ploc = p.getLocation();
                p.playSound(ploc, Sound.BLOCK_PORTAL_TRAVEL, 0.5f, 1.0f);
                Bukkit.getScheduler().runTaskLater(this, new Runnable() {
                    @Override
                    public void run() {
                        Location Oceanialoc = getConfig().getLocation("Oceania");
                        if (Oceanialoc != null){
                            p.teleport(Oceanialoc);
                        }else{
                            p.sendMessage("Oceanialoc is not set.");
                        }
                    }
                }, 30L);
            } else if (e.getCurrentItem().getType().equals((Material.WHITE_BANNER))) {
                p.closeInventory();
                ConsoleCommandSender console = Bukkit.getServer().getConsoleSender();
                String command = ("screeneffect fullscreen #000000 20 40 20 nofreeze " + p.getName() + " &aTeleporting... ");
                Bukkit.dispatchCommand(console, command);
                Location ploc = p.getLocation();
                p.playSound(ploc, Sound.BLOCK_PORTAL_TRAVEL, 0.5f, 1.0f);
                Bukkit.getScheduler().runTaskLater(this, new Runnable() {
                    @Override
                    public void run() {
                        Location Anarticaloc = getConfig().getLocation("Anartica");
                        if (Anarticaloc != null){
                            p.teleport(Anarticaloc);
                        }else{
                            p.sendMessage("Anarticaloc is not set.");
                        }
                    }
                }, 30L);
            } else if (e.getCurrentItem().getType().equals((Material.RED_BANNER))) {
                p.closeInventory();
                ConsoleCommandSender console = Bukkit.getServer().getConsoleSender();
                String command = ("screeneffect fullscreen #000000 20 40 20 nofreeze " + p.getName() + " &aTeleporting... ");
                Bukkit.dispatchCommand(console, command);
                Location ploc = p.getLocation();
                p.playSound(ploc, Sound.BLOCK_PORTAL_TRAVEL, 0.5f, 1.0f);
                Bukkit.getScheduler().runTaskLater(this, new Runnable() {
                    @Override
                    public void run() {
                        Location Asialoc = getConfig().getLocation("Asia");
                        if (Asialoc != null){
                            p.teleport(Asialoc);
                        }else{
                            p.sendMessage("Asialoc is not set.");
                        }
                    }
                }, 30L);
            } else if (e.getCurrentItem().getType().equals((Material.YELLOW_BANNER))) {
                p.closeInventory();
                ConsoleCommandSender console = Bukkit.getServer().getConsoleSender();
                String command = ("screeneffect fullscreen #000000 20 40 20 nofreeze " + p.getName() + " &aTeleporting... ");
                Bukkit.dispatchCommand(console, command);
                Location ploc = p.getLocation();
                p.playSound(ploc, Sound.BLOCK_PORTAL_TRAVEL, 0.5f, 1.0f);
                Bukkit.getScheduler().runTaskLater(this, new Runnable() {
                    @Override
                    public void run() {
                        Location SAloc = getConfig().getLocation("SouthAmerica");
                        if (SAloc != null){
                            p.teleport(SAloc);
                        }else{
                            p.sendMessage("SAloc is not set.");
                        }
                    }
                }, 30L);
            } else if (e.getCurrentItem().getType().equals((Material.GREEN_BANNER))) {
                p.closeInventory();
                ConsoleCommandSender console = Bukkit.getServer().getConsoleSender();
                String command = ("screeneffect fullscreen #000000 20 40 20 nofreeze " + p.getName() + " &aTeleporting... ");
                Bukkit.dispatchCommand(console, command);
                Location ploc = p.getLocation();
                p.playSound(ploc, Sound.BLOCK_PORTAL_TRAVEL, 0.5f, 1.0f);
                Bukkit.getScheduler().runTaskLater(this, new Runnable() {
                    @Override
                    public void run() {
                        Location Africaloc = getConfig().getLocation("Africa");
                        if (Africaloc != null){
                            p.teleport(Africaloc);
                        }else{
                            p.sendMessage("SAloc is not set.");
                        }
                    }
                }, 30L);
            }

        }
    }

}
