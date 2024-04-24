package net.pradone.tridentvariationsmod.item;

import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.pradone.tridentvariationsmod.TridentVariationsMod;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TridentVariationsMod.MOD_ID);


    //Items
    public static final RegistryObject<Item> DIAMONDRITE_INGOT = ITEMS.register("diamondrite_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> EMERALDRITE_INGOT = ITEMS.register("emeraldrite_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PINK_GOLD_INGOT = ITEMS.register("pink_gold_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> WHITE_GOLD_INGOT = ITEMS.register("white_gold_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ROSY_AMALGAMATION = ITEMS.register("rosy_amalgamation",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PALE_AMALGAMATION = ITEMS.register("pale_amalgamation",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> WHITE_GOLD_NUGGET = ITEMS.register("white_gold_nugget",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PINK_GOLD_NUGGET = ITEMS.register("pink_gold_nugget",
            () -> new Item(new Item.Properties()));


    //Food
    public static final RegistryObject<Item> WHITE_GOLD_BERRIES = ITEMS.register("white_gold_berries",
            () -> new Item(new Item.Properties().food(ModFood.WHITE_GOLD_BERRIES)));

    public static final RegistryObject<Item> PINK_GOLD_BERRIES = ITEMS.register("pink_gold_berries",
            () -> new Item(new Item.Properties().food(ModFood.PINK_GOLD_BERRIES)));


    //Tools
    public static RegistryObject<Item> WHITE_GOLD_PICKAXE = ITEMS.register("white_gold_pickaxe",
            () -> new PickaxeItem(ModToolTiers.WHITE_GOLD, 1,-2.6F, new Item.Properties()));

    public static RegistryObject<Item> WHITE_GOLD_AXE = ITEMS.register("white_gold_axe",
            () -> new AxeItem(ModToolTiers.WHITE_GOLD, 6.0F,-3.0F, new Item.Properties()));

    public static RegistryObject<Item> WHITE_GOLD_SHOVEL = ITEMS.register("white_gold_shovel",
            () -> new ShovelItem(ModToolTiers.WHITE_GOLD, 1.5F,-2.6F, new Item.Properties()));

    public static RegistryObject<Item> WHITE_GOLD_HOE = ITEMS.register("white_gold_hoe",
            () -> new HoeItem(ModToolTiers.WHITE_GOLD, -2,-0.9F, new Item.Properties()));


    public static RegistryObject<Item> PINK_GOLD_RAPIER = ITEMS.register("pink_gold_rapier",
            () -> new SwordItem(ModToolTiers.PINK_GOLD,3, -2.0F, new Item.Properties()));








    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
