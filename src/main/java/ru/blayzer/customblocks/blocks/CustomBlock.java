package ru.blayzer.customblocks.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class CustomBlock extends Block {

	public CustomBlock()
    {
        super(Material.rock);
        setHardness(1F);
    }
	
    public boolean isOpaqueCube()
    {
        return false;
    }
}
