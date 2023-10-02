package net.brynnexvii.gemcraft.utility;

import net.brynnexvii.gemcraft.GemCraft;
import net.brynnexvii.gemcraft.block.GCBlocks;
import net.brynnexvii.gemcraft.item.GCItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class GCCreativeModeTabs {
        public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, GemCraft.MODID);

        public static final RegistryObject<CreativeModeTab> GEM_TAB = CREATIVE_MODE_TABS.register("gem_tab",
                () -> CreativeModeTab.builder().icon(() -> new ItemStack(GCItems.RAW_EMERALD.get()))
                        .title(Component.translatable("gccreativetab.gem_tab"))
                        .displayItems((pParameters, pOutput) -> {
                                pOutput.accept(Blocks.DIAMOND_ORE);
                                pOutput.accept(Blocks.DEEPSLATE_DIAMOND_ORE);
                                pOutput.accept(GCBlocks.NETHER_DIAMOND_ORE.get());
                                pOutput.accept(GCBlocks.END_STONE_DIAMOND_ORE.get());
                                pOutput.accept(GCItems.RAW_DIAMOND.get());
                                pOutput.accept(GCItems.DIAMOND_POWDER.get());
                                pOutput.accept(Items.DIAMOND);
                                pOutput.accept(GCItems.BRILLIANT_DIAMOND.get());
                                pOutput.accept(Blocks.DIAMOND_BLOCK);

                                pOutput.accept(Blocks.EMERALD_ORE);
                                pOutput.accept(Blocks.DEEPSLATE_EMERALD_ORE);
                                pOutput.accept(GCBlocks.NETHER_EMERALD_ORE.get());
                                pOutput.accept(GCBlocks.END_STONE_EMERALD_ORE.get());
                                pOutput.accept(GCItems.RAW_EMERALD.get());
                                pOutput.accept(GCItems.EMERALD_POWDER.get());
                                pOutput.accept(Items.EMERALD);
                                pOutput.accept(GCItems.BRILLIANT_EMERALD.get());
                                pOutput.accept(Blocks.EMERALD_BLOCK);

                                pOutput.accept(GCBlocks.RUBY_ORE.get());
                                pOutput.accept(GCBlocks.DEEPSLATE_RUBY_ORE.get());
                                pOutput.accept(GCBlocks.NETHER_RUBY_ORE.get());
                                pOutput.accept(GCBlocks.END_STONE_RUBY_ORE.get());
                                pOutput.accept(GCItems.RAW_RUBY.get());
                                pOutput.accept(GCItems.RUBY_POWDER.get());
                                pOutput.accept(GCItems.RUBY.get());
                                pOutput.accept(GCItems.BRILLIANT_RUBY.get());
                                pOutput.accept(GCBlocks.RUBY_BLOCK.get());

                        }).build());
        public static void register(IEventBus eventBus){

            CREATIVE_MODE_TABS.register(eventBus);
        }
}
