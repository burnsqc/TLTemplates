package com.tltemplates.setup.client;

import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.config.ModConfig.Type;

public final class ClientSetup {
	public static void init() {
		ModLoadingContext.get().registerConfig(Type.CLIENT, TLTemplatesConfigClient.CLIENT_SPEC, "technologica-client.toml");
	}
}
