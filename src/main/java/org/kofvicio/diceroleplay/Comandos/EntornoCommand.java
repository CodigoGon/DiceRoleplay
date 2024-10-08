package org.kofvicio.diceroleplay.Comandos;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class EntornoCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender Sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (args.length >0) {
            if (Sender instanceof Player acusador) {
                int x = (int) acusador.getLocation().getX();
                int y = (int) acusador.getLocation().getY();
                int z = (int) acusador.getLocation().getZ();



                for (Player jugador : Bukkit.getOnlinePlayers()) {
                    if (jugador.hasPermission("DiceRoleplay.EntornoListen")) {
                        jugador.sendMessage(ChatColor.DARK_AQUA +String.join(" ", args)+
                                ChatColor.YELLOW+"Ubicacion: "+ x+" " +" "+ y+" "+ z);
                        jugador.playSound(jugador.getLocation(), Sound.ENTITY_FIREWORK_ROCKET_LAUNCH,1 ,1);
                    } else if (jugador.isOp()) {
                        jugador.sendMessage(ChatColor.DARK_AQUA +String.join(" ", args)+
                                ChatColor.YELLOW+" "+ x+"/"+ y+"/"+ z);
                        jugador.playSound(jugador.getLocation(), Sound.ENTITY_FIREWORK_ROCKET_LAUNCH,1 ,1);
                    }
                }
                Sender.sendMessage(ChatColor.GREEN + "aviso enviado");
            }
        } else {
            Sender.sendMessage(ChatColor.RED  + "DEBES PONER ALGO" );
        }
        return true;
    }
}
