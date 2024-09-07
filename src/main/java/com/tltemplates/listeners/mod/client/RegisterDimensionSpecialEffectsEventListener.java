package com.tltemplates.listeners.mod.client;

import com.tltemplates.client.renderer.TLTemplatesDimensionSpecialEffects;
import com.tltemplates.util.EventUtil;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterDimensionSpecialEffectsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@Mod.EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public final class RegisterDimensionSpecialEffectsEventListener {

	@SubscribeEvent
	public static final void onRegisterDimensionSpecialEffectsEvent(final RegisterDimensionSpecialEffectsEvent event) {
		EventUtil.logEvent(event, Thread.currentThread());
		TLTemplatesDimensionSpecialEffects.EFFECTS.forEach((k, v) -> event.register(k, v));
	}
}
