package net.brynnexvii.gemcraft.worldgen.biome;

import net.brynnexvii.gemcraft.GemCraft;
import net.brynnexvii.gemcraft.worldgen.biome.custom.GCEndRegion;
import net.brynnexvii.gemcraft.worldgen.biome.custom.GCNetherRegion;
import net.brynnexvii.gemcraft.worldgen.biome.custom.GCOverworldRegion;
import net.minecraft.resources.ResourceLocation;
import terrablender.api.Regions;

public class GCTerraBlenderAPI {
    public static void registerRegions(){
        Regions.register(new GCOverworldRegion(new ResourceLocation(GemCraft.MODID, "overworld"), 5)); //weight of how many will be replaced with yours
        Regions.register(new GCNetherRegion(new ResourceLocation(GemCraft.MODID, "nether"), 5));
        //Regions.register(new GCEndRegion(new ResourceLocation(GemCraft.MODID, "end"), 5)); no end region type?
    }
}
