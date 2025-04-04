package com.doltandtio.naturesdelight.core.registry;

import com.doltandtio.naturesdelight.common.block.*;
import com.doltandtio.naturesdelight.common.worldgen.trees.grower.BountifulDarkOakTreeGrower;
import com.doltandtio.naturesdelight.common.worldgen.trees.grower.BountifulOakGrower;
import com.doltandtio.naturesdelight.core.NaturesDelight;
import com.teamabnormals.blueprint.core.util.item.CreativeModeTabContentsPopulator;
import com.teamabnormals.blueprint.core.util.registry.BlockSubRegistryHelper;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegistryObject;
import vectorwing.farmersdelight.common.registry.ModBlocks;

import static com.doltandtio.naturesdelight.core.registry.NDItems.*;
import static net.minecraft.world.item.crafting.Ingredient.of;

@Mod.EventBusSubscriber(modid = NaturesDelight.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class NDBlocks {
    public static final BlockSubRegistryHelper HELPER = NaturesDelight.REGISTRY_HELPER.getBlockSubHelper();
    //Chiller

    //Crops
        //Flower
    public static final RegistryObject<Block> POPPY_BUSH = HELPER.createBlockNoItem("poppy_bush", () ->
            new PoppyBushBlock(BlockBehaviour.Properties.copy(Blocks.BEETROOTS)));
    public static final RegistryObject<Block> DANDELION_BUSH = HELPER.createBlockNoItem("dandelion_bush", () ->
            new DandelionBushBlock(BlockBehaviour.Properties.copy(Blocks.POTATOES)));
    public static final RegistryObject<Block> ROSE_HIP = HELPER.createBlockNoItem("rose_hip", () -> new DoubleCropBlock(
            BlockBehaviour.Properties.copy(Blocks.WHEAT), 3));
        //Tree
    public static final RegistryObject<Block> BOUNTIFUL_OAK_SAPLING = HELPER.createFuelBlock("bountiful_oak_sapling", () ->
            new SaplingBlock(new BountifulOakGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)), 100);
    public static final RegistryObject<Block> BOUNTIFUL_OAK_LEAVES = HELPER.createBlock("bountiful_oak_leaves", () ->
            new BountifulLeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES), () -> Items.APPLE));
    public static final RegistryObject<Block> BOUNTIFUL_DARK_OAK_SAPLING = HELPER.createFuelBlock("bountiful_dark_oak_sapling", () ->
            new SaplingBlock(new BountifulDarkOakTreeGrower(), BlockBehaviour.Properties.copy(Blocks.DARK_OAK_SAPLING)), 100);
    public static final RegistryObject<Block> BOUNTIFUL_DARK_OAK_LEAVES = HELPER.createBlock("bountiful_dark_oak_leaves", () ->
            new BountifulLeavesBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_LEAVES), BLACK_ACORN));

    //Syrup Tap
    public static final RegistryObject<Block> TAPPER = HELPER.createBlockNoItem("tapper", () ->
            new TapperBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));

//Storage
    public static final RegistryObject<Block> DANDELION_ROOTS_CRATE = HELPER.createBlock("dandelion_roots_crate", () ->
            new Block(BlockBehaviour.Properties.copy(ModBlocks.CABBAGE_CRATE.get())));
    public static final RegistryObject<Block> POPPY_SEEDS_SACK = HELPER.createBlock("poppy_seeds_sack", () ->
            new Block(BlockBehaviour.Properties.copy(ModBlocks.RICE_BAG.get())));
    public static final RegistryObject<Block> ROSE_HIP_SACK = HELPER.createBlock("rose_hip_sack", () -> new Block(
            BlockBehaviour.Properties.copy(ModBlocks.RICE_BAG.get())));
    public static final RegistryObject<Block> BLACK_ACORN_SACK = HELPER.createBlock("black_acorn_sack", () -> new Block(
            BlockBehaviour.Properties.copy(ModBlocks.RICE_BAG.get())));
    public static final RegistryObject<Block> SPRUCE_TIPS_SACK = HELPER.createBlock("spruce_tips_sack", () -> new Block(
            BlockBehaviour.Properties.copy(ModBlocks.RICE_BAG.get())));


    public static void setupTabEditors() {
        CreativeModeTabContentsPopulator.mod(NaturesDelight.MOD_ID)
                .tab(CreativeModeTabs.NATURAL_BLOCKS)
                    .addItemsAfter(of(Items.BEETROOT_SEEDS), POPPY_SEEDS, DANDELION_ROOT, SPRUCE_TIPS)
                    .addItemsAfter(of(Items.OAK_SAPLING), BOUNTIFUL_OAK_SAPLING)
                    .addItemsAfter(of(Items.OAK_LEAVES), BOUNTIFUL_OAK_LEAVES)
                    .addItemsAfter(of(Items.DARK_OAK_SAPLING), BOUNTIFUL_DARK_OAK_SAPLING)
                    .addItemsAfter(of(Items.DARK_OAK_LEAVES), BOUNTIFUL_DARK_OAK_LEAVES)
                    .addItemsAfter(of(Items.HAY_BLOCK), DANDELION_ROOTS_CRATE, ROSE_HIP_SACK, POPPY_SEEDS_SACK, SPRUCE_TIPS_SACK, BLACK_ACORN_SACK)
                .tab(CreativeModeTabs.FOOD_AND_DRINKS)
                    .addItemsAfter(of(Items.BREAD), POPPY_SEED_BAGEL)
                    .addItemsAfter(of(Items.COOKED_RABBIT), COOKED_RABBIT_LEG)
                    .addItemsAfter(of(Items.COOKIE), ACORN_COOKIE,ROSE_COOKIE,BLACK_FOREST_MUFFIN,RED_VELVET_CUPCAKE)
                    .addItemsAfter(of(Items.APPLE),APPLE_SLICE,BLACK_ACORN,ROSE_HIP,SUNFLOWER_KERNELS)
                    .addItemsAfter(of(Items.HONEY_BOTTLE), DANDELION_ROOT_TEA,ROSE_GRANITA,ROSE_CORDIAL)
                    .addItemsAfter(of(Items.MILK_BUCKET), SEED_MILK_BOTTLE, SEED_MILK_BUCKET)
                    .addItemsAfter(of(Items.RABBIT), RAW_RABBIT_LEG)
                    .addItemsAfter(of(Items.RABBIT_STEW),ACORN_NOODLES,CREAMY_SALMON_BAGEL,DANDELION_FRIES,FORAGERS_GRANOLA,JAMMY_BREAKFAST_SANDWICH,KELP_AND_BEET_SALAD,KELP_WRAP,MEADOW_MEDLEY,ROSE_ROASTED_ROOTS,
                            SEASIDE_SIZZLER,STEAMY_KELP_RICE)
                .tab(CreativeModeTabs.INGREDIENTS)
                    .addItemsAfter(of(Items.WHEAT),ACORN_DOUGH,ACORN_MEAL,COCOA_POWDER,CRUSHED_ICE,POPPY_SEED_PASTE,ROSE_PETALS,WHEAT_FLOUR)
                .tab(CreativeModeTabs.TOOLS_AND_UTILITIES)
                .addItemsAfter(of(Items.SHEARS), FLINT_SHEARS);
    }
}
