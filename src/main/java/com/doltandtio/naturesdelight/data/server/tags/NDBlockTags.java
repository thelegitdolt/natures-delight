package com.doltandtio.naturesdelight.data.server.tags;

import com.doltandtio.naturesdelight.core.NaturesDelight;
import com.doltandtio.naturesdelight.core.registry.NDBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.data.event.GatherDataEvent;
import org.jetbrains.annotations.NotNull;
import vectorwing.farmersdelight.common.tag.ModTags;

import static com.doltandtio.naturesdelight.core.registry.NDBlocks.*;

public class NDBlockTags extends BlockTagsProvider {

    public NDBlockTags(GatherDataEvent event) {
        super(event.getGenerator().getPackOutput(), event.getLookupProvider(), NaturesDelight.MOD_ID, event.getExistingFileHelper());
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider provider) {
        this.tag(BlockTags.MINEABLE_WITH_AXE).add(ROSE_HIP.get(), ROSE_HIP_CRATE.get(), BOUNTIFUL_OAK_SAPLING.get());
        this.tag(BlockTags.MINEABLE_WITH_HOE).add(BOUNTIFUL_OAK_LEAVES.get());
        this.tag(BlockTags.LEAVES).add(BOUNTIFUL_OAK_LEAVES.get());

        this.tag(BlockTags.SAPLINGS).add(BOUNTIFUL_OAK_SAPLING.get());

        this.tag(ModTags.MINEABLE_WITH_KNIFE).add(ROSE_PETALS_SACK.get());

        this.tag(BlockTags.CROPS).add(ROSE_HIP.get());
    }
}
