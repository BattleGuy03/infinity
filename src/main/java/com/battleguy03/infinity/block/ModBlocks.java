package com.battleguy03.infinity.block;

import com.battleguy03.infinity.Infinity;
import net.minecraft.block.*;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    // list of blocks to add
    public static final Block ENDERITE_BLOCK = registerBlock("enderite_block",
            new Block(AbstractBlock.Settings.copy(Blocks.DIAMOND_BLOCK)));
    public static final Block VACILIUM = registerBlock("vacilium",
            new PillarBlock(AbstractBlock.Settings.create().mapColor(MapColor.PINK).instrument(NoteBlockInstrument.BASEDRUM).strength(3.0F,9.0F).sounds(BlockSoundGroup.NYLIUM).requiresTool()));
    public static final Block SPARSE_VACILIUM = registerBlock("sparse_vacilium",
            new PillarBlock(AbstractBlock.Settings.create().mapColor(MapColor.PINK).instrument(NoteBlockInstrument.BASEDRUM).strength(3.0F,9.0F).sounds(BlockSoundGroup.NYLIUM).requiresTool()));


    // register block magic
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(Infinity.MOD_ID, name), block);
    }


    // register block ITEM magic
    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, Identifier.of(Infinity.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }


    // this is for console stuff I'm not adding
    public static void registerModBlocks() {



    }
}
