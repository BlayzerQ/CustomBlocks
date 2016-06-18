package ru.blayzer.customblocks.blocksmodels.util;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

public class TileEntityBlock2Renderer extends TileEntitySpecialRenderer {
    
    //Модель для блока
    private final Block2Model model;
    
    public TileEntityBlock2Renderer() {
            this.model = new Block2Model();
    }
    
    @Override
    public void renderTileEntityAt(TileEntity te, double x, double y, double z, float scale) {
    //Запуск рендера
            GL11.glPushMatrix();
    //Делает так, чтобы модель стояла на блоке
            GL11.glTranslatef((float) x + 0.5F, (float) y + 1.5F, (float) z + 0.5F);
    //Установка текстуры для модели
            ResourceLocation textures = (new ResourceLocation("customblocks:textures/blocks/Cobblestone.png"));
    //binding the textures (Делает так, чтобы текстура распологалась нормально
            this.bindTexture(textures);
    //Делает так, чтобы модель стояла в нужном наравлении сверху вниз)                    
            GL11.glPushMatrix();
            GL11.glRotatef(180F, 0.0F, 0.0F, 1.0F);
    //Вызывает рендер модели из самого файла
            this.model.render((Entity)null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
    //Остнавливает рендер модели
            GL11.glPopMatrix();
            GL11.glPopMatrix();
    }
}
