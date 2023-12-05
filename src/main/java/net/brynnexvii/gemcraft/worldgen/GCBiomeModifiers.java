package net.brynnexvii.gemcraft.worldgen;

import net.brynnexvii.gemcraft.GemCraft;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.common.world.ForgeBiomeModifiers;
import net.minecraftforge.registries.ForgeRegistries;

public class GCBiomeModifiers {
    public static final ResourceKey<BiomeModifier> ADD_TREE_WILLOW = registerKey("add_tree_willow");
    public static final ResourceKey<BiomeModifier> ADD_TREE_IGNIS = registerKey("add_tree_ignis");
    public static final ResourceKey<BiomeModifier> ADD_VIOLET_LILY = registerKey("add_violet_lily");

    public static void bootstrap(BootstapContext<BiomeModifier> context){
        var placedFeatures = context.lookup(Registries.PLACED_FEATURE);
        var biomes = context.lookup(Registries.BIOME);

        context.register(ADD_TREE_WILLOW, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD), //or Tag.Biomes....
                HolderSet.direct(placedFeatures.getOrThrow(GCPlacedFeatures.WILLOW_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION
        ));
        context.register(ADD_TREE_IGNIS, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_HOT_OVERWORLD), //or Tags.Biomes....
                HolderSet.direct(placedFeatures.getOrThrow(GCPlacedFeatures.IGNIS_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION
        ));

        context.register(ADD_VIOLET_LILY, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_MOUNTAIN),
                HolderSet.direct(placedFeatures.getOrThrow(GCPlacedFeatures.VIOLET_LILY_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION
        ));
    }

    //Helper methods
    public static ResourceKey<BiomeModifier> registerKey(String name){
        return ResourceKey.create(ForgeRegistries.Keys.BIOME_MODIFIERS, new ResourceLocation(GemCraft.MODID, name));
    }
}
