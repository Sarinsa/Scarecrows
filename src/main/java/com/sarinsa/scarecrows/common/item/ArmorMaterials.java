package com.sarinsa.scarecrows.common.item;

import com.sarinsa.scarecrows.common.core.Scarecrows;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class ArmorMaterials {

    public static final IArmorMaterial STRAW_HAT = new ArmorMaterial(
            new int[] {0, 0, 0, 0},
            new int[] {0, 0, 0, 0},
            0,
            SoundEvents.GRASS_STEP,
            Ingredient.EMPTY,
            "straw_hat",
            0,
            0.0F
    );

    private static class ArmorMaterial implements IArmorMaterial {

        private final int[] durability;
        private final int[] defense;
        private final int enchantability;
        private final SoundEvent equipSound;
        private final Ingredient repairMaterial;
        private final String name;
        private final float toughness;
        private final float knockbackResistance;

        protected ArmorMaterial(int[] durability, int[] defense, int enchantability, @Nullable SoundEvent equipSound, Ingredient repairMaterial, @Nonnull String name, float toughness, float knockbackResistance) {
            this.durability = durability;
            this.defense = defense;
            this.enchantability = enchantability;
            this.equipSound = equipSound;
            this.repairMaterial = repairMaterial;
            this.name = Scarecrows.resourceLoc(name).toString();
            this.toughness = toughness;
            this.knockbackResistance = knockbackResistance;
        }

        @Override
        public int getDurabilityForSlot(EquipmentSlotType slotType) {
            return this.durability[slotType.getIndex()];
        }

        @Override
        public int getDefenseForSlot(EquipmentSlotType slotType) {
            return this.defense[slotType.getIndex()];
        }

        @Override
        public int getEnchantmentValue() {
            return this.enchantability;
        }

        @Override
        public SoundEvent getEquipSound() {
            return this.equipSound;
        }

        @Override
        public Ingredient getRepairIngredient() {
            return this.repairMaterial;
        }

        @Override
        public String getName() {
            return this.name;
        }

        @Override
        public float getToughness() {
            return this.toughness;
        }

        @Override
        public float getKnockbackResistance() {
            return this.knockbackResistance;
        }
    }
}
