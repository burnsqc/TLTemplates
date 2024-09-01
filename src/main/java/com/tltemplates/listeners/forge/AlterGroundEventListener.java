package com.tltemplates.listeners.forge;

import com.tltemplates.util.EventUtil;

import net.minecraftforge.event.level.AlterGroundEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@Mod.EventBusSubscriber(bus = EventBusSubscriber.Bus.FORGE)
public final class AlterGroundEventListener {

	@SubscribeEvent
	public static final void onAlterGroundEvent(final AlterGroundEvent event) {
		EventUtil.logEvent(event, Thread.currentThread());
	}
}
