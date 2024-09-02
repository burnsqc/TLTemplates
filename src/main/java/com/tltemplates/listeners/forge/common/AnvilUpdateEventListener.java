package com.tltemplates.listeners.forge.common;

import net.minecraftforge.event.AnvilUpdateEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@Mod.EventBusSubscriber(bus = EventBusSubscriber.Bus.FORGE)
public final class AnvilUpdateEventListener {

	@SubscribeEvent
	public static final void onAnvilUpdateEvent(final AnvilUpdateEvent event) {
		//LOGICAL BOTH
	}
}
