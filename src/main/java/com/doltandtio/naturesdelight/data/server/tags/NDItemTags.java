package com.doltandtio.naturesdelight.data.server.tags;

import com.doltandtio.naturesdelight.core.registry.NDItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraftforge.data.event.GatherDataEvent;
import org.jetbrains.annotations.NotNull;

import static com.doltandtio.naturesdelight.core.registry.NDBlocks.*;
import static com.doltandtio.naturesdelight.core.registry.NDItems.CRUSHED_ICE;
import static com.doltandtio.naturesdelight.data.server.tags.NDTags.ItemTag.*;

public class NDItemTags extends ItemTagsProvider {
    public NDItemTags(GatherDataEvent e, NDBlockTags blockTags) {
        super(e.getGenerator().getPackOutput(), e.getLookupProvider(), blockTags.contentsGetter());
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider provider) {
        //Other
        this.tag(NDTags.ItemTag.ICE).add(Items.ICE, CRUSHED_ICE.get())
                .addOptional(new ResourceLocation("neapolitan", "ice_cubes"));
        this.tag(NDTags.ItemTag.SEEDS).add(NDItems.BLACK_ACORN.get(), NDItems.POPPY_SEEDS.get(), NDItems.SUNFLOWER_KERNELS.get());
        this.tag(NDTags.ItemTag.MILK_BUCKET).add(NDItems.SEED_MILK_BUCKET.get());
        this.tag(NDTags.ItemTag.MILK_BOTTLE).add(NDItems.SEED_MILK_BOTTLE.get());
        //Crops
        this.tag(NDTags.ItemTag.APPLE).add(NDItems.APPLE_SLICE.get(),Items.APPLE);
        this.tag(NDTags.ItemTag.POPPY_SEEDS).add(NDItems.POPPY_SEEDS.get(),NDItems.POPPY_SEED_PASTE.get());
        this.tag(ACORN).add(NDItems.BLACK_ACORN.get(),NDItems.ACORN_MEAL.get());
        this.tag(COCOA).add(Items.COCOA_BEANS,NDItems.COCOA_POWDER.get());
        this.tag(ROOTS).add(Items.CARROT,Items.BEETROOT,NDItems.DANDELION_ROOT.get());
        this.tag(MUSHROOM).add(Items.RED_MUSHROOM,Items.BROWN_MUSHROOM);
        //

        registerForgeTags();
    }

    protected void registerForgeTags() {
        tag(STORAGE_BLOCK_ROSE_HIP).add(ROSE_HIP_SACK.get().asItem());

        tag(STORAGE_BLOCK_POPPY_SEEDS).add(POPPY_SEEDS_SACK.get().asItem());
        tag(STORAGE_BLOCK_DANDELION_ROOT).add(DANDELION_ROOTS_CRATE.get().asItem());

        tag(STORAGE_BLOCK_SPRUCE_TIPS).add(SPRUCE_TIPS_SACK.get().asItem());
        tag(STORAGE_BLOCK_BLACK_ACORNS).add(BLACK_ACORN_SACK.get().asItem());
    }
}
