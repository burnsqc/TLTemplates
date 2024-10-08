package com.tltemplates.listeners.mod.client;

import com.tltemplates.util.EventUtil;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@Mod.EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public final class RegisterColorHandlersEventListener {

	@SubscribeEvent
	public static final void onRegisterColorHandlersEvent$Block(final RegisterColorHandlersEvent.Block event) {
		EventUtil.logEvent(event, Thread.currentThread());
	}

	@SubscribeEvent
	public static final void onRegisterColorHandlersEvent$ColorResolver(final RegisterColorHandlersEvent.ColorResolvers event) {
		EventUtil.logEvent(event, Thread.currentThread());
	}

	@SubscribeEvent
	public static final void onRegisterColorHandlersEvent$Item(final RegisterColorHandlersEvent.Item event) {
		EventUtil.logEvent(event, Thread.currentThread());
	}
}
