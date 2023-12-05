package net.brynnexvii.gemcraft.worldgen;

import net.brynnexvii.gemcraft.GemCraft;
import net.brynnexvii.gemcraft.block.GCBlocks;
import net.brynnexvii.gemcraft.worldgen.GCConfiguredFeatures;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.placement.*;

import java.util.List;

public class GCPlacedFeatures {
    public static final ResourceKey<PlacedFeature> WILLOW_PLACED_KEY = registerKey("willow_placed");
    public static final ResourceKey<PlacedFeature> IGNIS_PLACED_KEY = registerKey("ignis_placed");
    public static final ResourceKey<PlacedFeature> VIOLET_LILY_PLACED_KEY = registerKey("violet_lily_placed");

    public static void bootstrap(BootstapContext<PlacedFeature> context){
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        register(context, WILLOW_PLACED_KEY, configuredFeatures.getOrThrow(GCConfiguredFeatures.WILLOW_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(3, 0.1f, 2), // num per chunk, extra chance (1/extra chance must be an int), num extra
                        GCBlocks.WILLOW_SAPLING.get()));
        register(context, IGNIS_PLACED_KEY, configuredFeatures.getOrThrow(GCConfiguredFeatures.IGNIS_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(1, 0.1f, 1), // num per chunk, extra chance (1/extra chance must be an int), num extra
                        GCBlocks.IGNIS_SAPLING.get()));

        register(context, VIOLET_LILY_PLACED_KEY, configuredFeatures.getOrThrow(GCConfiguredFeatures.VIOLET_LILY_KEY),
                List.of(RarityFilter.onAverageOnceEvery(4), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));
    }


    //Helper methods
    public static ResourceKey<PlacedFeature> registerKey(String name){
        return ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(GemCraft.MODID, name));
    }

    private static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration, List<PlacementModifier> modifiers){
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}
