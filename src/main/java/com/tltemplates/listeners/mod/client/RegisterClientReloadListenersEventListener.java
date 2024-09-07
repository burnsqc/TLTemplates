package com.tltemplates.listeners.mod.client;

import com.tltemplates.util.EventUtil;

import net.minecraft.server.packs.resources.ResourceManager;
import net.minecraft.server.packs.resources.SimplePreparableReloadListener;
import net.minecraft.util.Unit;
import net.minecraft.util.profiling.ProfilerFiller;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterClientReloadListenersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@Mod.EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public final class RegisterClientReloadListenersEventListener {

	@SubscribeEvent
	public static final void onRegisterClientReloadListenersEvent(final RegisterClientReloadListenersEvent event) {
		EventUtil.logEvent(event, Thread.currentThread());
		event.registerReloadListener(new SimplePreparableReloadListener<Unit>() {

            @Override
            protected Unit prepare(ResourceManager resourceManager, ProfilerFiller profiller) {
                return Unit.INSTANCE;
            }

            @Override
            protected void apply(Unit ignored, ResourceManager resourceManager, ProfilerFiller profiller) {    
            }
        });
	}
}
