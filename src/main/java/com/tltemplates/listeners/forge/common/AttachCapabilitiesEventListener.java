package com.tltemplates.listeners.forge.common;

import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@Mod.EventBusSubscriber(bus = EventBusSubscriber.Bus.FORGE)
public final class AttachCapabilitiesEventListener {

	@SubscribeEvent
	public static final void onAttachCapabilitiesEvent(final AttachCapabilitiesEvent<?> event) {
		//LOGICAL BOTH
		//EventUtil.logEvent(event, Thread.currentThread());
	}
}
