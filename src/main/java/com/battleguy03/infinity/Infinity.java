package com.battleguy03.infinity;

import com.battleguy03.infinity.block.ModBlocks;
import com.battleguy03.infinity.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Infinity implements ModInitializer {

    private static final Logger LOGGER = LoggerFactory .getLogger("infinity");
    public static final String MOD_ID = "infinity";


    @Override
    public void onInitialize() {
        ModItems.registerModItems();
        ModBlocks.registerModBlocks();
    }
}
