package com.tltemplates.listeners.mod.client;

import net.minecraftforge.client.event.RegisterClientReloadListenersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@Mod.EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public final class RegisterClientReloadListenersEventListener {

	@SubscribeEvent
	public static final void onRegisterClientReloadListenersEvent(final RegisterClientReloadListenersEvent event) {
		//LOGICAL CLIENT
		//EventUtil.logEvent(event, Thread.currentThread());
	}
}
