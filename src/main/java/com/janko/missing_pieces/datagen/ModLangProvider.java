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

        translationBuilder.add(ModBlocks.CRACKED_POLISHED_ANDESITE_BRICKS, "Cracked Polished Andesite Bricks");
        translationBuilder.add(ModBlocks.POLISHED_ANDESITE_BRICKS, "Polished Andesite Bricks");
        translationBuilder.add(ModBlocks.POLISHED_ANDESITE_BRICK_STAIRS, "Polished Andesite Brick Stairs");
        translationBuilder.add(ModBlocks.POLISHED_ANDESITE_BRICK_SLAB, "Polished Andesite Brick Slab");
        translationBuilder.add(ModBlocks.POLISHED_ANDESITE_BRICK_WALL, "Polished Andesite Brick Wall");
    }
}
