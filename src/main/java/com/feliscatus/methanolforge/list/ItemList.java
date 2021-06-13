package com.feliscatus.methanolforge.list;

import com.feliscatus.methanolforge.mainobjects.ItemBase;
import net.minecraft.item.Item;

import java.util.ArrayList;
import java.util.List;

public class ItemList
{
    public static final List<Item> ITEMS = new ArrayList<Item>();

    public static final Item EXAMPLE_ITEM = new ItemBase("example_item");
}
