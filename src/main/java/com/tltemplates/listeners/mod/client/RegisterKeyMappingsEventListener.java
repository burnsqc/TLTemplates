package com.tltemplates.listeners.mod.client;

import com.tltemplates.util.EventUtil;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@Mod.EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public final class RegisterKeyMappingsEventListener {

	@SubscribeEvent
	public static final void onRegisterKeyMappingsEvent(final RegisterKeyMappingsEvent event) {
		EventUtil.logEvent(event, Thread.currentThread());
	}
}
