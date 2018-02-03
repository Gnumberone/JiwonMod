package jiwon.mod.render;

import org.lwjgl.opengl.GL11;

import jiwon.mod.util.Reference;
import jiwon.mod.entity.EntityHurricane;
import jiwon.mod.model.ModelHurricane;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderHurricane extends Render<EntityHurricane>{
	
	private static final ResourceLocation HURRICANE = new ResourceLocation(Reference.MODID + ":models/item/hurricane.json");
	private ModelHurricane model = new ModelHurricane();
	
	protected RenderHurricane(RenderManager renderManager) {
		super(renderManager);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityHurricane entity) {
		return HURRICANE;
	}
	
	@Override
	public void doRender(EntityHurricane entity, double x, double y, double z, float entityYaw, float partialTicks) {
		GL11.glPushMatrix();
		bindTexture(HURRICANE);
		GL11.glTranslated(x, y, z);
		model.render(entity, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f);
		GL11.glPopMatrix();
	}

}