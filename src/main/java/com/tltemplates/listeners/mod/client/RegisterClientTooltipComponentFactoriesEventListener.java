package com.tltemplates.listeners.mod.client;

import com.tltemplates.client.gui.screens.inventory.tooltip.TLTemplatesClientTextTooltip;
import com.tltemplates.util.EventUtil;
import com.tltemplates.world.inventory.tooltip.TLTemplatesTooltip;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterClientTooltipComponentFactoriesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@Mod.EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public final class RegisterClientTooltipComponentFactoriesEventListener {

	@SubscribeEvent
	public static void onRegisterClientTooltipComponentFactoriesEvent(final RegisterClientTooltipComponentFactoriesEvent event) {
		EventUtil.logEvent(event, Thread.currentThread());
		event.register(TLTemplatesTooltip.class, TLTemplatesClientTextTooltip::new);
	}
}
