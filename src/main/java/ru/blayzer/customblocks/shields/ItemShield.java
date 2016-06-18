package ru.blayzer.customblocks.shields;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import org.lwjgl.opengl.GL11;

import ru.blayzer.customblocks.CustomBlocksCore;
import ru.blayzer.customblocks.EventHandlerCommon;

public class ItemShield extends Item implements ItemRenderInterface {

	public ShieldMaterialUtils material;
	public static boolean aCancelHurtEvent;
	
	public ItemShield(ShieldMaterialUtils material) {
		super();
		this.maxStackSize = 1;
        this.setMaxDamage(material.getMaxUses());
        CustomBlocksCore.proxy.registerItem(this);
	}
    
	public boolean isItemTool(ItemStack par1ItemStack) {
		return true;
	}
	
	public void renderSpecial(){
	      GL11.glScalef(0.6F, 0.6F, 0.6F);
	      GL11.glTranslatef(0.0F, 0.0F, -0.2F); //1.7.10
	      //GL11.glTranslatef(0.0F, 0.0F, -0.26F); //1.5.2
	      GL11.glRotatef(-6.0F, 0.0F, 1.0F, 0.0F);
	}
	
    public boolean isFull3D()
    {
        return true;
    }
	
	public EnumAction getItemUseAction(ItemStack par1ItemStack)
    {
        return EnumAction.block;
    }
	
	@Override
    public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
        par3EntityPlayer.setItemInUse(par1ItemStack, this.getMaxItemUseDuration(par1ItemStack));
		EventHandlerCommon.bCancelHurtEvent = true;
		
        return par1ItemStack;
    }
	
	@Override
	public void onPlayerStoppedUsing(ItemStack par1ItemStack, World world, EntityPlayer par3EntityPlayer, int par4) 
	{
		EventHandlerCommon.bCancelHurtEvent = false;
	}
	
	@Override
    public int getMaxItemUseDuration(ItemStack par1ItemStack)
    {
        return 72000;
    }
}
