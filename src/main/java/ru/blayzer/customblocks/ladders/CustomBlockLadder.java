package ru.blayzer.customblocks.ladders;

import net.minecraft.block.BlockLadder;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.world.IBlockAccess;

public class CustomBlockLadder extends BlockLadder {

	public CustomBlockLadder()
    {
        super();
    }
	
    public boolean isLadder(IBlockAccess world, int x, int y, int z, EntityLivingBase entity)
    {
        return true;
    }
	
}
