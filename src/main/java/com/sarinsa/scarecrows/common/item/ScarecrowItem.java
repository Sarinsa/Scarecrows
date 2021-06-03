package com.sarinsa.scarecrows.common.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class ScarecrowItem extends Item {

    private final int dyeColorId;

    public ScarecrowItem(int dyeColorId) {
        super(new Item.Properties().tab(ItemGroup.TAB_DECORATIONS).stacksTo(16));
        this.dyeColorId = dyeColorId;
    }

    public int getDyeColorId() {
        return this.dyeColorId;
    }
}
