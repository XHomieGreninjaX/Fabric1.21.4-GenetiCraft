package net.ajmc.geneticraft.item;

import net.ajmc.geneticraft.GenetiCraft;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item AMBER = registerItem("amber", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(GenetiCraft.MOD_ID,"amber")))));
    public static final Item AMBER_BRICK = registerItem("amber_brick", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(GenetiCraft.MOD_ID,"amber_brick")))));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(GenetiCraft.MOD_ID, name), item);
    }

    public static void registeredModItems(){
        GenetiCraft.LOGGER.info("Registering Mod Items for" + GenetiCraft.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(AMBER);
            entries.add(AMBER_BRICK);
        });
    }
}
