package com.tltemplates.listeners.forge.common;

import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@Mod.EventBusSubscriber(bus = EventBusSubscriber.Bus.FORGE)
public final class TickEventListener {

	@SubscribeEvent
	public static final void onTickEvent$ClientTickEvent(final TickEvent.ClientTickEvent event) {
		//LOGICAL CLIENT
		//EventUtil.logEvent(event, Thread.currentThread());
	}

	@SubscribeEvent
	public static final void onTickEvent$LevelTickEvent(final TickEvent.LevelTickEvent event) {
		//LOGICAL BOTH
		//EventUtil.logEvent(event, Thread.currentThread());
	}

	@SubscribeEvent
	public static final void onTickEvent$PlayerTickEvent(final TickEvent.PlayerTickEvent event) {
		//LOGICAL BOTH
		//EventUtil.logEvent(event, Thread.currentThread());
	}

	@SubscribeEvent
	public static final void onTickEvent$RenderTickEvent(final TickEvent.RenderTickEvent event) {
		//LOGICAL CLIENT
		//EventUtil.logEvent(event, Thread.currentThread());
	}

	@SubscribeEvent
	public static final void onTickEvent$ServerTickEvent(final TickEvent.ServerTickEvent event) {
		//LOGICAL SERVER
		//EventUtil.logEvent(event, Thread.currentThread());
	}
}
