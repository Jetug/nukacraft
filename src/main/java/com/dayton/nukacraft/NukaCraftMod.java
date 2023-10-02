package com.dayton.nukacraft;


import com.dayton.nukacraft.client.ClientHandler;
import com.dayton.nukacraft.client.gui.RadiationHudOverlay;
import com.dayton.nukacraft.client.gui.pipboy.PipBoy;
import com.dayton.nukacraft.client.particles.ModParticles;
import com.dayton.nukacraft.common.foundation.blocks.ModBlocksClass;
import com.dayton.nukacraft.common.foundation.container.ContainerRegistry;
import com.dayton.nukacraft.common.foundation.effects.ModAttributesClass;
import com.dayton.nukacraft.common.foundation.effects.ModEffect;
import com.dayton.nukacraft.common.foundation.entities.EntityTypes;
import com.dayton.nukacraft.common.foundation.entities.MiniNukeEntity;
import com.dayton.nukacraft.common.foundation.items.ModArmorItems;
import com.dayton.nukacraft.common.foundation.items.ModGunsClass;
import com.dayton.nukacraft.common.foundation.items.ModItemsClass;
import com.dayton.nukacraft.common.foundation.items.PowerArmorItems;
import com.dayton.nukacraft.common.foundation.sounds.ModSounds;
import com.dayton.nukacraft.common.foundation.world.ModBiomeGeneration;
import com.dayton.nukacraft.common.foundation.world.ModBiomes;
import com.mojang.logging.LogUtils;
import com.mrcrayfish.guns.common.ProjectileManager;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import software.bernie.geckolib3.GeckoLib;


//Приходит улитка в бар, а там java классы в нарды играют...

@Mod(NukaCraftMod.MOD_ID)
public class NukaCraftMod
{
    public static final Logger LOGGER = LogUtils.getLogger();
    public static final String MOD_ID = "nukacraft";

    public NukaCraftMod()
    {
        GeckoLib.initialize();
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        eventBus.addListener(this::setup);

        ModItemsClass.register(eventBus);
        PowerArmorItems.register(eventBus);
        ModArmorItems.register(eventBus);
        ModGunsClass.register(eventBus);


        ModEffect.register(eventBus);
        ModAttributesClass.register(eventBus);
        ModBlocksClass.register(eventBus);
        ModBiomes.register(eventBus);
        ModParticles.register(eventBus);
        RadiationHudOverlay.register();
        EntityTypes.register(eventBus);
        ModSounds.SOUNDS.register(eventBus);
        ContainerRegistry.register(eventBus);

        eventBus.addListener(this::clientSetup);
        eventBus.addListener(this::onCommonSetup);

        // Register the setup method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        // Register the enqueueIMC method for modloading
//        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::enqueueIMC);
//        // Register the processIMC method for modloading
//        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::processIMC);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void clientSetup(final FMLCommonSetupEvent event) {

        ModSetup.renderTypeSetup();
        ClientHandler.setup();

    }

    private void setup(final FMLCommonSetupEvent event)
    {
        PipBoy pipBoy = new PipBoy();
        pipBoy.init();
        event.enqueueWork(ModBiomeGeneration::generateBiomes);
        ModSetup.flowerPotSetup();
    }

    private void onCommonSetup(FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            ProjectileManager.getInstance().registerFactory(ModItemsClass.MININUKE.get(), (worldIn, entity, weapon, item, modifiedGun) -> new MiniNukeEntity(EntityTypes.MININUKE.get(), worldIn, entity, weapon, item, modifiedGun));
        });
    }
//    private void enqueueIMC(final InterModEnqueueEvent event)
//    {
//    }
//
//    private void processIMC(final InterModProcessEvent event)
//    {
//    }
//
//    // You can use SubscribeEvent and let the Event Bus discover methods to call
//    @SubscribeEvent
//    public void onServerStarting(ServerStartingEvent event)
//    {
//    }


    // You can use EventBusSubscriber to automatically subscribe events on the contained class (this is subscribing to the MOD
    // Event bus for receiving Registry Events)
//    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
//    public static class RegistryEvents
//    {
//        @SubscribeEvent
//        public static void onBlocksRegistry(final RegistryEvent.Register<Block> blockRegistryEvent)
//        {
//        }
//    }
}
