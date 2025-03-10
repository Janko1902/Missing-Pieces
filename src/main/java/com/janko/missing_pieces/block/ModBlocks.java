package com.janko.missing_pieces.block;

import com.janko.missing_pieces.MissingPieces;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block CRACKED_ANDESITE_BRICKS = registerBlock("cracked_andesite_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.POLISHED_ANDESITE)));
    public static final Block ANDESITE_BRICKS = registerBlock("andesite_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.POLISHED_ANDESITE)));
    public static final Block ANDESITE_BRICK_STAIRS = registerBlock("andesite_brick_stairs",
            new StairsBlock(ModBlocks.ANDESITE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.POLISHED_ANDESITE)));
    public static final Block ANDESITE_BRICK_SLAB = registerBlock("andesite_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.POLISHED_ANDESITE)));
    public static final Block ANDESITE_BRICK_WALL = registerBlock("andesite_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.POLISHED_ANDESITE)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(MissingPieces.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(MissingPieces.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerBlocks() {
        MissingPieces.LOGGER.info("Registering Blocks for " + MissingPieces.MOD_ID);
    }
}
