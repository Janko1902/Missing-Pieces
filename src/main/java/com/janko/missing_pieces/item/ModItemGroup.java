package com.janko.missing_pieces.item;

import com.janko.missing_pieces.MissingPieces;
import com.janko.missing_pieces.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup MISSING_PIECES = Registry.register(Registries.ITEM_GROUP,
            new Identifier(MissingPieces.MOD_ID, "missing_pieces_tab"),
            FabricItemGroup.builder().displayName(Text.translatable("itemGroup.missing_pieces"))
                    .icon(() -> new ItemStack(ModItems.MISSING_PIECES)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.CRACKED_POLISHED_ANDESITE_BRICKS);
                        entries.add(ModBlocks.POLISHED_ANDESITE_BRICKS);
                        entries.add(ModBlocks.POLISHED_ANDESITE_BRICK_STAIRS);
                        entries.add(ModBlocks.POLISHED_ANDESITE_BRICK_SLAB);
                        entries.add(ModBlocks.POLISHED_ANDESITE_BRICK_WALL);
                    }).build());

    public static void registerItemGroups() {
        MissingPieces.LOGGER.info("Registering Item Groups for " + MissingPieces.MOD_ID);
    }
}
