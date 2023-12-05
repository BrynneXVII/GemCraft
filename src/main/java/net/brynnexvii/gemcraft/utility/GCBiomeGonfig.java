package net.brynnexvii.gemcraft.utility;

import net.brynnexvii.gemcraft.GemCraft;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.biome.Biome;
import net.minecraftforge.fml.loading.FMLPaths;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

public class GCBiomeGonfig {
    //Essentials from ModConfig from Biomes o' Plenty


    public static <Biome> boolean isBiomeEnabled(ResourceKey<Biome> key)
    {
        if (key == null || !key.location().getNamespace().equals(GemCraft.MODID))
            return false;

        return true;
    }

}
