package net.pradone.tridentvariationsmod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.pradone.tridentvariationsmod.TridentVariationsMod;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TridentVariationsMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab>  TRIDENT_VARIATIONS_TAB = CREATIVE_MODE_TABS.register("trident_variations_tab",
            () -> CreativeModeTab.builder().icon(()-> new ItemStack(Moditems.DIAMONDRITE_INGOT.get()))
                    .title(Component.translatable("creativetab.trident_variations_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(Moditems.DIAMONDRITE_INGOT.get());
                        pOutput.accept(Moditems.EMERALDRITE_INGOT.get());
                        pOutput.accept(Moditems.PINK_GOLD_INGOT.get());
                        pOutput.accept(Moditems.WHITE_GOLD_INGOT.get());

                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}