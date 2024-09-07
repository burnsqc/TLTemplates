package com.tltemplates.setup.client;

import net.minecraftforge.common.ForgeConfigSpec;

public final class TLTemplatesConfigClient {
	private static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
	public static final ForgeConfigSpec CLIENT_SPEC;

	public static final ForgeConfigSpec.ConfigValue<Boolean> CLIENT_ON;

	static {
		BUILDER.comment("TLTEMPLATES CLIENT CONFIG\n");
		CLIENT_ON = BUILDER.comment("true/false").define("Client Config", false);
		CLIENT_SPEC = BUILDER.build();
	}
}
