package navy.warspite.keepxp;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class KeepXP extends JavaPlugin {
    @Override
    public void onEnable() {
        // Plugin startup logic\
        new onDeathEventListener(this);
    }
    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
