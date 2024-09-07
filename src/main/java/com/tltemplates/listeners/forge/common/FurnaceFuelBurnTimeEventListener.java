package com.tltemplates.listeners.forge.common;

import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@Mod.EventBusSubscriber(bus = EventBusSubscriber.Bus.FORGE)
public final class FurnaceFuelBurnTimeEventListener {

	@SubscribeEvent
	public static final void onFurnaceFuelBurnTimeEvent(final FurnaceFuelBurnTimeEvent event) {
		//LOGICAL BOTH
	}
}
