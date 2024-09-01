package com.tltemplates.listeners.forge;

import com.tltemplates.util.EventUtil;

import net.minecraftforge.event.level.BlockEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@Mod.EventBusSubscriber(bus = EventBusSubscriber.Bus.FORGE)
public final class BlockEventListener {

	@SubscribeEvent
	public static final void onBlockEvent$BlockToolModificationEvent(final BlockEvent.BlockToolModificationEvent event) {
		EventUtil.logEvent(event, Thread.currentThread());
	}

	@SubscribeEvent
	public static final void onBlockEvent$BreakEvent(final BlockEvent.BreakEvent event) {
		EventUtil.logEvent(event, Thread.currentThread());
	}

	@Mod.EventBusSubscriber(bus = EventBusSubscriber.Bus.FORGE)
	public final class CropGrowEventListener {

		@SubscribeEvent
		public static final void onBlockEvent$CropGrowEvent$Post(final BlockEvent.CropGrowEvent.Post event) {
			EventUtil.logEvent(event, Thread.currentThread());
		}

		@SubscribeEvent
		public static final void onBlockEvent$CropGrowEvent$Pre(final BlockEvent.CropGrowEvent.Pre event) {
			EventUtil.logEvent(event, Thread.currentThread());
		}
	}

	@SubscribeEvent
	public static final void onBlockEvent$EntityPlaceEvent(final BlockEvent.EntityPlaceEvent event) {
		EventUtil.logEvent(event, Thread.currentThread());
	}

	@SubscribeEvent
	public static final void onBlockEvent$EntityMultiPlaceEvent(final BlockEvent.EntityMultiPlaceEvent event) {
		EventUtil.logEvent(event, Thread.currentThread());
	}

	@SubscribeEvent
	public static final void onBlockEvent$FarmlandTrampleEvent(final BlockEvent.FarmlandTrampleEvent event) {
		EventUtil.logEvent(event, Thread.currentThread());
	}

	@SubscribeEvent
	public static final void onBlockEvent$FluidPlaceBlockEvent(final BlockEvent.FluidPlaceBlockEvent event) {
		EventUtil.logEvent(event, Thread.currentThread());
	}

	@SubscribeEvent
	public static final void onBlockEvent$NeighborNotifyEvent(final BlockEvent.NeighborNotifyEvent event) {
		EventUtil.logEvent(event, Thread.currentThread());
	}

	@SubscribeEvent
	public static final void onBlockEvent$PortalSpawnEvent(final BlockEvent.PortalSpawnEvent event) {
		EventUtil.logEvent(event, Thread.currentThread());
	}
}
