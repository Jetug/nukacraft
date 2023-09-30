package com.dayton.nukacraft.common.container;

import com.dayton.nukacraft.common.container.screen.*;
import net.minecraft.client.gui.screens.MenuScreens;

import static com.dayton.nukacraft.common.container.ContainerRegistry.*;

public class GuiRegistry {
    public static void register() {
        MenuScreens.register(POWER_CHASSIS_MENU.get(), PowerArmorScreen::new);
        MenuScreens.register(ARMOR_STATION_MENU.get(), PowerArmorStationScreen::new);
    }
}
