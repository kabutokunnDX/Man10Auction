package kbtdx.man10auction;

import org.bukkit.plugin.java.JavaPlugin;

public final class Man10Auction extends JavaPlugin {

    public static JavaPlugin plugin;
    public static VaultManager vault;
    public static Boolean enable;
    @Override
    public void onEnable() {
        plugin=this;
        vault=new VaultManager(this);
        enable=plugin.getConfig().getBoolean("enable");
        getCommand("mauction").setExecutor(new Commands());
    }

    @Override
    public void onDisable() {
    }
}
