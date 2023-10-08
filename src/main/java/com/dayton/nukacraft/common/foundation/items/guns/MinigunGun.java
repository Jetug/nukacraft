package com.dayton.nukacraft.common.foundation.items.guns;

import com.dayton.guns.common.foundation.item.GunItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantment;

public class MinigunGun extends GunItem {
    public MinigunGun(Properties properties) {
        super(properties);
    }
    public boolean canApplyAtEnchantingTable(ItemStack stack, Enchantment enchantment) {
        return false;
    }

    @Override
    public boolean isFoil(ItemStack p_41453_) {
        return false;
    }
}
