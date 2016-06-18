package ru.blayzer.customblocks.armor;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import ru.blayzer.customblocks.CustomBlocksCore;

public class CustomArmor1 extends ItemArmor {
	
	  private String texturePath = "customblocks:textures/models/armor/";
	  public int textureID = 0;
	  
      public CustomArmor1(ArmorMaterial material, int armorType) {
              super(material, 0, armorType);
              this.setCreativeTab(CustomBlocksCore.CustomBlocksArmor);
              this.setTextureName();
      		  textureID = armorType;
      }

      public void setTextureName ()
      {
          if(armorType == 0||armorType == 1||armorType == 3){
              this.texturePath += "Custom2_" + 1 + ".png";
      }
      else {
              this.texturePath += "Custom2_" + 2 + ".png";
      }
}

     @Override
	 public void registerIcons(IIconRegister iconRegister)
	 {
		if (textureID == 0) { itemIcon = iconRegister.registerIcon("customblocks:armor/CustomHelm1"); }
		else if (textureID == 1) { itemIcon = iconRegister.registerIcon("customblocks:armor/CustomChest1"); }
		else if (textureID == 2) { itemIcon = iconRegister.registerIcon("customblocks:armor/CustomLegg1"); }
		else if (textureID == 3) { itemIcon = iconRegister.registerIcon("customblocks:armor/CustomBoots1"); }
	 }
      
      @Override
      public String getArmorTexture(ItemStack itemstack, Entity entity, int slot, String type){
              return this.texturePath;
      }
      
}