package com.tltemplates.listeners.forge;

import com.tltemplates.util.EventUtil;

import net.minecraftforge.client.event.ComputeFovModifierEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@Mod.EventBusSubscriber(bus = EventBusSubscriber.Bus.FORGE)
public final class ComputeFovModifierEventListener {

	@SubscribeEvent
	public static final void onComputeFovModifierEvent(final ComputeFovModifierEvent event) {
		EventUtil.logEvent(event, Thread.currentThread());
	}
}
