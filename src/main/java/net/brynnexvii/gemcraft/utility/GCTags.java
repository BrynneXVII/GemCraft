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

        //helper method to find tags
        private static TagKey<Block> tag(String name){
            return BlockTags.create(new ResourceLocation(GemCraft.MODID, name));
        }
    }

    public static class Items {


        private static TagKey<Item> tag(String name){
            return ItemTags.create(new ResourceLocation(GemCraft.MODID, name));
        }
    }
}
