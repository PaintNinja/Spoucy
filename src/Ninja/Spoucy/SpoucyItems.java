package Ninja.Spoucy;

import net.minecraft.item.Item;

	public class SpoucyItems extends Item {
		public SpoucyItems(int id) {
			super(id);
			setCreativeTab(SpoucyCore.tabSpoucy);
			setHasSubtypes(true);
			setMaxStackSize(1);
		}
	}
