package com.hanleybrand.cryspdr;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;

import com.hanleybrand.cryspdr.CommonProxy;

@Mod(modid = Main.MODID, name = Main.MODNAME, version = Main.VERSION)

public class Main
{
    public static final String MODID = "crystalspidersomg";
    public static final String MODNAME = "Crystal Spiders";
    public static final String VERSION = "0.1";

    //
    @Instance
    public static Main instance = new Main();

    @SidedProxy(clientSide="com.hanleybrand.cryspdr.ClientProxy", serverSide="com.hanleybrand.cryspdr.ServerProxy")
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent e) {
        System.out.println("crystalspidersomg: Called method: preInit");

    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
		// some example code
        System.out.println("DIRT BLOCK >> "+Blocks.dirt.getUnlocalizedName());
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent e) {
        System.out.println("crystalspidersomg: Called method: postInit");

    }
}
