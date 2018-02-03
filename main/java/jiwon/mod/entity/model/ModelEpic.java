package jiwon.mod.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * ModelPlayer - Either Mojang or a mod author
 * Created using Tabula 7.0.0
 */
public class ModelEpic extends ModelBase {
    public ModelRenderer field_178736_x;
    public ModelRenderer field_178729_w;
    public ModelRenderer LeftArm;
    public ModelRenderer RightLeg;
    public ModelRenderer field_178732_b;
    public ModelRenderer Crown;
    public ModelRenderer LeftLeg;
    public ModelRenderer RightArm;
    public ModelRenderer RightLeg_1;
    public ModelRenderer Head;
    public ModelRenderer Body;
    public ModelRenderer LeftArm_1;
    public ModelRenderer LeftLeg_1;
    public ModelRenderer field_178730_v;

    public ModelEpic() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.Head = new ModelRenderer(this, 0, 0);
        this.Head.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Head.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F);
        this.field_178732_b = new ModelRenderer(this, 40, 32);
        this.field_178732_b.setRotationPoint(-5.0F, 2.0F, 10.0F);
        this.field_178732_b.addBox(-3.0F, -2.0F, -2.0F, 4, 12, 4, 0.25F);
        this.Crown = new ModelRenderer(this, 32, 0);
        this.Crown.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Crown.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.5F);
        this.Body = new ModelRenderer(this, 16, 16);
        this.Body.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Body.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.0F);
        this.RightLeg = new ModelRenderer(this, 0, 32);
        this.RightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
        this.RightLeg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.25F);
        this.RightLeg_1 = new ModelRenderer(this, 0, 16);
        this.RightLeg_1.setRotationPoint(-1.9F, 12.0F, 0.0F);
        this.RightLeg_1.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.field_178730_v = new ModelRenderer(this, 16, 32);
        this.field_178730_v.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.field_178730_v.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.25F);
        this.field_178736_x = new ModelRenderer(this, 24, 0);
        this.field_178736_x.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.field_178736_x.addBox(-3.0F, -6.0F, -1.0F, 6, 6, 1, 0.0F);
        this.RightArm = new ModelRenderer(this, 40, 16);
        this.RightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
        this.RightArm.addBox(-3.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F);
        this.LeftLeg_1 = new ModelRenderer(this, 16, 48);
        this.LeftLeg_1.setRotationPoint(1.9F, 12.0F, 0.0F);
        this.LeftLeg_1.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.field_178729_w = new ModelRenderer(this, 0, 0);
        this.field_178729_w.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.field_178729_w.addBox(-5.0F, 0.0F, -1.0F, 10, 16, 1, 0.0F);
        this.LeftArm_1 = new ModelRenderer(this, 32, 48);
        this.LeftArm_1.setRotationPoint(5.0F, 2.0F, 0.0F);
        this.LeftArm_1.addBox(-1.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F);
        this.LeftLeg = new ModelRenderer(this, 0, 48);
        this.LeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
        this.LeftLeg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.25F);
        this.LeftArm = new ModelRenderer(this, 48, 48);
        this.LeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
        this.LeftArm.addBox(-1.0F, -2.0F, -2.0F, 4, 12, 4, 0.25F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.Head.render(f5);
        this.field_178732_b.render(f5);
        this.Crown.render(f5);
        this.Body.render(f5);
        this.RightLeg.render(f5);
        this.RightLeg_1.render(f5);
        this.field_178730_v.render(f5);
        this.field_178736_x.render(f5);
        this.RightArm.render(f5);
        this.LeftLeg_1.render(f5);
        this.field_178729_w.render(f5);
        this.LeftArm_1.render(f5);
        this.LeftLeg.render(f5);
        this.LeftArm.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
