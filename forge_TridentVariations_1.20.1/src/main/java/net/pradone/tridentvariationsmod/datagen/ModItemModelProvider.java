package net.pradone.tridentvariationsmod.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.PackType;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.armortrim.TrimMaterial;
import net.minecraft.world.item.armortrim.TrimMaterials;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.pradone.tridentvariationsmod.TridentVariationsMod;
import net.pradone.tridentvariationsmod.item.ModItems;

import java.util.LinkedHashMap;

public class ModItemModelProvider extends ItemModelProvider {
    private static LinkedHashMap<ResourceKey<TrimMaterial>, Float> trimMaterials = new LinkedHashMap<>();
    static {
        trimMaterials.put(TrimMaterials.QUARTZ, 0.1F);
        trimMaterials.put(TrimMaterials.IRON, 0.2F);
        trimMaterials.put(TrimMaterials.NETHERITE, 0.3F);
        trimMaterials.put(TrimMaterials.REDSTONE, 0.4F);
        trimMaterials.put(TrimMaterials.COPPER, 0.5F);
        trimMaterials.put(TrimMaterials.GOLD, 0.6F);
        trimMaterials.put(TrimMaterials.EMERALD, 0.7F);
        trimMaterials.put(TrimMaterials.DIAMOND, 0.8F);
        trimMaterials.put(TrimMaterials.LAPIS, 0.9F);
        trimMaterials.put(TrimMaterials.AMETHYST, 1.0F);
    }

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

        trimmedArmorItem(ModItems.WHITE_GOLD_HELMET);
        trimmedArmorItem(ModItems.WHITE_GOLD_CHESPLATE);
        trimmedArmorItem(ModItems.WHITE_GOLD_LEGGINGS);
        trimmedArmorItem(ModItems.WHITE_GOLD_BOOTS);
        trimmedArmorItem(ModItems.PINK_GOLD_HELMET);
        trimmedArmorItem(ModItems.PINK_GOLD_CHESPLATE);
        trimmedArmorItem(ModItems.PINK_GOLD_LEGGINGS);
        trimmedArmorItem(ModItems.PINK_GOLD_BOOTS);
    }


    private void trimmedArmorItem(RegistryObject<Item> itemRegistryObject) {
        final String MOD_ID = TridentVariationsMod.MOD_ID;

        if(itemRegistryObject.get() instanceof ArmorItem armorItem) {
            trimMaterials.entrySet().forEach(entry -> {

                ResourceKey<TrimMaterial> trimMaterial = entry.getKey();
                float trimValue = entry.getValue();

                String armorType = switch (armorItem.getEquipmentSlot()) {
                    case HEAD -> "helmet";
                    case CHEST -> "chestplate";
                    case LEGS -> "leggings";
                    case FEET -> "boots";
                    default -> "";
                };

                String armorItemPath = "item/" + armorItem;
                String trimPath = "trims/items/" + armorType + "_trim_" + trimMaterial.location().getPath();
                String currentTrimName = armorItemPath + "_" + trimMaterial.location().getPath() + "_trim";
                ResourceLocation armorItemResLoc = new ResourceLocation(MOD_ID, armorItemPath);
                ResourceLocation trimResLoc = new ResourceLocation(trimPath); // minecraft namespace
                ResourceLocation trimNameResLoc = new ResourceLocation(MOD_ID, currentTrimName);

                existingFileHelper.trackGenerated(trimResLoc, PackType.CLIENT_RESOURCES, ".png", "textures");

                getBuilder(currentTrimName)
                        .parent(new ModelFile.UncheckedModelFile("item/generated"))
                        .texture("layer0", armorItemResLoc)
                        .texture("layer1", trimResLoc);

                this.withExistingParent(itemRegistryObject.getId().getPath(),
                                mcLoc("item/generated"))
                        .override()
                        .model(new ModelFile.UncheckedModelFile(trimNameResLoc))
                        .predicate(mcLoc("trim_type"), trimValue).end()
                        .texture("layer0",
                                new ResourceLocation(MOD_ID,
                                        "item/" + itemRegistryObject.getId().getPath()));
            });
        }
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
