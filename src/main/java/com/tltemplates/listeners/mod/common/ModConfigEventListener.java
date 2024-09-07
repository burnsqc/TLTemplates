package com.tltemplates.listeners.mod.common;

import com.tltemplates.util.EventUtil;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.event.config.ModConfigEvent;

@Mod.EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public final class ModConfigEventListener {

	@SubscribeEvent
	public static final void onModConfigEvent$Loading(final ModConfigEvent.Loading event) {
		EventUtil.logEvent(event, Thread.currentThread());
	}
	
	@SubscribeEvent
	public static final void onModConfigEvent$Reloading(final ModConfigEvent.Reloading event) {
		EventUtil.logEvent(event, Thread.currentThread());
	}
	
	@SubscribeEvent
	public static final void onModConfigEvent$Unloading(final ModConfigEvent.Unloading event) {
		EventUtil.logEvent(event, Thread.currentThread());
	}
}
