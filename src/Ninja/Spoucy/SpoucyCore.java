package Ninja.Spoucy;

import Ninja.Spoucy.Lib.Reference;
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
@Mod(modid=Reference.MOD_ID,name=Reference.MOD_NAME,version=Reference.VERSION)
@NetworkMod(clientSideRequired=true, serverSideRequired=false)

public class SpoucyCore {
	
	public static final String modid = Reference.MOD_ID;
	
    @Instance(value = "Spoucy")
    public static SpoucyCore instance;
    
    public Block CustomBlock;
    
    //Fallback Items and Blocks
    public static Item CustomStaticItem; //Used for the tab icon
    public static Item CustomStaticBlock; //Used if CustomBlock fails - currently unused
    
	public static CreativeTabs tabSpoucy = new SpoucyTabs(CreativeTabs.getNextID(), "Spoucy");
    
    @EventHandler
    public void load(FMLInitializationEvent event) {
    	System.out.println("[Spoucy] Starting...");
		System.out.println("---------------------");
    	//define CustomItem
		System.out.println("[Spoucy] Defining CustomStaticItem...");
		CustomStaticItem = new SpoucyItems(5000).setUnlocalizedName("CustomStaticItem");
		System.out.println("[Spoucy] Defined CustomStaticItem");
		//define CustomBlock
		System.out.println("[Spoucy] Defining CustomBlock...");
		CustomBlock = new CustomBlocks(1000, Material.rock).setUnlocalizedName("spoucyblock").setHardness(2.0F);
		GameRegistry.registerBlock(CustomBlock, ItemCustomBlock.class, modid + (CustomBlock.getUnlocalizedName().substring(5)));
		System.out.println("[Spoucy] Defined CustomBlock");
		//names
		System.out.println("[Spoucy] Defining default names...");
		LanguageRegistry.addName(new ItemStack(CustomBlock, 1, 0), "CustomBlock1");
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
		LanguageRegistry.addName(new ItemStack(CustomBlock, 1, 16), "CustomBlock17");
		LanguageRegistry.addName(new ItemStack(CustomBlock, 1, 17), "CustomBlock18");
		LanguageRegistry.addName(new ItemStack(CustomBlock, 1, 18), "CustomBlock19");
		LanguageRegistry.addName(new ItemStack(CustomBlock, 1, 19), "CustomBlock20");
		LanguageRegistry.addName(new ItemStack(CustomBlock, 1, 20), "CustomBlock21");
		LanguageRegistry.addName(new ItemStack(CustomBlock, 1, 21), "CustomBlock22");
		LanguageRegistry.addName(new ItemStack(CustomBlock, 1, 22), "CustomBlock23");
		LanguageRegistry.addName(new ItemStack(CustomBlock, 1, 23), "CustomBlock24");
		LanguageRegistry.addName(new ItemStack(CustomBlock, 1, 24), "CustomBlock25");
		LanguageRegistry.addName(new ItemStack(CustomBlock, 1, 25), "CustomBlock26");
		LanguageRegistry.addName(new ItemStack(CustomBlock, 1, 26), "CustomBlock27");
		LanguageRegistry.addName(new ItemStack(CustomBlock, 1, 27), "CustomBlock28");
		LanguageRegistry.addName(new ItemStack(CustomBlock, 1, 28), "CustomBlock29");
		LanguageRegistry.addName(new ItemStack(CustomBlock, 1, 29), "CustomBlock30");
		LanguageRegistry.addName(new ItemStack(CustomBlock, 1, 30), "CustomBlock31");
		LanguageRegistry.addName(new ItemStack(CustomBlock, 1, 31), "CustomBlock32");
		LanguageRegistry.addName(new ItemStack(CustomBlock, 1, 32), "CustomBlock33");
		LanguageRegistry.addName(new ItemStack(CustomBlock, 1, 33), "CustomBlock34");
		LanguageRegistry.addName(new ItemStack(CustomBlock, 1, 34), "CustomBlock35");
		LanguageRegistry.addName(new ItemStack(CustomBlock, 1, 35), "CustomBlock36");
		LanguageRegistry.addName(new ItemStack(CustomBlock, 1, 36), "CustomBlock37");
		LanguageRegistry.addName(new ItemStack(CustomBlock, 1, 37), "CustomBlock38");
		LanguageRegistry.addName(new ItemStack(CustomBlock, 1, 38), "CustomBlock39");
		LanguageRegistry.addName(new ItemStack(CustomBlock, 1, 39), "CustomBlock40");
		LanguageRegistry.addName(new ItemStack(CustomBlock, 1, 40), "CustomBlock41");
		LanguageRegistry.addName(new ItemStack(CustomBlock, 1, 41), "CustomBlock42");
		LanguageRegistry.addName(new ItemStack(CustomBlock, 1, 42), "CustomBlock43");
		LanguageRegistry.addName(new ItemStack(CustomBlock, 1, 43), "CustomBlock44");
		LanguageRegistry.addName(new ItemStack(CustomBlock, 1, 44), "CustomBlock45");
		LanguageRegistry.addName(new ItemStack(CustomBlock, 1, 45), "CustomBlock46");
		LanguageRegistry.addName(new ItemStack(CustomBlock, 1, 46), "CustomBlock47");
		LanguageRegistry.addName(new ItemStack(CustomBlock, 1, 47), "CustomBlock48");
		
		LanguageRegistry.addName(CustomStaticItem,"Tab icon DO NOT USE");
		System.out.println("[Spoucy] Defined default names");
    }

}