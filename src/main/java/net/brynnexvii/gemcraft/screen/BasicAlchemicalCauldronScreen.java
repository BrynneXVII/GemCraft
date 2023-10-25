package net.brynnexvii.gemcraft.screen;

import net.brynnexvii.gemcraft.GemCraft;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;


public class BasicAlchemicalCauldronScreen extends AlchemicalCauldronScreen<BasicAlchemicalCauldronMenu> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(GemCraft.MODID, "textures/gui/basic_alchemical_cauldron_gui.png");
    public BasicAlchemicalCauldronScreen(BasicAlchemicalCauldronMenu pMenu, Inventory pPlayerInventory, Component pTitle) {
        super(pMenu, pPlayerInventory, pTitle, TEXTURE);
    }

    protected void renderProgressArrow(GuiGraphics guiGraphics, int x, int y){
        if(menu.isCrafting()){
            guiGraphics.blit(TEXTURE, x + 79, y + 39, 176, 0, menu.getScaledProgress(), 17); //where draw xy, where get xy, how big xy
        }
    }

}
