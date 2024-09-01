package com.tltemplates.listeners.forge;

import com.tltemplates.util.EventUtil;

import net.minecraftforge.client.event.ClientChatReceivedEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@Mod.EventBusSubscriber(bus = EventBusSubscriber.Bus.FORGE)
public final class ClientChatReceivedEventListener {

	@SubscribeEvent
	public static final void onClientChatReceivedEvent$Player(final ClientChatReceivedEvent.Player event) {
		EventUtil.logEvent(event, Thread.currentThread());
	}

	@SubscribeEvent
	public static final void onClientChatReceivedEvent$System(final ClientChatReceivedEvent.System event) {
		EventUtil.logEvent(event, Thread.currentThread());
	}
}
