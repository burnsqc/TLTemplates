package com.tltemplates.listeners;

import com.tltemplates.util.EventUtil;

import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@Mod.EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public final class BuildCreativeModeTabContentsEventListener {

	@SubscribeEvent
	public static final void onBuildCreativeModeTabContentsEvent(final BuildCreativeModeTabContentsEvent event) {
		EventUtil.logEvent(event, Thread.currentThread());
	}
}
