package net.ajmc.geneticraft.item;

import net.ajmc.geneticraft.GenetiCraft;
import net.ajmc.geneticraft.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup GENETICRAFT_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(GenetiCraft.MOD_ID, "geneticraft_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.AMBER))
                    .displayName(Text.translatable("itemgroup.geneticraft.geneticraft_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.AMBER);
                        entries.add(ModItems.AMBER_BRICK);
                    }).build());

    public static final ItemGroup GENETICRAFT_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(GenetiCraft.MOD_ID, "geneticraft_blocks"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.AMBER_BLOCK))
                    .displayName(Text.translatable("itemgroup.geneticraft.geneticraft_blocks"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.AMBER_BLOCK);
                        entries.add(ModBlocks.AMBER_BRICKS);
                        entries.add(ModBlocks.AMBER_RESIDUE);
                        entries.add(ModBlocks.DEEPSLATE_AMBER_RESIDUE);
                    }).build());

    public static void registerItemGroups(){
        GenetiCraft.LOGGER.info("Registering Item Groups for " + GenetiCraft.MOD_ID);
    }
}
