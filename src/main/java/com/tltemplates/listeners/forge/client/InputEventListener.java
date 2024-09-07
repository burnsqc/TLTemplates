package com.tltemplates.listeners.forge.client;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@Mod.EventBusSubscriber(bus = EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public final class InputEventListener {

	@SubscribeEvent
	public static final void onInputEvent$InteractionKeyMappingTriggered(final InputEvent.InteractionKeyMappingTriggered event) {
		//LOGICAL CLIENT
	}
	
	@SubscribeEvent
	public static final void onInputEvent$Key(final InputEvent.Key event) {
		//LOGICAL CLIENT
	}
	
	@SubscribeEvent
	public static final void onInputEvent$MouseButton$Post(final InputEvent.MouseButton.Post event) {
		//LOGICAL CLIENT
	}
	
	@SubscribeEvent
	public static final void onInputEvent$MouseButton$Pre(final InputEvent.MouseButton.Pre event) {
		//LOGICAL CLIENT
	}
	
	@SubscribeEvent
	public static final void onInputEvent$MouseScrollingEvent(final InputEvent.MouseScrollingEvent event) {
		//LOGICAL CLIENT
	}
}
