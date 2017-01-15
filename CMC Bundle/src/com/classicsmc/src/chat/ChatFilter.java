package com.classicsmc.src.chat;

import org.bukkit.ChatColor;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class ChatFilter {
	
	String feedBackMessage = ChatColor.RED + "Please be respectful of other players!";
	
	public void handleLanguage(AsyncPlayerChatEvent e) {
		if(e.getMessage().contains("ez")) {
			
			e.getPlayer().sendMessage(feedBackMessage);
			
			e.setCancelled(true);
			
		} else if(e.getMessage().contains("goty")) {
			
			e.getPlayer().sendMessage(feedBackMessage);
			
			e.setCancelled(true);
			
		} else if(e.getMessage().contains("ezpz")) {
			
			e.getPlayer().sendMessage(feedBackMessage);
			
			e.setCancelled(true);
			
		} else if(e.getMessage().contains("fuck")) {
			
			e.getPlayer().sendMessage(feedBackMessage);
			
			e.setCancelled(true);
			
		} else if(e.getMessage().contains("shit")) {
			
			e.getPlayer().sendMessage(feedBackMessage);
			
			e.setCancelled(true);
			
		} else if(e.getMessage().contains("dick")) {
			
			e.getPlayer().sendMessage(feedBackMessage);
			
			e.setCancelled(true);
			
		} else if(e.getMessage().contains("pussy")) {
			
			e.getPlayer().sendMessage(feedBackMessage);
			
			e.setCancelled(true);
			
		} else if(e.getMessage().contains("jerk")) {
			
			e.getPlayer().sendMessage(feedBackMessage);
			
			e.setCancelled(true);
			
		} else if(e.getMessage().contains("retard")) {
			
			e.getPlayer().sendMessage(feedBackMessage);
			
			e.setCancelled(true);
			
		} else if(e.getMessage().contains("cock")) {
			
			e.getPlayer().sendMessage(feedBackMessage);
			
			e.setCancelled(true);
			
		} else if(e.getMessage().contains(" ass ")) {
			
			e.getPlayer().sendMessage(feedBackMessage);
			
			e.setCancelled(true);
			
		} else if (e.getMessage().contains("hack")) {
			
			e.getPlayer().sendMessage(feedBackMessage);
			
			e.setCancelled(true);
			
		} else if(e.getMessage().contains("hax")) {
			
			e.getPlayer().sendMessage(feedBackMessage);
			
			e.setCancelled(true);
			
		}
		
	}
	
}
