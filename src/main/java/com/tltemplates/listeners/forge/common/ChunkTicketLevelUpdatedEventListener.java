package com.tltemplates.listeners.forge.common;

import net.minecraftforge.event.level.ChunkTicketLevelUpdatedEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@Mod.EventBusSubscriber(bus = EventBusSubscriber.Bus.FORGE)
public final class ChunkTicketLevelUpdatedEventListener {

	@SubscribeEvent
	public static final void onChunkTicketLevelUpdatedEvent(final ChunkTicketLevelUpdatedEvent event) {
		//LOGICAL SERVER
	}
}
