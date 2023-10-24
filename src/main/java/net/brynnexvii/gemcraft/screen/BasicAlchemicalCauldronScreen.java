package net.brynnexvii.gemcraft.screen;

import net.brynnexvii.gemcraft.GemCraft;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AbstractContainerMenu;

public class BasicAlchemicalCauldronScreen extends AlchemicalCauldronScreen{
    private static final ResourceLocation TEXTURE = new ResourceLocation(GemCraft.MODID, "textures/gui/basic_alchemical_cauldron_gui.png");
    public BasicAlchemicalCauldronScreen(BasicAlchemicalCauldronMenu pMenu, Inventory pPlayerInventory, Component pTitle) {
        super(pMenu, pPlayerInventory, pTitle, TEXTURE);
    }
}
