package net.pradone.tridentvariationsmod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFood {
    public static final FoodProperties WHITE_GOLDEN_APPLE = new FoodProperties.Builder().nutrition(4).saturationMod(1.2f)
            .effect(new MobEffectInstance(MobEffects.REGENERATION, 200, 1), 1.0F)
            .effect(new MobEffectInstance(MobEffects.ABSORPTION, 2400, 0), 1.0F)
            .effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 3000, 2), 1.0F).alwaysEat().build();
}
