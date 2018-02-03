
package jiwon.mod.render;

import jiwon.mod.entity.EntityHurricane;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderingRegistry {
	public static void registerEntityRenders() {
		net.minecraftforge.fml.client.registry.RenderingRegistry.registerEntityRenderingHandler(EntityHurricane.class, new IRenderFactory<EntityHurricane>() {

			@Override
			public Render<? super EntityHurricane> createRenderFor(RenderManager manager) {
				return new RenderHurricane(manager);
			}
		});
	}
}