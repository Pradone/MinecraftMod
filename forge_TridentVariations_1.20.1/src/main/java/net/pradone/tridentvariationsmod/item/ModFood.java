package net.pradone.tridentvariationsmod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFood {
    public static final FoodProperties WHITE_GOLD_BERRIES = new FoodProperties.Builder().nutrition(4).saturationMod(1.2f).fast()
            .effect(new MobEffectInstance(MobEffects.REGENERATION, 120, 0), 1.0F)
            .effect(new MobEffectInstance(MobEffects.ABSORPTION, 1200, 0), 1.0F)
            .effect(new MobEffectInstance(MobEffects.DIG_SPEED, 1200, 1), 1.0F)
            .effect(new MobEffectInstance(MobEffects.LUCK, 200,0),0.3F).alwaysEat().build();

    public static final FoodProperties PINK_GOLD_BERRIES = new FoodProperties.Builder().nutrition(6).saturationMod(1.2f).fast()
            .effect(new MobEffectInstance(MobEffects.REGENERATION, 200, 1), 1.0F)
            .effect(new MobEffectInstance(MobEffects.ABSORPTION, 1200, 0), 1.0F)
            .effect(new MobEffectInstance(MobEffects.SATURATION, 200,0),0.3F).alwaysEat().build();
}
