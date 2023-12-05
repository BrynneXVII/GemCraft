package net.brynnexvii.gemcraft.utility;

import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.biome.Biome;

public class GCBiomeUtil {
    public static ResourceKey<Biome> biomeOrFallback(Registry<Biome> biomeRegistry, ResourceKey<Biome>... biomes)
    {
        for (ResourceKey<Biome> key : biomes)
        {
            if (key == null)
                continue;

            if (GCBiomeGonfig.isBiomeEnabled(key) || key.location().getNamespace().equals("minecraft"))
                return key;
        }

        throw new RuntimeException("Failed to find fallback for biome!");
    }
}
