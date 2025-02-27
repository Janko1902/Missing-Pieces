package com.janko.missing_pieces;

import com.janko.missing_pieces.block.ModBlocks;
import com.janko.missing_pieces.item.ModItemGroup;
import com.janko.missing_pieces.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MissingPieces implements ModInitializer {
	public static final String MOD_ID = "missing_pieces";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroup.registerItemGroups();
		ModBlocks.registerBlocks();
		ModItems.registerItems();
	}
}