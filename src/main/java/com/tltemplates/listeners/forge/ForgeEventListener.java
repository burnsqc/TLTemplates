package com.tltemplates.listeners.forge;

import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@Mod.EventBusSubscriber(bus = EventBusSubscriber.Bus.FORGE)
public final class ForgeEventListener {

	@SubscribeEvent
	public static final void onEvent(final Event event) {
		//EventUtil.logEvent(event, Thread.currentThread());
	}
}
