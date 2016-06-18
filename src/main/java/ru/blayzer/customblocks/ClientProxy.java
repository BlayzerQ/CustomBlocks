package ru.blayzer.customblocks;

import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;
import ru.blayzer.customblocks.blocksmodels.util.*;
import cpw.mods.fml.client.registry.ClientRegistry;

public class ClientProxy extends CommonProxy {
    public void registerRenderThings() {
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBlockModel1.class, new TileEntityBlock1Renderer());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBlockModel2.class, new TileEntityBlock2Renderer());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBlockModel3.class, new TileEntityBlock3Renderer());
     }
    
    public void registerItem(Item item) {
        MinecraftForgeClient.registerItemRenderer(item, new CustomItemRenderer());
     }
	
}
