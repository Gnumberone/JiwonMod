package jiwon.mod.objects.tools;

import jiwon.mod.Main;
import jiwon.mod.init.ItemInit;
import jiwon.mod.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSpade;


public class ToolShovel extends ItemSpade implements IHasModel{

	public ToolShovel(String name, ToolMaterial material) {
		super(material);
		setUnlocalizedName(name); 
		setRegistryName(name);
		setCreativeTab(CreativeTabs.TOOLS);
		
		ItemInit.ITEMS.add(this);
	}

	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
		
	}


}