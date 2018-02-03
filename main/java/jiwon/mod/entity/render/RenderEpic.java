package jiwon.mod.entity.render;

import jiwon.mod.entity.EntityEpic;
import jiwon.mod.util.Reference;
import jiwon.mod.entity.model.ModelEpic;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;


public class RenderEpic extends RenderLiving<EntityEpic>{
	
	public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MODID + ":textures/entity/epic.png");
	
	public RenderEpic(RenderManager manager) {
		
		super(manager, new ModelEpic(), 0.5F);
	}
	@Override
	protected ResourceLocation getEntityTexture(EntityEpic entity) {

		return TEXTURES;
	}
	@Override
	protected void applyRotations(EntityEpic entityLiving, float p_77043_2_, float rotationYaw, float partialTicks) {
		
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}

}
