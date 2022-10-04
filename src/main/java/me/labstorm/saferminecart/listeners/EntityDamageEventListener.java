package me.labstorm.saferminecart.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;

public class EntityDamageEventListener implements Listener {
    @EventHandler
    public void onEntityDamageEvent(EntityDamageEvent e) {
        if (e.getEntity() instanceof Player) {
            return;
        }
        if (e.getEntity().getVehicle() != null && e.getCause().equals(EntityDamageEvent.DamageCause.SUFFOCATION)) {
            e.setCancelled(true);
        }
    }
}
