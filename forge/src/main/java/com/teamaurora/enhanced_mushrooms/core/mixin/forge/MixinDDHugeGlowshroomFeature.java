package com.teamaurora.enhanced_mushrooms.core.mixin.forge;

import com.naterbobber.darkerdepths.init.DDBlocks;
import com.naterbobber.darkerdepths.world.gen.features.HugeGlowshroomFeature;
import com.teamaurora.enhanced_mushrooms.core.registry.EMBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.LevelWriter;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(HugeGlowshroomFeature.class)
public class MixinDDHugeGlowshroomFeature {
    @Redirect(remap = false, method = "hugeGlowshroom", at = @At(value = "INVOKE", target = "Lcom/naterbobber/darkerdepths/world/gen/features/HugeGlowshroomFeature;m_5974_(Lnet/minecraft/world/level/LevelWriter;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)V"))
    public void placeEnhancedSmallGlowshroom(HugeGlowshroomFeature self, LevelWriter levelWriter, BlockPos blockPos, BlockState blockState) {
        if (blockState.is(DDBlocks.GLOWSHROOM_STEM.get())) {
            levelWriter.setBlock(blockPos, EMBlocks.DD_GLOWSHROOM_STEM.get().defaultBlockState(), 3);
        } else {
            levelWriter.setBlock(blockPos, blockState, 3);
        }
    }

    @Redirect(remap = false, method = "smallGlowshroom", at = @At(value = "INVOKE", target = "Lcom/naterbobber/darkerdepths/world/gen/features/HugeGlowshroomFeature;m_5974_(Lnet/minecraft/world/level/LevelWriter;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)V"))
    public void placeEnhancedHugeGlowshroom(HugeGlowshroomFeature self, LevelWriter levelWriter, BlockPos blockPos, BlockState blockState) {
        if (blockState.is(DDBlocks.GLOWSHROOM_STEM.get())) {
            levelWriter.setBlock(blockPos, EMBlocks.DD_GLOWSHROOM_STEM.get().defaultBlockState(), 3);
        } else {
            levelWriter.setBlock(blockPos, blockState, 3);
        }
    }
}
