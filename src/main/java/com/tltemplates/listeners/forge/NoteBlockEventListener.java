package com.tltemplates.listeners.forge;

import com.tltemplates.util.EventUtil;

import net.minecraftforge.event.level.NoteBlockEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@Mod.EventBusSubscriber(bus = EventBusSubscriber.Bus.FORGE)
public final class NoteBlockEventListener {

	@SubscribeEvent
	public static final void onNoteBlockEvent$Change(final NoteBlockEvent.Change event) {
		EventUtil.logEvent(event, Thread.currentThread());
	}

	@SubscribeEvent
	public static final void onNoteBlockEvent$Play(final NoteBlockEvent.Play event) {
		EventUtil.logEvent(event, Thread.currentThread());
	}
}
