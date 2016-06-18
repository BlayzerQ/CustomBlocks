package ru.blayzer.customblocks;

import ru.blayzer.customblocks.shields.ItemShield;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraftforge.event.entity.living.LivingHurtEvent;

public class EventHandlerCommon {

	public static boolean bCancelHurtEvent = false;
    public static DamageSource src;
    
    @SubscribeEvent
    public void onLivingHurtEvent(LivingHurtEvent event)
    {
        src = event.source;
        
        if (event.entityLiving instanceof EntityPlayer) {
		EntityLivingBase living = event.entityLiving;
		EntityPlayer player = (EntityPlayer) living;
		ItemStack stack = player.getHeldItem();
		
        if (bCancelHurtEvent
        		&& src != DamageSource.fall
        		&& src != DamageSource.magic
        		&& src != DamageSource.drown
        		&& src != DamageSource.inFire
        		&& src != DamageSource.onFire
        		&& src != DamageSource.inWall
        		&& src != DamageSource.lava
        		&& src != DamageSource.outOfWorld
        		&& src != DamageSource.starve
        		&& src != DamageSource.wither
        		&& src != DamageSource.generic
        		&& src != DamageSource.anvil
        		&& src != DamageSource.fallingBlock)
        {
        	if (player.getHeldItem() != null && ((player.getHeldItem().getItem() instanceof ItemShield)))
        	{
        	stack.damageItem((int) event.ammount, player);
        	event.setCanceled(true);
        	}
        }
        else
        {
        	event.setCanceled(false);
        }
    }
    }
	
}
