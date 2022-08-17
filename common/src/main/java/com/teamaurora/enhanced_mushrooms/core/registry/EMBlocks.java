package com.teamaurora.enhanced_mushrooms.core.registry;

import com.mojang.datafixers.util.Pair;
import com.teamaurora.enhanced_mushrooms.common.blockentity.EMCabinetBlockEntity;
import com.teamaurora.enhanced_mushrooms.common.item.TabInsertBlockItem;
import com.teamaurora.enhanced_mushrooms.core.EnhancedMushrooms;
import com.teamaurora.enhanced_mushrooms.core.registry.util.GlowingWoodset;
import com.teamaurora.enhanced_mushrooms.core.registry.util.Woodset;
import gg.moonflower.pollen.api.block.PollinatedStandingSignBlock;
import gg.moonflower.pollen.api.block.PollinatedWallSignBlock;
import gg.moonflower.pollen.api.platform.Platform;
import gg.moonflower.pollen.api.registry.PollinatedBlockRegistry;
import gg.moonflower.pollen.api.registry.PollinatedRegistry;
import net.minecraft.core.Registry;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;

import java.util.function.Function;
import java.util.function.Supplier;

/**
 * @author Steven
 * @author Exoplanetary
 * @author ebo2022
 */
@SuppressWarnings("unused")
public class EMBlocks {

    public static final PollinatedBlockRegistry BLOCKS = PollinatedRegistry.createBlock(EMItems.ITEMS);
    public static final PollinatedRegistry<BlockEntityType<?>> BLOCK_ENTITIES = PollinatedRegistry.create(Registry.BLOCK_ENTITY_TYPE, EnhancedMushrooms.MOD_ID);

    // Red Mushroom Woodset
    private static final Woodset RED_MUSHROOM = new Woodset(MaterialColor.WOOL, MaterialColor.SAND);

