package com.sarinsa.scarecrows.client;

import com.sarinsa.scarecrows.client.model.armor.StrawHatModel;
import com.sarinsa.scarecrows.common.core.Scarecrows;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(value = Dist.CLIENT, modid = Scarecrows.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientRegister {

    public static final StrawHatModel STRAW_HAT_MODEL = new StrawHatModel();

    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {
        registerEntityRenderers();
    }

    private static void registerEntityRenderers() {

    }
}
