package com.tltemplates.listeners;

import com.tltemplates.util.EventUtil;

import net.minecraftforge.client.event.RegisterClientReloadListenersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@Mod.EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public final class RegisterClientReloadListenersEventListener {

	@SubscribeEvent
	public static void onRegisterClientReloadListenersEvent(final RegisterClientReloadListenersEvent event) {
		EventUtil.logEvent(event, Thread.currentThread());
	}
}
