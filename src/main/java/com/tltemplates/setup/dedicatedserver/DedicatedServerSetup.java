package com.tltemplates.setup.dedicatedserver;

import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.config.ModConfig.Type;

public final class DedicatedServerSetup {
	public static void init() {
		ModLoadingContext.get().registerConfig(Type.SERVER, TLTemplatesConfigServer.SERVER_SPEC, "technologica-server.toml");
	}
}
