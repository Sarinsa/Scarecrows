package com.sarinsa.scarecrows.common.core;

import com.sarinsa.scarecrows.common.core.register.ScarecrowsItems;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(Scarecrows.MODID)
public class Scarecrows {

    public static final String MODID = "scarecrows";
    public static final Logger LOGGER = LogManager.getLogger(MODID);

    public Scarecrows() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ScarecrowsItems.ITEMS.register(eventBus);
    }

    public static ResourceLocation resourceLoc(String path) {
        return new ResourceLocation(MODID, path);
    }
}
