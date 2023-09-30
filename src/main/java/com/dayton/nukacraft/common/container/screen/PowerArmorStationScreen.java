package com.dayton.nukacraft.common.container.screen;

import com.dayton.nukacraft.NukaCraftMod;
import com.dayton.nukacraft.common.container.menu.PowerArmorStationMenu;
import com.jetug.chassis_core.common.foundation.container.screen.ArmorStationScreen;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;

import static com.dayton.nukacraft.common.data.utils.Resources.nukaResource;

public class PowerArmorStationScreen extends ArmorStationScreen<PowerArmorStationMenu> {
    public PowerArmorStationScreen(PowerArmorStationMenu menu, Inventory pPlayerInventory, Component pTitle) {
        super(menu, pPlayerInventory, pTitle, nukaResource( "textures/gui/power_armor_station_gui.png"));
    }
}
