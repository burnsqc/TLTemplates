package com.tltemplates.listeners.forge.client;

import net.minecraftforge.client.event.RegisterClientCommandsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@Mod.EventBusSubscriber(bus = EventBusSubscriber.Bus.FORGE)
public final class RegisterClientCommandsEventListener {

	@SubscribeEvent
	public static void onRegisterClientCommandsEvent(final RegisterClientCommandsEvent event) {
		//LOGICAL CLIENT
		//EventUtil.logEvent(event, Thread.currentThread());
	}
}
