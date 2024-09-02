package com.tltemplates.listeners.forge.common;

import net.minecraftforge.event.DifficultyChangeEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@Mod.EventBusSubscriber(bus = EventBusSubscriber.Bus.FORGE)
public final class DifficultyChangeEventListener {

	@SubscribeEvent
	public static final void onDifficultyChangeEvent(final DifficultyChangeEvent event) {
		//LOGICAL BOTH
	}
}
