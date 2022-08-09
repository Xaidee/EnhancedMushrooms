package com.teamaurora.enhanced_mushrooms.core.mixin.forge;

import com.naterbobber.darkerdepths.world.gen.features.HugeGlowshroomFeature;
import com.teamaurora.enhanced_mushrooms.core.registry.EMBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(HugeGlowshroomFeature.class)
public class MixinDDHugeGlowshroomFeature {
    @Redirect(remap = false, method = "hugeGlowshroom", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/level/WorldGenLevel;m_8055_(Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/BlockState;"))
    public BlockState placeEnhancedHugeGlowshroom(WorldGenLevel world, BlockPos pos) {
        return EMBlocks.DD_GLOWSHROOM_STEM.get().defaultBlockState();
    }

    @Redirect(remap = false, method = "smallGlowshroom", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/level/WorldGenLevel;m_8055_(Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/BlockState;"))
    public BlockState placeEnhancedSmallGlowshroom(WorldGenLevel world, BlockPos pos) {
        return EMBlocks.DD_GLOWSHROOM_STEM.get().defaultBlockState();
    }

    //(Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/core/BlockPos;I)Lnet/minecraft/world/level/block/state/BlockState;
}
