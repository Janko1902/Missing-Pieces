package com.janko.missing_pieces.datagen;

import com.janko.missing_pieces.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.CRACKED_ANDESITE_BRICKS);
        addDrop(ModBlocks.ANDESITE_BRICKS);
        addDrop(ModBlocks.ANDESITE_BRICK_STAIRS);
        addDrop(ModBlocks.ANDESITE_BRICK_SLAB);
        addDrop(ModBlocks.ANDESITE_BRICK_WALL);
    }
}
