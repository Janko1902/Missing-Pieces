package com.janko.missing_pieces.datagen;

import com.janko.missing_pieces.block.ModBlocks;
import com.janko.missing_pieces.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider  {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CRACKED_ANDESITE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool polishedAndesite = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ANDESITE_BRICKS);
        polishedAndesite.stairs(ModBlocks.ANDESITE_BRICK_STAIRS);
        polishedAndesite.slab(ModBlocks.ANDESITE_BRICK_SLAB);
        polishedAndesite.wall(ModBlocks.ANDESITE_BRICK_WALL);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.MISSING_PIECES, Models.GENERATED);
    }
}
