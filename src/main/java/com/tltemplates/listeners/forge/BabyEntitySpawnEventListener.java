package com.tltemplates.listeners.forge;

import com.tltemplates.util.EventUtil;

import net.minecraftforge.event.entity.living.BabyEntitySpawnEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@Mod.EventBusSubscriber(bus = EventBusSubscriber.Bus.FORGE)
public final class BabyEntitySpawnEventListener {

	@SubscribeEvent
	public static final void onBabyEntitySpawnEvent(final BabyEntitySpawnEvent event) {
		EventUtil.logEvent(event, Thread.currentThread());
	}
}
