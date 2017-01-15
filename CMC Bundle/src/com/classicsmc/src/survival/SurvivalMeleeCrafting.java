package com.classicsmc.src.survival;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;

import com.classicsmc.src.main.ClassicsMCBundle;

public class SurvivalMeleeCrafting {
	
	public void initHeavyWoodSwordTier1(ClassicsMCBundle plugin) {
		
		ItemStack newSword = new ItemStack(Material.WOOD_SWORD, 1);
		
		ItemMeta swordMeta = newSword.getItemMeta();
		
		swordMeta.addEnchant(Enchantment.DAMAGE_ALL, 1, true);
		
		swordMeta.setDisplayName(ChatColor.GRAY + "Sharp Sword");
		
		newSword.setItemMeta(swordMeta);
		
		ShapedRecipe heavySword = new ShapedRecipe(newSword);
		
		heavySword.shape("iii", "i*i");
		
		heavySword.setIngredient('i', Material.WOOD);
		heavySword.setIngredient('*', Material.WOOD_SWORD);
		
		plugin.getServer().addRecipe(heavySword);
		
	}
	
	public void initHeavyWoodAxeTier1(ClassicsMCBundle plugin) {
		
		ItemStack newAxe = new ItemStack(Material.WOOD_AXE, 1);
		
		ItemMeta axeMeta = newAxe.getItemMeta();
		
		axeMeta.addEnchant(Enchantment.DAMAGE_ALL, 1, true);
		
		axeMeta.setDisplayName(ChatColor.GRAY + "Sharp Sword");
		
		newAxe.setItemMeta(axeMeta);
		
		ShapedRecipe heavySword = new ShapedRecipe(newAxe);
		
		heavySword.shape("iii", "i*i");
		
		heavySword.setIngredient('i', Material.WOOD);
		heavySword.setIngredient('*', Material.WOOD_AXE);
		
		plugin.getServer().addRecipe(heavySword);
		
	}
	
	public void initHeavyStoneSwordTier1(ClassicsMCBundle plugin) {
		
		ItemStack newSword = new ItemStack(Material.STONE_SWORD, 1);
		
		ItemMeta swordMeta = newSword.getItemMeta();
		
		swordMeta.addEnchant(Enchantment.DAMAGE_ALL, 1, true);
		
		swordMeta.setDisplayName(ChatColor.GRAY + "Sharp Sword");
		
		newSword.setItemMeta(swordMeta);
		
		ShapedRecipe heavySword = new ShapedRecipe(newSword);
		
		heavySword.shape("iii", "i*i");
		
		heavySword.setIngredient('i', Material.COBBLESTONE);
		heavySword.setIngredient('*', Material.STONE_SWORD);
		
		plugin.getServer().addRecipe(heavySword);
		
	}
	
	public void initHeavyStoneAxeTier1(ClassicsMCBundle plugin) {
		
		ItemStack newAxe = new ItemStack(Material.IRON_SWORD, 1);
		
		ItemMeta axeMeta = newAxe.getItemMeta();
		
		axeMeta.addEnchant(Enchantment.DAMAGE_ALL, 1, true);
		
		axeMeta.setDisplayName(ChatColor.GRAY + "Sharp Sword");
		
		newAxe.setItemMeta(axeMeta);
		
		ShapedRecipe heavySword = new ShapedRecipe(newAxe);
		
		heavySword.shape("iii", "i*i");
		
		heavySword.setIngredient('i', Material.IRON_INGOT);
		heavySword.setIngredient('*', Material.IRON_AXE);
		
		plugin.getServer().addRecipe(heavySword);
		
	}
	
	public void initHeavyIronSwordTier1(ClassicsMCBundle plugin) {
		
		ItemStack newSword = new ItemStack(Material.IRON_SWORD, 1);
		
		ItemMeta swordMeta = newSword.getItemMeta();
		
		swordMeta.addEnchant(Enchantment.DAMAGE_ALL, 1, true);
		
		swordMeta.setDisplayName(ChatColor.GRAY + "Sharp Sword");
		
		newSword.setItemMeta(swordMeta);
		
		ShapedRecipe heavySword = new ShapedRecipe(newSword);
		
		heavySword.shape("iii", "i*i");
		
		heavySword.setIngredient('i', Material.IRON_INGOT);
		heavySword.setIngredient('*', Material.IRON_SWORD);
		
		plugin.getServer().addRecipe(heavySword);
		
	}
	
	public void initHeavyIronAxeTier1(ClassicsMCBundle plugin) {
		
		ItemStack newAxe = new ItemStack(Material.IRON_AXE, 1);
		
		ItemMeta axeMeta = newAxe.getItemMeta();
		
		axeMeta.addEnchant(Enchantment.DAMAGE_ALL, 1, true);
		
		axeMeta.setDisplayName(ChatColor.GRAY + "Sharp Sword");
		
		newAxe.setItemMeta(axeMeta);
		
		ShapedRecipe heavySword = new ShapedRecipe(newAxe);
		
		heavySword.shape("iii", "i*i");
		
		heavySword.setIngredient('i', Material.IRON_INGOT);
		heavySword.setIngredient('*', Material.IRON_AXE);
		
		plugin.getServer().addRecipe(heavySword);
		
	}
	
}
