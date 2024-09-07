package com.tltemplates.listeners.mod.common;

import com.tltemplates.util.EventUtil;

import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@Mod.EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public final class GatherDataEventListener {

	@SubscribeEvent
	public static final void onGatherDataEvent(final GatherDataEvent event) {
		EventUtil.logEvent(event, Thread.currentThread());
	}
}
