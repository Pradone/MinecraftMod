package net.pradone.tridentvariationsmod.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.pradone.tridentvariationsmod.TridentVariationsMod;
import net.pradone.tridentvariationsmod.item.ModItems;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends ItemTagsProvider {
    public ModItemTagGenerator(PackOutput p_275343_, CompletableFuture<HolderLookup.Provider> p_275729_, CompletableFuture<TagLookup<Block>> p_275322_, @Nullable ExistingFileHelper existingFileHelper) {
        super(p_275343_, p_275729_, p_275322_, TridentVariationsMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.WHITE_GOLD_HELMET.get(),
                        ModItems.WHITE_GOLD_CHESPLATE.get(),
                        ModItems.WHITE_GOLD_LEGGINGS.get(),
                        ModItems.WHITE_GOLD_BOOTS.get(),

                        ModItems.PINK_GOLD_HELMET.get(),
                        ModItems.PINK_GOLD_CHESPLATE.get(),
                        ModItems.PINK_GOLD_LEGGINGS.get(),
                        ModItems.PINK_GOLD_BOOTS.get());

    }
}
