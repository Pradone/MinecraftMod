package net.pradone.tridentvariationsmod.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.pradone.tridentvariationsmod.TridentVariationsMod;

public class Moditems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TridentVariationsMod.MOD_ID);

    public static final RegistryObject<Item> DIAMONDRITE_INGOT = ITEMS.register("diamondrite_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> EMERALDRITE_INGOT = ITEMS.register("emeraldrite_ingot",
            () -> new Item(new Item.Properties()));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
