package com.doltandtio.naturesdelight.data.server.tags;

import com.doltandtio.naturesdelight.core.NaturesDelight;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.data.event.GatherDataEvent;
import org.jetbrains.annotations.NotNull;
import vectorwing.farmersdelight.common.tag.ModTags;

import static com.doltandtio.naturesdelight.core.registry.NDBlocks.*;

public class NaDBlockTags extends BlockTagsProvider {

    public NaDBlockTags(GatherDataEvent event) {
        super(event.getGenerator().getPackOutput(), event.getLookupProvider(), NaturesDelight.MOD_ID, event.getExistingFileHelper());
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider provider) {
        this.tag(BlockTags.MINEABLE_WITH_AXE).add(ROSE_HIP.get(), ROSE_HIP_CRATE.get());
        this.tag(ModTags.MINEABLE_WITH_KNIFE).addOptional(ROSE_PETALS_SACK.getId());

        this.tag(BlockTags.CROPS).add(ROSE_HIP.get());


    }
}
