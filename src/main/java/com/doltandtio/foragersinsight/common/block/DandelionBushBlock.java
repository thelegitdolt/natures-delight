package com.doltandtio.foragersinsight.common.block;

import com.doltandtio.foragersinsight.core.registry.FIBlocks;
import com.doltandtio.foragersinsight.core.registry.FIItems;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockState;

public class DandelionBushBlock extends CropBlock {
    public DandelionBushBlock(Properties props) {
        super(props);
    }

    @Override
    public BlockState getPlant(BlockGetter level, BlockPos pos) {
        return FIBlocks.DANDELION_BUSH.get().defaultBlockState();
    }

    @Override
    protected ItemLike getBaseSeedId() {
        return FIItems.DANDELION_ROOT.get();
    }
}
