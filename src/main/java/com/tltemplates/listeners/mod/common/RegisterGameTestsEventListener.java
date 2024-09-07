package com.tltemplates.listeners.mod.common;

import com.tltemplates.util.EventUtil;

import net.minecraftforge.event.RegisterGameTestsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@Mod.EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public final class RegisterGameTestsEventListener {

	@SubscribeEvent
	public static final void onRegisterGameTestsEvent(final RegisterGameTestsEvent event) {
		EventUtil.logEvent(event, Thread.currentThread());
	}
}
