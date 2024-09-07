package com.tltemplates.listeners.forge.client;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RenderGuiOverlayEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@Mod.EventBusSubscriber(bus = EventBusSubscriber.Bus.FORGE, value= Dist.CLIENT)
public final class RenderGuiOverlayEventListener {

	@SubscribeEvent
	public static final void onRenderGuiOverlayEvent$Post(final RenderGuiOverlayEvent.Post event) {
		//LOGICAL CLIENT
	}

	@SubscribeEvent
	public static final void onRenderGuiOverlayEvent$Pre(final RenderGuiOverlayEvent.Pre event) {
		//LOGICAL CLIENT
	}
}
