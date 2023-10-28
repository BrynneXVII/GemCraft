package net.brynnexvii.gemcraft;

import com.mojang.logging.LogUtils;
import net.brynnexvii.gemcraft.block.GCBlocks;
import net.brynnexvii.gemcraft.block.entity.GCBlockEntities;
import net.brynnexvii.gemcraft.effect.GCEffects;
import net.brynnexvii.gemcraft.item.GCItems;
import net.brynnexvii.gemcraft.potion.brewing.BetterBrewingRecipe;
import net.brynnexvii.gemcraft.potion.brewing.GCPotions;
import net.brynnexvii.gemcraft.screen.BasicAlchemicalCauldronScreen;
import net.brynnexvii.gemcraft.screen.GCMenuTypes;
import net.brynnexvii.gemcraft.utility.GCCreativeModeTabs;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.alchemy.Potions;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.ComposterBlock;
import net.minecraft.world.level.block.FlowerBlock;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.brewing.BrewingRecipeRegistry;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(GemCraft.MODID)
public class GemCraft
{
    // Define mod id in a common place for everything to reference
    public static final String MODID = "gemcraft";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    public GemCraft()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        //register the deferred registries
        GCCreativeModeTabs.register(modEventBus);
        GCItems.register(modEventBus);
        GCBlocks.register(modEventBus);

        GCPotions.register(modEventBus);
        GCEffects.register(modEventBus);

        GCBlockEntities.register(modEventBus);
        GCMenuTypes.register(modEventBus);


        modEventBus.addListener(this::commonSetup);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
        // Register the item to a creative tab
        modEventBus.addListener(this::addCreative);

    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
        event.enqueueWork(() -> {
            ComposterBlock.COMPOSTABLES.put(GCItems.PARSNIP.get(), 0.68F);
            ComposterBlock.COMPOSTABLES.put(GCBlocks.VIOLET_LILY.get().asItem(), 0.65F);

            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(GCBlocks.VIOLET_LILY.getId(), GCBlocks.POTTED_VIOLET_LILY);

            BrewingRecipeRegistry.addRecipe(new BetterBrewingRecipe(Potions.AWKWARD, Items.GLOW_INK_SAC, GCPotions.GLOWING_POTION.get()));
        });
    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event)
    {
        if(event.getTabKey() == CreativeModeTabs.INGREDIENTS){
            //event.accept(GCItems.BRILLIANT_DIAMOND);
            //event.accept(GCItems.BRILLIANT_RUBY);
            //event.accept(GCItems.BRILLIANT_EMERALD);
        } else if (event.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {
            event.accept(GCItems.PARSNIP);
        }
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
            event.enqueueWork(() -> {

                MenuScreens.register(GCMenuTypes.BASIC_ALCHEMICAL_CAULDRON_MENU.get(), BasicAlchemicalCauldronScreen::new);

            });
        }
    }
}
