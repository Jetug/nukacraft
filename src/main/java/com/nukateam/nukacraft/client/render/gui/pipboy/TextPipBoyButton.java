package com.nukateam.nukacraft.client.render.gui.pipboy;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Font;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;

public class TextPipBoyButton extends Button {
    public static final ResourceLocation TEXTURES_LOC = new ResourceLocation("nukacraft:textures/screens/pip_boy_text_widgets.png");

    public TextPipBoyButton(int pX, int pY, int pWidth, int pHeight, Component pMessage, net.minecraft.client.gui.components.Button.OnPress pOnPress) {
        super(pX, pY, pWidth, pHeight, pMessage, pOnPress);
    }

    @Override
    public void renderButton(PoseStack pPoseStack, int pMouseX, int pMouseY, float pPartialTick) {
        Minecraft minecraft = Minecraft.getInstance();
        Font font = minecraft.font;
        RenderSystem.setShader(GameRenderer::getPositionTexShader);
        RenderSystem.setShaderTexture(0, TEXTURES_LOC);
        RenderSystem.setShaderColor(PipBoy.red, PipBoy.green, PipBoy.blue, this.alpha);
        int i = this.getYImage(this.isHoveredOrFocused());
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        RenderSystem.enableDepthTest();
        this.blit(pPoseStack, this.x, this.y, 0, 46 + i * 20, this.width / 2, this.height);
        this.blit(pPoseStack, this.x + this.width / 2, this.y, 200 - this.width / 2, 46 + i * 20, this.width / 2, this.height);
        this.renderBg(pPoseStack, minecraft, pMouseX, pMouseY);
        int j = this.getFGColor();
        drawCenteredString(pPoseStack, font, this.getMessage(), this.x + this.width / 2, this.y + (this.height - 8) / 2, j | Mth.ceil(this.alpha * 255.0F) << 24);
    }

    public int getFGColor() {
        if (packedFGColor != UNSET_FG_COLOR) return packedFGColor;
        return this.active ? -6684775 : 10526880; // White : Light Grey
    }
}
