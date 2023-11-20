package com.dayton.guns.common.foundation.item;

import com.dayton.nukacraft.common.data.interfaces.IResourceProvider;
import mod.azure.azurelib.animatable.GeoEntity;
import mod.azure.azurelib.core.animatable.instance.AnimatableInstanceCache;
import net.minecraft.client.renderer.block.model.ItemTransforms;
import net.minecraft.world.item.ItemStack;

import static mod.azure.azurelib.util.AzureLibUtil.createInstanceCache;
import static net.minecraft.client.renderer.block.model.ItemTransforms.*;

public abstract class GunItemBase implements GeoEntity {
    protected final AnimatableInstanceCache cache = createInstanceCache(this);

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return cache;
    }
}