package net.brynnexvii.gemcraft.item;

import net.brynnexvii.gemcraft.GemCraft;
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

    //item register method
    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}
