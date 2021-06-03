package com.sarinsa.scarecrows.common.core.register;

import com.sarinsa.scarecrows.common.core.Scarecrows;
import com.sarinsa.scarecrows.common.item.ScarecrowItem;
import com.sarinsa.scarecrows.common.item.StrawHatItem;
import net.minecraft.item.DyeColor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class ScarecrowsItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Scarecrows.MODID);


    public static final RegistryObject<Item> STRAW_HAT = registerItem("straw_hat", () -> new StrawHatItem(new Item.Properties().tab(ItemGroup.TAB_MISC)));

    public static final RegistryObject<Item> BLACK_SCARECROW = registerScarecrowItem(DyeColor.BLACK);
    public static final RegistryObject<Item> BLUE_SCARECROW = registerScarecrowItem(DyeColor.BLUE);
    public static final RegistryObject<Item> BROWN_SCARECROW = registerScarecrowItem(DyeColor.BROWN);
    public static final RegistryObject<Item> CYAN_SCARECROW = registerScarecrowItem(DyeColor.CYAN);
    public static final RegistryObject<Item> GRAY_SCARECROW = registerScarecrowItem(DyeColor.GRAY);
    public static final RegistryObject<Item> GREEN_SCARECROW = registerScarecrowItem(DyeColor.GREEN);
    public static final RegistryObject<Item> LIGHT_BLUE_SCARECROW = registerScarecrowItem(DyeColor.LIGHT_BLUE);
    public static final RegistryObject<Item> LIGHT_GRAY_SCARECROW = registerScarecrowItem(DyeColor.LIGHT_GRAY);
    public static final RegistryObject<Item> LIME_SCARECROW = registerScarecrowItem(DyeColor.LIME);
    public static final RegistryObject<Item> MAGENTA_SCARECROW = registerScarecrowItem(DyeColor.MAGENTA);
    public static final RegistryObject<Item> ORANGE_SCARECROW = registerScarecrowItem(DyeColor.ORANGE);
    public static final RegistryObject<Item> PINK_SCARECROW = registerScarecrowItem(DyeColor.PINK);
    public static final RegistryObject<Item> PURPLE_SCARECROW = registerScarecrowItem(DyeColor.PURPLE);
    public static final RegistryObject<Item> RED_SCARECROW = registerScarecrowItem(DyeColor.RED);
    public static final RegistryObject<Item> WHITE_SCARECROW = registerScarecrowItem(DyeColor.WHITE);
    public static final RegistryObject<Item> YELLOW_SCARECROW = registerScarecrowItem(DyeColor.YELLOW);


    private static <T extends Item> RegistryObject<T> registerItem(String name, Supplier<T> itemSupplier) {
        return ITEMS.register(name, itemSupplier);
    }

    private static RegistryObject<Item> registerScarecrowItem(DyeColor dyeColor) {
        return ITEMS.register(dyeColor.getName() + "_scarecrow", () -> new ScarecrowItem(dyeColor.getId()));
    }

    private static RegistryObject<Item> registerSimpleItem(String name, ItemGroup itemGroup) {
        return ITEMS.register(name, () -> new Item(new Item.Properties().tab(itemGroup)));
    }
}
