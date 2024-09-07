package com.tltemplates.setup.dedicatedserver;

import net.minecraftforge.common.ForgeConfigSpec;

public final class TLTemplatesConfigServer {
	private static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
	public static final ForgeConfigSpec SERVER_SPEC;

	public static final ForgeConfigSpec.ConfigValue<Boolean> SERVER_ON;

	static {
		BUILDER.comment("TLTEMPLATES SERVER CONFIG\n");
		SERVER_ON = BUILDER.comment("true/false").define("Server Config", true);
		SERVER_SPEC = BUILDER.build();
	}
}
