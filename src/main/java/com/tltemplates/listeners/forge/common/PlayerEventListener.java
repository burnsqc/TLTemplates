package com.tltemplates.listeners.forge.common;

import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@Mod.EventBusSubscriber(bus = EventBusSubscriber.Bus.FORGE)
public final class PlayerEventListener {

	@SubscribeEvent
	public static final void onPlayerEvent$BreakSpeed(final PlayerEvent.BreakSpeed event) {
		//LOGICAL BOTH
		//EventUtil.logEvent(event, Thread.currentThread());
	}

	@SubscribeEvent
	public static final void onPlayerEvent$Clone(final PlayerEvent.Clone event) {
		//LOGICAL SERVER
		//EventUtil.logEvent(event, Thread.currentThread());
	}

	@SubscribeEvent
	public static final void onPlayerEvent$HarvestCheck(final PlayerEvent.HarvestCheck event) {
		//LOGICAL SERVER
		//EventUtil.logEvent(event, Thread.currentThread());
	}

	@SubscribeEvent
	public static final void onPlayerEvent$ItemCraftedEvent(final PlayerEvent.ItemCraftedEvent event) {
		//LOGICAL BOTH
		//EventUtil.logEvent(event, Thread.currentThread());
	}

	@SubscribeEvent
	public static final void onPlayerEvent$ItemPickupEvent(final PlayerEvent.ItemPickupEvent event) {
		//LOGICAL SERVER
		//EventUtil.logEvent(event, Thread.currentThread());
	}

	@SubscribeEvent
	public static final void onPlayerEvent$ItemSmeltedEvent(final PlayerEvent.ItemSmeltedEvent event) {
		//LOGICAL BOTH
		//EventUtil.logEvent(event, Thread.currentThread());
	}

	@SubscribeEvent
	public static final void onPlayerEvent$LoadFromFile(final PlayerEvent.LoadFromFile event) {
		//LOGICAL SERVER
		//EventUtil.logEvent(event, Thread.currentThread());
	}

	@SubscribeEvent
	public static final void onPlayerEvent$NameFormat(final PlayerEvent.NameFormat event) {
		//LOGICAL BOTH
		//EventUtil.logEvent(event, Thread.currentThread());
	}

	@SubscribeEvent
	public static final void onPlayerEvent$PlayerChangedDimensionEvent(final PlayerEvent.PlayerChangedDimensionEvent event) {
		//LOGICAL SERVER
		//EventUtil.logEvent(event, Thread.currentThread());
	}

	@SubscribeEvent
	public static final void onPlayerEvent$PlayerChangeGameModeEvent(final PlayerEvent.PlayerChangeGameModeEvent event) {
		//LOGICAL SERVER
		//EventUtil.logEvent(event, Thread.currentThread());
	}

	@SubscribeEvent
	public static final void onPlayerEvent$PlayerLoggedOutEvent(final PlayerEvent.PlayerLoggedOutEvent event) {
		//LOGICAL SERVER
		//EventUtil.logEvent(event, Thread.currentThread());
	}

	@SubscribeEvent
	public static final void onPlayerEvent$PlayerLoggedInEvent(final PlayerEvent.PlayerLoggedInEvent event) {
		//LOGICAL SERVER
		//EventUtil.logEvent(event, Thread.currentThread());
	}

	@SubscribeEvent
	public static final void onPlayerEvent$PlayerRespawnEvent(final PlayerEvent.PlayerRespawnEvent event) {
		//LOGICAL SERVER
		//EventUtil.logEvent(event, Thread.currentThread());
	}

	@SubscribeEvent
	public static final void onPlayerEvent$SaveToFile(final PlayerEvent.SaveToFile event) {
		//LOGICAL SERVER
		//EventUtil.logEvent(event, Thread.currentThread());
	}

	@SubscribeEvent
	public static final void onPlayerEvent$StartTracking(final PlayerEvent.StartTracking event) {
		//LOGICAL SERVER
		//EventUtil.logEvent(event, Thread.currentThread());
	}

	@SubscribeEvent
	public static final void onPlayerEvent$StopTracking(final PlayerEvent.StopTracking event) {
		//LOGICAL SERVER
		//EventUtil.logEvent(event, Thread.currentThread());
	}

	@SubscribeEvent
	public static final void onPlayerEvent$TabListNameFormat(final PlayerEvent.TabListNameFormat event) {
		//LOGICAL SERVER
		//EventUtil.logEvent(event, Thread.currentThread());
	}
}
