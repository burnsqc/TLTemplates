package com.tltemplates.util;

import com.tltemplates.TLTemplates;

import net.minecraft.server.packs.PackType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.fml.LogicalSide;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.event.IModBusEvent;
import net.minecraftforge.fml.loading.FMLEnvironment;
import net.minecraftforge.fml.util.thread.SidedThreadGroups;

public class EventUtil {
	public static final String UNIVERSAL_FORMAT = "%1$-50s %2$-15s %3$-15s %4$-15s";

	public static String getName(Class<?> clazz) {
		int lastDot = clazz.getName().lastIndexOf(".") + 1;
		String eventName = clazz.getName().substring(lastDot);
		return eventName;
	}

	public static String getBus(Event event) {
		return (event instanceof IModBusEvent ? EventBusSubscriber.Bus.MOD : EventBusSubscriber.Bus.FORGE).toString();
	}

	public static String getPhysicalSide() {
		return FMLEnvironment.dist.toString();
	}

	public static String getLogicalSide(Thread thread) {
		if (FMLEnvironment.dist == Dist.DEDICATED_SERVER) {
			return LogicalSide.SERVER.toString(); 
		}
		return thread.getThreadGroup() == SidedThreadGroups.SERVER ? LogicalSide.SERVER.toString() : LogicalSide.CLIENT.toString();
	}

	public static void logEvent(Event event, Thread thread) {
		TLTemplates.EVENT_LOGGER.log(String.format(UNIVERSAL_FORMAT, "EVENT:" + getName(event.getClass()), "BUS:" + getBus(event), "SIDE_P:" + getPhysicalSide(), "SIDE_L:" + getLogicalSide(thread)));
	}
	
	public static void logEvent(Event event, PackType packType) {
		TLTemplates.EVENT_LOGGER.log(String.format(UNIVERSAL_FORMAT, "EVENT:" + getName(event.getClass()), "BUS:" + getBus(event), "SIDE_P:" + getPhysicalSide(), "SIDE_L:" + (packType == PackType.SERVER_DATA ? LogicalSide.SERVER.toString() : LogicalSide.CLIENT.toString())));
	}
}
