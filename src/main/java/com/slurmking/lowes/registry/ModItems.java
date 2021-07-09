package com.slurmking.lowes.registry;

import com.slurmking.lowes.lowescraft;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final BlockItem PAPERCRETE_BLOCK = new BlockItem(ModBlocks.PAPERCRETE_BLOCK,new Item.Settings().group(ItemGroup.DECORATIONS));
    public static final BlockItem PAPERCRETE_BLOCK_YELLOW = new BlockItem(ModBlocks.PAPERCRETE_BLOCK_YELLOW,new Item.Settings().group(ItemGroup.DECORATIONS));
    public static final BlockItem PAPERCRETE_BLOCK_WHITE = new BlockItem(ModBlocks.PAPERCRETE_BLOCK_WHITE,new Item.Settings().group(ItemGroup.DECORATIONS));

    public static void registeritems(){
        Registry.register(Registry.ITEM,new Identifier(lowescraft.MOD_ID, "papercrete_block"),PAPERCRETE_BLOCK);
        Registry.register(Registry.ITEM,new Identifier(lowescraft.MOD_ID, "papercrete_block_yellow"),PAPERCRETE_BLOCK_YELLOW);
        Registry.register(Registry.ITEM,new Identifier(lowescraft.MOD_ID, "papercrete_block_white"),PAPERCRETE_BLOCK_WHITE);
    }
}
