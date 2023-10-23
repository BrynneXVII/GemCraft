package net.brynnexvii.gemcraft.utility;

import net.brynnexvii.gemcraft.GemCraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class GCTags {
    public static class Blocks {
        public static final TagKey<Block> RED_INTERACTING_FLOWERS = tag("red_interacting_flowers");
        public static final TagKey<Block> GREEN_INTERACTING_FLOWERS = tag("green_interacting_flowers");
        public static final TagKey<Block> WHITE_INTERACTING_FLOWERS = tag("white_interacting_flowers");
        public static final TagKey<Block> GEM_ORES = tag("gem_ores");
        public static final TagKey<Block> WILLOW_LOGS = tag("willow_logs");

        //helper method to find tags
        private static TagKey<Block> tag(String name){
            return BlockTags.create(new ResourceLocation(GemCraft.MODID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> RAW_GEMS = tag("raw_gems");
        public static final TagKey<Item> GEM_ORES = tag("gem_ores");
        public static final TagKey<Item> JEWEL_POWDERS = tag("jewel_powders");
        public static final TagKey<Item> WILLOW_LOGS = tag("willow_logs");

        private static TagKey<Item> tag(String name){
            return ItemTags.create(new ResourceLocation(GemCraft.MODID, name));
        }
    }
}
