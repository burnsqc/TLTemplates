package com.tltemplates.listeners.mod.client;

import com.tltemplates.util.EventUtil;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public final class FMLClientSetupEventListener {

	@SubscribeEvent
	public static final void onFMLClientSetupEvent(final FMLClientSetupEvent event) {
		EventUtil.logEvent(event, Thread.currentThread());
	}
}
