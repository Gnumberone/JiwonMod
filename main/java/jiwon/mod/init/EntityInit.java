package jiwon.mod.init;

import jiwon.mod.Main;
import jiwon.mod.entity.EntityEpic;
import jiwon.mod.util.Reference;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class EntityInit {
	
	public static void registerEntites() {
		registerentity("epic", EntityEpic.class, Reference.ENTITY_EPIC, 50, 2017289, 000000);
	}
	
	private static void registerentity(String name, Class<? extends Entity> entity, int id, int range, int color1, int color2) {
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID + ":" + name), entity, name, id, Main.instance, range, 1, true, color1, color2);
	}
}
