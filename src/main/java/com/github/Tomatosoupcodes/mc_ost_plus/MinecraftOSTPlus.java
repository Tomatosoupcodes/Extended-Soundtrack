package com.github.Tomatosoupcodes.mc_ost_plus;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.github.Tomatosoupcodes.mc_ost_plus.core.init.ItemInit;
import com.github.Tomatosoupcodes.mc_ost_plus.core.init.SoundEventInit;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(MinecraftOSTPlus.MOD_ID)
public class MinecraftOSTPlus {
	public static final String MOD_ID = "mc_ost_plus";
	public static final Logger LOGGER = LogManager.getLogger();
	
	public MinecraftOSTPlus() {
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		
		ItemInit.ITEMS.register(bus);
		SoundEventInit.SOUND_EVENTS.register(bus);

		MinecraftForge.EVENT_BUS.register(this);
	}
}
