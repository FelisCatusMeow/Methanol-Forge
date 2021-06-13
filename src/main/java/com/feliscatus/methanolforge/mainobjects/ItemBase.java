package com.feliscatus.methanolforge.mainobjects;

import com.feliscatus.methanolforge.MethanolForge;
import com.feliscatus.methanolforge.list.ItemList;
import com.feliscatus.methanolforge.util.ModelRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements ModelRegistry
{

    public ItemBase(String name)
    {
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.MISC);
        ItemList.ITEMS.add(this);
    }

    @Override
    public void registerModels()
    {
        MethanolForge.proxy.registerItem(this, 0, "inventory");
    }
}
