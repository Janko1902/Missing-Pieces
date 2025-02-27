package com.janko.missing_pieces.item;

import com.janko.missing_pieces.MissingPieces;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item MISSING_PIECES = registerItem("missing_pieces", new Item(new FabricItemSettings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(MissingPieces.MOD_ID, name), item);
    }

    public static void registerItems() {
        MissingPieces.LOGGER.info("Registering Items for " + MissingPieces.MOD_ID);
    }
}
