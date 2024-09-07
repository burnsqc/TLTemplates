package com.tltemplates.listeners.mod.common;

import com.tltemplates.util.EventUtil;

import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@Mod.EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public final class EntityAttributeCreationEventListener {

	@SubscribeEvent
	public static final void onEntityAttributeCreationEvent(final EntityAttributeCreationEvent event) {
		EventUtil.logEvent(event, Thread.currentThread());
	}
}
