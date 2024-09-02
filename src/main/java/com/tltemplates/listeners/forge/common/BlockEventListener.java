package com.tltemplates.listeners.forge.common;

import net.minecraftforge.event.level.BlockEvent;
import net.minecraftforge.event.level.BlockEvent.CreateFluidSourceEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@Mod.EventBusSubscriber(bus = EventBusSubscriber.Bus.FORGE)
public final class BlockEventListener {

	@SubscribeEvent
	public static final void onBlockEvent$BlockToolModificationEvent(final BlockEvent.BlockToolModificationEvent event) {
		//LOGICAL BOTH
	}

	@SubscribeEvent
	public static final void onBlockEvent$BreakEvent(final BlockEvent.BreakEvent event) {
		//LOGICAL SERVER
	}

	@SubscribeEvent
	public static final void onBlockEvent$CreateFluidSourceEvent(final CreateFluidSourceEvent event) {
		//LOGICAL SERVER
	}
	
	@SubscribeEvent
	public static final void onBlockEvent$CropGrowEvent$Post(final BlockEvent.CropGrowEvent.Post event) {
		//LOGICAL SERVER
	}

	@SubscribeEvent
	public static final void onBlockEvent$CropGrowEvent$Pre(final BlockEvent.CropGrowEvent.Pre event) {
		//LOGICAL SERVER
	}
	
	@SubscribeEvent
	public static final void onBlockEvent$EntityPlaceEvent(final BlockEvent.EntityPlaceEvent event) {
		//LOGICAL SERVER
	}

	@SubscribeEvent
	public static final void onBlockEvent$EntityMultiPlaceEvent(final BlockEvent.EntityMultiPlaceEvent event) {
		//LOGICAL SERVER
	}

	@SubscribeEvent
	public static final void onBlockEvent$FarmlandTrampleEvent(final BlockEvent.FarmlandTrampleEvent event) {
		//LOGICAL SERVER
	}

	@SubscribeEvent
	public static final void onBlockEvent$FluidPlaceBlockEvent(final BlockEvent.FluidPlaceBlockEvent event) {
		//LOGICAL SERVER
	}

	@SubscribeEvent
	public static final void onBlockEvent$NeighborNotifyEvent(final BlockEvent.NeighborNotifyEvent event) {
		//LOGICAL SERVER
	}

	@SubscribeEvent
	public static final void onBlockEvent$PortalSpawnEvent(final BlockEvent.PortalSpawnEvent event) {
		//LOGICAL SERVER
	}
}
