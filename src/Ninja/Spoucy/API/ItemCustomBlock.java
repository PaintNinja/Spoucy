package Ninja.Spoucy.API;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemCustomBlock extends ItemBlock {

	public ItemCustomBlock(int par1) {
		super(par1);
		setHasSubtypes(true);
	}

    public String getUnlocalizedName(ItemStack itemstack)
    {
          String name = "";
          switch(itemstack.getItemDamage())
          {
                 case 0:
                 {
                        name = "Custom1";
                        break;
                 }
                 case 1:
                 {
                        name = "Custom2";
                        break;
                 }
                 case 2:
                 {
                        name = "Custom3";
                        break;
                 }
                 case 3:
                 {
                        name = "Custom4";
                        break;
                 }
                 case 4:
                 {
                        name = "Custom5";
                        break;
                 }
                 case 5:
                 {
                        name = "Custom6";
                        break;
                 }
                 case 6:
                 {
                        name = "Custom7";
                        break;
                 }
                 case 7:
                 {
                        name = "Custom8";
                        break;
                 }
                 case 8:
                 {
                        name = "Custom9";
                        break;
                 }
                 case 9:
                 {
                        name = "Custom10";
                        break;
                 }
                 case 10:
                 {
                        name = "Custom11";
                        break;
                 }
                 case 11:
                 {
                        name = "Custom12";
                        break;
                 }
                 case 12:
                 {
                        name = "Custom13";
                        break;
                 }
                 case 13:
                 {
                        name = "Custom14";
                        break;
                 }
                 case 14:
                 {
                        name = "Custom15";
                        break;
                 }
                 case 15:
                 {
                        name = "Custom16";
                        break;
                 }
                 default: name = "broken";
          }
          return getUnlocalizedName() + "." + name;
    }
   
    public int getMetadata(int par1)
    {
          return par1;
    }
}