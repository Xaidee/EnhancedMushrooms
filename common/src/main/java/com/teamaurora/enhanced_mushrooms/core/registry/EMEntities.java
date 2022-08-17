package com.teamaurora.enhanced_mushrooms.core.registry;

import com.teamaurora.enhanced_mushrooms.core.EnhancedMushrooms;
import gg.moonflower.pollen.api.PollenRegistries;
import gg.moonflower.pollen.api.entity.PollinatedBoatType;
import gg.moonflower.pollen.api.registry.PollinatedRegistry;
import net.minecraft.resources.ResourceLocation;

import java.util.function.Supplier;

/**
 * @author Steven
 * @author ebo2022
 */
public class EMEntities {
    public static final PollinatedRegistry<PollinatedBoatType> BOATS = PollinatedRegistry.create(PollenRegistries.BOAT_TYPE_REGISTRY, EnhancedMushrooms.MOD_ID);

    /* Boats */
    public static final Supplier<PollinatedBoatType> BROWN_MUSHROOM_BOAT = BOATS.register("brown_mushroom_boat", () -> new PollinatedBoatType(EnhancedMushrooms.location("textures/entity/boat/brown_mushroom.png")));
    public static final Supplier<PollinatedBoatType> RED_MUSHROOM_BOAT = BOATS.register("red_mushroom_boat", () -> new PollinatedBoatType(EnhancedMushrooms.location("textures/entity/boat/red_mushroom.png")));

    public static final Supplier<PollinatedBoatType> TOADSTOOL_BOAT = BOATS.register("toadstool_boat", () -> new PollinatedBoatType(EnhancedMushrooms.location("textures/entity/toadstool.png")));
    public static final Supplier<PollinatedBoatType> BOP_GLOWSHROOM_BOAT = BOATS.register("bop_glowshroom_boat", () -> new PollinatedBoatType(EnhancedMushrooms.location("textures/entity/bop_glowshroom.png")));

    public static final Supplier<PollinatedBoatType> DD_GLOWSHROOM_BOAT = BOATS.register("dd_glowshroom_boat", () -> new PollinatedBoatType(EnhancedMushrooms.location("textures/entity/boat/dd_glowshroom.png")));

}