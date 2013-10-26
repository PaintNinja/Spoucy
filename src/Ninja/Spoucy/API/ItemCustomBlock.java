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
                 case 16:
                 {
                        name = "Custom17";
                        break;
                 }
                 case 17:
                 {
                        name = "Custom18";
                        break;
                 }
                 case 18:
                 {
                        name = "Custom19";
                        break;
                 }
                 case 19:
                 {
                        name = "Custom20";
                        break;
                 }
                 case 20:
                 {
                        name = "Custom21";
                        break;
                 }
                 case 21:
                 {
                        name = "Custom22";
                        break;
                 }
                 case 22:
                 {
                        name = "Custom23";
                        break;
                 }
                 case 23:
                 {
                        name = "Custom24";
                        break;
                 }
                 case 24:
                 {
                        name = "Custom25";
                        break;
                 }
                 case 25:
                 {
                        name = "Custom26";
                        break;
                 }
                 case 26:
                 {
                        name = "Custom27";
                        break;
                 }
                 case 27:
                 {
                        name = "Custom28";
                        break;
                 }
                 case 28:
                 {
                        name = "Custom29";
                        break;
                 }
                 case 29:
                 {
                        name = "Custom30";
                        break;
                 }
                 case 30:
                 {
                        name = "Custom31";
                        break;
                 }
                 case 31:
                 {
                        name = "Custom32";
                        break;
                 }
                 case 32:
                 {
                        name = "Custom33";
                        break;
                 }
                 case 33:
                 {
                        name = "Custom34";
                        break;
                 }
                 case 34:
                 {
                        name = "Custom35";
                        break;
                 }
                 case 35:
                 {
                        name = "Custom36";
                        break;
                 }
                 case 36:
                 {
                        name = "Custom37";
                        break;
                 }
                 case 37:
                 {
                        name = "Custom38";
                        break;
                 }
                 case 38:
                 {
                        name = "Custom39";
                        break;
                 }
                 case 39:
                 {
                        name = "Custom40";
                        break;
                 }
                 case 40:
                 {
                        name = "Custom41";
                        break;
                 }
                 case 41:
                 {
                        name = "Custom42";
                        break;
                 }
                 case 42:
                 {
                        name = "Custom43";
                        break;
                 }
                 case 43:
                 {
                        name = "Custom44";
                        break;
                 }
                 case 44:
                 {
                        name = "Custom45";
                        break;
                 }
                 case 45:
                 {
                        name = "Custom46";
                        break;
                 }
                 case 46:
                 {
                        name = "Custom47";
                        break;
                 }
                 case 47:
                 {
                        name = "Custom48";
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