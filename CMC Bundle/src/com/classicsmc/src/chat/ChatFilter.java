package com.classicsmc.src.chat;

import java.util.ArrayList;

import org.bukkit.ChatColor;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.plugin.Plugin;

public class ChatFilter {
	
	String feedBackMessage = ChatColor.RED + "Please be respectful of other players!";
	
	private String[] blockedWords;
	
	public void loadConfiguration() {
		
		
	}
	
	public void handleLanguage(AsyncPlayerChatEvent e) {
		
		
		for (int i = 0; i < blockedWords.length; i++) {
			String curWord = blockedWords[i];
			
			if (e.getMessage().contains(curWord)) {
				e.getPlayer().sendMessage(feedBackMessage);
			}
		}
		

		
	}
	
}
