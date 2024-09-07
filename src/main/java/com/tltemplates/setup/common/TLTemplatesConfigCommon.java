package com.tltemplates.setup.common;

import net.minecraftforge.common.ForgeConfigSpec;

public final class TLTemplatesConfigCommon {
	public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
	public static final ForgeConfigSpec COMMON_SPEC;

	public static final ForgeConfigSpec.ConfigValue<Boolean> COMMON_ON;

	static {
		BUILDER.comment("TLTEMPLATES COMMON CONFIG\n");
		COMMON_ON = BUILDER.comment("true/false").define("Common Config", false);
		COMMON_SPEC = BUILDER.build();
	}
}
