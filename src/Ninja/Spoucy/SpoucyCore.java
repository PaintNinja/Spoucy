package Ninja.Spoucy;

import Ninja.Spoucy.API.CustomBlocks;
import Ninja.Spoucy.API.ItemCustomBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

// Basic needed forge stuff
@Mod(modid="Spoucy",name="Spoucy",version="v1")
@NetworkMod(clientSideRequired=true,serverSideRequired=false)

public class SpoucyCore {
	
	public static final String modid = "Spoucy";
	
    @Instance(value = "Spoucy")
    public static SpoucyCore instance;
    
    public Block CustomBlock;
    
    //Fallback Items and Blocks
    public static Item CustomStaticItem; //Used for the tab icon
    public static Item CustomStaticBlock; //Used if CustomBlock fails - currently unused
    
	public static CreativeTabs tabSpoucy = new SpoucyTabs(CreativeTabs.getNextID(), "Spoucy");
    
    @EventHandler
    public void load(FMLInitializationEvent event) {
		//define CustomItem
		CustomStaticItem = new SpoucyItems(5000).setUnlocalizedName("CustomStaticItem");
		
		//define CustomBlock
		CustomBlock = new CustomBlocks(1000, Material.rock).setUnlocalizedName("spoucyblock").setHardness(2.0F);
		GameRegistry.registerBlock(CustomBlock, ItemCustomBlock.class, modid + (CustomBlock.getUnlocalizedName().substring(5)));
		
		//names
		LanguageRegistry.addName(new ItemStack(CustomBlock, 1, 0), "CustomBlock");
		LanguageRegistry.addName(new ItemStack(CustomBlock, 1, 1), "CustomBlock2");
		LanguageRegistry.addName(new ItemStack(CustomBlock, 1, 2), "CustomBlock3");
		LanguageRegistry.addName(new ItemStack(CustomBlock, 1, 3), "CustomBlock4");
		LanguageRegistry.addName(new ItemStack(CustomBlock, 1, 4), "CustomBlock5");
		LanguageRegistry.addName(new ItemStack(CustomBlock, 1, 5), "CustomBlock6");
		LanguageRegistry.addName(new ItemStack(CustomBlock, 1, 6), "CustomBlock7");
		LanguageRegistry.addName(new ItemStack(CustomBlock, 1, 7), "CustomBlock8");
		LanguageRegistry.addName(new ItemStack(CustomBlock, 1, 8), "CustomBlock9");
		LanguageRegistry.addName(new ItemStack(CustomBlock, 1, 9), "CustomBlock10");
		LanguageRegistry.addName(new ItemStack(CustomBlock, 1, 10), "CustomBlock11");
		LanguageRegistry.addName(new ItemStack(CustomBlock, 1, 11), "CustomBlock12");
		LanguageRegistry.addName(new ItemStack(CustomBlock, 1, 12), "CustomBlock13");
		LanguageRegistry.addName(new ItemStack(CustomBlock, 1, 13), "CustomBlock14");
		LanguageRegistry.addName(new ItemStack(CustomBlock, 1, 14), "CustomBlock15");
		LanguageRegistry.addName(new ItemStack(CustomBlock, 1, 15), "CustomBlock16");
		
		LanguageRegistry.addName(CustomStaticItem,"Tab icon DO NOT USE");
		
    }

}