package com.tltemplates.listeners.mod.server;

import com.tltemplates.util.EventUtil;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.event.lifecycle.FMLDedicatedServerSetupEvent;

@Mod.EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.DEDICATED_SERVER)
public final class FMLDedicatedServerSetupEventListener {

	@SubscribeEvent
	public static final void onFMLDedicatedServerSetupEvent(final FMLDedicatedServerSetupEvent event) {
		EventUtil.logEvent(event, Thread.currentThread());
	}
}
