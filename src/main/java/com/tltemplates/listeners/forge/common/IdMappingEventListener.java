package com.tltemplates.listeners.forge.common;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.registries.IdMappingEvent;

@Mod.EventBusSubscriber(bus = EventBusSubscriber.Bus.FORGE)
public final class IdMappingEventListener {

	@SubscribeEvent
	public static final void onIdMappingEventEvent(final IdMappingEvent event) {
		//LOGICAL BOTH
	}
}
