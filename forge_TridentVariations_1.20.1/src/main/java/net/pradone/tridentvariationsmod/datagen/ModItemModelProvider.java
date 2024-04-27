package net.pradone.tridentvariationsmod.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.pradone.tridentvariationsmod.TridentVariationsMod;
import net.pradone.tridentvariationsmod.item.ModItems;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, TridentVariationsMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.DIAMONDRITE_INGOT);
        simpleItem(ModItems.EMERALDRITE_INGOT);
        simpleItem(ModItems.PALE_AMALGAMATION);
        simpleItem(ModItems.ROSY_AMALGAMATION);
        simpleItem(ModItems.PINK_GOLD_NUGGET);
        simpleItem(ModItems.WHITE_GOLD_NUGGET);
        simpleItem(ModItems.PINK_GOLD_INGOT);
        simpleItem(ModItems.WHITE_GOLD_INGOT);

        simpleItem(ModItems.PINK_GOLD_BERRIES);
        simpleItem(ModItems.WHITE_GOLD_BERRIES);

        handheldItem(ModItems.WHITE_GOLD_PICKAXE);
        handheldItem(ModItems.WHITE_GOLD_AXE);
        handheldItem(ModItems.WHITE_GOLD_SHOVEL);
        handheldItem(ModItems.WHITE_GOLD_HOE);
        handheldItem(ModItems.PINK_GOLD_PICKAXE);
        handheldItem(ModItems.PINK_GOLD_AXE);
        handheldItem(ModItems.PINK_GOLD_SHOVEL);
        handheldItem(ModItems.PINK_GOLD_HOE);
    }


    private ItemModelBuilder simpleItem(RegistryObject<Item> item){
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(TridentVariationsMod.MOD_ID,"item/" + item.getId().getPath()));
    }

    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(TridentVariationsMod.MOD_ID,"item/" + item.getId().getPath()));
    }

    private ItemModelBuilder simpleBlockItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(TridentVariationsMod.MOD_ID,"item/" + item.getId().getPath()));
    }
}
