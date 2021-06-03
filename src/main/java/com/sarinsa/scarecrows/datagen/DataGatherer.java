package com.sarinsa.scarecrows.datagen;

import com.sarinsa.scarecrows.common.core.Scarecrows;
import com.sarinsa.scarecrows.datagen.recipe.SRecipeProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = Scarecrows.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGatherer {

    @SubscribeEvent
    public static void onGatherData(GatherDataEvent event) {
        DataGenerator dataGen = event.getGenerator();

        if (event.includeServer()) {
            dataGen.addProvider(new SRecipeProvider(dataGen));
        }
    }
}
