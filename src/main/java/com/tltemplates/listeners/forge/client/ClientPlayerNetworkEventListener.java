package com.tltemplates.listeners.forge.client;

import com.tltemplates.util.EventUtil;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.ClientPlayerNetworkEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@Mod.EventBusSubscriber(bus = EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public final class ClientPlayerNetworkEventListener {

	@SubscribeEvent
	public static final void onClientPlayerNetworkEvent$Clone(final ClientPlayerNetworkEvent.Clone event) {
		EventUtil.logEvent(event, Thread.currentThread());
	}

	@SubscribeEvent
	public static final void onClientPlayerNetworkEvent$LoggingIn(final ClientPlayerNetworkEvent.LoggingIn event) {
		EventUtil.logEvent(event, Thread.currentThread());
	}

	@SubscribeEvent
	public static final void onClientPlayerNetworkEvent$LoggingOut(final ClientPlayerNetworkEvent.LoggingOut event) {
		EventUtil.logEvent(event, Thread.currentThread());
	}
}
