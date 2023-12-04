package net.brynnexvii.gemcraft.item;

import net.brynnexvii.gemcraft.GemCraft;
import net.brynnexvii.gemcraft.block.GCBlocks;
import net.brynnexvii.gemcraft.item.gems.*;
import net.brynnexvii.gemcraft.item.herbs.MintItem;
import net.brynnexvii.gemcraft.potion.alchemy.ReassuranceElixir;
import net.brynnexvii.gemcraft.utility.enums.GCAspect;
import net.brynnexvii.gemcraft.utility.enums.GCRarity;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.RegistryObject;

public class GCItems {
    //item deferred register
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, GemCraft.MODID);

    //items
    public static final RegistryObject<Item>  BRILLIANT_DIAMOND = ITEMS.register("brilliant_diamond",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item>  BRILLIANT_RUBY = ITEMS.register("brilliant_ruby",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item>  RUBY = ITEMS.register("ruby",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item>  BRILLIANT_EMERALD = ITEMS.register("brilliant_emerald",
            () -> new Item(new Item.Properties()));


    //------------ raw gems
    // Ignis
    public static final RegistryObject<Item>  RAW_GARNET = ITEMS.register("raw_garnet", () -> new GemcraftAspectedItem(new Item.Properties(), GCRarity.COMMON, GCAspect.IGNIS));
    public static final RegistryObject<Item>  RAW_SPHALERITE = ITEMS.register("raw_sphalerite", () -> new GemcraftAspectedItem(new Item.Properties(), GCRarity.UNCOMMON, GCAspect.IGNIS));
    public static final RegistryObject<Item>  RAW_RUBY = ITEMS.register("raw_ruby", () -> new GemcraftAspectedItem(new Item.Properties(), GCRarity.RARE, GCAspect.IGNIS));

    // Zephyr
    public static final RegistryObject<Item>  RAW_GOLDEN_BERYL = ITEMS.register("raw_golden_beryl", () -> new GemcraftAspectedItem(new Item.Properties(), GCRarity.COMMON, GCAspect.ZEPHYR));
    public static final RegistryObject<Item>  RAW_CITRINE = ITEMS.register("raw_citrine", () -> new GemcraftAspectedItem(new Item.Properties(), GCRarity.UNCOMMON, GCAspect.ZEPHYR));
    public static final RegistryObject<Item>  RAW_TOPAZ = ITEMS.register("raw_topaz", () -> new GemcraftAspectedItem(new Item.Properties(), GCRarity.RARE, GCAspect.ZEPHYR));

    // Terra
    public static final RegistryObject<Item>  RAW_JADE = ITEMS.register("raw_jade", () -> new GemcraftAspectedItem(new Item.Properties(), GCRarity.COMMON, GCAspect.TERRA));
    public static final RegistryObject<Item>  RAW_PERIDOT = ITEMS.register("raw_peridot", () -> new GemcraftAspectedItem(new Item.Properties(), GCRarity.UNCOMMON, GCAspect.TERRA));
    public static final RegistryObject<Item>  RAW_EMERALD = ITEMS.register("raw_emerald", () -> new GemcraftAspectedItem(new Item.Properties(), GCRarity.RARE, GCAspect.TERRA));

    // Mizu
    public static final RegistryObject<Item>  RAW_AQUAMARINE = ITEMS.register("raw_aquamarine", () -> new GemcraftAspectedItem(new Item.Properties(), GCRarity.COMMON, GCAspect.MIZU));
    public static final RegistryObject<Item>  RAW_IOLITE = ITEMS.register("raw_iolite", () -> new GemcraftAspectedItem(new Item.Properties(), GCRarity.UNCOMMON, GCAspect.MIZU));
    public static final RegistryObject<Item>  RAW_SAPPHIRE = ITEMS.register("raw_sapphire", () -> new GemcraftAspectedItem(new Item.Properties(), GCRarity.RARE, GCAspect.MIZU));

    // Aether
    public static final RegistryObject<Item>  RAW_AMETHYST = ITEMS.register("raw_amethyst", () -> new GemcraftAspectedItem(new Item.Properties(), GCRarity.COMMON, GCAspect.AETHER));
    public static final RegistryObject<Item>  RAW_CHAROITE = ITEMS.register("raw_charoite", () -> new GemcraftAspectedItem(new Item.Properties(), GCRarity.UNCOMMON, GCAspect.AETHER));
    public static final RegistryObject<Item>  RAW_TANZANITE = ITEMS.register("raw_tanzanite", () -> new GemcraftAspectedItem(new Item.Properties(), GCRarity.RARE, GCAspect.AETHER));

    // Lys
    public static final RegistryObject<Item>  RAW_ALBITE = ITEMS.register("raw_albite", () -> new GemcraftAspectedItem(new Item.Properties(), GCRarity.COMMON, GCAspect.LYS));
    public static final RegistryObject<Item>  RAW_DENDRITIC_OPAL = ITEMS.register("raw_dendritic_opal", () -> new GemcraftAspectedItem(new Item.Properties(), GCRarity.UNCOMMON, GCAspect.LYS));
    public static final RegistryObject<Item>  RAW_DIAMOND = ITEMS.register("raw_diamond", () -> new GemcraftAspectedItem(new Item.Properties(), GCRarity.RARE, GCAspect.LYS));

    // Inanis
    public static final RegistryObject<Item>  RAW_SMOKY_QUARTZ = ITEMS.register("raw_smoky_quartz", () -> new GemcraftAspectedItem(new Item.Properties(), GCRarity.COMMON, GCAspect.INANIS));
    public static final RegistryObject<Item>  RAW_FERBERITE = ITEMS.register("raw_ferberite", () -> new GemcraftAspectedItem(new Item.Properties(), GCRarity.UNCOMMON, GCAspect.INANIS));
    public static final RegistryObject<Item>  RAW_ONYX = ITEMS.register("raw_onyx", () -> new GemcraftAspectedItem(new Item.Properties(), GCRarity.RARE, GCAspect.INANIS));


    public static final RegistryObject<Item> IGNIS_GEM_POWDER = ITEMS.register("ignis_gem_powder",
            () -> new IgnisGemPowderItem(new Item.Properties()));
    public static final RegistryObject<Item> ZEPHYR_GEM_POWDER = ITEMS.register("zephyr_gem_powder",
            () -> new ZephyrGemPowderItem(new Item.Properties()));
    public static final RegistryObject<Item> TERRA_GEM_POWDER = ITEMS.register("terra_gem_powder",
            () -> new TerraGemPowderItem(new Item.Properties()));
    public static final RegistryObject<Item> MIZU_GEM_POWDER = ITEMS.register("mizu_gem_powder",
            () -> new MizuGemPowderItem(new Item.Properties()));
    public static final RegistryObject<Item> AETHER_GEM_POWDER = ITEMS.register("aether_gem_powder",
            () -> new AetherGemPowderItem(new Item.Properties()));
    public static final RegistryObject<Item> LYS_GEM_POWDER = ITEMS.register("lys_gem_powder",
            () -> new LysGemPowderItem(new Item.Properties()));
    public static final RegistryObject<Item> INANIS_GEM_POWDER = ITEMS.register("inanis_gem_powder",
            () -> new InanisGemPowderItem(new Item.Properties()));

    public static final RegistryObject<Item>  ROCK_CANDY = ITEMS.register("rock_candy",
            () -> new Item(new Item.Properties().food(GCFood.ROCK_CANDY)));

    public static final RegistryObject<Item>  BASIC_STAFF = ITEMS.register("basic_staff",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item>  TEST_3D_GEM = ITEMS.register("test_3d_gem",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> MINT = ITEMS.register("mint", () -> new MintItem(new Item.Properties()));

    public static final RegistryObject<Item> PARSNIP = ITEMS.register("parsnip",
            () -> new ItemNameBlockItem(GCBlocks.PARSNIP_CROP.get(), new Item.Properties().food(GCFood.PARSNIP)));

    public static final RegistryObject<Item>  GLASS_VIAL = ITEMS.register("glass_vial",
            () -> new Item(new Item.Properties()));

    //--------- Alchemical Elixirs
    public static final RegistryObject<Item> WEAK_REASSURANCE_ELIXIR = ITEMS.register("weak_reassurance_elixir",
            () -> new ReassuranceElixir(new Item.Properties(), 0, 0, 90));
    public static final RegistryObject<Item> MIDDLING_REASSURANCE_ELIXIR = ITEMS.register("middling_reassurance_elixir",
            () -> new ReassuranceElixir(new Item.Properties(), 2, 2, 90));

    //item register method
    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}
