package net.brynnexvii.gemcraft.worldgen.biome.custom;

import com.mojang.datafixers.util.Pair;
import net.brynnexvii.gemcraft.utility.GCBiomeUtil;
import net.brynnexvii.gemcraft.worldgen.biome.GCBiomes;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.biome.Climate;
import terrablender.api.Region;
import terrablender.api.RegionType;

import java.util.function.Consumer;

public class GCNetherRegion extends Region {
    public GCNetherRegion(ResourceLocation name, int weight) {
        super(name, RegionType.NETHER, weight);
    }

    @Override
    public void addBiomes(Registry<Biome> registry, Consumer<Pair<Climate.ParameterPoint, ResourceKey<Biome>>> mapper) {
        this.addBiome(mapper,
                Climate.Parameter.point(0.4F),
                Climate.Parameter.point(0.0F),
                Climate.Parameter.point(0.0F),
                Climate.Parameter.point(0.0F),
                Climate.Parameter.point(0.0F),
                Climate.Parameter.point(0.0F),
                0.0F,
                GCBiomeUtil.biomeOrFallback(registry, GCBiomes.IGNIS_NETHER, Biomes.CRIMSON_FOREST));
    }
}
