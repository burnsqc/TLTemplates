package com.tltemplates.listeners.mod.common;

import com.tltemplates.util.EventUtil;

import net.minecraftforge.event.ModMismatchEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@Mod.EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public final class ModMismatchEventListener {

	@SubscribeEvent
	public static final void onModMismatchEvent(final ModMismatchEvent event) {
		EventUtil.logEvent(event, Thread.currentThread());
	}
}
