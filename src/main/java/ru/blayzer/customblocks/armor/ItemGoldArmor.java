package ru.blayzer.customblocks.armor;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import ru.blayzer.customblocks.CustomBlocksCore;

public class ItemGoldArmor extends ItemArmor {
	
	  private String texturePath = "customblocks:textures/models/armor/";
	  public int textureID = 0;
	  
      public ItemGoldArmor(ArmorMaterial material, int armorType) {
          super(material, 0, armorType);
              this.setCreativeTab(CustomBlocksCore.CustomBlocksArmor);
              this.setTextureName();
      		  textureID = armorType;
      }

      public void setTextureName ()
      {
              if(armorType == 0||armorType == 1||armorType == 3){
                      this.texturePath += "GoldArmor_" + 1 + ".png";
              }
              else {
                      this.texturePath += "GoldArmor_" + 2 + ".png";
              }
      }
      
    	@Override
      	public void registerIcons(IIconRegister iconRegister)
      	{
      		if (textureID == 0) { itemIcon = iconRegister.registerIcon("customblocks:armor/GoldHelmet"); }
      		else if (textureID == 1) { itemIcon = iconRegister.registerIcon("customblocks:armor/GoldChest"); }
      		else if (textureID == 2) { itemIcon = iconRegister.registerIcon("customblocks:armor/GoldLeggins"); }
      		else if (textureID == 3) { itemIcon = iconRegister.registerIcon("customblocks:armor/GoldBoots"); }
      	}
      
      @Override
      public String getArmorTexture(ItemStack itemstack, Entity entity, int slot, String type){
              return this.texturePath;
      }
      
}