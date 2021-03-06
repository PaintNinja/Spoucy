package Ninja.Spoucy.API;

import Ninja.Spoucy.SpoucyCore;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class CustomItems extends Item
{
	public CustomItems(int id) 
	{
		super(id);
		this.setCreativeTab(CreativeTabs.tabMaterials);
	}
	
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister par1IconRegister)
    {
        this.itemIcon = par1IconRegister.registerIcon(SpoucyCore.modid + ":" + (this.getUnlocalizedName().substring(5)));
    }
}