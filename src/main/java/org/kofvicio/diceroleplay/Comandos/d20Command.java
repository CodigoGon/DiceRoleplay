package org.kofvicio.diceroleplay.Comandos;

import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.util.Random;


public class d20Command implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender Sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        Random random = new Random();
        String resultado = String.valueOf(random.nextInt(20)+1);
        int dado = Integer.parseInt(resultado);
        if (Sender instanceof Player player) {
            String nombre = String.valueOf(player.getDisplayName());
            if (dado > 10) {
                Bukkit.broadcastMessage(ChatColor.LIGHT_PURPLE + nombre +ChatColor.YELLOW+" ha sacado "+ ChatColor.GREEN+ ChatColor.BOLD+ resultado);
            } else {
                Bukkit.broadcastMessage(ChatColor.LIGHT_PURPLE + nombre + ChatColor.YELLOW+" ha sacado "+ ChatColor.RED + ChatColor.BOLD + resultado);
            };
        } else {
            return false;
        }
        return true;
    }
}
