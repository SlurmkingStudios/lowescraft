package com.slurmking.lowes.registry;

import com.slurmking.lowes.lowescraft;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
    public static final Block PAPERCRETE_BLOCK = new Block(FabricBlockSettings.of(Material.WOOD));
    public static final Block PAPERCRETE_BLOCK_YELLOW = new Block(FabricBlockSettings.of(Material.WOOD));
    public static final Block PAPERCRETE_BLOCK_WHITE = new Block(FabricBlockSettings.of(Material.WOOD));

    public static void registerBlocks(){
        Registry.register(Registry.BLOCK, new Identifier(lowescraft.MOD_ID, "papercrete_block"), PAPERCRETE_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(lowescraft.MOD_ID, "papercrete_block_yellow"), PAPERCRETE_BLOCK_YELLOW);
        Registry.register(Registry.BLOCK, new Identifier(lowescraft.MOD_ID, "papercrete_block_white"), PAPERCRETE_BLOCK_WHITE);
    }
}
