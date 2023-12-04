package net.brynnexvii.gemcraft.block;

import net.brynnexvii.gemcraft.GemCraft;
import net.brynnexvii.gemcraft.block.crops.ParsnipCropBlock;
import net.brynnexvii.gemcraft.item.GCItems;
import net.brynnexvii.gemcraft.worldgen.tree.IgnisTreeGrower;
import net.brynnexvii.gemcraft.worldgen.tree.WillowTreeGrower;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class GCBlocks {
    //block deferred register
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, GemCraft.MODID);

    //<editor-fold desc="Random Blocks">
    public static final RegistryObject<Block> RUBY_BLOCK = registerBlock("ruby_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK)));
    //</editor-fold>

    //------------------------------------------------------------------------------------------------------------------
    //<editor-fold desc="Ore Blocks">
    public static final RegistryObject<Block> IGNIS_GEM_ORE = registerBlock("ignis_gem_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE).requiresCorrectToolForDrops(), UniformInt.of(3,7)));
    public static final RegistryObject<Block> DEEPSLATE_IGNIS_GEM_ORE = registerBlock("deepslate_ignis_gem_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_DIAMOND_ORE).requiresCorrectToolForDrops(), UniformInt.of(3,7)));
    public static final RegistryObject<Block> NETHER_IGNIS_GEM_ORE = registerBlock("nether_ignis_gem_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.NETHERRACK).requiresCorrectToolForDrops(), UniformInt.of(3,7)));
    public static final RegistryObject<Block> END_STONE_IGNIS_GEM_ORE = registerBlock("end_stone_ignis_gem_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.END_STONE).requiresCorrectToolForDrops(), UniformInt.of(4,8)));

    public static final RegistryObject<Block> ZEPHYR_GEM_ORE = registerBlock("zephyr_gem_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE).requiresCorrectToolForDrops(), UniformInt.of(3,7)));
    public static final RegistryObject<Block> DEEPSLATE_ZEPHYR_GEM_ORE = registerBlock("deepslate_zephyr_gem_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_DIAMOND_ORE).requiresCorrectToolForDrops(), UniformInt.of(3,7)));
    public static final RegistryObject<Block> NETHER_ZEPHYR_GEM_ORE = registerBlock("nether_zephyr_gem_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.NETHERRACK).requiresCorrectToolForDrops(), UniformInt.of(3,7)));
    public static final RegistryObject<Block> END_STONE_ZEPHYR_GEM_ORE = registerBlock("end_stone_zephyr_gem_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.END_STONE).requiresCorrectToolForDrops(), UniformInt.of(4,8)));

    public static final RegistryObject<Block> TERRA_GEM_ORE = registerBlock("terra_gem_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE).requiresCorrectToolForDrops(), UniformInt.of(3,7)));
    public static final RegistryObject<Block> DEEPSLATE_TERRA_GEM_ORE = registerBlock("deepslate_terra_gem_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_DIAMOND_ORE).requiresCorrectToolForDrops(), UniformInt.of(3,7)));
    public static final RegistryObject<Block> NETHER_TERRA_GEM_ORE = registerBlock("nether_terra_gem_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.NETHERRACK).requiresCorrectToolForDrops(), UniformInt.of(3,7)));
    public static final RegistryObject<Block> END_STONE_TERRA_GEM_ORE = registerBlock("end_stone_terra_gem_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.END_STONE).requiresCorrectToolForDrops(), UniformInt.of(4,8)));

    public static final RegistryObject<Block> MIZU_GEM_ORE = registerBlock("mizu_gem_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE).requiresCorrectToolForDrops(), UniformInt.of(3,7)));
    public static final RegistryObject<Block> DEEPSLATE_MIZU_GEM_ORE = registerBlock("deepslate_mizu_gem_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_DIAMOND_ORE).requiresCorrectToolForDrops(), UniformInt.of(3,7)));
    public static final RegistryObject<Block> NETHER_MIZU_GEM_ORE = registerBlock("nether_mizu_gem_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.NETHERRACK).requiresCorrectToolForDrops(), UniformInt.of(3,7)));
    public static final RegistryObject<Block> END_STONE_MIZU_GEM_ORE = registerBlock("end_stone_mizu_gem_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.END_STONE).requiresCorrectToolForDrops(), UniformInt.of(4,8)));

    public static final RegistryObject<Block> AETHER_GEM_ORE = registerBlock("aether_gem_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE).requiresCorrectToolForDrops(), UniformInt.of(3,7)));
    public static final RegistryObject<Block> DEEPSLATE_AETHER_GEM_ORE = registerBlock("deepslate_aether_gem_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_DIAMOND_ORE).requiresCorrectToolForDrops(), UniformInt.of(3,7)));
    public static final RegistryObject<Block> NETHER_AETHER_GEM_ORE = registerBlock("nether_aether_gem_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.NETHERRACK).requiresCorrectToolForDrops(), UniformInt.of(3,7)));
    public static final RegistryObject<Block> END_STONE_AETHER_GEM_ORE = registerBlock("end_stone_aether_gem_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.END_STONE).requiresCorrectToolForDrops(), UniformInt.of(4,8)));

    public static final RegistryObject<Block> LYS_GEM_ORE = registerBlock("lys_gem_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE).requiresCorrectToolForDrops(), UniformInt.of(3,7)));
    public static final RegistryObject<Block> DEEPSLATE_LYS_GEM_ORE = registerBlock("deepslate_lys_gem_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_DIAMOND_ORE).requiresCorrectToolForDrops(), UniformInt.of(3,7)));
    public static final RegistryObject<Block> NETHER_LYS_GEM_ORE = registerBlock("nether_lys_gem_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.NETHERRACK).requiresCorrectToolForDrops(), UniformInt.of(3,7)));
    public static final RegistryObject<Block> END_STONE_LYS_GEM_ORE = registerBlock("end_stone_lys_gem_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.END_STONE).requiresCorrectToolForDrops(), UniformInt.of(4,8)));

    public static final RegistryObject<Block> INANIS_GEM_ORE = registerBlock("inanis_gem_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE).requiresCorrectToolForDrops(), UniformInt.of(3,7)));
    public static final RegistryObject<Block> DEEPSLATE_INANIS_GEM_ORE = registerBlock("deepslate_inanis_gem_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_DIAMOND_ORE).requiresCorrectToolForDrops(), UniformInt.of(3,7)));
    public static final RegistryObject<Block> NETHER_INANIS_GEM_ORE = registerBlock("nether_inanis_gem_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.NETHERRACK).requiresCorrectToolForDrops(), UniformInt.of(3,7)));
    public static final RegistryObject<Block> END_STONE_INANIS_GEM_ORE = registerBlock("end_stone_inanis_gem_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.END_STONE).requiresCorrectToolForDrops(), UniformInt.of(4,8)));


    //</editor-fold>

    //------------------------------------------------------------------------------------------------------------------
    //<editor-fold desc="Log and Wood Blocks">
    //Define the stripped versions first so the normal ones can reference them in their registry objects
    public static final RegistryObject<Block> STRIPPED_WILLOW_LOG = registerBlock("stripped_willow_log",
            () -> new GCFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final RegistryObject<Block> WILLOW_LOG = registerBlock("willow_log",
            () -> new GCFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG), GCBlocks.STRIPPED_WILLOW_LOG.get()));
    public static final RegistryObject<Block> STRIPPED_WILLOW_WOOD = registerBlock("stripped_willow_wood",
            () -> new GCFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final RegistryObject<Block> WILLOW_WOOD = registerBlock("willow_wood",
            () -> new GCFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD), GCBlocks.STRIPPED_WILLOW_WOOD.get()));

    public static final RegistryObject<Block> STRIPPED_IGNIS_LOG = registerBlock("stripped_ignis_log",
            () -> new GCFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final RegistryObject<Block> IGNIS_LOG = registerBlock("ignis_log",
            () -> new GCFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG), GCBlocks.STRIPPED_IGNIS_LOG.get()));
    public static final RegistryObject<Block> STRIPPED_IGNIS_WOOD = registerBlock("stripped_ignis_wood",
            () -> new GCFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final RegistryObject<Block> IGNIS_WOOD = registerBlock("ignis_wood",
            () -> new GCFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD), GCBlocks.STRIPPED_IGNIS_WOOD.get()));

    //</editor-fold>

    //------------------------------------------------------------------------------------------------------------------
    //<editor-fold desc="Leaf Blocks">
    public static final RegistryObject<Block> WILLOW_LEAVES = registerBlock("willow_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)){
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 60;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 30;
                }
            });

    public static final RegistryObject<Block> IGNIS_LEAVES = registerBlock("ignis_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)){
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 60;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 30;
                }
            });
    //</editor-fold>

    //------------------------------------------------------------------------------------------------------------------
    //<editor-fold desc="Saplings">

    public static final RegistryObject<Block> WILLOW_SAPLING = registerBlock("willow_sapling",
            () -> new SaplingBlock(new WillowTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> IGNIS_SAPLING = registerBlock("ignis_sapling",
            () -> new SaplingBlock(new IgnisTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
    //</editor-fold>

    //------------------------------------------------------------------------------------------------------------------
    //<editor-fold desc="Planks">
    public static final RegistryObject<Block> WILLOW_PLANKS = registerBlock("willow_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)){
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }
            });

    public static final RegistryObject<Block> IGNIS_PLANKS = registerBlock("ignis_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)){
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }
            });
    //</editor-fold>

    //------------------------------------------------------------------------------------------------------------------
    //<editor-fold desc="Stair Blocks">
    public static final RegistryObject<Block> WILLOW_STAIRS = registerBlock("willow_stairs",
            () -> new StairBlock(() -> GCBlocks.WILLOW_PLANKS.get().defaultBlockState(),BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS)){
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }
            });

    public static final RegistryObject<Block> IGNIS_STAIRS = registerBlock("ignis_stairs",
            () -> new StairBlock(() -> GCBlocks.IGNIS_PLANKS.get().defaultBlockState(),BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS)){
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }
            });

    //</editor-fold>

    //------------------------------------------------------------------------------------------------------------------
    //<editor-fold desc="Slab Blocks">

    public static final RegistryObject<Block> WILLOW_SLAB = registerBlock("willow_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)){
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }
            });

    public static final RegistryObject<Block> IGNIS_SLAB = registerBlock("ignis_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)){
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }
            });
    //</editor-fold>

    //------------------------------------------------------------------------------------------------------------------
    //<editor-fold desc="Button Blocks">

    public static final RegistryObject<Block> WILLOW_BUTTON = registerBlock("willow_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON), BlockSetType.OAK, 10, true));
    public static final RegistryObject<Block> IGNIS_BUTTON = registerBlock("ignis_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON), BlockSetType.OAK, 10, true));
    //</editor-fold>

    //------------------------------------------------------------------------------------------------------------------
    //<editor-fold desc="Pressure Plates">

    public static final RegistryObject<Block> WILLOW_PRESSURE_PLATE = registerBlock("willow_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE), BlockSetType.OAK));
    public static final RegistryObject<Block> IGNIS_PRESSURE_PLATE = registerBlock("ignis_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE), BlockSetType.OAK));
    //</editor-fold>

    //------------------------------------------------------------------------------------------------------------------
    //<editor-fold desc="Fence Blocks">

    public static final RegistryObject<Block> WILLOW_FENCE = registerBlock("willow_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)){
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }
            });
    public static final RegistryObject<Block> IGNIS_FENCE = registerBlock("ignis_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)){
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }
            });
    //</editor-fold>

    //------------------------------------------------------------------------------------------------------------------
    //<editor-fold desc="Fence Gates">

    public static final RegistryObject<Block> WILLOW_FENCE_GATE = registerBlock("willow_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE){
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }
            });

    public static final RegistryObject<Block> IGNIS_FENCE_GATE = registerBlock("ignis_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE){
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }
            });
    //</editor-fold>

    //------------------------------------------------------------------------------------------------------------------
    //<editor-fold desc="Wall Blocks">

    public static final RegistryObject<Block> WILLOW_WALL = registerBlock("willow_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)){
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 10;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }
            });

    public static final RegistryObject<Block> IGNIS_WALL = registerBlock("ignis_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)){
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 10;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }
            });
    //</editor-fold>

    //------------------------------------------------------------------------------------------------------------------
    //<editor-fold desc="Doors">

    public static final RegistryObject<Block> WILLOW_DOOR = registerBlock("willow_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion(), BlockSetType.OAK));
    public static final RegistryObject<Block> IGNIS_DOOR = registerBlock("ignis_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion(), BlockSetType.OAK));
    //</editor-fold>

    //------------------------------------------------------------------------------------------------------------------
    //<editor-fold desc="Trapdoors">

    public static final RegistryObject<Block> WILLOW_TRAPDOOR = registerBlock("willow_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion(), BlockSetType.OAK));
    public static final RegistryObject<Block> IGNIS_TRAPDOOR = registerBlock("ignis_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion(), BlockSetType.OAK));
    //</editor-fold>

    //------------------------------------------------------------------------------------------------------------------
    //<editor-fold desc="Cauldrons">

    public static final RegistryObject<Block> BASIC_ALCHEMICAL_CAULDRON = registerBlock("basic_alchemical_cauldron",
            () -> new BasicAlchemicalCauldron(BlockBehaviour.Properties.copy(Blocks.CAULDRON).noOcclusion()));
    //</editor-fold>

    //------------------------------------------------------------------------------------------------------------------
    //<editor-fold desc="Crops">
    //registered differently because you cannot just set it down anywhere
    public static final RegistryObject<Block> PARSNIP_CROP = BLOCKS.register("parsnip_crop",
            () -> new ParsnipCropBlock(BlockBehaviour.Properties.copy(Blocks.CARROTS).noOcclusion().noCollission()));
    //</editor-fold>

    //------------------------------------------------------------------------------------------------------------------
    //<editor-fold desc="Flowers">

    public static final RegistryObject<Block> VIOLET_LILY = registerBlock("violet_lily",
            () -> new FlowerBlock(() -> MobEffects.DIG_SPEED, 60, BlockBehaviour.Properties.copy(Blocks.LILY_OF_THE_VALLEY)));
    public static final RegistryObject<Block> POTTED_VIOLET_LILY = BLOCKS.register("potted_violet_lily",
            () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), VIOLET_LILY, BlockBehaviour.Properties.copy(Blocks.POTTED_LILY_OF_THE_VALLEY)));

    //</editor-fold>

    //------------------------------------------------------------------------------------------------------------------

    //block registry helper methods

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    //register the items for the blocks
    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return GCItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    //block register method
    public static void register(IEventBus eventBus){
            BLOCKS.register(eventBus);
    }
}
