package net.ajmc.geneticraft;

import net.ajmc.geneticraft.block.ModBlocks;
import net.ajmc.geneticraft.item.ModItemGroups;
import net.ajmc.geneticraft.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GenetiCraft implements ModInitializer {
	public static final String MOD_ID = "geneticraft";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registeredModItems();
		ModBlocks.registerModBlocks();
	}
}