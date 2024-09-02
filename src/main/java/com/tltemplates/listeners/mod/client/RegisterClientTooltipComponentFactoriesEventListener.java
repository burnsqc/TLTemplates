package com.tltemplates.listeners.mod.client;

import net.minecraftforge.client.event.RegisterClientTooltipComponentFactoriesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@Mod.EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public final class RegisterClientTooltipComponentFactoriesEventListener {

	@SubscribeEvent
	public static void onRegisterClientTooltipComponentFactoriesEvent(final RegisterClientTooltipComponentFactoriesEvent event) {
		//LOGICAL CLIENT
		//EventUtil.logEvent(event, Thread.currentThread());
	}
}
