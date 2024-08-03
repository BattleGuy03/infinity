package com.battleguy03.infinity.item;

import com.battleguy03.infinity.Infinity;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static com.battleguy03.infinity.block.ModBlocks.*;

public class ModItems {


    // list of items to add
    public static final Item ENDERITE_INGOT = registerItem("enderite_ingot", new Item(new Item.Settings()));
    public static final Item RAW_ENDERITE = registerItem("raw_enderite", new Item(new Item.Settings()));

    // adding items to their respective item tabs
    private static void addItemsToIngredientItemTab(FabricItemGroupEntries entries) {
        entries.add(ENDERITE_INGOT);
        entries.add(RAW_ENDERITE);
    }
    private static void addItemsToBuildingBlocksItemTab(FabricItemGroupEntries entries) {
        entries.add(ENDERITE_BLOCK);
    }
    private static void addItemsToNaturalItemTab(FabricItemGroupEntries entries) {
        entries.add(VACILLIUM);
        entries.add(SPARSE_VACILLIUM);
    }

    // item adding magic
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Infinity.MOD_ID, name), item);
    }
    
    // registering mod items obv
    public static void registerModItems() {

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemTab);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(ModItems::addItemsToBuildingBlocksItemTab);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(ModItems::addItemsToNaturalItemTab);

    }

}
