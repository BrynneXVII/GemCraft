package net.brynnexvii.gemcraft.datagen;

import net.brynnexvii.gemcraft.GemCraft;
import net.brynnexvii.gemcraft.worldgen.GCBiomeModifiers;
import net.brynnexvii.gemcraft.worldgen.GCConfiguredFeatures;
import net.brynnexvii.gemcraft.worldgen.GCPlacedFeatures;
import net.brynnexvii.gemcraft.worldgen.biome.GCBiomes;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.DatapackBuiltinEntriesProvider;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class GCWorldGenProvider extends DatapackBuiltinEntriesProvider {
    public static final RegistrySetBuilder BUILDER = new RegistrySetBuilder()
            .add(Registries.CONFIGURED_FEATURE, GCConfiguredFeatures::bootstrap)
            .add(Registries.PLACED_FEATURE, GCPlacedFeatures::bootstrap)
            .add(Registries.BIOME, GCBiomes::bootstrap)
            .add(ForgeRegistries.Keys.BIOME_MODIFIERS, GCBiomeModifiers::bootstrap);

    public GCWorldGenProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, BUILDER, Set.of(GemCraft.MODID));
    }
}
