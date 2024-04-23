package net.pradone.tridentvariationsmod.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.pradone.tridentvariationsmod.TridentVariationsMod;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> NEEDS_WHITE_GOLD_TOOL = tag("need_white_gold_tool");
        public static final TagKey<Block> NEEDS_PINK_GOLD_TOOL = tag("need_pink_gold_tool");


        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(TridentVariationsMod.MOD_ID, name));
        }
    }

    public static class Items{

        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(TridentVariationsMod.MOD_ID, name));
        }
    }
}
