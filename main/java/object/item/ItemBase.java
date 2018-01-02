package object.item;

import init.ItemInit;
import jiwon.mod.Main;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import util.IHasModel;

public class ItemBase extends Item implements IHasModel{

	public ItemBase(String name) {
	
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS);
	
		ItemInit.ITEMS.add(this);

	}

	@Override
	public void registerModel() {

		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
		

		



	}


