package com.sarinsa.scarecrows.client.model.armor;

import com.google.common.collect.ImmutableList;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.LivingEntity;

public class StrawHatModel extends BipedModel<LivingEntity> {

    public StrawHatModel() {
        super(0.0F);
        this.texWidth = 48;
        this.texHeight = 48;

        this.head = new ModelRenderer(this);
        this.head.setPos(0.0F, 0.0F, 0.0F);
        this.head.texOffs(0, 32).addBox(-8.0F, -4.0F, -8.0F, 16.0F, 0.0F, 16.0F, 0.0F, false);
        this.head.texOffs(0, 18).addBox(-5.0F, -8.0F, -5.0F, 10.0F, 4.0F, 10.0F, 0.0F, false);
    }

    @Override
    protected Iterable<ModelRenderer> headParts() {
        return ImmutableList.of(this.head);
    }

    @Override
    protected Iterable<ModelRenderer> bodyParts() {
        return ImmutableList.of();
    }
}
