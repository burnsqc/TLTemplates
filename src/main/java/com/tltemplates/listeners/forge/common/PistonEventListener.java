package com.tltemplates.listeners.forge.common;

import net.minecraftforge.event.level.PistonEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@Mod.EventBusSubscriber(bus = EventBusSubscriber.Bus.FORGE)
public final class PistonEventListener {

	@SubscribeEvent
	public static final void onPistonEvent$Post(final PistonEvent.Post event) {
		//LOGICAL BOTH
		//EventUtil.logEvent(event, Thread.currentThread());
	}

	@SubscribeEvent
	public static final void onPistonEvent$Pre(final PistonEvent.Pre event) {
		//LOGICAL BOTH
		//EventUtil.logEvent(event, Thread.currentThread());
	}
}
