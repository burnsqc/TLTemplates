package com.tltemplates.listeners.forge.client;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RenderTooltipEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@Mod.EventBusSubscriber(bus = EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public final class RenderTooltipEventListener {

	@SubscribeEvent
	public static final void onRenderTooltipEvent$GatherComponents(final RenderTooltipEvent.Color event) {
		//LOGICAL CLIENT
	}
	
	@SubscribeEvent
	public static final void onRenderTooltipEvent$GatherComponents(final RenderTooltipEvent.GatherComponents event) {
		//LOGICAL CLIENT
	}
	
	@SubscribeEvent
	public static final void onRenderTooltipEvent$GatherComponents(final RenderTooltipEvent.Pre event) {
		//LOGICAL CLIENT
	}
}
