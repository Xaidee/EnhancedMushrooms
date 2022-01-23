package com.teamaurora.enhanced_mushrooms.core;

import com.teamaurora.enhanced_mushrooms.core.registry.EMBlocks;
import com.teamaurora.enhanced_mushrooms.core.registry.EMItems;
import gg.moonflower.pollen.api.platform.Platform;
import gg.moonflower.pollen.api.registry.StrippingRegistry;
import gg.moonflower.pollen.api.registry.client.RenderTypeRegistry;
import gg.moonflower.pollen.api.registry.resource.ResourceRegistry;
import gg.moonflower.pollen.api.util.PollinatedModContainer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;

public class EnhancedMushrooms {
    public static final String MOD_ID = "enhanced_mushrooms";
    public static final Platform PLATFORM = Platform.builder(MOD_ID)
            .clientInit(EnhancedMushrooms::onClientInit)
            .clientPostInit(EnhancedMushrooms::onClientPostInit)
            .commonInit(EnhancedMushrooms::onCommonInit)
            .commonPostInit(EnhancedMushrooms::onCommonPostInit)
            .build();

    public static void onClientInit() {
        RenderTypeRegistry.register(EMBlocks.BROWN_MUSHROOM_DOOR.get(), RenderType.cutoutMipped());
        RenderTypeRegistry.register(EMBlocks.BROWN_MUSHROOM_TRAPDOOR.get(), RenderType.cutoutMipped());

        PollinatedModContainer.get(MOD_ID).ifPresent(modContainer -> ResourceRegistry.registerBuiltinResourcePack(new ResourceLocation(EnhancedMushrooms.MOD_ID, "vanilla_overrides"), modContainer, false));
    }

    public static void onClientPostInit(Platform.ModSetupContext ctx) {}

    public static void onCommonInit() {
        EMBlocks.BLOCKS.register(EnhancedMushrooms.PLATFORM);
        EMItems.ITEMS.register(EnhancedMushrooms.PLATFORM);

        StrippingRegistry.register(EMBlocks.RED_MUSHROOM_STEM.get(), EMBlocks.STRIPPED_RED_MUSHROOM_STEM.get());
        StrippingRegistry.register(EMBlocks.BROWN_MUSHROOM_STEM.get(), EMBlocks.STRIPPED_BROWN_MUSHROOM_STEM.get());
    }

    public static void onCommonPostInit(Platform.ModSetupContext ctx) {}
}