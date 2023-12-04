package net.brynnexvii.gemcraft.utility;

import net.brynnexvii.gemcraft.GemCraft;
import net.brynnexvii.gemcraft.block.GCBlocks;
import net.brynnexvii.gemcraft.item.GCItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class GCCreativeModeTabs {
        public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, GemCraft.MODID);

        public static final RegistryObject<CreativeModeTab> GEMCRAFT_TAB = CREATIVE_MODE_TABS.register("gemcraft_tab",
                () -> CreativeModeTab.builder().icon(() -> new ItemStack(GCItems.ROCK_CANDY.get()))
                        .title(Component.translatable("gccreativetab.gemcraft_tab"))
                        .displayItems((pParameters, pOutput) -> {
                                pOutput.accept(GCItems.RAW_GARNET.get());
                                pOutput.accept(GCItems.RAW_SPHALERITE.get());
                                pOutput.accept(GCItems.RAW_RUBY.get());
                                pOutput.accept(GCItems.RAW_GOLDEN_BERYL.get());
                                pOutput.accept(GCItems.RAW_CITRINE.get());
                                pOutput.accept(GCItems.RAW_TOPAZ.get());
                                pOutput.accept(GCItems.RAW_JADE.get());
                                pOutput.accept(GCItems.RAW_PERIDOT.get());
                                pOutput.accept(GCItems.RAW_EMERALD.get());
                                pOutput.accept(GCItems.RAW_AQUAMARINE.get());
                                pOutput.accept(GCItems.RAW_IOLITE.get());
                                pOutput.accept(GCItems.RAW_SAPPHIRE.get());
                                pOutput.accept(GCItems.RAW_AMETHYST.get());
                                pOutput.accept(GCItems.RAW_CHAROITE.get());
                                pOutput.accept(GCItems.RAW_TANZANITE.get());
                                pOutput.accept(GCItems.RAW_ALBITE.get());
                                pOutput.accept(GCItems.RAW_DENDRITIC_OPAL.get());
                                pOutput.accept(GCItems.RAW_DIAMOND.get());
                                pOutput.accept(GCItems.RAW_SMOKY_QUARTZ.get());
                                pOutput.accept(GCItems.RAW_FERBERITE.get());
                                pOutput.accept(GCItems.RAW_ONYX.get());

                                pOutput.accept(GCBlocks.IGNIS_GEM_ORE.get());
                                pOutput.accept(GCBlocks.DEEPSLATE_IGNIS_GEM_ORE.get());
                                pOutput.accept(GCBlocks.NETHER_IGNIS_GEM_ORE.get());
                                pOutput.accept(GCBlocks.END_STONE_IGNIS_GEM_ORE.get());

                                pOutput.accept(GCBlocks.ZEPHYR_GEM_ORE.get());
                                pOutput.accept(GCBlocks.DEEPSLATE_ZEPHYR_GEM_ORE.get());
                                pOutput.accept(GCBlocks.NETHER_ZEPHYR_GEM_ORE.get());
                                pOutput.accept(GCBlocks.END_STONE_ZEPHYR_GEM_ORE.get());

                                pOutput.accept(GCBlocks.TERRA_GEM_ORE.get());
                                pOutput.accept(GCBlocks.DEEPSLATE_TERRA_GEM_ORE.get());
                                pOutput.accept(GCBlocks.NETHER_TERRA_GEM_ORE.get());
                                pOutput.accept(GCBlocks.END_STONE_TERRA_GEM_ORE.get());

                                pOutput.accept(GCBlocks.MIZU_GEM_ORE.get());
                                pOutput.accept(GCBlocks.DEEPSLATE_MIZU_GEM_ORE.get());
                                pOutput.accept(GCBlocks.NETHER_MIZU_GEM_ORE.get());
                                pOutput.accept(GCBlocks.END_STONE_MIZU_GEM_ORE.get());

                                pOutput.accept(GCBlocks.AETHER_GEM_ORE.get());
                                pOutput.accept(GCBlocks.DEEPSLATE_AETHER_GEM_ORE.get());
                                pOutput.accept(GCBlocks.NETHER_AETHER_GEM_ORE.get());
                                pOutput.accept(GCBlocks.END_STONE_AETHER_GEM_ORE.get());

                                pOutput.accept(GCBlocks.LYS_GEM_ORE.get());
                                pOutput.accept(GCBlocks.DEEPSLATE_LYS_GEM_ORE.get());
                                pOutput.accept(GCBlocks.NETHER_LYS_GEM_ORE.get());
                                pOutput.accept(GCBlocks.END_STONE_LYS_GEM_ORE.get());

                                pOutput.accept(GCBlocks.INANIS_GEM_ORE.get());
                                pOutput.accept(GCBlocks.DEEPSLATE_INANIS_GEM_ORE.get());
                                pOutput.accept(GCBlocks.NETHER_INANIS_GEM_ORE.get());
                                pOutput.accept(GCBlocks.END_STONE_INANIS_GEM_ORE.get());

                                pOutput.accept(GCItems.IGNIS_GEM_POWDER.get());
                                pOutput.accept(GCItems.RUBY.get());
                                pOutput.accept(GCItems.BRILLIANT_RUBY.get());
                                pOutput.accept(GCBlocks.RUBY_BLOCK.get());

                                pOutput.accept(GCItems.ZEPHYR_GEM_POWDER.get());

                                pOutput.accept(GCItems.TERRA_GEM_POWDER.get());
                                pOutput.accept(GCItems.BRILLIANT_EMERALD.get());

                                pOutput.accept(GCItems.MIZU_GEM_POWDER.get());

                                pOutput.accept(GCItems.AETHER_GEM_POWDER.get());

                                pOutput.accept(GCItems.LYS_GEM_POWDER.get());
                                pOutput.accept(GCItems.BRILLIANT_DIAMOND.get());

                                pOutput.accept(GCItems.INANIS_GEM_POWDER.get());


                                pOutput.accept(GCBlocks.WILLOW_LOG.get());
                                pOutput.accept(GCBlocks.STRIPPED_WILLOW_LOG.get());
                                pOutput.accept(GCBlocks.WILLOW_WOOD.get());
                                pOutput.accept(GCBlocks.STRIPPED_WILLOW_WOOD.get());
                                pOutput.accept(GCBlocks.WILLOW_LEAVES.get());
                                pOutput.accept(GCBlocks.WILLOW_SAPLING.get());
                                pOutput.accept(GCBlocks.WILLOW_PLANKS.get());
                                pOutput.accept(GCBlocks.WILLOW_STAIRS.get());
                                pOutput.accept(GCBlocks.WILLOW_SLAB.get());
                                pOutput.accept(GCBlocks.WILLOW_BUTTON.get());
                                pOutput.accept(GCBlocks.WILLOW_PRESSURE_PLATE.get());
                                pOutput.accept(GCBlocks.WILLOW_FENCE.get());
                                pOutput.accept(GCBlocks.WILLOW_FENCE_GATE.get());
                                pOutput.accept(GCBlocks.WILLOW_WALL.get());
                                pOutput.accept(GCBlocks.WILLOW_DOOR.get());
                                pOutput.accept(GCBlocks.WILLOW_TRAPDOOR.get());

                                pOutput.accept(GCItems.BASIC_STAFF.get());
                                pOutput.accept(GCItems.ROCK_CANDY.get());
                                pOutput.accept(GCItems.GLASS_VIAL.get());
                                pOutput.accept(GCItems.WEAK_REASSURANCE_ELIXIR.get());
                                pOutput.accept(GCItems.MIDDLING_REASSURANCE_ELIXIR.get());
                                pOutput.accept(GCItems.MINT.get());
                                pOutput.accept(GCItems.PARSNIP.get());
                                pOutput.accept(GCBlocks.VIOLET_LILY.get());

                                pOutput.accept(GCBlocks.BASIC_ALCHEMICAL_CAULDRON.get());

                        }).build());

        public static final RegistryObject<CreativeModeTab> ALCHEMY_TAB = CREATIVE_MODE_TABS.register("alchemy_tab",
                () -> CreativeModeTab.builder().icon(() -> new ItemStack(GCItems.MINT.get()))
                        .title(Component.translatable("gccreativetab.alchemy_tab"))
                        .displayItems((pParameters, pOutput) -> {
                                pOutput.accept(GCItems.IGNIS_GEM_POWDER.get());
                                pOutput.accept(GCItems.ZEPHYR_GEM_POWDER.get());
                                pOutput.accept(GCItems.TERRA_GEM_POWDER.get());
                                pOutput.accept(GCItems.MIZU_GEM_POWDER.get());
                                pOutput.accept(GCItems.AETHER_GEM_POWDER.get());
                                pOutput.accept(GCItems.LYS_GEM_POWDER.get());
                                pOutput.accept(GCItems.INANIS_GEM_POWDER.get());

                                pOutput.accept(GCItems.GLASS_VIAL.get());
                                pOutput.accept(GCItems.MINT.get());

                                pOutput.accept(GCItems.WEAK_REASSURANCE_ELIXIR.get());
                                pOutput.accept(GCItems.MIDDLING_REASSURANCE_ELIXIR.get());

                        }).build());

    public static final RegistryObject<CreativeModeTab> GEM_TAB = CREATIVE_MODE_TABS.register("gem_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(GCItems.RAW_GARNET.get()))
                    .title(Component.translatable("gccreativetab.gem_tab"))
                    .displayItems((pParameters, pOutput) -> {
                            pOutput.accept(GCItems.TEST_3D_GEM.get());

                            pOutput.accept(GCBlocks.IGNIS_GEM_ORE.get());
                            pOutput.accept(GCBlocks.DEEPSLATE_IGNIS_GEM_ORE.get());
                            pOutput.accept(GCBlocks.NETHER_IGNIS_GEM_ORE.get());
                            pOutput.accept(GCBlocks.END_STONE_IGNIS_GEM_ORE.get());
                            pOutput.accept(GCItems.RAW_GARNET.get());
                            pOutput.accept(GCItems.RAW_SPHALERITE.get());
                            pOutput.accept(GCItems.RAW_RUBY.get());
                            pOutput.accept(GCItems.IGNIS_GEM_POWDER.get());

                            pOutput.accept(GCBlocks.ZEPHYR_GEM_ORE.get());
                            pOutput.accept(GCBlocks.DEEPSLATE_ZEPHYR_GEM_ORE.get());
                            pOutput.accept(GCBlocks.NETHER_ZEPHYR_GEM_ORE.get());
                            pOutput.accept(GCBlocks.END_STONE_ZEPHYR_GEM_ORE.get());
                            pOutput.accept(GCItems.RAW_GOLDEN_BERYL.get());
                            pOutput.accept(GCItems.RAW_CITRINE.get());
                            pOutput.accept(GCItems.RAW_TOPAZ.get());
                            pOutput.accept(GCItems.ZEPHYR_GEM_POWDER.get());

                            pOutput.accept(GCBlocks.TERRA_GEM_ORE.get());
                            pOutput.accept(GCBlocks.DEEPSLATE_TERRA_GEM_ORE.get());
                            pOutput.accept(GCBlocks.NETHER_TERRA_GEM_ORE.get());
                            pOutput.accept(GCBlocks.END_STONE_TERRA_GEM_ORE.get());
                            pOutput.accept(GCItems.RAW_JADE.get());
                            pOutput.accept(GCItems.RAW_PERIDOT.get());
                            pOutput.accept(GCItems.RAW_EMERALD.get());
                            pOutput.accept(GCItems.TERRA_GEM_POWDER.get());

                            pOutput.accept(GCBlocks.MIZU_GEM_ORE.get());
                            pOutput.accept(GCBlocks.DEEPSLATE_MIZU_GEM_ORE.get());
                            pOutput.accept(GCBlocks.NETHER_MIZU_GEM_ORE.get());
                            pOutput.accept(GCBlocks.END_STONE_MIZU_GEM_ORE.get());
                            pOutput.accept(GCItems.RAW_AQUAMARINE.get());
                            pOutput.accept(GCItems.RAW_IOLITE.get());
                            pOutput.accept(GCItems.RAW_SAPPHIRE.get());
                            pOutput.accept(GCItems.MIZU_GEM_POWDER.get());

                            pOutput.accept(GCBlocks.AETHER_GEM_ORE.get());
                            pOutput.accept(GCBlocks.DEEPSLATE_AETHER_GEM_ORE.get());
                            pOutput.accept(GCBlocks.NETHER_AETHER_GEM_ORE.get());
                            pOutput.accept(GCBlocks.END_STONE_AETHER_GEM_ORE.get());
                            pOutput.accept(GCItems.RAW_AMETHYST.get());
                            pOutput.accept(GCItems.RAW_CHAROITE.get());
                            pOutput.accept(GCItems.RAW_TANZANITE.get());
                            pOutput.accept(GCItems.AETHER_GEM_POWDER.get());

                            pOutput.accept(GCBlocks.LYS_GEM_ORE.get());
                            pOutput.accept(GCBlocks.DEEPSLATE_LYS_GEM_ORE.get());
                            pOutput.accept(GCBlocks.NETHER_LYS_GEM_ORE.get());
                            pOutput.accept(GCBlocks.END_STONE_LYS_GEM_ORE.get());
                            pOutput.accept(GCItems.RAW_ALBITE.get());
                            pOutput.accept(GCItems.RAW_DENDRITIC_OPAL.get());
                            pOutput.accept(GCItems.RAW_DIAMOND.get());
                            pOutput.accept(GCItems.LYS_GEM_POWDER.get());

                            pOutput.accept(GCBlocks.INANIS_GEM_ORE.get());
                            pOutput.accept(GCBlocks.DEEPSLATE_INANIS_GEM_ORE.get());
                            pOutput.accept(GCBlocks.NETHER_INANIS_GEM_ORE.get());
                            pOutput.accept(GCBlocks.END_STONE_INANIS_GEM_ORE.get());
                            pOutput.accept(GCItems.RAW_SMOKY_QUARTZ.get());
                            pOutput.accept(GCItems.RAW_FERBERITE.get());
                            pOutput.accept(GCItems.RAW_ONYX.get());
                            pOutput.accept(GCItems.INANIS_GEM_POWDER.get());
                    }).build());

        public static void register(IEventBus eventBus){

            CREATIVE_MODE_TABS.register(eventBus);
        }
}
