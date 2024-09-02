package com.tltemplates.listeners.forge.common;

import net.minecraftforge.event.level.ChunkWatchEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@Mod.EventBusSubscriber(bus = EventBusSubscriber.Bus.FORGE)
public final class ChunkWatchEventListener {

	@SubscribeEvent
	public static final void onChunkWatchEvent$UnWatch(final ChunkWatchEvent.UnWatch event) {
		//LOGICAL SERVER
	}

	@SubscribeEvent
	public static final void onChunkWatchEvent$Watch(final ChunkWatchEvent.Watch event) {
		//LOGICAL SERVER
	}
}
