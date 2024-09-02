package com.tltemplates.listeners.mod.common;

import net.minecraftforge.event.AddPackFindersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@Mod.EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public final class AddPackFindersEventListener {

	@SubscribeEvent
	public static final void onAddPackFindersEvent(final AddPackFindersEvent event) {
		//LOGICAL BOTH
	}
}
