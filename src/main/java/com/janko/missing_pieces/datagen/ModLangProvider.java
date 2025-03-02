package com.janko.missing_pieces.datagen;

import com.janko.missing_pieces.block.ModBlocks;
import com.janko.missing_pieces.item.ModItemGroup;
import com.janko.missing_pieces.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

public class ModLangProvider extends FabricLanguageProvider {
    public ModLangProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        translationBuilder.add("itemGroup.missing_pieces", "Missing Pieces");

        translationBuilder.add(ModItems.MISSING_PIECES, "Missing Pieces");

        translationBuilder.add(ModBlocks.CRACKED_ANDESITE_BRICKS, "Cracked Andesite Bricks");
        translationBuilder.add(ModBlocks.ANDESITE_BRICKS, "Andesite Bricks");
        translationBuilder.add(ModBlocks.ANDESITE_BRICK_STAIRS, "Andesite Brick Stairs");
        translationBuilder.add(ModBlocks.ANDESITE_BRICK_SLAB, "Andesite Brick Slab");
        translationBuilder.add(ModBlocks.ANDESITE_BRICK_WALL, "Andesite Brick Wall");
    }
}
