package com.tltemplates.listeners.forge;

import com.tltemplates.util.EventUtil;

import net.minecraftforge.event.level.PistonEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@Mod.EventBusSubscriber(bus = EventBusSubscriber.Bus.FORGE)
public final class PistonEventListener {

	@SubscribeEvent
	public static final void onPistonEvent$Post(final PistonEvent.Post event) {
		EventUtil.logEvent(event, Thread.currentThread());
	}

	@SubscribeEvent
	public static final void onPistonEvent$Pre(final PistonEvent.Pre event) {
		EventUtil.logEvent(event, Thread.currentThread());
	}
}
