package com.tltemplates.listeners.forge.client;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.ContainerScreenEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@Mod.EventBusSubscriber(bus = EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public final class ContainerScreenEventListener {

	@SubscribeEvent
	public static final void onCreateFluidSourceEvent$Render$Background(final ContainerScreenEvent.Render.Background event) {
		//LOGICAL CLIENT
	}
	
	@SubscribeEvent
	public static final void onCreateFluidSourceEvent$Render$Foreground(final ContainerScreenEvent.Render.Foreground event) {
		//LOGICAL CLIENT
	}
}
