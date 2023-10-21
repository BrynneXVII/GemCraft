package net.brynnexvii.gemcraft.worldgen;

import net.brynnexvii.gemcraft.GemCraft;
import net.brynnexvii.gemcraft.block.GCBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.random.SimpleWeightedRandomList;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.util.valueproviders.IntProvider;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.util.valueproviders.WeightedListInt;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.CherryFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.CherryTrunkPlacer;

public class GCConfiguredFeatures {
    public static final ResourceKey<ConfiguredFeature<?, ?>> WILLOW_KEY = registerKey("willow");

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context){

        register(context, WILLOW_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(GCBlocks.WILLOW_LOG.get()), //log (trunk) block
                new CherryTrunkPlacer( //trunk placer - currently the cherry tree stats
                        7, //trunk height
                        1, //height_rand_a
                        0, //height_rand_b, VV branchCount VV
                        new WeightedListInt(SimpleWeightedRandomList.<IntProvider>builder().add(ConstantInt.of(1), 1).add(ConstantInt.of(2), 1).add(ConstantInt.of(3), 1).build()),
                        UniformInt.of(2, 4), //branchHorizontalLength
                        UniformInt.of(-4, -3), //branchStartOffsetFromTop
                        UniformInt.of(-1, 0)), //branchEndOffsetFromTop
                BlockStateProvider.simple(GCBlocks.WILLOW_LEAVES.get()), //leaves block
                new CherryFoliagePlacer( //foliage placer - currently the cherry tree stats except bottom 2 upped
                        ConstantInt.of(4), //radius
                        ConstantInt.of(0), //offset
                        ConstantInt.of(5), //height
                        0.25F, //wideBottomLayerHoleChance
                        0.5F, //cornerHoleChance
                        0.8F, //hangingLeavesChance
                        0.7F), //hangingLeavesExtensionChance
                new TwoLayersFeatureSize(1, 0, 2)) //
                .build()
        );
    }

    //Helper methods
    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name){
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(GemCraft.MODID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context, ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration){
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
