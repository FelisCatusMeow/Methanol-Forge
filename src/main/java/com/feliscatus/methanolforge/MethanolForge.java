package com.feliscatus.methanolforge;

import com.feliscatus.methanolforge.proxy.ServerProxy;
import com.feliscatus.methanolforge.util.Reference;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = "0.01a", useMetadata = true)
public class MethanolForge
{

    @Mod.Instance
    public static MethanolForge instance;

    @SidedProxy(clientSide = Reference.CLIENT, serverSide = Reference.SERVER)
    public static ServerProxy proxy;

    @Mod.EventHandler
    public static void preInitializationEvent(FMLPreInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public static void init(FMLInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public static void postInit(FMLPostInitializationEvent event)
    {

    }
}
