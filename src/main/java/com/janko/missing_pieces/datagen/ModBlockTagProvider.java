package com.janko.missing_pieces.datagen;

import com.janko.missing_pieces.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected  void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.CRACKED_ANDESITE_BRICKS)
                .add(ModBlocks.ANDESITE_BRICKS);

        getOrCreateTagBuilder(BlockTags.STAIRS)
                .add(ModBlocks.ANDESITE_BRICK_STAIRS);

        getOrCreateTagBuilder(BlockTags.SLABS)
                .add(ModBlocks.ANDESITE_BRICK_SLAB);

        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(ModBlocks.ANDESITE_BRICK_WALL);
    }
}
