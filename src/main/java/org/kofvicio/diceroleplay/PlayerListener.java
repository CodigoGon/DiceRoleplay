package org.kofvicio.diceroleplay;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

import java.net.http.WebSocket;

public class PlayerListener implements Listener {

    @EventHandler
    public void EnMovimiento (PlayerMoveEvent event) {
        event.setCancelled(false);
    }
}
