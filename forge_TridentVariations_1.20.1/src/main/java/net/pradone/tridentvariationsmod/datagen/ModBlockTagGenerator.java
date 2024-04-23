package net.pradone.tridentvariationsmod.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.pradone.tridentvariationsmod.TridentVariationsMod;
import net.pradone.tridentvariationsmod.block.ModBlocks;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, TridentVariationsMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        //this.tag(ModTags.Blocks.ITEM)
        //          .add(ModBlocks.ITEM.get()).addTag(Tags.Blocks.TAG_NAME)
        // ADD TAGS FOR THE BLOCKS

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.PINK_GOLD_BLOCK.get(),
                        ModBlocks.WHITE_GOLD_BLOCK.get(),
                        ModBlocks.BUTIJAO.get());


        this.tag(BlockTags.NEEDS_STONE_TOOL);
        // nothing yet

        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.PINK_GOLD_BLOCK.get(),
                        ModBlocks.WHITE_GOLD_BLOCK.get(),
                        ModBlocks.BUTIJAO.get());

        this.tag(BlockTags.NEEDS_DIAMOND_TOOL);
        // nothing yet

        this.tag(Tags.Blocks.NEEDS_NETHERITE_TOOL);
        // nothing yet

    }
}
