package com.tltemplates.listeners.forge.common;

import net.minecraftforge.event.level.ExplosionEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@Mod.EventBusSubscriber(bus = EventBusSubscriber.Bus.FORGE)
public final class ExplosionEventListener {

	@SubscribeEvent
	public static final void onExplosionEvent$Detonate(final ExplosionEvent.Detonate event) {
		//LOGICAL SERVER
	}

	@SubscribeEvent
	public static final void onExplosionEvent$Start(final ExplosionEvent.Start event) {
		//LOGICAL SERVER
	}
}
