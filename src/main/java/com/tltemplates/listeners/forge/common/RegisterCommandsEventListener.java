package com.tltemplates.listeners.forge.common;

import com.tltemplates.server.commands.StopIntegratedServer;

import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@Mod.EventBusSubscriber(bus = EventBusSubscriber.Bus.FORGE)
public final class RegisterCommandsEventListener {

	@SubscribeEvent
	public static final void onRegisterCommandsEvent(final RegisterCommandsEvent event) {
		//LOGICAL SERVER
		//EventUtil.logEvent(event, Thread.currentThread());
		StopIntegratedServer.register(event.getDispatcher());
	}
}
