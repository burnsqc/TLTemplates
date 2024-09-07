package com.tltemplates.listeners.mod.common;

import com.tltemplates.util.EventUtil;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;

@Mod.EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public final class InterModEnqueueEventListener {

	@SubscribeEvent
	public static final void onInterModEnqueueEvent(final InterModEnqueueEvent event) {
		EventUtil.logEvent(event, Thread.currentThread());
	}
}
