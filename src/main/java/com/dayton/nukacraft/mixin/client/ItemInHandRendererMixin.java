package com.dayton.nukacraft.mixin.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.ItemInHandRenderer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.block.model.ItemTransforms;
import net.minecraft.client.renderer.entity.ItemRenderer;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import static com.dayton.nukacraft.client.ClientConfig.currentEntity;
import static net.minecraft.client.renderer.block.model.ItemTransforms.*;

@Mixin(ItemInHandRenderer.class)
public class ItemInHandRendererMixin {

    @Inject(method = {"renderItem"}, at = @At(value = "HEAD"))
    public void renderItem(LivingEntity livingEntity, ItemStack pItemStack, TransformType pTransformType,
                           boolean pLeftHand, PoseStack pPoseStack, MultiBufferSource pBuffer,
                           int pCombinedLight, CallbackInfo ci) {
        currentEntity = livingEntity;
    }
}
