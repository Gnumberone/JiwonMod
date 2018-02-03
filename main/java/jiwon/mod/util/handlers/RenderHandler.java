package jiwon.mod.util.handlers;

import jiwon.mod.entity.EntityEpic;
import jiwon.mod.entity.render.RenderEpic;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderHandler {
	
	public static void registerEntityRenders() {
		RenderingRegistry.registerEntityRenderingHandler(EntityEpic.class, new IRenderFactory<EntityEpic>() {
			@Override
			public Render<? super EntityEpic> createRenderFor(RenderManager manager) {

				return new RenderEpic(manager);
			}
		});
	}
}
