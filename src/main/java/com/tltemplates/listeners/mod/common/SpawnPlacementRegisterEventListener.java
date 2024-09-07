package com.tltemplates.listeners.mod.common;

import com.tltemplates.util.EventUtil;

import net.minecraftforge.event.entity.SpawnPlacementRegisterEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@Mod.EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public final class SpawnPlacementRegisterEventListener {

	@SubscribeEvent
	public static final void onSpawnPlacementRegisterEvent(final SpawnPlacementRegisterEvent event) {
		EventUtil.logEvent(event, Thread.currentThread());
	}
}
