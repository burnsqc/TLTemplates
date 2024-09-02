package com.tltemplates.listeners.forge.client;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.ClientPlayerChangeGameTypeEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@Mod.EventBusSubscriber(bus = EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public final class ClientPlayerChangeGameTypeEventListener {

	@SubscribeEvent
	public static final void onClientPlayerChangeGameTypeEvent(final ClientPlayerChangeGameTypeEvent event) {
		//LOGICAL CLIENT
	}
}
