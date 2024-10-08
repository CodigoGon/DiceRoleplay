package org.kofvicio.diceroleplay;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.event.ClickEvent;
import net.kyori.adventure.text.format.NamedTextColor;
import net.kyori.adventure.text.format.TextDecoration;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import org.kofvicio.diceroleplay.Comandos.DoCommand;
import org.kofvicio.diceroleplay.Comandos.EntornoCommand;
import org.kofvicio.diceroleplay.Comandos.d20Command;

public final class DiceRoleplay extends JavaPlugin {

    @Override
    public void onEnable() {

        Bukkit.getPluginManager().registerEvents(new PlayerListener(),this);
        getCommand("d20").setExecutor(new d20Command());
        getCommand("do").setExecutor(new DoCommand());
        getCommand("entorno").setExecutor(new EntornoCommand());

        System.out.println("plugin funcionando");
        Component texto = Component.text("Gremio Vortex")
                .color(NamedTextColor.BLUE)
                .decorate(TextDecoration.BOLD)
                .clickEvent(ClickEvent.openUrl("x.com/GremioVortex"));

    }

    @Override
    public void onDisable() {
        System.out.println("plugin cerrandose");
    }
}
