package com.janko.missing_pieces.datagen;

import com.janko.missing_pieces.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    public static final List<ItemConvertible> ANDESITE_BRICKS = List.of(ModBlocks.ANDESITE_BRICKS);

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        offerSmelting(exporter, ANDESITE_BRICKS, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_ANDESITE_BRICKS,
                0.1f, 200, "andesite");
        offer2x2CompactingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICKS, Items.POLISHED_ANDESITE);
        createStairsRecipe(ModBlocks.ANDESITE_BRICK_STAIRS, Ingredient.ofItems(ModBlocks.ANDESITE_BRICKS));
        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS,ModBlocks.ANDESITE_BRICK_SLAB, Ingredient.ofItems(ModBlocks.ANDESITE_BRICKS));
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICK_WALL, ModBlocks.ANDESITE_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICKS, Blocks.ANDESITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICKS, Blocks.POLISHED_ANDESITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICK_STAIRS, Blocks.ANDESITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICK_STAIRS, Blocks.POLISHED_ANDESITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICK_SLAB, Blocks.ANDESITE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICK_SLAB, Blocks.POLISHED_ANDESITE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICK_WALL, Blocks.ANDESITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICK_WALL, Blocks.POLISHED_ANDESITE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICK_STAIRS, ModBlocks.ANDESITE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICK_SLAB, ModBlocks.ANDESITE_BRICKS, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICK_WALL, ModBlocks.ANDESITE_BRICKS);
    }
}
