package com.tltemplates.listeners.forge.client;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.CustomizeGuiOverlayEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@Mod.EventBusSubscriber(bus = EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public final class CustomizeGuiOverlayEventListener {

	@SubscribeEvent
	public static final void onCustomizeGuiOverlayEvent$BossEventProgress(final CustomizeGuiOverlayEvent.BossEventProgress event) {
		//LOGICAL CLIENT
	}

	@SubscribeEvent
	public static final void onCustomizeGuiOverlayEvent$Chat(final CustomizeGuiOverlayEvent.Chat event) {
		//LOGICAL CLIENT
	}

	@SubscribeEvent
	public static final void onCustomizeGuiOverlayEvent$DebugText(final CustomizeGuiOverlayEvent.DebugText event) {
		//LOGICAL CLIENT
	}
}
