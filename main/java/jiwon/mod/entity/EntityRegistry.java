package jiwon.mod.entity;

import jiwon.mod.util.Reference;
import jiwon.mod.Main;
import jiwon.mod.util.Reference;

import net.minecraft.util.ResourceLocation;

public class EntityRegistry {
	public static void registerEntities() {
		net.minecraftforge.fml.common.registry.EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID + "hurricane"), EntityHurricane.class, "hurricane", -1, Main.instance, 64, 1, true);
	}
}