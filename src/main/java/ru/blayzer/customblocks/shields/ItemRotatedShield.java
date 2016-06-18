package ru.blayzer.customblocks.shields;

import org.lwjgl.opengl.GL11;

public class ItemRotatedShield extends ItemShield {

	public ItemRotatedShield(ShieldMaterialUtils material) {
		super(material);
	}

	public void renderSpecial() {
	      GL11.glScalef(0.6F, 0.6F, 0.6F);
	      GL11.glTranslatef(0.4F, 1.0F, -0.18F); //1.7.10
	      //GL11.glTranslatef(-0.1F, 1.0F, -0.18F); //1.5.2
	      GL11.glRotatef(-6.0F, 0.0F, 1.0F, 0.0F); //1.7.10
	      GL11.glRotatef(120.0F, 0.0F, 0.0F, 1.0F); //1.7.10
	      //GL11.glRotatef(120.0F, 1.0F, 0.0F, 1.0F); //1.5.2
	      //GL11.glRotatef(-6.0F, 0.0F, 1.0F, 0.0F); //1.5.2
	}
}
