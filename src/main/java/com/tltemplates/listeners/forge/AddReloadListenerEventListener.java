package com.tltemplates.listeners.forge;

import com.tltemplates.util.EventUtil;

import net.minecraftforge.event.AddReloadListenerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@Mod.EventBusSubscriber(bus = EventBusSubscriber.Bus.FORGE)
public final class AddReloadListenerEventListener {

	@SubscribeEvent
	public static final void onAddReloadListenerEvent(final AddReloadListenerEvent event) {
		EventUtil.logEvent(event, Thread.currentThread());
	}
}
