package com.tltemplates.listeners.mod.client;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@Mod.EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public final class BuildCreativeModeTabContentsEventListener {

	@SubscribeEvent
	public static final void onBuildCreativeModeTabContentsEvent(final BuildCreativeModeTabContentsEvent event) {
		//LOGICAL CLIENT
	}
}
