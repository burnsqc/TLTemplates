package com.tltemplates.listeners.mod.common;

import com.tltemplates.util.EventUtil;

import net.minecraftforge.event.entity.EntityAttributeModificationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@Mod.EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public final class EntityAttributeModificationEventListener {

	@SubscribeEvent
	public static final void onEntityAttributeModificationEvent(final EntityAttributeModificationEvent event) {
		EventUtil.logEvent(event, Thread.currentThread());
	}
}
