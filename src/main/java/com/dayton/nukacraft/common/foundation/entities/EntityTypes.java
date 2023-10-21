package com.dayton.nukacraft.common.foundation.entities;

import com.dayton.nukacraft.NukaCraftMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.level.Level;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.BiFunction;

import static net.minecraft.world.entity.EntityType.*;

public class EntityTypes {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES
            = DeferredRegister.create(ForgeRegistries.ENTITIES, NukaCraftMod.MOD_ID);

    public static final RegistryObject<EntityType<Deathclaw>> DEATHCLAW =
            registerEntity("deathclaw", Builder
                    .of(Deathclaw::new, MobCategory.MONSTER)
                    .sized(1.5f, 3f));

    public static final RegistryObject<EntityType<MiniNukeEntity>> MININUKE = registerBasic("mini_nuke", MiniNukeEntity::new);

    public static final RegistryObject<EntityType<PowerArmorFrame>> POWER_ARMOR_FRAME =
            registerEntity("power_armor_frame", Builder
                    .of(PowerArmorFrame::new, MobCategory.MISC)
                    .sized(1.0f, 2.3f));

    public static final RegistryObject<EntityType<NuclearExplosionEffectEntity>> NUCLEAR_EXPLOSION_EFFECT
            = ENTITY_TYPES.register("nuclear_explosion_effect", () -> (EntityType) EntityType.Builder
                    .of(NuclearExplosionEffectEntity::new, MobCategory.MISC)
                    .sized(0.99F, 0.99F)
                    .clientTrackingRange(20)
                    .build("nuclear_explosion_effect"));


    public static final RegistryObject<EntityType<NuclearExplosionEntity>> NUCLEAR_EXPLOSION
            = ENTITY_TYPES.register("nuclear_explosion", () -> (EntityType) EntityType.Builder
                    .of(NuclearExplosionEntity::new, MobCategory.MISC)
                    .sized(0.99F, 0.99F)
                    .setCustomClientFactory(NuclearExplosionEntity::new)
                    .setUpdateInterval(1)
                    .setShouldReceiveVelocityUpdates(true)
                    .updateInterval(10)
                    .clientTrackingRange(20)
                    .build("nuclear_explosion"));

    private static <T extends Entity> RegistryObject<EntityType<T>> registerEntity(String entityName, EntityType.Builder<T> builder) {
        NukaCraftMod.LOGGER.debug("ENTITY REGISTERED");
        return ENTITY_TYPES.register(entityName, () -> builder.build(new ResourceLocation(NukaCraftMod.MOD_ID, entityName).toString()));
    }

    private static <T extends Entity> RegistryObject<EntityType<T>>
    registerBasic(String id, BiFunction<EntityType<T>, Level, T> function) {
        return ENTITY_TYPES.register(id, () -> Builder.of(function::apply, MobCategory.MISC)
                .sized(0.25F, 0.25F)
                .setTrackingRange(100)
                .setUpdateInterval(1)
                //.noSummon()
                .fireImmune()
                .setShouldReceiveVelocityUpdates(true).build(id));
    }

    public static void register(IEventBus eventBus){
        ENTITY_TYPES.register(eventBus);
    }
}
