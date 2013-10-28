package Ninja.Spoucy;

import Ninja.Spoucy.Lib.Reference;
import Ninja.Spoucy.API.CustomBlocks;
import Ninja.Spoucy.API.CustomCarpet;
import Ninja.Spoucy.API.CustomPlant;
import Ninja.Spoucy.API.CustomSand;
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
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
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
    
    public Block CustomStoneBlock;
    public Block CustomPlant;
    public Block CustomCarpet;
    public Block CustomSand;
    public Item CustomItem;
    
    //Fallback Items and Blocks
    public static Item CustomStaticItem; //Used for the tab icon
    public static Item CustomStaticBlock; //Used if CustomStoneBlock fails - currently unused
    
	public static CreativeTabs tabSpoucy = new SpoucyTabs(CreativeTabs.getNextID(), "Spoucy");
	public static CreativeTabs tabSpoucyOther = new SpoucyTabs2(CreativeTabs.getNextID(), "Spoucy Other");
    
	/*
	 * Hardcoded mcmod.info
	 */
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
/*    	event.getModMetadata().version = Reference.VERSION;
    	event.getModMetadata().name = Reference.MOD_NAME;
    	event.getModMetadata().description = "Description goes here";
    	event.getModMetadata().authorList.add(Reference.AUTHOR1);
	TODO: Fix crash with hardcoded mcmod.info */
    }
    
    /*
     * Mod startup
     */
    @EventHandler
    public void load(FMLInitializationEvent event) {
    	System.out.println("[Spoucy] Starting...");
		System.out.println("---------------------");
		
    	//define CustomStaticItem
		System.out.println("[Spoucy] Defining CustomStaticItem...");
		CustomStaticItem = new SpoucyItems(5000).setUnlocalizedName("CustomStaticItem");
		System.out.println("[Spoucy] Defined CustomStaticItem");
		
		//define CustomStoneBlock
		System.out.println("[Spoucy] Defining CustomStoneBlock...");
		CustomStoneBlock = new CustomBlocks(1000, Material.rock).setUnlocalizedName("spoucystoneblock").setHardness(2.0F);
		GameRegistry.registerBlock(CustomStoneBlock, ItemCustomBlock.class, modid + (CustomStoneBlock.getUnlocalizedName().substring(5)));
		System.out.println("[Spoucy] Defined CustomStoneBlock");
		
		//define CustomPlant
		System.out.println("[Spoucy] Defining CustomPlant...");
		CustomPlant = new CustomPlant(1001, Material.plants).setUnlocalizedName("spoucyplant");
		GameRegistry.registerBlock(CustomPlant, ItemCustomBlock.class, modid + (CustomPlant.getUnlocalizedName().substring(5)));
		System.out.println("[Spoucy] Defined CustomPlant");
		
		//define CustomCarpet
		System.out.println("[Spoucy] Defining CustomCarpet...");
		CustomCarpet = new CustomCarpet(1002, Material.materialCarpet).setUnlocalizedName("spoucycarpet");
		GameRegistry.registerBlock(CustomCarpet, ItemCustomBlock.class, modid + (CustomCarpet.getUnlocalizedName().substring(5)));
		System.out.println("[Spoucy] Defined CustomCarpet");
		
		//define CustomSand
		System.out.println("[Spoucy] Defining CustomSand...");
		CustomSand = new CustomSand(1003, Material.sand).setUnlocalizedName("spoucysand");
		GameRegistry.registerBlock(CustomSand, ItemCustomBlock.class, modid + (CustomSand.getUnlocalizedName().substring(5)));
		System.out.println("[Spoucy] Defined CustomSand");
		
    	//define CustomItem TODO
/*		System.out.println("[Spoucy] Defining CustomItem...");
		CustomItem = new SpoucyItems(5001).setUnlocalizedName("CustomItem");
		System.out.println("[Spoucy] Defined CustomItem");
*/	
		//names
		System.out.println("[Spoucy] Defining default names...");
		LanguageRegistry.addName(new ItemStack(CustomStoneBlock, 1, 0), "CustomStoneBlock1");
		LanguageRegistry.addName(new ItemStack(CustomStoneBlock, 1, 1), "CustomStoneBlock2");
		LanguageRegistry.addName(new ItemStack(CustomStoneBlock, 1, 2), "CustomStoneBlock3");
		LanguageRegistry.addName(new ItemStack(CustomStoneBlock, 1, 3), "CustomStoneBlock4");
		LanguageRegistry.addName(new ItemStack(CustomStoneBlock, 1, 4), "CustomStoneBlock5");
		LanguageRegistry.addName(new ItemStack(CustomStoneBlock, 1, 5), "CustomStoneBlock6");
		LanguageRegistry.addName(new ItemStack(CustomStoneBlock, 1, 6), "CustomStoneBlock7");
		LanguageRegistry.addName(new ItemStack(CustomStoneBlock, 1, 7), "CustomStoneBlock8");
		LanguageRegistry.addName(new ItemStack(CustomStoneBlock, 1, 8), "CustomStoneBlock9");
		LanguageRegistry.addName(new ItemStack(CustomStoneBlock, 1, 9), "CustomStoneBlock10");
		LanguageRegistry.addName(new ItemStack(CustomStoneBlock, 1, 10), "CustomStoneBlock11");
		LanguageRegistry.addName(new ItemStack(CustomStoneBlock, 1, 11), "CustomStoneBlock12");
		LanguageRegistry.addName(new ItemStack(CustomStoneBlock, 1, 12), "CustomStoneBlock13");
		LanguageRegistry.addName(new ItemStack(CustomStoneBlock, 1, 13), "CustomStoneBlock14");
		LanguageRegistry.addName(new ItemStack(CustomStoneBlock, 1, 14), "CustomStoneBlock15");
		LanguageRegistry.addName(new ItemStack(CustomStoneBlock, 1, 15), "CustomStoneBlock16");
		LanguageRegistry.addName(new ItemStack(CustomStoneBlock, 1, 16), "CustomStoneBlock17");
		LanguageRegistry.addName(new ItemStack(CustomStoneBlock, 1, 17), "CustomStoneBlock18");
		LanguageRegistry.addName(new ItemStack(CustomStoneBlock, 1, 18), "CustomStoneBlock19");
		LanguageRegistry.addName(new ItemStack(CustomStoneBlock, 1, 19), "CustomStoneBlock20");
		LanguageRegistry.addName(new ItemStack(CustomStoneBlock, 1, 20), "CustomStoneBlock21");
		LanguageRegistry.addName(new ItemStack(CustomStoneBlock, 1, 21), "CustomStoneBlock22");
		LanguageRegistry.addName(new ItemStack(CustomStoneBlock, 1, 22), "CustomStoneBlock23");
		LanguageRegistry.addName(new ItemStack(CustomStoneBlock, 1, 23), "CustomStoneBlock24");
		LanguageRegistry.addName(new ItemStack(CustomStoneBlock, 1, 24), "CustomStoneBlock25");
		LanguageRegistry.addName(new ItemStack(CustomStoneBlock, 1, 25), "CustomStoneBlock26");
		LanguageRegistry.addName(new ItemStack(CustomStoneBlock, 1, 26), "CustomStoneBlock27");
		LanguageRegistry.addName(new ItemStack(CustomStoneBlock, 1, 27), "CustomStoneBlock28");
		LanguageRegistry.addName(new ItemStack(CustomStoneBlock, 1, 28), "CustomStoneBlock29");
		LanguageRegistry.addName(new ItemStack(CustomStoneBlock, 1, 29), "CustomStoneBlock30");
		LanguageRegistry.addName(new ItemStack(CustomStoneBlock, 1, 30), "CustomStoneBlock31");
		LanguageRegistry.addName(new ItemStack(CustomStoneBlock, 1, 31), "CustomStoneBlock32");
		LanguageRegistry.addName(new ItemStack(CustomStoneBlock, 1, 32), "CustomStoneBlock33");
		LanguageRegistry.addName(new ItemStack(CustomStoneBlock, 1, 33), "CustomStoneBlock34");
		LanguageRegistry.addName(new ItemStack(CustomStoneBlock, 1, 34), "CustomStoneBlock35");
		LanguageRegistry.addName(new ItemStack(CustomStoneBlock, 1, 35), "CustomStoneBlock36");
		LanguageRegistry.addName(new ItemStack(CustomStoneBlock, 1, 36), "CustomStoneBlock37");
		LanguageRegistry.addName(new ItemStack(CustomStoneBlock, 1, 37), "CustomStoneBlock38");
		LanguageRegistry.addName(new ItemStack(CustomStoneBlock, 1, 38), "CustomStoneBlock39");
		LanguageRegistry.addName(new ItemStack(CustomStoneBlock, 1, 39), "CustomStoneBlock40");
		LanguageRegistry.addName(new ItemStack(CustomStoneBlock, 1, 40), "CustomStoneBlock41");
		LanguageRegistry.addName(new ItemStack(CustomStoneBlock, 1, 41), "CustomStoneBlock42");
		LanguageRegistry.addName(new ItemStack(CustomStoneBlock, 1, 42), "CustomStoneBlock43");
		LanguageRegistry.addName(new ItemStack(CustomStoneBlock, 1, 43), "CustomStoneBlock44");
		LanguageRegistry.addName(new ItemStack(CustomStoneBlock, 1, 44), "CustomStoneBlock45");
		LanguageRegistry.addName(new ItemStack(CustomStoneBlock, 1, 45), "CustomStoneBlock46");
		LanguageRegistry.addName(new ItemStack(CustomStoneBlock, 1, 46), "CustomStoneBlock47");
		LanguageRegistry.addName(new ItemStack(CustomStoneBlock, 1, 47), "CustomStoneBlock48");
		LanguageRegistry.addName(new ItemStack(CustomStoneBlock, 1, 48), "CustomStoneBlock49");
		LanguageRegistry.addName(new ItemStack(CustomStoneBlock, 1, 49), "CustomStoneBlock50");
		LanguageRegistry.addName(new ItemStack(CustomStoneBlock, 1, 50), "CustomStoneBlock51");
		LanguageRegistry.addName(new ItemStack(CustomStoneBlock, 1, 51), "CustomStoneBlock52");
		LanguageRegistry.addName(new ItemStack(CustomStoneBlock, 1, 52), "CustomStoneBlock53");
		LanguageRegistry.addName(new ItemStack(CustomStoneBlock, 1, 53), "CustomStoneBlock54");
		LanguageRegistry.addName(new ItemStack(CustomStoneBlock, 1, 54), "CustomStoneBlock55");
		LanguageRegistry.addName(new ItemStack(CustomStoneBlock, 1, 55), "CustomStoneBlock56");
		LanguageRegistry.addName(new ItemStack(CustomStoneBlock, 1, 56), "CustomStoneBlock57");
		LanguageRegistry.addName(new ItemStack(CustomStoneBlock, 1, 57), "CustomStoneBlock58");
		LanguageRegistry.addName(new ItemStack(CustomStoneBlock, 1, 58), "CustomStoneBlock59");
		LanguageRegistry.addName(new ItemStack(CustomStoneBlock, 1, 59), "CustomStoneBlock60");
		LanguageRegistry.addName(new ItemStack(CustomStoneBlock, 1, 60), "CustomStoneBlock61");
		LanguageRegistry.addName(new ItemStack(CustomStoneBlock, 1, 61), "CustomStoneBlock62");
		LanguageRegistry.addName(new ItemStack(CustomStoneBlock, 1, 62), "CustomStoneBlock63");
		LanguageRegistry.addName(new ItemStack(CustomStoneBlock, 1, 63), "CustomStoneBlock64");
		
		LanguageRegistry.addName(new ItemStack(CustomPlant, 1, 0), "CustomPlant1");
		LanguageRegistry.addName(new ItemStack(CustomPlant, 1, 1), "CustomPlant2");
		LanguageRegistry.addName(new ItemStack(CustomPlant, 1, 2), "CustomPlant3");
		LanguageRegistry.addName(new ItemStack(CustomPlant, 1, 3), "CustomPlant4");
		LanguageRegistry.addName(new ItemStack(CustomPlant, 1, 4), "CustomPlant5");
		LanguageRegistry.addName(new ItemStack(CustomPlant, 1, 5), "CustomPlant6");
		LanguageRegistry.addName(new ItemStack(CustomPlant, 1, 6), "CustomPlant7");
		LanguageRegistry.addName(new ItemStack(CustomPlant, 1, 7), "CustomPlant8");
		LanguageRegistry.addName(new ItemStack(CustomPlant, 1, 8), "CustomPlant9");
		LanguageRegistry.addName(new ItemStack(CustomPlant, 1, 9), "CustomPlant10");
		LanguageRegistry.addName(new ItemStack(CustomPlant, 1, 10), "CustomPlant11");
		LanguageRegistry.addName(new ItemStack(CustomPlant, 1, 11), "CustomPlant12");
		LanguageRegistry.addName(new ItemStack(CustomPlant, 1, 12), "CustomPlant13");
		LanguageRegistry.addName(new ItemStack(CustomPlant, 1, 13), "CustomPlant14");
		LanguageRegistry.addName(new ItemStack(CustomPlant, 1, 14), "CustomPlant15");
		LanguageRegistry.addName(new ItemStack(CustomPlant, 1, 15), "CustomPlant16");
		LanguageRegistry.addName(new ItemStack(CustomPlant, 1, 16), "CustomPlant17");
		LanguageRegistry.addName(new ItemStack(CustomPlant, 1, 17), "CustomPlant18");
		LanguageRegistry.addName(new ItemStack(CustomPlant, 1, 18), "CustomPlant19");
		LanguageRegistry.addName(new ItemStack(CustomPlant, 1, 19), "CustomPlant20");
		LanguageRegistry.addName(new ItemStack(CustomPlant, 1, 20), "CustomPlant21");
		LanguageRegistry.addName(new ItemStack(CustomPlant, 1, 21), "CustomPlant22");
		LanguageRegistry.addName(new ItemStack(CustomPlant, 1, 22), "CustomPlant23");
		LanguageRegistry.addName(new ItemStack(CustomPlant, 1, 23), "CustomPlant24");
		LanguageRegistry.addName(new ItemStack(CustomPlant, 1, 24), "CustomPlant25");
		LanguageRegistry.addName(new ItemStack(CustomPlant, 1, 25), "CustomPlant26");
		LanguageRegistry.addName(new ItemStack(CustomPlant, 1, 26), "CustomPlant27");
		LanguageRegistry.addName(new ItemStack(CustomPlant, 1, 27), "CustomPlant28");
		LanguageRegistry.addName(new ItemStack(CustomPlant, 1, 28), "CustomPlant29");
		LanguageRegistry.addName(new ItemStack(CustomPlant, 1, 29), "CustomPlant30");
		LanguageRegistry.addName(new ItemStack(CustomPlant, 1, 30), "CustomPlant31");
		LanguageRegistry.addName(new ItemStack(CustomPlant, 1, 31), "CustomPlant32");
		LanguageRegistry.addName(new ItemStack(CustomPlant, 1, 32), "CustomPlant33");
		LanguageRegistry.addName(new ItemStack(CustomPlant, 1, 33), "CustomPlant34");
		LanguageRegistry.addName(new ItemStack(CustomPlant, 1, 34), "CustomPlant35");
		LanguageRegistry.addName(new ItemStack(CustomPlant, 1, 35), "CustomPlant36");
		LanguageRegistry.addName(new ItemStack(CustomPlant, 1, 36), "CustomPlant37");
		LanguageRegistry.addName(new ItemStack(CustomPlant, 1, 37), "CustomPlant38");
		LanguageRegistry.addName(new ItemStack(CustomPlant, 1, 38), "CustomPlant39");
		LanguageRegistry.addName(new ItemStack(CustomPlant, 1, 39), "CustomPlant40");
		LanguageRegistry.addName(new ItemStack(CustomPlant, 1, 40), "CustomPlant41");
		LanguageRegistry.addName(new ItemStack(CustomPlant, 1, 41), "CustomPlant42");
		LanguageRegistry.addName(new ItemStack(CustomPlant, 1, 42), "CustomPlant43");
		LanguageRegistry.addName(new ItemStack(CustomPlant, 1, 43), "CustomPlant44");
		LanguageRegistry.addName(new ItemStack(CustomPlant, 1, 44), "CustomPlant45");
		LanguageRegistry.addName(new ItemStack(CustomPlant, 1, 45), "CustomPlant46");
		LanguageRegistry.addName(new ItemStack(CustomPlant, 1, 46), "CustomPlant47");
		LanguageRegistry.addName(new ItemStack(CustomPlant, 1, 47), "CustomPlant48");
		LanguageRegistry.addName(new ItemStack(CustomPlant, 1, 48), "CustomPlant49");
		LanguageRegistry.addName(new ItemStack(CustomPlant, 1, 49), "CustomPlant50");
		LanguageRegistry.addName(new ItemStack(CustomPlant, 1, 50), "CustomPlant51");
		LanguageRegistry.addName(new ItemStack(CustomPlant, 1, 51), "CustomPlant52");
		LanguageRegistry.addName(new ItemStack(CustomPlant, 1, 52), "CustomPlant53");
		LanguageRegistry.addName(new ItemStack(CustomPlant, 1, 53), "CustomPlant54");
		LanguageRegistry.addName(new ItemStack(CustomPlant, 1, 54), "CustomPlant55");
		LanguageRegistry.addName(new ItemStack(CustomPlant, 1, 55), "CustomPlant56");
		LanguageRegistry.addName(new ItemStack(CustomPlant, 1, 56), "CustomPlant57");
		LanguageRegistry.addName(new ItemStack(CustomPlant, 1, 57), "CustomPlant58");
		LanguageRegistry.addName(new ItemStack(CustomPlant, 1, 58), "CustomPlant59");
		LanguageRegistry.addName(new ItemStack(CustomPlant, 1, 59), "CustomPlant60");
		LanguageRegistry.addName(new ItemStack(CustomPlant, 1, 60), "CustomPlant61");
		LanguageRegistry.addName(new ItemStack(CustomPlant, 1, 61), "CustomPlant62");
		LanguageRegistry.addName(new ItemStack(CustomPlant, 1, 62), "CustomPlant63");
		LanguageRegistry.addName(new ItemStack(CustomPlant, 1, 63), "CustomPlant64");
		
		LanguageRegistry.addName(new ItemStack(CustomCarpet, 1, 0), "CustomCarpet1");
		LanguageRegistry.addName(new ItemStack(CustomCarpet, 1, 1), "CustomCarpet2");
		LanguageRegistry.addName(new ItemStack(CustomCarpet, 1, 2), "CustomCarpet3");
		LanguageRegistry.addName(new ItemStack(CustomCarpet, 1, 3), "CustomCarpet4");
		LanguageRegistry.addName(new ItemStack(CustomCarpet, 1, 4), "CustomCarpet5");
		LanguageRegistry.addName(new ItemStack(CustomCarpet, 1, 5), "CustomCarpet6");
		LanguageRegistry.addName(new ItemStack(CustomCarpet, 1, 6), "CustomCarpet7");
		LanguageRegistry.addName(new ItemStack(CustomCarpet, 1, 7), "CustomCarpet8");
		LanguageRegistry.addName(new ItemStack(CustomCarpet, 1, 8), "CustomCarpet9");
		LanguageRegistry.addName(new ItemStack(CustomCarpet, 1, 9), "CustomCarpet10");
		LanguageRegistry.addName(new ItemStack(CustomCarpet, 1, 10), "CustomCarpet11");
		LanguageRegistry.addName(new ItemStack(CustomCarpet, 1, 11), "CustomCarpet12");
		LanguageRegistry.addName(new ItemStack(CustomCarpet, 1, 12), "CustomCarpet13");
		LanguageRegistry.addName(new ItemStack(CustomCarpet, 1, 13), "CustomCarpet14");
		LanguageRegistry.addName(new ItemStack(CustomCarpet, 1, 14), "CustomCarpet15");
		LanguageRegistry.addName(new ItemStack(CustomCarpet, 1, 15), "CustomCarpet16");
		LanguageRegistry.addName(new ItemStack(CustomCarpet, 1, 16), "CustomCarpet17");
		LanguageRegistry.addName(new ItemStack(CustomCarpet, 1, 17), "CustomCarpet18");
		LanguageRegistry.addName(new ItemStack(CustomCarpet, 1, 18), "CustomCarpet19");
		LanguageRegistry.addName(new ItemStack(CustomCarpet, 1, 19), "CustomCarpet20");
		LanguageRegistry.addName(new ItemStack(CustomCarpet, 1, 20), "CustomCarpet21");
		LanguageRegistry.addName(new ItemStack(CustomCarpet, 1, 21), "CustomCarpet22");
		LanguageRegistry.addName(new ItemStack(CustomCarpet, 1, 22), "CustomCarpet23");
		LanguageRegistry.addName(new ItemStack(CustomCarpet, 1, 23), "CustomCarpet24");
		LanguageRegistry.addName(new ItemStack(CustomCarpet, 1, 24), "CustomCarpet25");
		LanguageRegistry.addName(new ItemStack(CustomCarpet, 1, 25), "CustomCarpet26");
		LanguageRegistry.addName(new ItemStack(CustomCarpet, 1, 26), "CustomCarpet27");
		LanguageRegistry.addName(new ItemStack(CustomCarpet, 1, 27), "CustomCarpet28");
		LanguageRegistry.addName(new ItemStack(CustomCarpet, 1, 28), "CustomCarpet29");
		LanguageRegistry.addName(new ItemStack(CustomCarpet, 1, 29), "CustomCarpet30");
		LanguageRegistry.addName(new ItemStack(CustomCarpet, 1, 30), "CustomCarpet31");
		LanguageRegistry.addName(new ItemStack(CustomCarpet, 1, 31), "CustomCarpet32");
		LanguageRegistry.addName(new ItemStack(CustomCarpet, 1, 32), "CustomCarpet33");
		LanguageRegistry.addName(new ItemStack(CustomCarpet, 1, 33), "CustomCarpet34");
		LanguageRegistry.addName(new ItemStack(CustomCarpet, 1, 34), "CustomCarpet35");
		LanguageRegistry.addName(new ItemStack(CustomCarpet, 1, 35), "CustomCarpet36");
		LanguageRegistry.addName(new ItemStack(CustomCarpet, 1, 36), "CustomCarpet37");
		LanguageRegistry.addName(new ItemStack(CustomCarpet, 1, 37), "CustomCarpet38");
		LanguageRegistry.addName(new ItemStack(CustomCarpet, 1, 38), "CustomCarpet39");
		LanguageRegistry.addName(new ItemStack(CustomCarpet, 1, 39), "CustomCarpet40");
		LanguageRegistry.addName(new ItemStack(CustomCarpet, 1, 40), "CustomCarpet41");
		LanguageRegistry.addName(new ItemStack(CustomCarpet, 1, 41), "CustomCarpet42");
		LanguageRegistry.addName(new ItemStack(CustomCarpet, 1, 42), "CustomCarpet43");
		LanguageRegistry.addName(new ItemStack(CustomCarpet, 1, 43), "CustomCarpet44");
		LanguageRegistry.addName(new ItemStack(CustomCarpet, 1, 44), "CustomCarpet45");
		LanguageRegistry.addName(new ItemStack(CustomCarpet, 1, 45), "CustomCarpet46");
		LanguageRegistry.addName(new ItemStack(CustomCarpet, 1, 46), "CustomCarpet47");
		LanguageRegistry.addName(new ItemStack(CustomCarpet, 1, 47), "CustomCarpet48");
		LanguageRegistry.addName(new ItemStack(CustomCarpet, 1, 48), "CustomCarpet49");
		LanguageRegistry.addName(new ItemStack(CustomCarpet, 1, 49), "CustomCarpet50");
		LanguageRegistry.addName(new ItemStack(CustomCarpet, 1, 50), "CustomCarpet51");
		LanguageRegistry.addName(new ItemStack(CustomCarpet, 1, 51), "CustomCarpet52");
		LanguageRegistry.addName(new ItemStack(CustomCarpet, 1, 52), "CustomCarpet53");
		LanguageRegistry.addName(new ItemStack(CustomCarpet, 1, 53), "CustomCarpet54");
		LanguageRegistry.addName(new ItemStack(CustomCarpet, 1, 54), "CustomCarpet55");
		LanguageRegistry.addName(new ItemStack(CustomCarpet, 1, 55), "CustomCarpet56");
		LanguageRegistry.addName(new ItemStack(CustomCarpet, 1, 56), "CustomCarpet57");
		LanguageRegistry.addName(new ItemStack(CustomCarpet, 1, 57), "CustomCarpet58");
		LanguageRegistry.addName(new ItemStack(CustomCarpet, 1, 58), "CustomCarpet59");
		LanguageRegistry.addName(new ItemStack(CustomCarpet, 1, 59), "CustomCarpet60");
		LanguageRegistry.addName(new ItemStack(CustomCarpet, 1, 60), "CustomCarpet61");
		LanguageRegistry.addName(new ItemStack(CustomCarpet, 1, 61), "CustomCarpet62");
		LanguageRegistry.addName(new ItemStack(CustomCarpet, 1, 62), "CustomCarpet63");
		LanguageRegistry.addName(new ItemStack(CustomCarpet, 1, 63), "CustomCarpet64");
		
		LanguageRegistry.addName(new ItemStack(CustomSand, 1, 0), "CustomSand1");
		LanguageRegistry.addName(new ItemStack(CustomSand, 1, 1), "CustomSand2");
		LanguageRegistry.addName(new ItemStack(CustomSand, 1, 2), "CustomSand3");
		LanguageRegistry.addName(new ItemStack(CustomSand, 1, 3), "CustomSand4");
		LanguageRegistry.addName(new ItemStack(CustomSand, 1, 4), "CustomSand5");
		LanguageRegistry.addName(new ItemStack(CustomSand, 1, 5), "CustomSand6");
		LanguageRegistry.addName(new ItemStack(CustomSand, 1, 6), "CustomSand7");
		LanguageRegistry.addName(new ItemStack(CustomSand, 1, 7), "CustomSand8");
		LanguageRegistry.addName(new ItemStack(CustomSand, 1, 8), "CustomSand9");
		LanguageRegistry.addName(new ItemStack(CustomSand, 1, 9), "CustomSand10");
		LanguageRegistry.addName(new ItemStack(CustomSand, 1, 10), "CustomSand11");
		LanguageRegistry.addName(new ItemStack(CustomSand, 1, 11), "CustomSand12");
		LanguageRegistry.addName(new ItemStack(CustomSand, 1, 12), "CustomSand13");
		LanguageRegistry.addName(new ItemStack(CustomSand, 1, 13), "CustomSand14");
		LanguageRegistry.addName(new ItemStack(CustomSand, 1, 14), "CustomSand15");
		LanguageRegistry.addName(new ItemStack(CustomSand, 1, 15), "CustomSand16");
		LanguageRegistry.addName(new ItemStack(CustomSand, 1, 16), "CustomSand17");
		LanguageRegistry.addName(new ItemStack(CustomSand, 1, 17), "CustomSand18");
		LanguageRegistry.addName(new ItemStack(CustomSand, 1, 18), "CustomSand19");
		LanguageRegistry.addName(new ItemStack(CustomSand, 1, 19), "CustomSand20");
		LanguageRegistry.addName(new ItemStack(CustomSand, 1, 20), "CustomSand21");
		LanguageRegistry.addName(new ItemStack(CustomSand, 1, 21), "CustomSand22");
		LanguageRegistry.addName(new ItemStack(CustomSand, 1, 22), "CustomSand23");
		LanguageRegistry.addName(new ItemStack(CustomSand, 1, 23), "CustomSand24");
		LanguageRegistry.addName(new ItemStack(CustomSand, 1, 24), "CustomSand25");
		LanguageRegistry.addName(new ItemStack(CustomSand, 1, 25), "CustomSand26");
		LanguageRegistry.addName(new ItemStack(CustomSand, 1, 26), "CustomSand27");
		LanguageRegistry.addName(new ItemStack(CustomSand, 1, 27), "CustomSand28");
		LanguageRegistry.addName(new ItemStack(CustomSand, 1, 28), "CustomSand29");
		LanguageRegistry.addName(new ItemStack(CustomSand, 1, 29), "CustomSand30");
		LanguageRegistry.addName(new ItemStack(CustomSand, 1, 30), "CustomSand31");
		LanguageRegistry.addName(new ItemStack(CustomSand, 1, 31), "CustomSand32");
		LanguageRegistry.addName(new ItemStack(CustomSand, 1, 32), "CustomSand33");
		LanguageRegistry.addName(new ItemStack(CustomSand, 1, 33), "CustomSand34");
		LanguageRegistry.addName(new ItemStack(CustomSand, 1, 34), "CustomSand35");
		LanguageRegistry.addName(new ItemStack(CustomSand, 1, 35), "CustomSand36");
		LanguageRegistry.addName(new ItemStack(CustomSand, 1, 36), "CustomSand37");
		LanguageRegistry.addName(new ItemStack(CustomSand, 1, 37), "CustomSand38");
		LanguageRegistry.addName(new ItemStack(CustomSand, 1, 38), "CustomSand39");
		LanguageRegistry.addName(new ItemStack(CustomSand, 1, 39), "CustomSand40");
		LanguageRegistry.addName(new ItemStack(CustomSand, 1, 40), "CustomSand41");
		LanguageRegistry.addName(new ItemStack(CustomSand, 1, 41), "CustomSand42");
		LanguageRegistry.addName(new ItemStack(CustomSand, 1, 42), "CustomSand43");
		LanguageRegistry.addName(new ItemStack(CustomSand, 1, 43), "CustomSand44");
		LanguageRegistry.addName(new ItemStack(CustomSand, 1, 44), "CustomSand45");
		LanguageRegistry.addName(new ItemStack(CustomSand, 1, 45), "CustomSand46");
		LanguageRegistry.addName(new ItemStack(CustomSand, 1, 46), "CustomSand47");
		LanguageRegistry.addName(new ItemStack(CustomSand, 1, 47), "CustomSand48");
		LanguageRegistry.addName(new ItemStack(CustomSand, 1, 48), "CustomSand49");
		LanguageRegistry.addName(new ItemStack(CustomSand, 1, 49), "CustomSand50");
		LanguageRegistry.addName(new ItemStack(CustomSand, 1, 50), "CustomSand51");
		LanguageRegistry.addName(new ItemStack(CustomSand, 1, 51), "CustomSand52");
		LanguageRegistry.addName(new ItemStack(CustomSand, 1, 52), "CustomSand53");
		LanguageRegistry.addName(new ItemStack(CustomSand, 1, 53), "CustomSand54");
		LanguageRegistry.addName(new ItemStack(CustomSand, 1, 54), "CustomSand55");
		LanguageRegistry.addName(new ItemStack(CustomSand, 1, 55), "CustomSand56");
		LanguageRegistry.addName(new ItemStack(CustomSand, 1, 56), "CustomSand57");
		LanguageRegistry.addName(new ItemStack(CustomSand, 1, 57), "CustomSand58");
		LanguageRegistry.addName(new ItemStack(CustomSand, 1, 58), "CustomSand59");
		LanguageRegistry.addName(new ItemStack(CustomSand, 1, 59), "CustomSand60");
		LanguageRegistry.addName(new ItemStack(CustomSand, 1, 60), "CustomSand61");
		LanguageRegistry.addName(new ItemStack(CustomSand, 1, 61), "CustomSand62");
		LanguageRegistry.addName(new ItemStack(CustomSand, 1, 62), "CustomSand63");
		LanguageRegistry.addName(new ItemStack(CustomSand, 1, 63), "CustomSand64");
		
		/* TODO
		LanguageRegistry.addName(new ItemStack(CustomItem, 1, 0), "CustomItem1");
		LanguageRegistry.addName(new ItemStack(CustomItem, 1, 1), "CustomItem2");
		LanguageRegistry.addName(new ItemStack(CustomItem, 1, 2), "CustomItem3");
		LanguageRegistry.addName(new ItemStack(CustomItem, 1, 3), "CustomItem4");
		LanguageRegistry.addName(new ItemStack(CustomItem, 1, 4), "CustomItem5");
		LanguageRegistry.addName(new ItemStack(CustomItem, 1, 5), "CustomItem6");
		LanguageRegistry.addName(new ItemStack(CustomItem, 1, 6), "CustomItem7");
		LanguageRegistry.addName(new ItemStack(CustomItem, 1, 7), "CustomItem8");
		LanguageRegistry.addName(new ItemStack(CustomItem, 1, 8), "CustomItem9");
		LanguageRegistry.addName(new ItemStack(CustomItem, 1, 9), "CustomItem10");
		LanguageRegistry.addName(new ItemStack(CustomItem, 1, 10), "CustomItem11");
		LanguageRegistry.addName(new ItemStack(CustomItem, 1, 11), "CustomItem12");
		LanguageRegistry.addName(new ItemStack(CustomItem, 1, 12), "CustomItem13");
		LanguageRegistry.addName(new ItemStack(CustomItem, 1, 13), "CustomItem14");
		LanguageRegistry.addName(new ItemStack(CustomItem, 1, 14), "CustomItem15");
		LanguageRegistry.addName(new ItemStack(CustomItem, 1, 15), "CustomItem16");
		LanguageRegistry.addName(new ItemStack(CustomItem, 1, 16), "CustomItem17");
		LanguageRegistry.addName(new ItemStack(CustomItem, 1, 17), "CustomItem18");
		LanguageRegistry.addName(new ItemStack(CustomItem, 1, 18), "CustomItem19");
		LanguageRegistry.addName(new ItemStack(CustomItem, 1, 19), "CustomItem20");
		LanguageRegistry.addName(new ItemStack(CustomItem, 1, 20), "CustomItem21");
		LanguageRegistry.addName(new ItemStack(CustomItem, 1, 21), "CustomItem22");
		LanguageRegistry.addName(new ItemStack(CustomItem, 1, 22), "CustomItem23");
		LanguageRegistry.addName(new ItemStack(CustomItem, 1, 23), "CustomItem24");
		LanguageRegistry.addName(new ItemStack(CustomItem, 1, 24), "CustomItem25");
		LanguageRegistry.addName(new ItemStack(CustomItem, 1, 25), "CustomItem26");
		LanguageRegistry.addName(new ItemStack(CustomItem, 1, 26), "CustomItem27");
		LanguageRegistry.addName(new ItemStack(CustomItem, 1, 27), "CustomItem28");
		LanguageRegistry.addName(new ItemStack(CustomItem, 1, 28), "CustomItem29");
		LanguageRegistry.addName(new ItemStack(CustomItem, 1, 29), "CustomItem30");
		LanguageRegistry.addName(new ItemStack(CustomItem, 1, 30), "CustomItem31");
		LanguageRegistry.addName(new ItemStack(CustomItem, 1, 31), "CustomItem32");
		LanguageRegistry.addName(new ItemStack(CustomItem, 1, 32), "CustomItem33");
		LanguageRegistry.addName(new ItemStack(CustomItem, 1, 33), "CustomItem34");
		LanguageRegistry.addName(new ItemStack(CustomItem, 1, 34), "CustomItem35");
		LanguageRegistry.addName(new ItemStack(CustomItem, 1, 35), "CustomItem36");
		LanguageRegistry.addName(new ItemStack(CustomItem, 1, 36), "CustomItem37");
		LanguageRegistry.addName(new ItemStack(CustomItem, 1, 37), "CustomItem38");
		LanguageRegistry.addName(new ItemStack(CustomItem, 1, 38), "CustomItem39");
		LanguageRegistry.addName(new ItemStack(CustomItem, 1, 39), "CustomItem40");
		LanguageRegistry.addName(new ItemStack(CustomItem, 1, 40), "CustomItem41");
		LanguageRegistry.addName(new ItemStack(CustomItem, 1, 41), "CustomItem42");
		LanguageRegistry.addName(new ItemStack(CustomItem, 1, 42), "CustomItem43");
		LanguageRegistry.addName(new ItemStack(CustomItem, 1, 43), "CustomItem44");
		LanguageRegistry.addName(new ItemStack(CustomItem, 1, 44), "CustomItem45");
		LanguageRegistry.addName(new ItemStack(CustomItem, 1, 45), "CustomItem46");
		LanguageRegistry.addName(new ItemStack(CustomItem, 1, 46), "CustomItem47");
		LanguageRegistry.addName(new ItemStack(CustomItem, 1, 47), "CustomItem48");
		LanguageRegistry.addName(new ItemStack(CustomItem, 1, 48), "CustomItem49");
		LanguageRegistry.addName(new ItemStack(CustomItem, 1, 49), "CustomItem50");
		LanguageRegistry.addName(new ItemStack(CustomItem, 1, 50), "CustomItem51");
		LanguageRegistry.addName(new ItemStack(CustomItem, 1, 51), "CustomItem52");
		LanguageRegistry.addName(new ItemStack(CustomItem, 1, 52), "CustomItem53");
		LanguageRegistry.addName(new ItemStack(CustomItem, 1, 53), "CustomItem54");
		LanguageRegistry.addName(new ItemStack(CustomItem, 1, 54), "CustomItem55");
		LanguageRegistry.addName(new ItemStack(CustomItem, 1, 55), "CustomItem56");
		LanguageRegistry.addName(new ItemStack(CustomItem, 1, 56), "CustomItem57");
		LanguageRegistry.addName(new ItemStack(CustomItem, 1, 57), "CustomItem58");
		LanguageRegistry.addName(new ItemStack(CustomItem, 1, 58), "CustomItem59");
		LanguageRegistry.addName(new ItemStack(CustomItem, 1, 59), "CustomItem60");
		LanguageRegistry.addName(new ItemStack(CustomItem, 1, 60), "CustomItem61");
		LanguageRegistry.addName(new ItemStack(CustomItem, 1, 61), "CustomItem62");
		LanguageRegistry.addName(new ItemStack(CustomItem, 1, 62), "CustomItem63");
		LanguageRegistry.addName(new ItemStack(CustomItem, 1, 63), "CustomItem64");
		*/
		
		LanguageRegistry.addName(CustomStaticItem,"Tab icon DO NOT USE");
		System.out.println("[Spoucy] Defined default names");
    }

}