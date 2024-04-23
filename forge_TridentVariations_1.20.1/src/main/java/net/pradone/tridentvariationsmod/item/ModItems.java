package net.pradone.tridentvariationsmod.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.pradone.tridentvariationsmod.TridentVariationsMod;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TridentVariationsMod.MOD_ID);

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


    public static final RegistryObject<Item> WHITE_GOLD_BERRIES = ITEMS.register("white_gold_berries",
            () -> new Item(new Item.Properties().food(ModFood.WHITE_GOLD_BERRIES)));

    public static final RegistryObject<Item> PINK_GOLD_BERRIES = ITEMS.register("pink_gold_berries",
            () -> new Item(new Item.Properties().food(ModFood.PINK_GOLD_BERRIES)));







    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
