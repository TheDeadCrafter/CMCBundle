package com.classicsmc.src.chat;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class LoyalChat implements CommandExecutor {
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
			if (sender instanceof Player && sender.hasPermission("classicsmc.loyalchat")) {
				
				Player player = (Player) sender;
				
				if (cmd.getName().equalsIgnoreCase("lc") || cmd.getName().equalsIgnoreCase("loyalchat")) {
						
						if(player.hasPermission("classicsmc.staffchat")) {
							
							Bukkit.broadcast(ChatColor.DARK_GRAY + "[" + ChatColor.DARK_AQUA + "Loyal" + 
									ChatColor.GOLD + "Chat" + ChatColor.DARK_GRAY 
									+ "] " + ChatColor.DARK_AQUA + player.getName()
									+ ChatColor.DARK_GRAY + ":" + ChatColor.AQUA + 
									buildMessage(args), "classicsmc.staffchat");
							
						} else {
							
							Bukkit.broadcast(ChatColor.DARK_GRAY + "[" + ChatColor.DARK_AQUA + "Loyal" + 
									ChatColor.GOLD + "Chat" + ChatColor.DARK_GRAY 
									+ "] " + ChatColor.DARK_GRAY + player.getName()
									+ ChatColor.DARK_GRAY + ":" + ChatColor.GRAY + 
									buildMessage(args), "classicsmc.staffchat");
							
						}

				} 
				
			}
		return false;
		
	}
	
	private String buildMessage(String[] args) {
		
		String newMessage;
		
		StringBuilder sb = new StringBuilder();
		
		for(String s : args) {
			
			sb.append(' ').append(s);
			
		}
		
		newMessage = sb.toString();
		
		return newMessage;
		
	}
	
}
