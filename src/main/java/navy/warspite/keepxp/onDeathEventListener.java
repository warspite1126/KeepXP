package navy.warspite.keepxp;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.plugin.Plugin;

public class onDeathEventListener implements Listener {
    public onDeathEventListener(Plugin plugin) {
        plugin.getServer().getPluginManager().registerEvents(this, plugin);
    }
    @EventHandler
    public void onDeath(PlayerDeathEvent e) {
        Player player = e.getEntity();
        if (player.hasPermission("KeepXP.da")) {
            e.setKeepLevel(true);
            e.setDroppedExp(0);
        }
    }
}
