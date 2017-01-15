package com.classicsmc.src.survival;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;

import com.classicsmc.src.main.ClassicsMCBundle;

public class SurvivalArmorCrafting {
	
	public void initReinforcedChestplateTier1(ClassicsMCBundle plugin) {
		
		ItemStack newChestplate = new ItemStack(Material.IRON_CHESTPLATE, 1);
		
		ItemMeta chestMeta = newChestplate.getItemMeta();
		
		chestMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
		
		chestMeta.setDisplayName(ChatColor.GRAY + "Reinforced Chestplate");
		
		newChestplate.setItemMeta(chestMeta);
		
		ShapedRecipe reinforcedChest = new ShapedRecipe(newChestplate);
		
		reinforcedChest.shape("iii", "i*i");
		
		reinforcedChest.setIngredient('i', Material.IRON_INGOT);
		reinforcedChest.setIngredient('*', Material.IRON_CHESTPLATE);
		
		plugin.getServer().addRecipe(reinforcedChest);
		
	}
	
	public void initReinforcedLeggingsTier1(ClassicsMCBundle plugin) {
		
		ItemStack newLeggings = new ItemStack(Material.IRON_LEGGINGS, 1);
		
		ItemMeta legMeta = newLeggings.getItemMeta();
		
		legMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
		
		legMeta.setDisplayName(ChatColor.GRAY + "Reinforced Leggings");
		
		newLeggings.setItemMeta(legMeta);
		
		ShapedRecipe reinforcedLeggings = new ShapedRecipe(newLeggings);
		
		reinforcedLeggings.shape("iii", "i*i");
		
		reinforcedLeggings.setIngredient('i', Material.IRON_INGOT);
		reinforcedLeggings.setIngredient('*', Material.IRON_LEGGINGS);
		
		plugin.getServer().addRecipe(reinforcedLeggings);
		
	}
	
	public void initReinforcedHelmetTier1(ClassicsMCBundle plugin) {
		
		ItemStack newHelmet = new ItemStack(Material.IRON_HELMET, 1);
		
		ItemMeta headMeta = newHelmet.getItemMeta();
		
		headMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
		
		headMeta.setDisplayName(ChatColor.GRAY + "Reinforced Helmet");
		
		newHelmet.setItemMeta(headMeta);
		
		ShapedRecipe reinforcedLeggings = new ShapedRecipe(newHelmet);
		
		reinforcedLeggings.shape("iii", "i*i");
		
		reinforcedLeggings.setIngredient('i', Material.IRON_INGOT);
		reinforcedLeggings.setIngredient('*', Material.IRON_HELMET);
		
		plugin.getServer().addRecipe(reinforcedLeggings);
		
	}
	
	public void initReinforcedBootsTier1(ClassicsMCBundle plugin) {
		
		ItemStack newBoots = new ItemStack(Material.IRON_BOOTS, 1);
		
		ItemMeta feetMeta = newBoots.getItemMeta();
		
		feetMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
		
		feetMeta.setDisplayName(ChatColor.GRAY + "Reinforced Footwear");
		
		newBoots.setItemMeta(feetMeta);
		
		ShapedRecipe reinforcedBoots = new ShapedRecipe(newBoots);
		
		reinforcedBoots.shape("iii", "i*i");
		
		reinforcedBoots.setIngredient('i', Material.IRON_INGOT);
		reinforcedBoots.setIngredient('*', Material.IRON_BOOTS);
		
		plugin.getServer().addRecipe(reinforcedBoots);
		
	}
	
	public void initReinforcedGoldChestplateTier1(ClassicsMCBundle plugin) {
		
		ItemStack newChestplate = new ItemStack(Material.GOLD_CHESTPLATE, 1);
		
		ItemMeta chestMeta = newChestplate.getItemMeta();
		
		chestMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
		
		chestMeta.setDisplayName(ChatColor.GRAY + "Reinforced Chestplate");
		
		newChestplate.setItemMeta(chestMeta);
		
		ShapedRecipe reinforcedChest = new ShapedRecipe(newChestplate);
		
		reinforcedChest.shape("iii", "i*i");
		
		reinforcedChest.setIngredient('i', Material.GOLD_INGOT);
		reinforcedChest.setIngredient('*', Material.GOLD_CHESTPLATE);
		
		plugin.getServer().addRecipe(reinforcedChest);
		
	}
	
	public void initReinforcedGoldLeggingsTier1(ClassicsMCBundle plugin) {
		
		ItemStack newLeggings = new ItemStack(Material.GOLD_LEGGINGS, 1);
		
		ItemMeta legMeta = newLeggings.getItemMeta();
		
		legMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
		
		legMeta.setDisplayName(ChatColor.GRAY + "Reinforced Leggings");
		
		newLeggings.setItemMeta(legMeta);
		
		ShapedRecipe reinforcedLeggings = new ShapedRecipe(newLeggings);
		
		reinforcedLeggings.shape("iii", "i*i");
		
		reinforcedLeggings.setIngredient('i', Material.GOLD_INGOT);
		reinforcedLeggings.setIngredient('*', Material.GOLD_LEGGINGS);
		
		plugin.getServer().addRecipe(reinforcedLeggings);
		
	}
	
