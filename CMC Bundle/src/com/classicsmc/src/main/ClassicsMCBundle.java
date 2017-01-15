package com.classicsmc.src.main;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import com.classicsmc.src.chat.ChatEvents;
import com.classicsmc.src.chat.StaffChat;
import com.classicsmc.src.survival.SurvivalCraftLoader;

public class ClassicsMCBundle extends JavaPlugin implements Listener {
	
	SurvivalCraftLoader loader = new SurvivalCraftLoader();
	
	public static String msgTag = ChatColor.DARK_GRAY + "[" + 
			ChatColor.DARK_AQUA + "Classics" + 
			ChatColor.GOLD + "MC" + 
			ChatColor.DARK_GRAY + "] " + ChatColor.DARK_AQUA;
	
	@Override
	public void onEnable() {
		
		loader.initCrafting(this);
		
		Bukkit.getServer().getPluginManager().registerEvents(new ChatEvents(), this);
		
		this.getCommand("sc").setExecutor(new StaffChat());
		this.getCommand("staffchat").setExecutor(new StaffChat());
		
	}
	
	@Override
	public void onDisable() {
		
		
		
	}

	
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		
		
		return false;
		
	}

	@SuppressWarnings("unused")
	private void helpScreen(CommandSender sender) {
		
		sender.sendMessage(msgTag + "");
		
	}
	
}
