package com.classicsmc.src.chat;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class ChatEvents implements Listener {
	
	StaffChat staffChat = new StaffChat();
	ChatFilter filter = new ChatFilter();
	
	@EventHandler
	public void onPlayerChatEvent(AsyncPlayerChatEvent e) {
		
		filter.handleLanguage(e);
		
		if(staffChat.inStaffChat.contains(e.getPlayer())) {
			
			Bukkit.broadcast(ChatColor.DARK_GRAY + "[" + ChatColor.DARK_AQUA + "Staff" + 
					ChatColor.GOLD + "Chat" + ChatColor.DARK_GRAY 
					+ "] " + ChatColor.DARK_AQUA + e.getPlayer().getName()
					+ ChatColor.DARK_GRAY + ":" + ChatColor.AQUA + e.getMessage(), "classicsmc.staffchat");
			
			e.setCancelled(true);
			
		}
		
	}
	
}
