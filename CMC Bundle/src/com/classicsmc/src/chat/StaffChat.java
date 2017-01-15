package com.classicsmc.src.chat;

import java.util.ArrayList;

import org.bukkit.Bukkit;
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
						
						Bukkit.broadcast(ChatColor.DARK_GRAY + "[" + ChatColor.DARK_AQUA + "Staff" + 
								ChatColor.GOLD + "Chat" + ChatColor.DARK_GRAY 
								+ "] " + ChatColor.DARK_AQUA + player.getName()
								+ ChatColor.DARK_GRAY + ":" + ChatColor.AQUA + buildMessage(args), "classicsmc.staffchat");
						
						

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
