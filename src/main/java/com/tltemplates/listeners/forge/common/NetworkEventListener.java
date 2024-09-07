package com.tltemplates.listeners.forge.common;

import com.tltemplates.util.EventUtil;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.network.NetworkEvent;

@Mod.EventBusSubscriber(bus = EventBusSubscriber.Bus.FORGE)
public final class NetworkEventListener {

	@SubscribeEvent
	public static final void onNetworkEvent$GatherLoginPayloadsEvent(final NetworkEvent.GatherLoginPayloadsEvent event) {
		//LOGICAL BOTH
		EventUtil.logEvent(event, Thread.currentThread());

	}
}
