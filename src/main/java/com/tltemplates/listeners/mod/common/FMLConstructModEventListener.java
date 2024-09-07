package com.tltemplates.listeners.mod.common;

import com.tltemplates.util.EventUtil;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.event.lifecycle.FMLConstructModEvent;

@Mod.EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public final class FMLConstructModEventListener {

	@SubscribeEvent
	public static final void onFMLConstructModEvent(final FMLConstructModEvent event) {
		EventUtil.logEvent(event, Thread.currentThread());
	}
}
