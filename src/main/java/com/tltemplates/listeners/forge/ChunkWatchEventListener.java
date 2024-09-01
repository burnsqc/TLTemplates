package com.tltemplates.listeners.forge;

import com.tltemplates.util.EventUtil;

import net.minecraftforge.event.level.ChunkWatchEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@Mod.EventBusSubscriber(bus = EventBusSubscriber.Bus.FORGE)
public final class ChunkWatchEventListener {

	@SubscribeEvent
	public static final void onChunkWatchEvent$UnWatch(final ChunkWatchEvent.UnWatch event) {
		EventUtil.logEvent(event, Thread.currentThread());
	}

	@SubscribeEvent
	public static final void onChunkWatchEvent$Watch(final ChunkWatchEvent.Watch event) {
		EventUtil.logEvent(event, Thread.currentThread());
	}
}
