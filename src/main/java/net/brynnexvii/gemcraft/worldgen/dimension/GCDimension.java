package net.brynnexvii.gemcraft.worldgen.dimension;

import com.mojang.datafixers.util.Pair;
import net.brynnexvii.gemcraft.GemCraft;
import net.brynnexvii.gemcraft.worldgen.biome.GCBiomes;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.biome.*;
import net.minecraft.world.level.dimension.BuiltinDimensionTypes;
import net.minecraft.world.level.dimension.DimensionType;
import net.minecraft.world.level.dimension.LevelStem;
import net.minecraft.world.level.levelgen.NoiseBasedChunkGenerator;
import net.minecraft.world.level.levelgen.NoiseGeneratorSettings;

import java.util.List;
import java.util.OptionalLong;


public class GCDimension {
    public static final ResourceKey<LevelStem> GEMCRAFT_DIM_KEY = ResourceKey.create(Registries.LEVEL_STEM, new ResourceLocation(GemCraft.MODID, "gemcraft_dim"));
    public static final ResourceKey<Level> GEMCRAFT_DIM_LEVEL_KEY = ResourceKey.create(Registries.DIMENSION, new ResourceLocation(GemCraft.MODID, "gemcraft_dim"));
    public static final ResourceKey<DimensionType> GEMCRAFT_DIM_TYPE = ResourceKey.create(Registries.DIMENSION_TYPE, new ResourceLocation(GemCraft.MODID, "gemcraft_dim_type"));

    public static void bootstrapType(BootstapContext<DimensionType> context) {
        context.register(GEMCRAFT_DIM_TYPE, new DimensionType(
                OptionalLong.of(12000), // fixedTime
                false, // hasSkylight
                false, // hasCeiling
                false, // ultraWarm
                false, // natural
                1.0, // coordinateScale
                true, // bedWorks
                true, // respawnAnchorWorks
                -64, // minY
                256, // height
                256, // logicalHeight
                BlockTags.INFINIBURN_OVERWORLD, // infiniburn
                BuiltinDimensionTypes.OVERWORLD_EFFECTS, // effectsLocation
                1.0f, // ambientLight
                new DimensionType.MonsterSettings(false, false, ConstantInt.of(0), 0)));
    }

    public static void bootstrapStem(BootstapContext<LevelStem> context) {
        HolderGetter<Biome> biomeRegistry = context.lookup(Registries.BIOME);
        HolderGetter<DimensionType> dimTypes = context.lookup(Registries.DIMENSION_TYPE);
        HolderGetter<NoiseGeneratorSettings> noiseGenSettings = context.lookup(Registries.NOISE_SETTINGS);

        NoiseBasedChunkGenerator wrappedChunkGenerator = new NoiseBasedChunkGenerator(
                new FixedBiomeSource(biomeRegistry.getOrThrow(GCBiomes.IGNIS_OVERWORLD)),
                noiseGenSettings.getOrThrow(NoiseGeneratorSettings.AMPLIFIED)); //one singular biome

        NoiseBasedChunkGenerator noiseBasedChunkGenerator = new NoiseBasedChunkGenerator( //multibiome, changing below params changes the spawn
                MultiNoiseBiomeSource.createFromList(
                        new Climate.ParameterList<>(List.of(
                                Pair.of(Climate.parameters(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), biomeRegistry.getOrThrow(GCBiomes.IGNIS_OVERWORLD)),
                                Pair.of(Climate.parameters(0.1F, 0.2F, 0.0F, 0.2F, 0.0F, 0.0F, 0.0F), biomeRegistry.getOrThrow(Biomes.MEADOW)),
                                Pair.of(Climate.parameters(0.3F, 0.6F, 0.1F, 0.1F, 0.0F, 0.0F, 0.0F), biomeRegistry.getOrThrow(Biomes.DARK_FOREST)),
                                Pair.of(Climate.parameters(0.4F, 0.3F, 0.2F, 0.1F, 0.0F, 0.0F, 0.0F), biomeRegistry.getOrThrow(GCBiomes.WILLOW_SWAMP_OVERWORLD))
                        ))),
                noiseGenSettings.getOrThrow(NoiseGeneratorSettings.AMPLIFIED));

        LevelStem stem = new LevelStem(dimTypes.getOrThrow(GCDimension.GEMCRAFT_DIM_TYPE), noiseBasedChunkGenerator); //choose singular biome or multibiome

        context.register(GEMCRAFT_DIM_KEY, stem);
    }

}
