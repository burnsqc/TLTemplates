package com.tltemplates.listeners.mod.common;

import com.tltemplates.util.EventUtil;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.registries.DataPackRegistryEvent;

@Mod.EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public final class DataPackRegistryEventListener {

	@SubscribeEvent
	public static final void onDataPackRegistryEvent$NewRegistry(final DataPackRegistryEvent.NewRegistry event) {
		EventUtil.logEvent(event, Thread.currentThread());
	}
}
