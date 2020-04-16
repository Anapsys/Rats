package com.github.alexthe666.rats.client.render.tile;

import com.github.alexthe666.rats.server.blocks.RatsBlockRegistry;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.tileentity.ItemStackTileEntityRenderer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import org.lwjgl.opengl.GL11;

public class RatsTEISR extends ItemStackTileEntityRenderer {

    private RenderRatHole renderRatHole = new RenderRatHole();
    private RenderRatTrap renderRatTrap = new RenderRatTrap();
    private RenderAutoCurdler renderAutoCurdler = new RenderAutoCurdler();
    private RenderRatlantisPortal renderRatlantisPortal = new RenderRatlantisPortal();
    private RenderRatlanteanAutomatonHead renderRatlanteanAutomatonHead = new RenderRatlanteanAutomatonHead();
    //private RenderUpgradeCombiner renderUpgradeCombiner = new RenderUpgradeCombiner();
    //private RenderUpgradeSeparator renderUpgradeSeparator = new RenderUpgradeSeparator();

    public void render(ItemStack itemStackIn, MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int combinedLightIn, int combinedOverlayIn) {
        if (itemStackIn.getItem() == Item.getItemFromBlock(RatsBlockRegistry.RAT_HOLE)) {
            renderRatHole.render(null, 0, 0, 0, 0, 0);
        }
        if (itemStackIn.getItem() == Item.getItemFromBlock(RatsBlockRegistry.RAT_TRAP)) {
            GL11.glScalef(1.2F, 1.2F, 1.2F);
            renderRatTrap.render(null, 0, 0, 0, 0, 0);
        }
        if (itemStackIn.getItem() == Item.getItemFromBlock(RatsBlockRegistry.AUTO_CURDLER)) {
            renderAutoCurdler.render(null, 0, 0, 0, 0, 0);
        }
        if (itemStackIn.getItem() == Item.getItemFromBlock(RatsBlockRegistry.RATLANTIS_PORTAL)) {
            renderRatlantisPortal.render(null, 0, 0, 0, 0, 0);
        }
        if (itemStackIn.getItem() == Item.getItemFromBlock(RatsBlockRegistry.MARBLED_CHEESE_RAT_HEAD)) {
            renderRatlanteanAutomatonHead.render(null, 0, 0, 0, 0, 0);
        }
    }
}