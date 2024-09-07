package com.tltemplates.listeners.mod.common;

import com.tltemplates.util.EventUtil;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.registries.NewRegistryEvent;

@Mod.EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public final class NewRegistryEventListener {

	@SubscribeEvent
	public static final void onNewRegistryEvent(final NewRegistryEvent event) {
		EventUtil.logEvent(event, Thread.currentThread());
	}
}
