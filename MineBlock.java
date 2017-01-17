package com.classicsmc.src.antixray;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class MineBlock implements Listener {
	
	@EventHandler
	public void onBlockBreak(final BlockBreakEvent e) {
		
		Block block = e.getBlock();
		
		Player p = e.getPlayer();
		
		Location l = p.getLocation();
		
		Location blockUnderneathPlayer = new Location(l.getWorld(), l.getX(), l.getY() -1, l.getZ());
		int lightlevel = blockUnderneathPlayer.getBlock().getLightLevel();
		
		if(block.getType() == Material.DIAMOND_ORE) {
			
			Bukkit.broadcast(ChatColor.AQUA + e.getPlayer().getName() +
				" has mined diamond! L:" + lightlevel, 
				"classicsmc.antixray");
			
			return;
			
		} else if(block.getType() == Material.GOLD_ORE) {
			
			Bukkit.broadcast(ChatColor.GOLD + e.getPlayer().getName() + 
				" has mined gold! L:" + lightlevel, 
				"classicsmc.antixray");
			
			return;
			
		} else if(block.getType() == Material.IRON_ORE) {
			
			Bukkit.broadcast(ChatColor.GRAY + e.getPlayer().getName() + 
					" has mined iron! L:" + lightlevel, 
					"classicsmc.antixray");
			
		} else if(block.getType() == Material.LAPIS_ORE) {
			
			Bukkit.broadcast(ChatColor.BLUE + e.getPlayer().getName() + 
					" has mined lapis! L:" + lightlevel, 
					"classicsmc.antixray");
			
		}
		
	} 
}
