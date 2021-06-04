package com.sarinsa.scarecrows.common.event;

import com.sarinsa.scarecrows.common.core.register.ScarecrowsItems;
import net.minecraft.entity.merchant.villager.VillagerProfession;
import net.minecraft.entity.merchant.villager.VillagerTrades;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class VillagerTradeEvents {

    @SubscribeEvent
    public void onGatherTrades(VillagerTradesEvent event) {
        if (event.getType() == VillagerProfession.FARMER) {
            event.getTrades().get(5).add(new VillagerTrades.ItemsForEmeraldsTrade(ScarecrowsItems.STRAW_HAT.get(), 16, 1, 30));
        }
    }
}
