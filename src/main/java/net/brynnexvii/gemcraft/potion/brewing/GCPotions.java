package net.brynnexvii.gemcraft.potion.brewing;

import net.brynnexvii.gemcraft.GemCraft;
import net.brynnexvii.gemcraft.effect.GCEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class GCPotions {

    public static final DeferredRegister<Potion> POTIONS = DeferredRegister.create(ForgeRegistries.POTIONS, GemCraft.MODID);

    public static final RegistryObject<Potion> GLOWING_POTION = POTIONS.register("glowing_potion", () -> new Potion(new MobEffectInstance(MobEffects.GLOWING, 200, 0)));
    public static final RegistryObject<Potion> NATURE_GROWTH_POTION = POTIONS.register("nature_growth_potion", () -> new Potion(new MobEffectInstance(GCEffects.NATURE_GROWTH_EFFECT_2r_20f.get(), 200, 0)));

    //Helper methods
    public static void register(IEventBus eventBus){
        POTIONS.register(eventBus);
    }
}
