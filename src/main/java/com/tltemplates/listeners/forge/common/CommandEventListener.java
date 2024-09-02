package com.tltemplates.listeners.forge.common;

import net.minecraftforge.event.CommandEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@Mod.EventBusSubscriber(bus = EventBusSubscriber.Bus.FORGE)
public final class CommandEventListener {

	@SubscribeEvent
	public static final void onCommandEvent(final CommandEvent event) {
		//LOGICAL SERVER
	}
}
