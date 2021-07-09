package com.slurmking.lowes;

import com.slurmking.lowes.registry.ModBlocks;
import com.slurmking.lowes.registry.ModItems;
import net.fabricmc.api.ModInitializer;

public class lowescraft implements ModInitializer {

    public static final String MOD_ID = "lowescraft";
    @Override
    public void onInitialize() {
        ModItems.registeritems();
        ModBlocks.registerBlocks();

    }
}
