package jiwon.mod.init;

import java.util.ArrayList;
import java.util.List;

import jiwon.mod.objects.armour.ArmourBase;
import jiwon.mod.objects.items.ItemBase;
import jiwon.mod.objects.tools.ToolPickaxe;
import jiwon.mod.objects.tools.ToolAxe;
import jiwon.mod.objects.tools.ToolHoe;
import jiwon.mod.objects.tools.ToolShovel;
import jiwon.mod.objects.tools.ToolSword;
import jiwon.mod.util.Reference;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ItemInit {
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Material
	public static final ToolMaterial TOOL_WEATHER = EnumHelper.addToolMaterial("tool_weather", 5, 2000, 6.5F, 7.0F, 10);
	public static final ArmorMaterial ARMOUR_WEATHER = EnumHelper.addArmorMaterial("armour_weather", Reference.MODID + ":weather",  20, new int[]{2, 5, 7, 5}, 15, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F);
	
	//Items
	public static final Item TICKET = new ItemBase("ticket");
	
	
	//Tools
	public static final Item AXE_WEATHER = new ToolAxe("axe_weather", TOOL_WEATHER);
	public static final Item HOE_WEATHER = new ToolHoe("hoe_weather", TOOL_WEATHER);
	public static final Item PICKAXE_WEATHER = new ToolPickaxe("pickaxe_weather", TOOL_WEATHER);
	public static final Item SHOVEL_WEATHER = new ToolShovel("shovel_weather", TOOL_WEATHER);
	public static final Item SWORD_WEATHER = new ToolSword("sword_weather", TOOL_WEATHER);
	
	
	//Armour
	public static final Item HELMET_WEATHER = new ArmourBase("helmet_weather", ARMOUR_WEATHER, 1, EntityEquipmentSlot.HEAD);
	public static final Item CHESTPLATE_WEATHER = new ArmourBase("chestplate_weather", ARMOUR_WEATHER, 1, EntityEquipmentSlot.CHEST);
	public static final Item LEGGINGS_WEATHER = new ArmourBase("leggings_weather", ARMOUR_WEATHER, 2, EntityEquipmentSlot.LEGS);
	public static final Item BOOTS_WEATHER = new ArmourBase("boots_weather", ARMOUR_WEATHER, 1, EntityEquipmentSlot.FEET);
}
