package kbtdx.man10auction;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

public class Commands implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (command.getName().equalsIgnoreCase("mauction")){
            switch(args.length){
                case 0:
                    sender.sendMessage("§1/mauction helpでコマンドを表示。");
                    return true;
                case 1: //open entry list switch
                    if (args[0].equalsIgnoreCase("open")){
                        if (!sender.hasPermission("mauction.open")){
                            sender.sendMessage(ChatColor.RED + "[Man10Auction] 権限がありません。");
                            return true;
                        }else {

                        }
                    }
                    if (args[0].equalsIgnoreCase("entry")){
                        if (!sender.hasPermission("mauction.entry")){
                            
                        }
                    }
            }
        }
        return true;
    }
}