    public static final Supplier<Block> STRIPPED_RED_MUSHROOM_STEM = BLOCKS.registerWithItem("stripped_red_mushroom_stem", RED_MUSHROOM::stripped_log, followItem(Items.STRIPPED_WARPED_STEM, new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final Supplier<Block> STRIPPED_RED_MUSHROOM_HYPHAE = BLOCKS.registerWithItem("stripped_red_mushroom_hyphae", RED_MUSHROOM::stripped_wood, followItem(Items.STRIPPED_WARPED_HYPHAE, new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final Supplier<Block> RED_MUSHROOM_STEM = BLOCKS.registerWithItem("red_mushroom_stem", RED_MUSHROOM::log, followItem(Items.WARPED_STEM, new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final Supplier<Block> RED_MUSHROOM_HYPHAE = BLOCKS.registerWithItem("red_mushroom_hyphae", RED_MUSHROOM::wood, followItem(Items.WARPED_HYPHAE, new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));

    public static final Supplier<Block> RED_MUSHROOM_PLANKS = BLOCKS.registerWithItem("red_mushroom_planks", RED_MUSHROOM::planks, followItem(Items.WARPED_PLANKS, new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final Supplier<Block> RED_MUSHROOM_SLAB = BLOCKS.registerWithItem("red_mushroom_slab", RED_MUSHROOM::slab, followItem(Items.WARPED_SLAB, new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final Supplier<Block> RED_MUSHROOM_STAIRS = BLOCKS.registerWithItem("red_mushroom_stairs", () -> RED_MUSHROOM.stairs(RED_MUSHROOM_PLANKS), followItem(Items.WARPED_STAIRS, new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final Supplier<Block> RED_MUSHROOM_PRESSURE_PLATE = BLOCKS.registerWithItem("red_mushroom_pressure_plate", RED_MUSHROOM::pressurePlate, followItem(Items.WARPED_PRESSURE_PLATE, new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE)));
    public static final Supplier<Block> RED_MUSHROOM_BUTTON = BLOCKS.registerWithItem("red_mushroom_button", RED_MUSHROOM::button, followItem(Items.WARPED_BUTTON, new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE)));
    public static final Supplier<Block> RED_MUSHROOM_FENCE = BLOCKS.registerWithItem("red_mushroom_fence", RED_MUSHROOM::fence, followItem(Items.WARPED_FENCE, new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final Supplier<Block> RED_MUSHROOM_FENCE_GATE = BLOCKS.registerWithItem("red_mushroom_fence_gate", RED_MUSHROOM::fenceGate, followItem(Items.WARPED_FENCE_GATE, new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE)));
    public static final Supplier<Block> RED_MUSHROOM_DOOR = BLOCKS.registerWithItem("red_mushroom_door", RED_MUSHROOM::door, followItem(Items.WARPED_DOOR, new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE)));
    public static final Supplier<Block> RED_MUSHROOM_TRAPDOOR = BLOCKS.registerWithItem("red_mushroom_trapdoor", RED_MUSHROOM::trapdoor, followItem(Items.WARPED_TRAPDOOR, new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE)));
    public static final Supplier<Block> RED_MUSHROOM_CABINET = BLOCKS.registerWithItem("red_mushroom_cabinet", RED_MUSHROOM::cabinet, new Item.Properties().tab(Platform.isModLoaded("farmersdelight") ? CreativeModeTab.TAB_BUILDING_BLOCKS : null));

    public static final Pair<Supplier<PollinatedStandingSignBlock>, Supplier<PollinatedWallSignBlock>> RED_MUSHROOM_SIGN = BLOCKS.registerSign("red_mushroom", Material.WOOD, MaterialColor.SAND);

    // Brown Mushroom Woodset
    private static final Woodset BROWN_MUSHROOM = new Woodset(MaterialColor.COLOR_ORANGE, MaterialColor.DIRT);

    public static final Supplier<Block> STRIPPED_BROWN_MUSHROOM_STEM = BLOCKS.registerWithItem("stripped_brown_mushroom_stem", BROWN_MUSHROOM::stripped_log, followItem(Items.STRIPPED_WARPED_STEM, new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final Supplier<Block> STRIPPED_BROWN_MUSHROOM_HYPHAE = BLOCKS.registerWithItem("stripped_brown_mushroom_hyphae", BROWN_MUSHROOM::stripped_wood, followItem(Items.STRIPPED_WARPED_HYPHAE, new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final Supplier<Block> BROWN_MUSHROOM_STEM = BLOCKS.registerWithItem("brown_mushroom_stem", BROWN_MUSHROOM::log, followItem(Items.WARPED_STEM, new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final Supplier<Block> BROWN_MUSHROOM_HYPHAE = BLOCKS.registerWithItem("brown_mushroom_hyphae", BROWN_MUSHROOM::wood, followItem(Items.WARPED_HYPHAE, new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));

    public static final Supplier<Block> BROWN_MUSHROOM_PLANKS = BLOCKS.registerWithItem("brown_mushroom_planks", BROWN_MUSHROOM::planks, followItem(Items.WARPED_PLANKS, new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final Supplier<Block> BROWN_MUSHROOM_SLAB = BLOCKS.registerWithItem("brown_mushroom_slab", BROWN_MUSHROOM::slab, followItem(Items.WARPED_SLAB, new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final Supplier<Block> BROWN_MUSHROOM_STAIRS = BLOCKS.registerWithItem("brown_mushroom_stairs", () -> BROWN_MUSHROOM.stairs(BROWN_MUSHROOM_PLANKS), followItem(Items.WARPED_STAIRS, new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final Supplier<Block> BROWN_MUSHROOM_PRESSURE_PLATE = BLOCKS.registerWithItem("brown_mushroom_pressure_plate", BROWN_MUSHROOM::pressurePlate, followItem(Items.WARPED_PRESSURE_PLATE, new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE)));
    public static final Supplier<Block> BROWN_MUSHROOM_BUTTON = BLOCKS.registerWithItem("brown_mushroom_button", BROWN_MUSHROOM::button, followItem(Items.WARPED_BUTTON, new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE)));
    public static final Supplier<Block> BROWN_MUSHROOM_FENCE = BLOCKS.registerWithItem("brown_mushroom_fence", BROWN_MUSHROOM::fence, followItem(Items.WARPED_FENCE, new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final Supplier<Block> BROWN_MUSHROOM_FENCE_GATE = BLOCKS.registerWithItem("brown_mushroom_fence_gate", BROWN_MUSHROOM::fenceGate, followItem(Items.WARPED_FENCE_GATE, new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE)));
    public static final Supplier<Block> BROWN_MUSHROOM_DOOR = BLOCKS.registerWithItem("brown_mushroom_door", BROWN_MUSHROOM::door, followItem(Items.WARPED_DOOR, new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE)));
    public static final Supplier<Block> BROWN_MUSHROOM_TRAPDOOR = BLOCKS.registerWithItem("brown_mushroom_trapdoor", BROWN_MUSHROOM::trapdoor, followItem(Items.WARPED_TRAPDOOR, new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE)));
    public static final Supplier<Block> BROWN_MUSHROOM_CABINET = BLOCKS.registerWithItem("brown_mushroom_cabinet", BROWN_MUSHROOM::cabinet, new Item.Properties().tab(Platform.isModLoaded("farmersdelight") ? CreativeModeTab.TAB_BUILDING_BLOCKS : null));

    public static final Pair<Supplier<PollinatedStandingSignBlock>, Supplier<PollinatedWallSignBlock>> BROWN_MUSHROOM_SIGN = BLOCKS.registerSign("brown_mushroom", Material.WOOD, MaterialColor.DIRT);

    /// Compat Mushroom Woodsets

    // Biomes O' Plenty Toadstool Woodste
    private static final Woodset TOADSTOOL = new Woodset(MaterialColor.COLOR_ORANGE, MaterialColor.SNOW);

    public static final Supplier<Block> STRIPPED_TOADSTOOL_STEM = BLOCKS.registerWithItem("stripped_toadstool_stem", TOADSTOOL::stripped_log, followItem(Items.STRIPPED_WARPED_STEM, new Item.Properties().tab(Platform.isModLoaded("biomesoplenty") ? CreativeModeTab.TAB_BUILDING_BLOCKS : null)));
    public static final Supplier<Block> STRIPPED_TOADSTOOL_HYPHAE = BLOCKS.registerWithItem("stripped_toadstool_hyphae", TOADSTOOL::stripped_wood, followItem(Items.STRIPPED_WARPED_HYPHAE, new Item.Properties().tab(Platform.isModLoaded("biomesoplenty") ? CreativeModeTab.TAB_BUILDING_BLOCKS : null)));
    public static final Supplier<Block> TOADSTOOL_STEM = BLOCKS.registerWithItem("toadstool_stem", TOADSTOOL::log, followItem(Items.WARPED_STEM, new Item.Properties().tab(Platform.isModLoaded("biomesoplenty") ? CreativeModeTab.TAB_BUILDING_BLOCKS : null)));
    public static final Supplier<Block> TOADSTOOL_HYPHAE = BLOCKS.registerWithItem("toadstool_hyphae", TOADSTOOL::wood, followItem(Items.WARPED_HYPHAE, new Item.Properties().tab(Platform.isModLoaded("biomesoplenty") ? CreativeModeTab.TAB_BUILDING_BLOCKS : null)));

    public static final Supplier<Block> TOADSTOOL_PLANKS = BLOCKS.registerWithItem("toadstool_planks", TOADSTOOL::planks, followItem(Items.WARPED_PLANKS, new Item.Properties().tab(Platform.isModLoaded("biomesoplenty") ? CreativeModeTab.TAB_BUILDING_BLOCKS : null)));
    public static final Supplier<Block> TOADSTOOL_SLAB = BLOCKS.registerWithItem("toadstool_slab", TOADSTOOL::slab, followItem(Items.WARPED_SLAB, new Item.Properties().tab(Platform.isModLoaded("biomesoplenty") ? CreativeModeTab.TAB_BUILDING_BLOCKS : null)));
    public static final Supplier<Block> TOADSTOOL_STAIRS = BLOCKS.registerWithItem("toadstool_stairs", () -> TOADSTOOL.stairs(TOADSTOOL_PLANKS), followItem(Items.WARPED_STAIRS, new Item.Properties().tab(Platform.isModLoaded("biomesoplenty") ? CreativeModeTab.TAB_BUILDING_BLOCKS : null)));
    public static final Supplier<Block> TOADSTOOL_PRESSURE_PLATE = BLOCKS.registerWithItem("toadstool_pressure_plate", TOADSTOOL::pressurePlate, followItem(Items.WARPED_PRESSURE_PLATE, new Item.Properties().tab(Platform.isModLoaded("biomesoplenty") ? CreativeModeTab.TAB_REDSTONE : null)));
    public static final Supplier<Block> TOADSTOOL_BUTTON = BLOCKS.registerWithItem("toadstool_button", TOADSTOOL::button, followItem(Items.WARPED_BUTTON, new Item.Properties().tab(Platform.isModLoaded("biomesoplenty") ? CreativeModeTab.TAB_REDSTONE : null)));
    public static final Supplier<Block> TOADSTOOL_FENCE = BLOCKS.registerWithItem("toadstool_fence", TOADSTOOL::fence, followItem(Items.WARPED_FENCE, new Item.Properties().tab(Platform.isModLoaded("biomesoplenty") ? CreativeModeTab.TAB_DECORATIONS : null)));
    public static final Supplier<Block> TOADSTOOL_FENCE_GATE = BLOCKS.registerWithItem("toadstool_fence_gate", TOADSTOOL::fenceGate, followItem(Items.WARPED_FENCE_GATE, new Item.Properties().tab(Platform.isModLoaded("biomesoplenty") ? CreativeModeTab.TAB_REDSTONE : null)));
    public static final Supplier<Block> TOADSTOOL_DOOR = BLOCKS.registerWithItem("toadstool_door", TOADSTOOL::door, followItem(Items.WARPED_DOOR, new Item.Properties().tab(Platform.isModLoaded("biomesoplenty") ? CreativeModeTab.TAB_REDSTONE : null)));
    public static final Supplier<Block> TOADSTOOL_TRAPDOOR = BLOCKS.registerWithItem("toadstool_trapdoor", TOADSTOOL::trapdoor, followItem(Items.WARPED_TRAPDOOR, new Item.Properties().tab(Platform.isModLoaded("biomesoplenty") ? CreativeModeTab.TAB_REDSTONE : null)));
    public static final Supplier<Block> TOADSTOOL_CABINET = BLOCKS.registerWithItem("toadstool_cabinet", TOADSTOOL::cabinet, new Item.Properties().tab(Platform.isModLoaded("farmersdelight") && Platform.isModLoaded("biomesoplenty") ? CreativeModeTab.TAB_BUILDING_BLOCKS : null));

    public static final Pair<Supplier<PollinatedStandingSignBlock>, Supplier<PollinatedWallSignBlock>> TOADSTOOL_SIGN = BLOCKS.registerSign("toadstool", BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.DIRT).noCollission().strength(1.0F).sound(SoundType.WOOD), new Item.Properties().stacksTo(16).tab(Platform.isModLoaded("biomesoplenty") ? CreativeModeTab.TAB_DECORATIONS : null));

    // Biomes O' Plenty Glowshroom Woodset

    private static final GlowingWoodset BOP_GLOWSHROOM = new GlowingWoodset(MaterialColor.SNOW, MaterialColor.DIAMOND, 8);

    public static final Supplier<Block> BOP_STRIPPED_GLOWSHROOM_STEM = BLOCKS.registerWithItem("bop_stripped_glowshroom_stem", BOP_GLOWSHROOM::stripped_log, followItem(Items.STRIPPED_WARPED_STEM, new Item.Properties().tab(Platform.isModLoaded("biomesoplenty") ? CreativeModeTab.TAB_BUILDING_BLOCKS : null)));
    public static final Supplier<Block> BOP_STRIPPED_GLOWSHROOM_HYPHAE = BLOCKS.registerWithItem("bop_stripped_glowshroom_hyphae", BOP_GLOWSHROOM::stripped_wood, followItem(Items.STRIPPED_WARPED_HYPHAE, new Item.Properties().tab(Platform.isModLoaded("biomesoplenty") ? CreativeModeTab.TAB_BUILDING_BLOCKS : null)));
    public static final Supplier<Block> BOP_GLOWSHROOM_STEM = BLOCKS.registerWithItem("bop_glowshroom_stem", BOP_GLOWSHROOM::log, followItem(Items.WARPED_STEM, new Item.Properties().tab(Platform.isModLoaded("biomesoplenty") ? CreativeModeTab.TAB_BUILDING_BLOCKS : null)));
    public static final Supplier<Block> BOP_GLOWSHROOM_HYPHAE = BLOCKS.registerWithItem("bop_glowshroom_hyphae", BOP_GLOWSHROOM::wood, followItem(Items.WARPED_HYPHAE, new Item.Properties().tab(Platform.isModLoaded("biomesoplenty") ? CreativeModeTab.TAB_BUILDING_BLOCKS : null)));

    public static final Supplier<Block> BOP_GLOWSHROOM_PLANKS = BLOCKS.registerWithItem("bop_glowshroom_planks", BOP_GLOWSHROOM::planks, followItem(Items.WARPED_PLANKS, new Item.Properties().tab(Platform.isModLoaded("biomesoplenty") ? CreativeModeTab.TAB_BUILDING_BLOCKS : null)));
    public static final Supplier<Block> BOP_GLOWSHROOM_SLAB = BLOCKS.registerWithItem("bop_glowshroom_slab", BOP_GLOWSHROOM::slab, followItem(Items.WARPED_SLAB, new Item.Properties().tab(Platform.isModLoaded("biomesoplenty") ? CreativeModeTab.TAB_BUILDING_BLOCKS : null)));
    public static final Supplier<Block> BOP_GLOWSHROOM_STAIRS = BLOCKS.registerWithItem("bop_glowshroom_stairs", () -> BOP_GLOWSHROOM.stairs(BOP_GLOWSHROOM_PLANKS), followItem(Items.WARPED_STAIRS, new Item.Properties().tab(Platform.isModLoaded("biomesoplenty") ? CreativeModeTab.TAB_BUILDING_BLOCKS : null)));
    public static final Supplier<Block> BOP_GLOWSHROOM_PRESSURE_PLATE = BLOCKS.registerWithItem("bop_glowshroom_pressure_plate", BOP_GLOWSHROOM::pressurePlate, followItem(Items.WARPED_PRESSURE_PLATE, new Item.Properties().tab(Platform.isModLoaded("biomesoplenty") ? CreativeModeTab.TAB_REDSTONE : null)));
    public static final Supplier<Block> BOP_GLOWSHROOM_BUTTON = BLOCKS.registerWithItem("bop_glowshroom_button", BOP_GLOWSHROOM::button, followItem(Items.WARPED_BUTTON, new Item.Properties().tab(Platform.isModLoaded("biomesoplenty") ? CreativeModeTab.TAB_REDSTONE : null)));
    public static final Supplier<Block> BOP_GLOWSHROOM_FENCE = BLOCKS.registerWithItem("bop_glowshroom_fence", BOP_GLOWSHROOM::fence, followItem(Items.WARPED_FENCE, new Item.Properties().tab(Platform.isModLoaded("biomesoplenty") ? CreativeModeTab.TAB_DECORATIONS : null)));
    public static final Supplier<Block> BOP_GLOWSHROOM_FENCE_GATE = BLOCKS.registerWithItem("bop_glowshroom_fence_gate", BOP_GLOWSHROOM::fenceGate, followItem(Items.WARPED_FENCE_GATE, new Item.Properties().tab(Platform.isModLoaded("biomesoplenty") ? CreativeModeTab.TAB_REDSTONE : null)));
    public static final Supplier<Block> BOP_GLOWSHROOM_DOOR = BLOCKS.registerWithItem("bop_glowshroom_door", BOP_GLOWSHROOM::door, followItem(Items.WARPED_DOOR, new Item.Properties().tab(Platform.isModLoaded("biomesoplenty") ? CreativeModeTab.TAB_REDSTONE : null)));
    public static final Supplier<Block> BOP_GLOWSHROOM_TRAPDOOR = BLOCKS.registerWithItem("bop_glowshroom_trapdoor", BOP_GLOWSHROOM::trapdoor, followItem(Items.WARPED_TRAPDOOR, new Item.Properties().tab(Platform.isModLoaded("biomesoplenty") ? CreativeModeTab.TAB_REDSTONE : null)));
    public static final Supplier<Block> BOP_GLOWSHROOM_CABINET = BLOCKS.registerWithItem("bop_glowshroom_cabinet", BOP_GLOWSHROOM::cabinet, new Item.Properties().tab(Platform.isModLoaded("farmersdelight") && Platform.isModLoaded("biomesoplenty") ? CreativeModeTab.TAB_BUILDING_BLOCKS : null));

    public static final Pair<Supplier<PollinatedStandingSignBlock>, Supplier<PollinatedWallSignBlock>> BOP_GLOWSHROOM_SIGN = BLOCKS.registerSign("bop_glowshroom", BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.DIAMOND).noCollission().strength(1.0F).sound(SoundType.WOOD), new Item.Properties().stacksTo(16).tab(Platform.isModLoaded("biomesoplenty") ? CreativeModeTab.TAB_DECORATIONS : null));

    // Darker Depths' Glowshroom Woodset
    private static final GlowingWoodset DD_GLOWSHROOM = new GlowingWoodset(MaterialColor.COLOR_ORANGE, MaterialColor.DIRT, 8);

    public static final Supplier<Block> DD_STRIPPED_GLOWSHROOM_STEM = BLOCKS.registerWithItem("dd_stripped_glowshroom_stem", DD_GLOWSHROOM::stripped_log, followItem(Items.STRIPPED_WARPED_STEM, new Item.Properties().tab(Platform.isModLoaded("darkerdepths") ? CreativeModeTab.TAB_BUILDING_BLOCKS : null)));
    public static final Supplier<Block> DD_STRIPPED_GLOWSHROOM_HYPHAE = BLOCKS.registerWithItem("dd_stripped_glowshroom_hyphae", DD_GLOWSHROOM::stripped_wood, followItem(Items.STRIPPED_WARPED_HYPHAE, new Item.Properties().tab(Platform.isModLoaded("darkerdepths") ? CreativeModeTab.TAB_BUILDING_BLOCKS : null)));
    public static final Supplier<Block> DD_GLOWSHROOM_STEM = BLOCKS.registerWithItem("dd_glowshroom_stem", DD_GLOWSHROOM::log, followItem(Items.WARPED_STEM, new Item.Properties().tab(Platform.isModLoaded("darkerdepths") ? CreativeModeTab.TAB_BUILDING_BLOCKS : null)));
    public static final Supplier<Block> DD_GLOWSHROOM_HYPHAE = BLOCKS.registerWithItem("dd_glowshroom_hyphae", DD_GLOWSHROOM::wood, followItem(Items.WARPED_HYPHAE, new Item.Properties().tab(Platform.isModLoaded("darkerdepths") ? CreativeModeTab.TAB_BUILDING_BLOCKS : null)));

    public static final Supplier<Block> DD_GLOWSHROOM_PLANKS = BLOCKS.registerWithItem("dd_glowshroom_planks", DD_GLOWSHROOM::planks, followItem(Items.WARPED_PLANKS, new Item.Properties().tab(Platform.isModLoaded("darkerdepths") ? CreativeModeTab.TAB_BUILDING_BLOCKS : null)));
    public static final Supplier<Block> DD_GLOWSHROOM_SLAB = BLOCKS.registerWithItem("dd_glowshroom_slab", DD_GLOWSHROOM::slab, followItem(Items.WARPED_SLAB, new Item.Properties().tab(Platform.isModLoaded("darkerdepths") ? CreativeModeTab.TAB_BUILDING_BLOCKS : null)));
    public static final Supplier<Block> DD_GLOWSHROOM_STAIRS = BLOCKS.registerWithItem("dd_glowshroom_stairs", () -> DD_GLOWSHROOM.stairs(DD_GLOWSHROOM_PLANKS), followItem(Items.WARPED_STAIRS, new Item.Properties().tab(Platform.isModLoaded("darkerdepths") ? CreativeModeTab.TAB_BUILDING_BLOCKS : null)));
    public static final Supplier<Block> DD_GLOWSHROOM_PRESSURE_PLATE = BLOCKS.registerWithItem("dd_glowshroom_pressure_plate", DD_GLOWSHROOM::pressurePlate, followItem(Items.WARPED_PRESSURE_PLATE, new Item.Properties().tab(Platform.isModLoaded("darkerdepths") ? CreativeModeTab.TAB_REDSTONE : null)));
    public static final Supplier<Block> DD_GLOWSHROOM_BUTTON = BLOCKS.registerWithItem("dd_glowshroom_button", DD_GLOWSHROOM::button, followItem(Items.WARPED_BUTTON, new Item.Properties().tab(Platform.isModLoaded("darkerdepths") ? CreativeModeTab.TAB_REDSTONE : null)));
    public static final Supplier<Block> DD_GLOWSHROOM_FENCE = BLOCKS.registerWithItem("dd_glowshroom_fence", DD_GLOWSHROOM::fence, followItem(Items.WARPED_FENCE, new Item.Properties().tab(Platform.isModLoaded("darkerdepths") ? CreativeModeTab.TAB_DECORATIONS : null)));
    public static final Supplier<Block> DD_GLOWSHROOM_FENCE_GATE = BLOCKS.registerWithItem("dd_glowshroom_fence_gate", DD_GLOWSHROOM::fenceGate, followItem(Items.WARPED_FENCE_GATE, new Item.Properties().tab(Platform.isModLoaded("darkerdepths") ? CreativeModeTab.TAB_REDSTONE : null)));
    public static final Supplier<Block> DD_GLOWSHROOM_DOOR = BLOCKS.registerWithItem("dd_glowshroom_door", DD_GLOWSHROOM::door, followItem(Items.WARPED_DOOR, new Item.Properties().tab(Platform.isModLoaded("darkerdepths") ? CreativeModeTab.TAB_REDSTONE : null)));
    public static final Supplier<Block> DD_GLOWSHROOM_TRAPDOOR = BLOCKS.registerWithItem("dd_glowshroom_trapdoor", DD_GLOWSHROOM::trapdoor, followItem(Items.WARPED_TRAPDOOR, new Item.Properties().tab(Platform.isModLoaded("darkerdepths") ? CreativeModeTab.TAB_REDSTONE : null)));
    public static final Supplier<Block> DD_GLOWSHROOM_CABINET = BLOCKS.registerWithItem("dd_glowshroom_cabinet", DD_GLOWSHROOM::cabinet, new Item.Properties().tab(Platform.isModLoaded("farmersdelight") && Platform.isModLoaded("darkerdepths") ? CreativeModeTab.TAB_BUILDING_BLOCKS : null));

    public static final Pair<Supplier<PollinatedStandingSignBlock>, Supplier<PollinatedWallSignBlock>> DD_GLOWSHROOM_SIGN = BLOCKS.registerSign("dd_glowshroom", BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.DIRT).noCollission().strength(1.0F).sound(SoundType.WOOD), new Item.Properties().stacksTo(16).tab(Platform.isModLoaded("darkerdepths") ? CreativeModeTab.TAB_DECORATIONS : null));

    // Cabinet Block Entity
    public static final Supplier<BlockEntityType<EMCabinetBlockEntity>> CABINET_BE = BLOCK_ENTITIES.register("cabinet", () -> BlockEntityType.Builder.of(EMCabinetBlockEntity::new, EMBlocks.BROWN_MUSHROOM_CABINET.get(), EMBlocks.RED_MUSHROOM_CABINET.get()).build(null));

    private static Function<Block, Item> followItem(Item insertAfter, Item.Properties properties) {
        return object -> new TabInsertBlockItem(insertAfter, object, properties);
    }
}
