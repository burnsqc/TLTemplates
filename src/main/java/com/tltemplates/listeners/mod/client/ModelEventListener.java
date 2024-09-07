package com.tltemplates.listeners.mod.client;

import com.tltemplates.TLTemplates;
import com.tltemplates.client.model.TLTemplatesItemLayerModel;
import com.tltemplates.util.EventUtil;

import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.ModelEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@Mod.EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public final class ModelEventListener {

	@SubscribeEvent
	public static final void onModelEvent$BakingCompleted(final ModelEvent.BakingCompleted event) {
		EventUtil.logEvent(event, Thread.currentThread());
	}
	
	@SubscribeEvent
	public static final void onModelEvent$ModifyBakingResult(final ModelEvent.ModifyBakingResult event) {
		EventUtil.logEvent(event, Thread.currentThread());
	}
	
	@SubscribeEvent
	public static final void onModelEvent$RegisterAdditional(final ModelEvent.RegisterAdditional event) {
		EventUtil.logEvent(event, Thread.currentThread());
		event.register(new ResourceLocation(TLTemplates.MOD_ID, "item/technetium_ingot_base"));
	}
	
	@SubscribeEvent
	public static final void onModelEvent$RegisterGeometryLoaders(final ModelEvent.RegisterGeometryLoaders event) {
		EventUtil.logEvent(event, Thread.currentThread());
		event.register("custom", new TLTemplatesItemLayerModel.Loader());
	}
}
