package ru.blayzer.customblocks.blocksmulti;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

public class BlockMulti_09 extends Block {

	public BlockMulti_09()
    {
		super(Material.rock);
        setHardness(1F);
    }
	
    public boolean isOpaqueCube()
    {
        return false;
    }
	
    @SideOnly(Side.CLIENT)
    private IIcon iconTop, iconSide,  iconBot;

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int par1, int par2)
    {
        return par1 == 1 ? this.iconTop : (par1 == 0 ? this.iconBot :  this.blockIcon);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister par1IconRegister)
    {
        this.blockIcon = par1IconRegister.registerIcon("customblocks:BlockMulti9");
        this.iconTop = par1IconRegister.registerIcon("customblocks:BlockMulti9_top");
        this.iconBot = par1IconRegister.registerIcon("customblocks:BlockMulti9");
    }
	
}
