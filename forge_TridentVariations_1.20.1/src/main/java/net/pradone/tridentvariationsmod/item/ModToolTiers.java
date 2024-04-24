package net.pradone.tridentvariationsmod.item;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;
import net.pradone.tridentvariationsmod.TridentVariationsMod;
import net.pradone.tridentvariationsmod.util.ModTags;

import java.util.List;

public class ModToolTiers {
    public static final Tier WHITE_GOLD = TierSortingRegistry.registerTier(
            new ForgeTier(2,750,8f,2f,23,
                    ModTags.Blocks.NEEDS_WHITE_GOLD_TOOL, () -> Ingredient.of(ModItems.WHITE_GOLD_INGOT.get())),
            new ResourceLocation(TridentVariationsMod.MOD_ID, "white_gold_ingot"), List.of(Tiers.IRON), List.of(Tiers.DIAMOND));

    public static final Tier PINK_GOLD = TierSortingRegistry.registerTier(
            new ForgeTier(2,600,7f,2f,23,
                    ModTags.Blocks.NEEDS_PINK_GOLD_TOOL, () -> Ingredient.of(ModItems.PINK_GOLD_INGOT.get())),
            new ResourceLocation(TridentVariationsMod.MOD_ID, "pink_gold_ingot"), List.of(Tiers.IRON), List.of(Tiers.DIAMOND));
}
