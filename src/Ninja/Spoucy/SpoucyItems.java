package Ninja.Spoucy;

import net.minecraft.item.Item;

	public class SpoucyItems extends Item {
		public SpoucyItems(int id) {
			super(id);
			setCreativeTab(SpoucyCore.tabSpoucy); //Puts all the Spoucy stuff in its own tab
			setHasSubtypes(true);
			setMaxStackSize(1);
		}
	}
