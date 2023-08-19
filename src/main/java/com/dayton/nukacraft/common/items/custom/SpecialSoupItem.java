package com.dayton.nukacraft.common.items.custom;

import com.dayton.nukacraft.NukaCraftMod;
import com.dayton.nukacraft.client.helpers.RadiationMath;
import com.dayton.nukacraft.common.items.ModItemsClass;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;


public class SpecialSoupItem extends Item {
    private float radfloat;
    private boolean irradiated;
    public SpecialSoupItem(boolean irradiated, float radfloat, Item.Properties item) {
        super(item);
        this.irradiated = irradiated;
        this.radfloat = radfloat;
    }
//
    @Override
    public ItemStack finishUsingItem(ItemStack stack, Level level, LivingEntity entity) {
        if (entity instanceof Player) {
            RadiationMath.attributeUpdate(entity, this.irradiated, this.radfloat, Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
                    (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
        }

        if (stack.getItem() == ModItemsClass.FMSOUP.get() || stack.getItem() == ModItemsClass.FMPUREE.get()) {
            entity.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 200, 0, false, false));
        }
        if (!((Player) entity).isCreative()) {entity.getMainHandItem().shrink(1);}
        ItemStack itemstack = super.finishUsingItem(stack, level, entity);
        return entity instanceof Player && ((Player)entity).getAbilities().instabuild ? itemstack : new ItemStack(Items.BOWL);
    }

    @Override
    public void appendHoverText(ItemStack item, @Nullable Level level, List<Component> list, TooltipFlag flag) {
        super.appendHoverText(item, level, list, flag);
        if (!this.irradiated) {
            if (!(this.radfloat == 0.0f)) {
                list.add(new TranslatableComponent("tooltip.nukacraft.irradiation").append(("§a-" + this.radfloat)));
            }
        } else {
            list.add(new TranslatableComponent("tooltip.nukacraft.radiation").append(("§c+" + this.radfloat)));
        }

        if (item.getItem() == ModItemsClass.FMSOUP.get() || item.getItem() == ModItemsClass.FMPUREE.get()) {
            list.add(new TranslatableComponent("tooltip.nukacraft.fire_res").append("§9(0:10)"));
        }
    }
}
