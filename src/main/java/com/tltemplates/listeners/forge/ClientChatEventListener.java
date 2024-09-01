package com.tltemplates.listeners.forge;

import com.tltemplates.util.EventUtil;

import net.minecraftforge.client.event.ClientChatEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@Mod.EventBusSubscriber(bus = EventBusSubscriber.Bus.FORGE)
public final class ClientChatEventListener {

	@SubscribeEvent
	public static final void onClientChatEvent(final ClientChatEvent event) {
		EventUtil.logEvent(event, Thread.currentThread());
	}
}
