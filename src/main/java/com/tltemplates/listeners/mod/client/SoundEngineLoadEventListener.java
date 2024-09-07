package com.tltemplates.listeners.mod.client;

import com.tltemplates.util.EventUtil;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.sound.SoundEngineLoadEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@Mod.EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public final class SoundEngineLoadEventListener {

	@SubscribeEvent
	public static final void onSoundEngineLoadEvent(final SoundEngineLoadEvent event) {
		EventUtil.logEvent(event, Thread.currentThread());
	}
}
