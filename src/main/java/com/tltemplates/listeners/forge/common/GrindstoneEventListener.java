package com.tltemplates.listeners.forge.common;

import net.minecraftforge.event.GrindstoneEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@Mod.EventBusSubscriber(bus = EventBusSubscriber.Bus.FORGE)
public final class GrindstoneEventListener {

	@SubscribeEvent
	public static final void onGrindstoneEvent$OnPlaceItem(final GrindstoneEvent.OnPlaceItem event) {
		//LOGICAL BOTH
	}

	@SubscribeEvent
	public static final void onGrindstoneEvent$OnTakeItem(final GrindstoneEvent.OnTakeItem event) {
		//LOGICAL SERVER
	}
}
