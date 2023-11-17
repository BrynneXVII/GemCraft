package net.brynnexvii.gemcraft.item;

import net.brynnexvii.gemcraft.GemCraft;
import net.brynnexvii.gemcraft.utility.GCTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class GCToolTiers {
    public static final Tier IGNIS_GARNET = TierSortingRegistry.registerTier(
           new ForgeTier(3, 1750, 8.5F, 3.5f, 15, GCTags.Blocks.NEEDS_IGNIS_TOOL,
                   () -> Ingredient.of(GCItems.RAW_GARNET.get())), // level, uses, speed, damage bonus, enchantment value, tags, repair material
            new ResourceLocation(GemCraft.MODID, "ignis_garnet"), List.of(Tiers.DIAMOND), List.of(Tiers.NETHERITE));
}
