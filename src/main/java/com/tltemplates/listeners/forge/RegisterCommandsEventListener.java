package com.tltemplates.listeners.forge;

import com.tltemplates.util.EventUtil;

import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@Mod.EventBusSubscriber(bus = EventBusSubscriber.Bus.FORGE)
public final class RegisterCommandsEventListener {

	@SubscribeEvent
	public static void onRegisterCommandsEvent(final RegisterCommandsEvent event) {
		EventUtil.logEvent(event, Thread.currentThread());
	}
}
