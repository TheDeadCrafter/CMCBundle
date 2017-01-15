package com.classicsmc.src.chat;

import java.util.ArrayList;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class StaffChat implements CommandExecutor {
	
	public ArrayList<Player> inStaffChat = new ArrayList<Player>();
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
			if (sender instanceof Player && sender.hasPermission("classicsmc.staffchat")) {
				
				Player player = (Player) sender;
				
				if (cmd.getName().equalsIgnoreCase("sc") || cmd.getName().equalsIgnoreCase("staffchat")) {
						
						if (args.length == 0) {
							
							if(inStaffChat.contains(player)) {
								
								inStaffChat.remove(player);
								
								player.sendMessage(ChatColor.DARK_AQUA + "You have disabled staff chatting!");
								
								return true;
								
							}
							
							inStaffChat.add(player);
							
							player.sendMessage(ChatColor.DARK_AQUA + "You have enabled staff chatting!");
							
							return true;
							
						}

				} 
				
			}
		return false;
		
	}
	
	
	
}
