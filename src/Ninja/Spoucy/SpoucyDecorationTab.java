package Ninja.Spoucy;

import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public final class SpoucyDecorationTab extends CreativeTabs {
	public SpoucyDecorationTab(int par1, String par2Str)
	{
		super(par1, par2Str);
	}

//sets the image for the creative tab
@SideOnly(Side.CLIENT)
public int getTabIconItemIndex()
{
return SpoucyCore.CustomStaticItem.itemID;
}

//sets the title for the creative tab
public String getTranslatedTabLabel()
{
return "Spoucy Decoration";
}
}