	public void initReinforcedGoldHelmetTier1(ClassicsMCBundle plugin) {
		
		ItemStack newHelmet = new ItemStack(Material.GOLD_HELMET, 1);
		
		ItemMeta headMeta = newHelmet.getItemMeta();
		
		headMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
		
		headMeta.setDisplayName(ChatColor.GRAY + "Reinforced Helmet");
		
		newHelmet.setItemMeta(headMeta);
		
		ShapedRecipe reinforcedLeggings = new ShapedRecipe(newHelmet);
		
		reinforcedLeggings.shape("iii", "i*i");
		
		reinforcedLeggings.setIngredient('i', Material.GOLD_INGOT);
		reinforcedLeggings.setIngredient('*', Material.GOLD_HELMET);
		
		plugin.getServer().addRecipe(reinforcedLeggings);
		
	}
	
	public void initReinforcedGoldBootsTier1(ClassicsMCBundle plugin) {
		
		ItemStack newBoots = new ItemStack(Material.IRON_BOOTS, 1);
		
		ItemMeta feetMeta = newBoots.getItemMeta();
		
		feetMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
		
		feetMeta.setDisplayName(ChatColor.GRAY + "Reinforced Footwear");
		
		newBoots.setItemMeta(feetMeta);
		
		ShapedRecipe reinforcedBoots = new ShapedRecipe(newBoots);
		
		reinforcedBoots.shape("iii", "i*i");
		
		reinforcedBoots.setIngredient('i', Material.GOLD_INGOT);
		reinforcedBoots.setIngredient('*', Material.GOLD_BOOTS);
		
		plugin.getServer().addRecipe(reinforcedBoots);
		
	}
	
	public void initStuddedLeatherHat(ClassicsMCBundle plugin) {
		
		ItemStack newHat = new ItemStack(Material.LEATHER_HELMET, 1);
		
		ItemMeta hatMeta = newHat.getItemMeta();
		
		hatMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
		
		hatMeta.setDisplayName(ChatColor.GRAY + "Studded Leather Hat");
		
		newHat.setItemMeta(hatMeta);
		
		ShapedRecipe studdedLeatherHat = new ShapedRecipe(newHat);
		
		studdedLeatherHat.shape("lll", "lil", "lll");
		
		studdedLeatherHat.setIngredient('l', Material.LEATHER);
		studdedLeatherHat.setIngredient('i', Material.LEATHER_HELMET);
		
		plugin.getServer().addRecipe(studdedLeatherHat);
		
	}
	
	public void initStuddedLeatherChestplate(ClassicsMCBundle plugin) {
		
		ItemStack newChest = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
		
		ItemMeta chestMeta = newChest.getItemMeta();
		
		chestMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
		
		chestMeta.setDisplayName(ChatColor.GRAY + "Studded Leather Chestplate");
		
		newChest.setItemMeta(chestMeta);
		
		ShapedRecipe studdedLeatherChest = new ShapedRecipe(newChest);
		
		studdedLeatherChest.shape("lll", "lil", "lll");
		
		studdedLeatherChest.setIngredient('l', Material.LEATHER);
		studdedLeatherChest.setIngredient('i', Material.LEATHER_CHESTPLATE);
		
		plugin.getServer().addRecipe(studdedLeatherChest);
		
	}
	
	public void initStuddedLeatherLeggings(ClassicsMCBundle plugin) {
		
		ItemStack newLegs = new ItemStack(Material.LEATHER_LEGGINGS, 1);
		
		ItemMeta legMeta = newLegs.getItemMeta();
		
		legMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
		
		legMeta.setDisplayName(ChatColor.GRAY + "Studded Leather Leggings");
		
		newLegs.setItemMeta(legMeta);
		
		ShapedRecipe studdedLeatherLegs = new ShapedRecipe(newLegs);
		
		studdedLeatherLegs.shape("lll", "lil", "lll");
		
		studdedLeatherLegs.setIngredient('l', Material.LEATHER);
		studdedLeatherLegs.setIngredient('i', Material.LEATHER_LEGGINGS);
		
		plugin.getServer().addRecipe(studdedLeatherLegs);
		
	}
	
	public void initStuddedLeatherBoots(ClassicsMCBundle plugin) {
		
		ItemStack newBoots = new ItemStack(Material.LEATHER_BOOTS, 1);
		
		ItemMeta bootMeta = newBoots.getItemMeta();
		
		bootMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
		
		bootMeta.setDisplayName(ChatColor.GRAY + "Studded Leather Boots");
		
		newBoots.setItemMeta(bootMeta);
		
		ShapedRecipe studdedLeatherBoots = new ShapedRecipe(newBoots);
		
		studdedLeatherBoots.shape("lll", "lil", "lll");
		
		studdedLeatherBoots.setIngredient('l', Material.LEATHER);
		studdedLeatherBoots.setIngredient('i', Material.LEATHER_BOOTS);
		
		plugin.getServer().addRecipe(studdedLeatherBoots);
		
	}
	
}
