package net.brynnexvii.gemcraft.worldgen.biome;

import net.brynnexvii.gemcraft.GemCraft;
import net.brynnexvii.gemcraft.worldgen.GCPlacedFeatures;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BiomeDefaultFeatures;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.placement.MiscOverworldPlacements;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.Musics;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.level.biome.*;
import net.minecraft.world.level.levelgen.GenerationStep;

public class GCBiomes {
    public static final ResourceKey<Biome> WILLOW_SWAMP_OVERWORLD = register("willow_swamp_overworld");
    public static final ResourceKey<Biome> IGNIS_OVERWORLD = register("ignis_overworld");
    public static final ResourceKey<Biome> IGNIS_NETHER = register("ignis_nether");
    public static final ResourceKey<Biome> IGNIS_END = register("ignis_end");

    public static void bootstrap(BootstapContext<Biome> context){
        context.register(WILLOW_SWAMP_OVERWORLD, willowSwampOverworld(context));
        context.register(IGNIS_OVERWORLD, ignisOverworld(context));
        //context.register(IGNIS_NETHER, );
        //context.register(IGNIS_END, );
    }

    //Helper method
    public static void globalOverworldGeneration(BiomeGenerationSettings.Builder builder){
        BiomeDefaultFeatures.addDefaultCarversAndLakes(builder);
        BiomeDefaultFeatures.addDefaultCrystalFormations(builder);
        BiomeDefaultFeatures.addDefaultMonsterRoom(builder);
        BiomeDefaultFeatures.addDefaultUndergroundVariety(builder);
        BiomeDefaultFeatures.addDefaultSprings(builder);
        BiomeDefaultFeatures.addSurfaceFreezing(builder);
    }

    public static void globalNetherGeneration(BiomeGenerationSettings.Builder builder){

    }

    public static void globalEndGeneration(BiomeGenerationSettings.Builder builder){

    }

    public static Biome willowSwampOverworld(BootstapContext<Biome> context){
        //mobs
        MobSpawnSettings.Builder spawnBuilder = new MobSpawnSettings.Builder();

        spawnBuilder.addSpawn(MobCategory.AXOLOTLS, new MobSpawnSettings.SpawnerData(EntityType.AXOLOTL, 5, 3, 7));
        spawnBuilder.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.FROG, 5, 4, 4));
        spawnBuilder.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.ALLAY, 3, 2, 2));

        BiomeDefaultFeatures.commonSpawns(spawnBuilder);

        //terrain
        BiomeGenerationSettings.Builder biomeBuilder = new BiomeGenerationSettings.Builder(context.lookup(Registries.PLACED_FEATURE), context.lookup(Registries.CONFIGURED_CARVER));
        globalOverworldGeneration(biomeBuilder);


        BiomeDefaultFeatures.addFerns(biomeBuilder);
        BiomeDefaultFeatures.addForestFlowers(biomeBuilder);

        BiomeDefaultFeatures.addSwampVegetation(biomeBuilder);
        BiomeDefaultFeatures.addSwampClayDisk(biomeBuilder);




        BiomeDefaultFeatures.addDefaultMushrooms(biomeBuilder);
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, GCPlacedFeatures.WILLOW_PLACED_KEY);
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, GCPlacedFeatures.VIOLET_LILY_PLACED_KEY);
        //return
        return new Biome.BiomeBuilder()
                .hasPrecipitation(true)
                .downfall(0.7f) //how often will it rain
                .temperature(0.5f)
                .generationSettings(biomeBuilder.build())
                .mobSpawnSettings(spawnBuilder.build())
                .specialEffects((new BiomeSpecialEffects.Builder())
                        .waterColor(0x00a37b)
                        .waterFogColor(0xa1fde7)
                        .skyColor(0x93c3fe)
                        .grassColorOverride(0x019849)
                        .foliageColorOverride(0x218551)
                        .fogColor(0xa1fde7)
                        .ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS)
                        .backgroundMusic(Musics.GAME)
                        .build())
                .build();

    }

    public static Biome ignisOverworld(BootstapContext<Biome> context){
        //mobs
        MobSpawnSettings.Builder spawnBuilder = new MobSpawnSettings.Builder();
        BiomeDefaultFeatures.commonSpawns(spawnBuilder);

        //terrain
        BiomeGenerationSettings.Builder biomeBuilder = new BiomeGenerationSettings.Builder(context.lookup(Registries.PLACED_FEATURE), context.lookup(Registries.CONFIGURED_CARVER));
        globalOverworldGeneration(biomeBuilder);

        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, GCPlacedFeatures.IGNIS_PLACED_KEY);

        //return
        return new Biome.BiomeBuilder()
                .hasPrecipitation(false)
                .downfall(0.0f) //how often will it rain
                .temperature(0.9f)
                .generationSettings(biomeBuilder.build())
                .mobSpawnSettings(spawnBuilder.build())
                .specialEffects((new BiomeSpecialEffects.Builder())
                        .waterColor(0x96d0eb)
                        .waterFogColor(0x96d0eb)
                        .skyColor(0x93c3fe)
                        .grassColorOverride(0xc70039)
                        .foliageColorOverride(0xaf3333)
                        .fogColor(0xeb96a6)
                        .ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS)
                        .backgroundMusic(Musics.GAME)
                        .build())
                .build();
    }
/*
    public static Biome ignisNether(BootstapContext<Biome> context){
        //mobs
        MobSpawnSettings.Builder spawnBuilder = new MobSpawnSettings.Builder();

        //terrain
        BiomeGenerationSettings.Builder biomeBuilder = new BiomeGenerationSettings.Builder(context.lookup(Registries.PLACED_FEATURE), context.lookup(Registries.CONFIGURED_CARVER));
    }

    public static Biome ignisEnd(BootstapContext<Biome> context){
        //mobs
        MobSpawnSettings.Builder spawnBuilder = new MobSpawnSettings.Builder();

        //terrain
        BiomeGenerationSettings.Builder biomeBuilder = new BiomeGenerationSettings.Builder(context.lookup(Registries.PLACED_FEATURE), context.lookup(Registries.CONFIGURED_CARVER));
    }

*/




    //register method
    public static ResourceKey<Biome> register(String name){
        return ResourceKey.create(Registries.BIOME, new ResourceLocation(GemCraft.MODID, name));
    }
}
