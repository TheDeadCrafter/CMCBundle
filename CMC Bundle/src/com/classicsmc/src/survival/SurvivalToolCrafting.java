package com.classicsmc.src.survival;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;

import com.classicsmc.src.main.ClassicsMCBundle;

public class SurvivalToolCrafting {
	
	public void initFineWoodPickaxeTier1(ClassicsMCBundle plugin) {
		
		ItemStack newPick = new ItemStack(Material.WOOD_PICKAXE, 1);
		
		ItemMeta pickMeta = newPick.getItemMeta();
		
		pickMeta.addEnchant(Enchantment.DIG_SPEED, 1, true);
		
		pickMeta.setDisplayName(ChatColor.GRAY + "Fine Pickaxe");
		
		newPick.setItemMeta(pickMeta);
		
		ShapedRecipe pickRecipe = new ShapedRecipe(newPick);
		
		pickRecipe.shape("iii", "i*i");
		
		pickRecipe.setIngredient('i', Material.WOOD);
		pickRecipe.setIngredient('*', Material.WOOD_PICKAXE);
		
		plugin.getServer().addRecipe(pickRecipe);
		
	}
	
	public void initFineStonePickaxeTier1(ClassicsMCBundle plugin) {
		
		ItemStack newPick = new ItemStack(Material.STONE_PICKAXE, 1);
		
		ItemMeta pickMeta = newPick.getItemMeta();
		
		pickMeta.addEnchant(Enchantment.DIG_SPEED, 1, true);
		
		pickMeta.setDisplayName(ChatColor.GRAY + "Fine Pickaxe");
		
		newPick.setItemMeta(pickMeta);
		
		ShapedRecipe pickRecipe = new ShapedRecipe(newPick);
		
		pickRecipe.shape("iii", "i*i");
		
		pickRecipe.setIngredient('i', Material.COBBLESTONE);
		pickRecipe.setIngredient('*', Material.STONE_PICKAXE);
		
		plugin.getServer().addRecipe(pickRecipe);
		
	}
	
	public void initFineIronPickaxeTier1(ClassicsMCBundle plugin) {
		
		ItemStack newPick = new ItemStack(Material.IRON_PICKAXE, 1);
		
		ItemMeta pickMeta = newPick.getItemMeta();
		
		pickMeta.addEnchant(Enchantment.DIG_SPEED, 1, true);
		
		pickMeta.setDisplayName(ChatColor.GRAY + "Fine Pickaxe");
		
		newPick.setItemMeta(pickMeta);
		
		ShapedRecipe pickRecipe = new ShapedRecipe(newPick);
		
		pickRecipe.shape("iii", "i*i");
		
		pickRecipe.setIngredient('i', Material.IRON_INGOT);
		pickRecipe.setIngredient('*', Material.IRON_PICKAXE);
		
		plugin.getServer().addRecipe(pickRecipe);
		
	}
	
	public void initFineGoldPickaxeTier1(ClassicsMCBundle plugin) {
		
		ItemStack newPick = new ItemStack(Material.GOLD_PICKAXE, 1);
		
		ItemMeta pickMeta = newPick.getItemMeta();
		
		pickMeta.addEnchant(Enchantment.DIG_SPEED, 1, true);
		
		pickMeta.setDisplayName(ChatColor.GRAY + "Fine Pickaxe");
		
		newPick.setItemMeta(pickMeta);
		
		ShapedRecipe pickRecipe = new ShapedRecipe(newPick);
		
		pickRecipe.shape("iii", "i*i");
		
		pickRecipe.setIngredient('i', Material.GOLD_INGOT);
		pickRecipe.setIngredient('*', Material.GOLD_PICKAXE);
		
		plugin.getServer().addRecipe(pickRecipe);
		
	}
	
	public void initFineDiamondPickaxeTier1(ClassicsMCBundle plugin) {
		
		ItemStack newPick = new ItemStack(Material.DIAMOND_PICKAXE, 1);
		
		ItemMeta pickMeta = newPick.getItemMeta();
		
		pickMeta.addEnchant(Enchantment.DIG_SPEED, 1, true);
		
		pickMeta.setDisplayName(ChatColor.GRAY + "Fine Pickaxe");
		
		newPick.setItemMeta(pickMeta);
		
		ShapedRecipe pickRecipe = new ShapedRecipe(newPick);
		
		pickRecipe.shape("iii", "i*i");
		
		pickRecipe.setIngredient('i', Material.DIAMOND);
		pickRecipe.setIngredient('*', Material.DIAMOND_PICKAXE);
		
		plugin.getServer().addRecipe(pickRecipe);
		
	}
	
}
