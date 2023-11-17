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
        public static final TagKey<Block> NEEDS_IGNIS_TOOL = tag("needs_ignis_tool");

        public static final TagKey<Block> IGNIS_ASPECTED_FLOWERS = tag("ignis_aspected_flowers");
        public static final TagKey<Block> ZEPHYR_ASPECTED_FLOWERS = tag("zephyr_aspected_flowers");
        public static final TagKey<Block> TERRA_ASPECTED_FLOWERS = tag("terra_aspected_flowers");
        public static final TagKey<Block> MIZU_ASPECTED_FLOWERS = tag("mizu_aspected_flowers");
        public static final TagKey<Block> AETHER_ASPECTED_FLOWERS = tag("aether_aspected_flowers");
        public static final TagKey<Block> LYS_ASPECTED_FLOWERS = tag("lys_aspected_flowers");
        public static final TagKey<Block> INANIS_ASPECTED_FLOWERS = tag("inanis_aspected_flowers");
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
        public static final TagKey<Item> HERBS = tag("herbs");

        private static TagKey<Item> tag(String name){
            return ItemTags.create(new ResourceLocation(GemCraft.MODID, name));
        }
    }
}
