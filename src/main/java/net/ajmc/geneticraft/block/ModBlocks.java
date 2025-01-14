package net.ajmc.geneticraft.block;

import net.ajmc.geneticraft.GenetiCraft;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.block.MapColor;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block AMBER_BLOCK = registerBlock("amber_block",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(GenetiCraft.MOD_ID, "amber_block")))
                    .mapColor(MapColor.YELLOW)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(0.5f,1f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.GILDED_BLACKSTONE)));
    public static final Block AMBER_BRICKS = registerBlock("amber_bricks",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(GenetiCraft.MOD_ID, "amber_bricks")))
                    .mapColor(MapColor.YELLOW)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5f,6f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.RESIN_BRICKS)));
    public static final Block AMBER_RESIDUE = registerBlock("amber_residue",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(GenetiCraft.MOD_ID, "amber_residue")))
                    .mapColor(MapColor.STONE_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(3f,3f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block DEEPSLATE_AMBER_RESIDUE = registerBlock("deepslate_amber_residue",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(GenetiCraft.MOD_ID, "deepslate_amber_residue")))
                    .mapColor(MapColor.DEEPSLATE_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(4.5f,3f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.DEEPSLATE)));


    private static Block registerBlock(String name, Block block){
        registeredBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(GenetiCraft.MOD_ID, name), block);
    }

    private static void registeredBlockItem(String name, Block block){
        Registry.register(Registries.ITEM, Identifier.of(GenetiCraft.MOD_ID, name),
                new BlockItem(block, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(GenetiCraft.MOD_ID, name)))));
    }

    public static void registerModBlocks(){
        GenetiCraft.LOGGER.info("Registering Mod Blocks for " + GenetiCraft.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(AMBER_BLOCK);
            entries.add(AMBER_BRICKS);
            entries.add(AMBER_RESIDUE);
            entries.add(DEEPSLATE_AMBER_RESIDUE);
        });
    }
}
