package ru.blayzer.customblocks.webs;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;

public class CustomBlockWeb extends Block {

	public CustomBlockWeb()
    {
        super(Material.cloth);
        setHardness(1F);
    }
	
	public boolean isOpaqueCube()
    {
        return false;
    }
	
	public int getRenderType()
	{
	    return 1;
	}
	
    public boolean renderAsNormalBlock()
    {
        return false;
    }

    public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World, int par2, int par3, int par4)
    {
        return null;
    }
}
