package net.brynnexvii.gemcraft.block.entity;

import net.brynnexvii.gemcraft.GemCraft;
import net.brynnexvii.gemcraft.block.GCBlocks;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class GCBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, GemCraft.MODID);

    public static final RegistryObject<BlockEntityType<BasicAlchemicalCauldronEntity>> BASIC_ALCHEMICAL_CAULDRON_BLOCK_ENTITY = BLOCK_ENTITIES.register("basic_alchemical_cauldron_block_entity",
            () -> BlockEntityType.Builder.of(BasicAlchemicalCauldronEntity::new, GCBlocks.BASIC_ALCHEMICAL_CAULDRON.get()).build(null));

    public static void register(IEventBus eventBus){
        BLOCK_ENTITIES.register(eventBus);
    }
}
