package com.doltandtio.naturesdelight.data.server.tags;

import com.doltandtio.naturesdelight.core.NaturesDelight;
import com.doltandtio.naturesdelight.core.registry.NDBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.data.event.GatherDataEvent;
import org.checkerframework.common.value.qual.MinLenFieldInvariant;
import org.jetbrains.annotations.NotNull;
import vectorwing.farmersdelight.common.registry.ModBlocks;
import vectorwing.farmersdelight.common.tag.ModTags;

import static com.doltandtio.naturesdelight.core.registry.NDBlocks.*;
import static com.doltandtio.naturesdelight.data.server.tags.NDTags.BlockTag.*;

public class NDBlockTags extends BlockTagsProvider {

    public NDBlockTags(GatherDataEvent event) {
        super(event.getGenerator().getPackOutput(), event.getLookupProvider(), NaturesDelight.MOD_ID, event.getExistingFileHelper());
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider provider) {
        this.tag(TAPPABLE).addTags(BlockTags.BIRCH_LOGS);

        this.tag(BlockTags.SAPLINGS).add(BOUNTIFUL_OAK_SAPLING.get(), BOUNTIFUL_DARK_OAK_SAPLING.get());
        this.tag(BlockTags.LEAVES).add(BOUNTIFUL_DARK_OAK_LEAVES.get(), BOUNTIFUL_OAK_LEAVES.get());



        this.tag(BlockTags.CROPS).add(NDBlocks.ROSE_HIP.get(), DANDELION_BUSH.get(), POPPY_BUSH.get());
        this.tag(BlockTags.SMALL_FLOWERS).add(DANDELION_BUSH.get(), POPPY_BUSH.get());
        this.tag(BlockTags.TALL_FLOWERS).add(NDBlocks.ROSE_HIP.get());

        registerForgeTags();
        registerMineables();
    }

    protected void registerMineables() {
        this.tag(BlockTags.MINEABLE_WITH_AXE).add(NDBlocks.ROSE_HIP.get(), BOUNTIFUL_OAK_SAPLING.get(), BOUNTIFUL_DARK_OAK_SAPLING.get(),
                DANDELION_ROOTS_CRATE.get());
        this.tag(BlockTags.MINEABLE_WITH_HOE).add(BOUNTIFUL_OAK_LEAVES.get(), BOUNTIFUL_DARK_OAK_LEAVES.get());
        this.tag(BlockTags.LEAVES).add(BOUNTIFUL_OAK_LEAVES.get());
        this.tag(ModTags.MINEABLE_WITH_KNIFE).add(ROSE_HIP_SACK.get(), POPPY_SEEDS_SACK.get(), SPRUCE_TIPS_SACK.get(), BLACK_ACORN_SACK.get());
    }


    protected void registerForgeTags() {
        tag(STORAGE_BLOCK_ROSE_HIP).add(ROSE_HIP_SACK.get());

        tag(STORAGE_BLOCK_POPPY_SEEDS).add(POPPY_SEEDS_SACK.get());
        tag(STORAGE_BLOCK_DANDELION_ROOT).add(DANDELION_ROOTS_CRATE.get());

        tag(STORAGE_BLOCK_SPRUCE_TIPS).add(SPRUCE_TIPS_SACK.get());
        tag(STORAGE_BLOCK_BLACK_ACORNS).add(BLACK_ACORN_SACK.get());
    }


}
