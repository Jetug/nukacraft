package com.nukateam.nukacraft.client.models.endity;

import com.jetug.chassis_core.client.render.utils.ResourceHelper;
import com.jetug.chassis_core.common.foundation.entity.ChassisBase;
import com.nukateam.nukacraft.common.foundation.entities.Deathclaw;
import mod.azure.azurelib.core.animatable.GeoAnimatable;
import mod.azure.azurelib.core.animation.AnimationState;
import mod.azure.azurelib.model.GeoModel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;

import static com.jetug.chassis_core.client.render.utils.GeoUtils.setHeadAnimation;
import static com.jetug.chassis_core.client.render.utils.ResourceHelper.getChassisResource;
import static com.jetug.chassis_core.common.data.constants.Resources.resourceLocation;
import static com.nukateam.nukacraft.common.data.utils.Resources.nukaResource;

public class EntityModel<T extends LivingEntity & GeoAnimatable> extends GeoModel<T> {
    private static final ResourceLocation model = nukaResource("geo/deathclaw.geo.json");
    private static final ResourceLocation texture = nukaResource( "textures/deathclaw/deathclaw.png");
    private static final ResourceLocation animation = nukaResource( "animations/deathclaw.animation.json");

    @Override
    public ResourceLocation getModelResource(T object) {
        return getChassisResource(object,"geo/chassis/", ".geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(T object) {
        return getChassisResource(object,"textures/entity/", ".png");
    }

    @Override
    public ResourceLocation getAnimationResource(T object) {
        return getChassisResource(object,"animations/", ".animation.json");
    }

    @Override
    public void setCustomAnimations(T animatable, long instanceId, AnimationState<T> animationState) {
        super.setCustomAnimations(animatable, instanceId, animationState);
        setHeadAnimation(animatable, this.getAnimationProcessor(), animationState);
    }

    public static ResourceLocation getChassisResource(Entity animatable, String path, String extension){
        var name = ResourceHelper.getResourceName(animatable.getType().getRegistryName());
        var modId = animatable.getType().getRegistryName().getNamespace();

        return new ResourceLocation(modId, path + name + extension);
    }

//    @Override
//    public void setCustomAnimations(Type animatable, int instanceId, AnimationEvent animationEvent) {
//        super.setCustomAnimations(animatable, instanceId, animationEvent);
//        var head = this.getAnimationProcessor().getBone("head");
//        var extraData = (EntityModelData) animationEvent.getExtraDataOfType(EntityModelData.class).get(0);
//        head.setRotX(extraData.headPitch * ((float) Math.PI / 180F));
//        head.setRotY(extraData.netHeadYaw * ((float) Math.PI / 180F));
//    }

}