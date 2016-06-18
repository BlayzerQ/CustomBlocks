package ru.blayzer.customblocks.rails;

import net.minecraft.block.BlockRail;
import net.minecraft.client.renderer.texture.IIconRegister;

public class CustomBlockRail extends BlockRail {
	
	public CustomBlockRail() {
        super();
    }
    
    public void registerBlockIcons(IIconRegister texture)
    {
        super.registerBlockIcons(texture);
        texture.registerIcon(this.getTextureName() + "_turned");
    }
    
}
