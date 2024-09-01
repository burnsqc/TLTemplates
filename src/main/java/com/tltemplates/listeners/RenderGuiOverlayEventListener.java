package com.tltemplates.listeners;

import com.tltemplates.util.EventUtil;

import net.minecraftforge.client.event.RenderGuiOverlayEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@Mod.EventBusSubscriber(bus = EventBusSubscriber.Bus.FORGE)
public final class RenderGuiOverlayEventListener {

	@SubscribeEvent
	public static final void onRenderGuiOverlayEvent$Post(final RenderGuiOverlayEvent.Post event) {
		EventUtil.logEvent(event, Thread.currentThread());
	}

	@SubscribeEvent
	public static final void onRenderGuiOverlayEvent$Pre(final RenderGuiOverlayEvent.Pre event) {
		EventUtil.logEvent(event, Thread.currentThread());
	}
}
