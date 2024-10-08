package org.kofvicio.diceroleplay.Comandos;


import org.bukkit.Bukkit;
import org.bukkit.ChatColor;

import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class DoCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender Sender, @NotNull Command command, @NotNull String s, @NotNull String[] args) {
        if (Sender instanceof Player player) {
            if (args.length > 0) {
                Location location = player.getLocation();
                for (Player nearbyPlayer : Bukkit.getOnlinePlayers()) {
                    if (nearbyPlayer.getLocation().distance(location) <= 15) {
                        nearbyPlayer.sendMessage(ChatColor.BLUE + "*" + ChatColor.LIGHT_PURPLE + player.getDisplayName() + " " + ChatColor.BLUE + String.join(" ", args) + "*");
                    }
                }
            }
        }

        return true;
    }
}
