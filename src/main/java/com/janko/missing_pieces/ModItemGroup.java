package com.janko.missing_pieces;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(MissingPieces.MOD_ID, "missing_pieces_tab"),
            FabricItemGroup.builder().displayName(Text.translatable("itemGroup.missing_pieces"))
                    .icon(() -> new ItemStack(ModBlocks.POLISHED_ANDESITE_BRICKS)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.POLISHED_ANDESITE_BRICKS);
                        entries.add(ModBlocks.CRACKED_POLISHED_ANDESITE_BRICKS);
                    }).build());
}
