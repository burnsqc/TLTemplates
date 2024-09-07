package com.tltemplates.listeners.mod.client;

import com.tltemplates.util.EventUtil;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@Mod.EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public final class EntityRenderersEventListener {

	@SubscribeEvent
	public static final void onEntityRenderersEvent$AddLayers(final EntityRenderersEvent.AddLayers event) {
		EventUtil.logEvent(event, Thread.currentThread());
	}
	
	@SubscribeEvent
	public static final void onEntityRenderersEvent$CreateSkullModels(final EntityRenderersEvent.CreateSkullModels event) {
		EventUtil.logEvent(event, Thread.currentThread());
	}
	
	@SubscribeEvent
	public static final void onEntityRenderersEvent$RegisterLayerDefinitions(final EntityRenderersEvent.RegisterLayerDefinitions event) {
		EventUtil.logEvent(event, Thread.currentThread());
	}
	
	@SubscribeEvent
	public static final void onEntityRenderersEvent$RegisterRenderers(final EntityRenderersEvent.RegisterRenderers event) {
		EventUtil.logEvent(event, Thread.currentThread());
	}
}
