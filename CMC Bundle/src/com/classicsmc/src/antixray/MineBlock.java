package com.classicsmc.src.antixray;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class MineBlock implements Listener {
	public Material[] blocksToAlert; //Creating list for blocks to alert
	
	public void blockList() {
		blocksToAlert[0] = Material.IRON_ORE; //Adding Iron ore to block list
		blocksToAlert[1] = Material.GOLD_ORE; //Adding Gold ore to block list
		blocksToAlert[2] = Material.LAPIS_ORE; //Adding Lapis ore to block list
		blocksToAlert[3] = Material.DIAMOND_ORE; //Adding Diamond ore to block list
	}
	
	@EventHandler
	public void onBlockBreak(final BlockBreakEvent e) {
		for (int i = 0; i < blocksToAlert.length; i++) {
			Material m = blocksToAlert[i];
			Player p = e.getPlayer();
			if (e.getBlock().getType() == m) {
				Bukkit.broadcast(ChatColor.RED + "[MineAlert]" + p + "Has mined" + m, "classicsmc.antixray");
			}
		}
	} 
}
