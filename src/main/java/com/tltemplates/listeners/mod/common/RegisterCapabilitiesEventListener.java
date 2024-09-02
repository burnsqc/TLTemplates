package com.tltemplates.listeners.mod.common;

import net.minecraftforge.common.capabilities.RegisterCapabilitiesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@Mod.EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public final class RegisterCapabilitiesEventListener {

	@SubscribeEvent
	public static final void onRegisterCapabilitiesEvent(final RegisterCapabilitiesEvent event) {
		//LOGICAL BOTH
		//EventUtil.logEvent(event, Thread.currentThread());
	}
}
