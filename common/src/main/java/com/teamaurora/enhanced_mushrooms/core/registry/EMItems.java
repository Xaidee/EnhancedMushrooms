package com.teamaurora.enhanced_mushrooms.core.registry;

import com.teamaurora.enhanced_mushrooms.core.EnhancedMushrooms;
import gg.moonflower.pollen.api.item.PollinatedBoatItem;
import gg.moonflower.pollen.api.platform.Platform;
import gg.moonflower.pollen.api.registry.PollinatedRegistry;
import net.minecraft.core.Registry;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;

import java.util.function.Supplier;

/**
 * @author Steven
 * @author Exoplanetary
 */
public class EMItems {
    public static final PollinatedRegistry<Item> ITEMS = PollinatedRegistry.create(Registry.ITEM, EnhancedMushrooms.MOD_ID);

    /* Boats */
    public static final Supplier<Item> BROWN_MUSHROOM_BOAT_ITEM = ITEMS.register("brown_mushroom_boat", () -> new PollinatedBoatItem(EMEntities.BROWN_MUSHROOM_BOAT, new Item.Properties().stacksTo(1).tab(CreativeModeTab.TAB_TRANSPORTATION)));
    public static final Supplier<Item> RED_MUSHROOM_BOAT_ITEM = ITEMS.register("red_mushroom_boat", () -> new PollinatedBoatItem(EMEntities.RED_MUSHROOM_BOAT, new Item.Properties().stacksTo(1).tab(CreativeModeTab.TAB_TRANSPORTATION)));

    public static final Supplier<Item> TOADSTOOL_BOAT_ITEM = ITEMS.register("toadstool_boat", () -> new PollinatedBoatItem(EMEntities.TOADSTOOL_BOAT, new Item.Properties().stacksTo(1).tab(Platform.isModLoaded("biomesoplenty") ? CreativeModeTab.TAB_TRANSPORTATION : null)));
    public static final Supplier<Item> BOP_GLOWSHROOM_BOAT_ITEM = ITEMS.register("bop_glowshroom_boat", () -> new PollinatedBoatItem(EMEntities.BOP_GLOWSHROOM_BOAT, new Item.Properties().stacksTo(1).tab(Platform.isModLoaded("biomesoplenty") ? CreativeModeTab.TAB_TRANSPORTATION : null)));

    public static final Supplier<Item> DD_GLOWSHROOM_BOAT_ITEM = ITEMS.register("dd_glowshroom_boat", () -> new PollinatedBoatItem(EMEntities.DD_GLOWSHROOM_BOAT, new Item.Properties().stacksTo(1).tab(Platform.isModLoaded("darkerdepths") ? CreativeModeTab.TAB_TRANSPORTATION : null)));

}