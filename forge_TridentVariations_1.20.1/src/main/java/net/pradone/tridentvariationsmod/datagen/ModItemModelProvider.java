package net.pradone.tridentvariationsmod.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
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
    }


    private ItemModelBuilder simpleItem(RegistryObject<Item> item){
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(TridentVariationsMod.MOD_ID,"item/" + item.getId().getPath()));
    }
}