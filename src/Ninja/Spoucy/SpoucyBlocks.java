package Ninja.Spoucy;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlockWithMetadata;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class SpoucyBlocks extends Block {
	public SpoucyBlocks(int blockId, String texture) {
		super(blockId, Material.rock);
		setCreativeTab(SpoucyCore.tabSpoucy); //place in creative tabs
}

	//texture the block
	public String getTextureFile() {
	return "/textures/blocks/spoucyblock.png";
	}

}
