package com.doltandtio.naturesdelight.core.other;

import com.doltandtio.naturesdelight.core.registry.NDMobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodData;
import net.minecraft.world.food.FoodProperties;
import net.minecraftforge.fml.common.Mod;
import vectorwing.farmersdelight.common.registry.ModEffects;

public class NDFoods {

    //Crops
            //This is for Apple Slices/Black Acorns
    public static final FoodProperties MID_SAT_MORSELS = new FoodProperties.Builder().fast()
            .nutrition(2).saturationMod(0.3f).build();
            //This is for Sunflower Kernels/Dandelion Root
    public static final FoodProperties LOW_SAT_MORSELS = new FoodProperties.Builder().fast()
            .nutrition(1).saturationMod(0.1f).build();
            //This is for Poppy Seeds/Rose Hips/Spruce Tips
    public static final FoodProperties NO_SAT_MORSELS= new FoodProperties.Builder().fast()
            .nutrition( 1).build();

    //DISHES
        //Comfort
    public static final FoodProperties COD_AND_PUMPKIN_STEW = new FoodProperties.Builder()
            .nutrition(10).saturationMod(0.9f)
            .effect(() -> new MobEffectInstance(ModEffects.COMFORT.get(),2500),1).build();
    public static final FoodProperties CREAMY_SALMON_BAGEL = new FoodProperties.Builder().fast()
            .nutrition(3).saturationMod(0.3f)
            .effect(() -> new MobEffectInstance(ModEffects.COMFORT.get(), 800), 1).build();
    public static final FoodProperties STEAMY_KELP_RICE = new FoodProperties.Builder()
            .nutrition(6).saturationMod(0.5f)
            .effect(() -> new MobEffectInstance(ModEffects.COMFORT.get(), 1200), 1).build();
    public static final FoodProperties FORAGERS_GRANOLA = new FoodProperties.Builder()
            .nutrition(6).saturationMod(0.6f)
            .effect(() -> new MobEffectInstance(ModEffects.COMFORT.get(), 1500), 1).build();
    public static final FoodProperties JAMMY_BREAKFAST_SANDWICH = new FoodProperties.Builder()
            .nutrition(8).saturationMod(0.7f)
            .effect(() -> new MobEffectInstance(ModEffects.COMFORT.get(), 1800), 1).build();
        //Chilled
        public static final FoodProperties ROSE_GRANITA = new FoodProperties.Builder()
                .nutrition(6).saturationMod(0.9f)
                .effect(() -> new MobEffectInstance(NDMobEffects.CHILLED.get(), 300), 1).build();
        //Medicinal

        //Nourishment
        public static final FoodProperties ACORN_NOODLES = new FoodProperties.Builder()
                .nutrition(7).saturationMod(0.6f)
                .effect(() -> new MobEffectInstance(ModEffects.NOURISHMENT.get(), 900), 1).build();
        public static final FoodProperties ROSE_ROASTED_ROOTS = new FoodProperties.Builder()
                .nutrition(12).saturationMod(1.1f)
                .effect(() -> new MobEffectInstance(ModEffects.NOURISHMENT.get(), 4000), 1).build();
        public static final FoodProperties SEASIDE_SIZZLER = new FoodProperties.Builder()
            .nutrition(10).saturationMod(0.9f)
            .effect(() -> new MobEffectInstance(ModEffects.NOURISHMENT.get(), 3600), 1).build();
        //Other
        public static final FoodProperties BAKED_GOOD = new FoodProperties.Builder()
                .nutrition(4).saturationMod(0.3f)
                .effect(() -> new MobEffectInstance(ModEffects.COMFORT.get(), 500), 1).build();
        public static final FoodProperties KELP_WRAP = new FoodProperties.Builder()
            .nutrition(8).saturationMod(0.7f).build();
        public static final FoodProperties SALAD = new FoodProperties.Builder()
            .nutrition(6).saturationMod(0.4f)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 100), 1).build();
        public static final FoodProperties DANDELION_FRIES = new FoodProperties.Builder().fast()
            .nutrition(3).saturationMod(0.3f).build();


    //DRINKS
    public static final FoodProperties ROSE_CORDIAL = new FoodProperties.Builder().alwaysEat()
            .nutrition(0)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 200), 1).build();
        //Chilled
        //Medicinal
        public static final FoodProperties DANDELION_ROOT_TEA = new FoodProperties.Builder().alwaysEat()
                .nutrition(0)
                .effect(() -> new MobEffectInstance(NDMobEffects.MEDICINAL.get(), 1200), 1).build();
        //Other
    //Ingredients
    public static final FoodProperties ACORN_DOUGH = new FoodProperties.Builder()
            .nutrition(2).saturationMod(0.3f)
            .effect(() -> new MobEffectInstance(MobEffects.HUNGER, 600, 0), 0.3F).build();
    public static final FoodProperties SEED_MILK_BOTTLE = new FoodProperties.Builder().build();
    public static final FoodProperties SEED_MILK_BUCKET = new FoodProperties.Builder().build();

    //Meat
    public static final FoodProperties RAW_RABBIT_LEG = new FoodProperties.Builder().meat()
            .nutrition(2).saturationMod(0.4f).build();
    public static final FoodProperties COOKED_RABBIT_LEG = new FoodProperties.Builder().meat()
            .nutrition(3).saturationMod(0.6f).build();
}
