package com.tltemplates.listeners.forge.client;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.ClientChatReceivedEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@Mod.EventBusSubscriber(bus = EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public final class ClientChatReceivedEventListener {

	@SubscribeEvent
	public static final void onClientChatReceivedEvent$Player(final ClientChatReceivedEvent.Player event) {
		//LOGICAL CLIENT
	}

	@SubscribeEvent
	public static final void onClientChatReceivedEvent$System(final ClientChatReceivedEvent.System event) {
		//LOGICAL CLIENT
	}
}
