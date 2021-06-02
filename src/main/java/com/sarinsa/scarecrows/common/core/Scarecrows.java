package com.sarinsa.scarecrows.common.core;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(Scarecrows.MODID)
public class Scarecrows {

    public static final String MODID = "scarecrows";
    private static final Logger LOGGER = LogManager.getLogger(MODID);

    public Scarecrows() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();


    }
}
