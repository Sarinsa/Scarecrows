package com.sarinsa.scarecrows.common.item;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.sarinsa.scarecrows.client.ClientRegister;
import com.sarinsa.scarecrows.common.core.Scarecrows;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.attributes.Attribute;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nullable;

public class StrawHatItem extends ArmorItem {

    public static final String TEXTURE = Scarecrows.resourceLoc("textures/model/armor/straw_hat.png").toString();

    public StrawHatItem(Properties properties) {
        super(ArmorMaterials.STRAW_HAT, EquipmentSlotType.HEAD, properties);
    }

    @Override
    @Nullable
    public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
        return TEXTURE;
    }

    @OnlyIn(Dist.CLIENT)
    @Override
    @Nullable
    @SuppressWarnings("unchecked")
    public <A extends BipedModel<?>> A getArmorModel(LivingEntity entityLiving, ItemStack itemStack, EquipmentSlotType armorSlot, A defaultModel) {
        return armorSlot == EquipmentSlotType.HEAD ? (A) ClientRegister.STRAW_HAT_MODEL : defaultModel;
    }

    @Override
    public Multimap<Attribute, AttributeModifier> getDefaultAttributeModifiers(EquipmentSlotType slotType) {
        return ImmutableMultimap.of();
    }
}
