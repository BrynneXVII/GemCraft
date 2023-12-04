package net.brynnexvii.gemcraft.datagen.loot;

import net.brynnexvii.gemcraft.block.GCBlocks;
import net.brynnexvii.gemcraft.block.crops.ParsnipCropBlock;
import net.brynnexvii.gemcraft.item.GCItems;
import net.minecraft.advancements.critereon.StatePropertiesPredicate;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.ApplyExplosionDecay;
import net.minecraft.world.level.storage.loot.predicates.*;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class GCBlockLootTables extends BlockLootSubProvider {

    public GCBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        // Ignis
        oreWithRarityDrops(GCBlocks.IGNIS_GEM_ORE.get(), GCItems.RAW_GARNET.get(), GCItems.RAW_SPHALERITE.get(), GCItems.RAW_RUBY.get());
        oreWithRarityDrops(GCBlocks.DEEPSLATE_IGNIS_GEM_ORE.get(), GCItems.RAW_GARNET.get(), GCItems.RAW_SPHALERITE.get(), GCItems.RAW_RUBY.get());
        oreWithRarityDrops(GCBlocks.NETHER_IGNIS_GEM_ORE.get(), GCItems.RAW_GARNET.get(), GCItems.RAW_SPHALERITE.get(), GCItems.RAW_RUBY.get());
        oreWithRarityDrops(GCBlocks.END_STONE_IGNIS_GEM_ORE.get(), GCItems.RAW_GARNET.get(), GCItems.RAW_SPHALERITE.get(), GCItems.RAW_RUBY.get());

        // Zephyr
        oreWithRarityDrops(GCBlocks.ZEPHYR_GEM_ORE.get(), GCItems.RAW_GOLDEN_BERYL.get(), GCItems.RAW_CITRINE.get(), GCItems.RAW_TOPAZ.get());
        oreWithRarityDrops(GCBlocks.DEEPSLATE_ZEPHYR_GEM_ORE.get(), GCItems.RAW_GOLDEN_BERYL.get(), GCItems.RAW_CITRINE.get(), GCItems.RAW_TOPAZ.get());
        oreWithRarityDrops(GCBlocks.NETHER_ZEPHYR_GEM_ORE.get(), GCItems.RAW_GOLDEN_BERYL.get(), GCItems.RAW_CITRINE.get(), GCItems.RAW_TOPAZ.get());
        oreWithRarityDrops(GCBlocks.END_STONE_ZEPHYR_GEM_ORE.get(), GCItems.RAW_GOLDEN_BERYL.get(), GCItems.RAW_CITRINE.get(), GCItems.RAW_TOPAZ.get());

        // Terra
        oreWithRarityDrops(GCBlocks.TERRA_GEM_ORE.get(), GCItems.RAW_JADE.get(), GCItems.RAW_PERIDOT.get(), GCItems.RAW_EMERALD.get());
        oreWithRarityDrops(GCBlocks.DEEPSLATE_TERRA_GEM_ORE.get(), GCItems.RAW_JADE.get(), GCItems.RAW_PERIDOT.get(), GCItems.RAW_EMERALD.get());
        oreWithRarityDrops(GCBlocks.NETHER_TERRA_GEM_ORE.get(), GCItems.RAW_JADE.get(), GCItems.RAW_PERIDOT.get(), GCItems.RAW_EMERALD.get());
        oreWithRarityDrops(GCBlocks.END_STONE_TERRA_GEM_ORE.get(), GCItems.RAW_JADE.get(), GCItems.RAW_PERIDOT.get(), GCItems.RAW_EMERALD.get());

        // Mizu
        oreWithRarityDrops(GCBlocks.MIZU_GEM_ORE.get(), GCItems.RAW_AQUAMARINE.get(), GCItems.RAW_IOLITE.get(), GCItems.RAW_SAPPHIRE.get());
        oreWithRarityDrops(GCBlocks.DEEPSLATE_MIZU_GEM_ORE.get(), GCItems.RAW_AQUAMARINE.get(), GCItems.RAW_IOLITE.get(), GCItems.RAW_SAPPHIRE.get());
        oreWithRarityDrops(GCBlocks.NETHER_MIZU_GEM_ORE.get(), GCItems.RAW_AQUAMARINE.get(), GCItems.RAW_IOLITE.get(), GCItems.RAW_SAPPHIRE.get());
        oreWithRarityDrops(GCBlocks.END_STONE_MIZU_GEM_ORE.get(), GCItems.RAW_AQUAMARINE.get(), GCItems.RAW_IOLITE.get(), GCItems.RAW_SAPPHIRE.get());

        // Aether
        oreWithRarityDrops(GCBlocks.AETHER_GEM_ORE.get(), GCItems.RAW_AMETHYST.get(), GCItems.RAW_CHAROITE.get(), GCItems.RAW_TANZANITE.get());
        oreWithRarityDrops(GCBlocks.DEEPSLATE_AETHER_GEM_ORE.get(), GCItems.RAW_AMETHYST.get(), GCItems.RAW_CHAROITE.get(), GCItems.RAW_TANZANITE.get());
        oreWithRarityDrops(GCBlocks.NETHER_AETHER_GEM_ORE.get(), GCItems.RAW_AMETHYST.get(), GCItems.RAW_CHAROITE.get(), GCItems.RAW_TANZANITE.get());
        oreWithRarityDrops(GCBlocks.END_STONE_AETHER_GEM_ORE.get(), GCItems.RAW_AMETHYST.get(), GCItems.RAW_CHAROITE.get(), GCItems.RAW_TANZANITE.get());

        // Lys
        oreWithRarityDrops(GCBlocks.LYS_GEM_ORE.get(), GCItems.RAW_ALBITE.get(), GCItems.RAW_DENDRITIC_OPAL.get(), GCItems.RAW_DIAMOND.get());
        oreWithRarityDrops(GCBlocks.DEEPSLATE_LYS_GEM_ORE.get(), GCItems.RAW_ALBITE.get(), GCItems.RAW_DENDRITIC_OPAL.get(), GCItems.RAW_DIAMOND.get());
        oreWithRarityDrops(GCBlocks.NETHER_LYS_GEM_ORE.get(), GCItems.RAW_ALBITE.get(), GCItems.RAW_DENDRITIC_OPAL.get(), GCItems.RAW_DIAMOND.get());
        oreWithRarityDrops(GCBlocks.END_STONE_LYS_GEM_ORE.get(), GCItems.RAW_ALBITE.get(), GCItems.RAW_DENDRITIC_OPAL.get(), GCItems.RAW_DIAMOND.get());

        // Inanis
        oreWithRarityDrops(GCBlocks.INANIS_GEM_ORE.get(), GCItems.RAW_SMOKY_QUARTZ.get(), GCItems.RAW_FERBERITE.get(), GCItems.RAW_ONYX.get());
        oreWithRarityDrops(GCBlocks.DEEPSLATE_INANIS_GEM_ORE.get(), GCItems.RAW_SMOKY_QUARTZ.get(), GCItems.RAW_FERBERITE.get(), GCItems.RAW_ONYX.get());
        oreWithRarityDrops(GCBlocks.NETHER_INANIS_GEM_ORE.get(), GCItems.RAW_SMOKY_QUARTZ.get(), GCItems.RAW_FERBERITE.get(), GCItems.RAW_ONYX.get());
        oreWithRarityDrops(GCBlocks.END_STONE_INANIS_GEM_ORE.get(), GCItems.RAW_SMOKY_QUARTZ.get(), GCItems.RAW_FERBERITE.get(), GCItems.RAW_ONYX.get());

        this.dropSelf(GCBlocks.RUBY_BLOCK.get());

        //Willow wood
        this.dropSelf(GCBlocks.WILLOW_LOG.get());
        this.dropSelf(GCBlocks.STRIPPED_WILLOW_LOG.get());
        this.dropSelf(GCBlocks.WILLOW_WOOD.get());
        this.dropSelf(GCBlocks.STRIPPED_WILLOW_WOOD.get());
        this.dropSelf(GCBlocks.WILLOW_SAPLING.get());
        this.dropSelf(GCBlocks.WILLOW_PLANKS.get());
        this.dropSelf(GCBlocks.WILLOW_STAIRS.get());
        this.dropSelf(GCBlocks.WILLOW_BUTTON.get());
        this.dropSelf(GCBlocks.WILLOW_PRESSURE_PLATE.get());
        this.dropSelf(GCBlocks.WILLOW_TRAPDOOR.get());
        this.dropSelf(GCBlocks.WILLOW_FENCE.get());
        this.dropSelf(GCBlocks.WILLOW_FENCE_GATE.get());
        this.dropSelf(GCBlocks.WILLOW_WALL.get());

        this.add(GCBlocks.WILLOW_SLAB.get(),
                block -> createSlabItemTable(GCBlocks.WILLOW_SLAB.get()));
        this.add(GCBlocks.WILLOW_DOOR.get(),
                block -> createDoorTable(GCBlocks.WILLOW_DOOR.get()));

        this.add(GCBlocks.WILLOW_LEAVES.get(), block ->
                createLeavesDrops(block, GCBlocks.WILLOW_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));

        //Ignis wood
        this.dropSelf(GCBlocks.IGNIS_LOG.get());
        this.dropSelf(GCBlocks.STRIPPED_IGNIS_LOG.get());
        this.dropSelf(GCBlocks.IGNIS_WOOD.get());
        this.dropSelf(GCBlocks.STRIPPED_IGNIS_WOOD.get());
        this.dropSelf(GCBlocks.IGNIS_SAPLING.get());
        this.dropSelf(GCBlocks.IGNIS_PLANKS.get());
        this.dropSelf(GCBlocks.IGNIS_STAIRS.get());
        this.dropSelf(GCBlocks.IGNIS_BUTTON.get());
        this.dropSelf(GCBlocks.IGNIS_PRESSURE_PLATE.get());
        this.dropSelf(GCBlocks.IGNIS_TRAPDOOR.get());
        this.dropSelf(GCBlocks.IGNIS_FENCE.get());
        this.dropSelf(GCBlocks.IGNIS_FENCE_GATE.get());
        this.dropSelf(GCBlocks.IGNIS_WALL.get());

        this.add(GCBlocks.IGNIS_SLAB.get(),
                block -> createSlabItemTable(GCBlocks.IGNIS_SLAB.get()));
        this.add(GCBlocks.IGNIS_DOOR.get(),
                block -> createDoorTable(GCBlocks.IGNIS_DOOR.get()));

        this.add(GCBlocks.IGNIS_LEAVES.get(), block ->
                createLeavesDrops(block, GCBlocks.IGNIS_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));

        this.dropSelf(GCBlocks.BASIC_ALCHEMICAL_CAULDRON.get());

        this.dropSelf(GCBlocks.VIOLET_LILY.get());
        this.add(GCBlocks.POTTED_VIOLET_LILY.get(), createPotFlowerItemTable(GCBlocks.VIOLET_LILY.get()));

        LootItemCondition.Builder parsnipLootItemConditionBuilder = LootItemBlockStatePropertyCondition
                .hasBlockStateProperties(GCBlocks.PARSNIP_CROP.get()).setProperties(StatePropertiesPredicate.Builder.properties()
                        .hasProperty(ParsnipCropBlock.AGE, 8));
        this.add(GCBlocks.PARSNIP_CROP.get(), this.applyExplosionDecay(GCBlocks.PARSNIP_CROP.get(), LootTable.lootTable()
                .withPool(LootPool.lootPool().add(LootItem.lootTableItem(GCItems.PARSNIP.get())))
                .withPool(LootPool.lootPool().when(parsnipLootItemConditionBuilder)
                        .add(LootItem.lootTableItem(GCItems.PARSNIP.get())
                                .apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 3))))));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return GCBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }

    protected void oreWithRarityDrops(Block block, Item common, Item uncommon, Item rare){
        this.add(block, LootTable.lootTable()
                .withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(block).when(HAS_SILK_TOUCH))
                )
                .withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F)).when(HAS_NO_SILK_TOUCH)
                        .add(LootItem.lootTableItem(common).setWeight(80))
                        .add(LootItem.lootTableItem(uncommon).setWeight(18))
                        .add(LootItem.lootTableItem(rare).setWeight(2))
                        .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))
                        .apply(ApplyExplosionDecay.explosionDecay())
                )
        );
    }
}

