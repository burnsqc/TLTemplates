package com.tltemplates;

import org.apache.logging.log4j.Level;

import com.tltemplates.network.packets.clientbound.TriggerEnvironsTitleCardPacket;
import com.tltemplates.setup.client.ClientSetup;
import com.tltemplates.util.TLLogger;

import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.loading.FMLEnvironment;
import net.minecraftforge.network.NetworkRegistry;
import net.minecraftforge.network.simple.SimpleChannel;

@Mod(TLTemplates.MOD_ID)
public final class TLTemplates {
	public static final String MOD_ID = "tltemplates";
	public static final TLLogger LOGGER = new TLLogger(Level.DEBUG, "TLTEMPLATES", "LOADING");
	public static final TLLogger EVENT_LOGGER = new TLLogger(Level.DEBUG, "TLTEMPLATES", "EVENT");
	private static final String PROTOCOL_VERSION = "1";
	public static final SimpleChannel CHANNEL = NetworkRegistry.newSimpleChannel(new ResourceLocation(MOD_ID, "main"), () -> PROTOCOL_VERSION, PROTOCOL_VERSION::equals, PROTOCOL_VERSION::equals);
	private static int PACKET_ID = 0;

	public TLTemplates() {
		LOGGER.log("TLTEMPLATES NOW LOADING FOR DISTRIBUTION - " + FMLEnvironment.dist.toString());
		CHANNEL.registerMessage(PACKET_ID++, TriggerEnvironsTitleCardPacket.class, TriggerEnvironsTitleCardPacket::encode, TriggerEnvironsTitleCardPacket::decode, TriggerEnvironsTitleCardPacket::handle);
		if (FMLEnvironment.dist.isClient()) {
			ClientSetup.init();
		}
	}
}
