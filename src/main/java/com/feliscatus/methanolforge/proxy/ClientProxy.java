package com.feliscatus.methanolforge.proxy;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

public class ClientProxy extends ServerProxy
{
    @Override
    public void registerItem(Item item, int w, String id)
    {
        ModelLoader.setCustomModelResourceLocation(item, w, new ModelResourceLocation(item.getRegistryName(), id));

    }
}
