package com.classicsmc.src.survival;

import org.bukkit.Material;
import org.bukkit.inventory.FurnaceRecipe;
import org.bukkit.inventory.ItemStack;

import com.classicsmc.src.main.ClassicsMCBundle;

public class SurvivalCraftLoader {
	
	private SurvivalArmorCrafting armor = new SurvivalArmorCrafting();
	private SurvivalMeleeCrafting melee = new SurvivalMeleeCrafting();
	private SurvivalToolCrafting tool = new SurvivalToolCrafting();
	
	public void initCrafting(ClassicsMCBundle plugin) {
		
		initCraftingFromClass(plugin);
		
		initFurnaceRecipes(plugin);
		
	}

	private void initFurnaceRecipes(ClassicsMCBundle plugin) {
		
		FurnaceRecipe gravelToFlint = 
				new FurnaceRecipe(new ItemStack(Material.FLINT, 1), Material.GRAVEL);
		
		plugin.getServer().addRecipe(gravelToFlint);
		
	}

	private void initCraftingFromClass(ClassicsMCBundle plugin) {
		
		armor.initReinforcedChestplateTier1(plugin);
		armor.initReinforcedLeggingsTier1(plugin);
		armor.initReinforcedHelmetTier1(plugin);
		armor.initReinforcedBootsTier1(plugin);
		
		armor.initReinforcedGoldChestplateTier1(plugin);
		armor.initReinforcedGoldLeggingsTier1(plugin);
		armor.initReinforcedGoldHelmetTier1(plugin);
		armor.initReinforcedGoldBootsTier1(plugin);
		
		armor.initStuddedLeatherHat(plugin);
		armor.initStuddedLeatherChestplate(plugin);
		armor.initStuddedLeatherLeggings(plugin);
		armor.initStuddedLeatherBoots(plugin);
		
		tool.initFineWoodPickaxeTier1(plugin);
		tool.initFineStonePickaxeTier1(plugin);
		tool.initFineIronPickaxeTier1(plugin);
		tool.initFineGoldPickaxeTier1(plugin);
		tool.initFineDiamondPickaxeTier1(plugin);
		
		melee.initHeavyIronSwordTier1(plugin);
		melee.initHeavyIronAxeTier1(plugin);
		
	}
	
}
