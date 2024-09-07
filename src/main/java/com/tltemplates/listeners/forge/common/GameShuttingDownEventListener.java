package com.tltemplates.listeners.forge.common;

import net.minecraftforge.event.GameShuttingDownEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@Mod.EventBusSubscriber(bus = EventBusSubscriber.Bus.FORGE)
public final class GameShuttingDownEventListener {

	@SubscribeEvent
	public static final void onGameShuttingDownEvent(final GameShuttingDownEvent event) {
		//LOGICAL BOTH
	}
}
