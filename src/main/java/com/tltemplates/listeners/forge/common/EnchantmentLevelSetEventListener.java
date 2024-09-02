package com.tltemplates.listeners.forge.common;

import net.minecraftforge.event.enchanting.EnchantmentLevelSetEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@Mod.EventBusSubscriber(bus = EventBusSubscriber.Bus.FORGE)
public final class EnchantmentLevelSetEventListener {

	@SubscribeEvent
	public static final void onEnchantmentLevelSetEvent(final EnchantmentLevelSetEvent event) {
		//LOGICAL SERVER
	}
}
