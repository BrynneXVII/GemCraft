package net.brynnexvii.gemcraft.item;

import net.brynnexvii.gemcraft.GemCraft;
import net.brynnexvii.gemcraft.block.GCBlocks;
import net.brynnexvii.gemcraft.item.herbs.MintItem;
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
    public static final RegistryObject<Item>  RAW_DIAMOND = ITEMS.register("raw_diamond",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item>  BRILLIANT_RUBY = ITEMS.register("brilliant_ruby",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item>  RUBY = ITEMS.register("ruby",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item>  RAW_RUBY = ITEMS.register("raw_ruby",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item>  BRILLIANT_EMERALD = ITEMS.register("brilliant_emerald",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item>  RAW_EMERALD = ITEMS.register("raw_emerald",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RUBY_POWDER = ITEMS.register("ruby_powder",
            () -> new RubyPowderItem(new Item.Properties()));
    public static final RegistryObject<Item> EMERALD_POWDER = ITEMS.register("emerald_powder",
            () -> new EmeraldPowderItem(new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_POWDER = ITEMS.register("diamond_powder",
            () -> new DiamondPowderItem(new Item.Properties()));

    public static final RegistryObject<Item>  ROCK_CANDY = ITEMS.register("rock_candy",
            () -> new Item(new Item.Properties().food(GCFood.ROCK_CANDY)));

    public static final RegistryObject<Item>  BASIC_STAFF = ITEMS.register("basic_staff",
            () -> new Item(new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> MINT = ITEMS.register("mint", () -> new MintItem(new Item.Properties()));

    public static final RegistryObject<Item> PARSNIP = ITEMS.register("parsnip",
            () -> new ItemNameBlockItem(GCBlocks.PARSNIP_CROP.get(), new Item.Properties().food(GCFood.PARSNIP)));

    //item register method
    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}
