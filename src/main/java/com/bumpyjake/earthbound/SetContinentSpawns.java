package com.bumpyjake.earthbound;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SetContinentSpawns implements CommandExecutor {

    private final Earthbound plugin;
    public SetContinentSpawns(Earthbound plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (args.length == 0){
            sender.sendMessage("You must include a continent");
        }else if (args.length == 1){

            if(args[0].equalsIgnoreCase("northamerica")) {
                if (sender instanceof Player){
                    Player player = (Player) sender;
                    Location location = player.getLocation();
                    plugin.getConfig().set("NorthAmerica", location);
                    plugin.saveConfig();
                    player.sendMessage(ChatColor.GREEN + "North America Set");

                }else{
                    System.out.println("This command can only be ran by a player.");
                }
            } else if(args[0].equalsIgnoreCase("europe")) {
                if (sender instanceof Player){
                    Player player = (Player) sender;
                    Location location = player.getLocation();
                    plugin.getConfig().set("Europe", location);
                    plugin.saveConfig();
                    player.sendMessage(ChatColor.GREEN + "Europe Set");

                }else{
                    System.out.println("This command can only be ran by a player.");
                }
            }else if(args[0].equalsIgnoreCase("oceania")) {
                if (sender instanceof Player){
                    Player player = (Player) sender;
                    Location location = player.getLocation();
                    plugin.getConfig().set("Oceania", location);
                    plugin.saveConfig();
                    player.sendMessage(ChatColor.GREEN + "Oceania Set");

                }else{
                    System.out.println("This command can only be ran by a player.");
                }
            }else if(args[0].equalsIgnoreCase("antartica")) {
                if (sender instanceof Player){
                    Player player = (Player) sender;
                    Location location = player.getLocation();
                    plugin.getConfig().set("Anartica", location);
                    plugin.saveConfig();
                    player.sendMessage(ChatColor.GREEN + "Anartica Set");

                }else{
                    System.out.println("This command can only be ran by a player.");
                }
            }else if(args[0].equalsIgnoreCase("asia")) {
                if (sender instanceof Player){
                    Player player = (Player) sender;
                    Location location = player.getLocation();
                    plugin.getConfig().set("Asia", location);
                    plugin.saveConfig();
                    player.sendMessage(ChatColor.GREEN + "Asia Set");

                }else{
                    System.out.println("This command can only be ran by a player.");
                }
            }else if(args[0].equalsIgnoreCase("southamerica")) {
                if (sender instanceof Player){
                    Player player = (Player) sender;
                    Location location = player.getLocation();
                    plugin.getConfig().set("SouthAmerica", location);
                    plugin.saveConfig();
                    player.sendMessage(ChatColor.GREEN + "South America Set");

                }else{
                    System.out.println("This command can only be ran by a player.");
                }
            }else if(args[0].equalsIgnoreCase("africa")) {
                if (sender instanceof Player){
                    Player player = (Player) sender;
                    Location location = player.getLocation();
                    plugin.getConfig().set("Africa", location);
                    plugin.saveConfig();
                    player.sendMessage(ChatColor.GREEN + "Africa Set");

                }else{
                    System.out.println("This command can only be ran by a player.");
                }
            }else{
                sender.sendMessage("That is not an available continent");
            }
        }






        return true;
    }
}
