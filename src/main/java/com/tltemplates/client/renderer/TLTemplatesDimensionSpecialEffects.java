package com.tltemplates.client.renderer;

import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import net.minecraft.Util;
import net.minecraft.client.renderer.DimensionSpecialEffects;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.dimension.BuiltinDimensionTypes;
import net.minecraft.world.phys.Vec3;

public abstract class TLTemplatesDimensionSpecialEffects {
	public static final Object2ObjectMap<ResourceLocation, DimensionSpecialEffects> EFFECTS = Util.make(new Object2ObjectArrayMap<>(), (map) -> {
		map.put(BuiltinDimensionTypes.OVERWORLD_EFFECTS, new ChallengerDeepEffects());
	});

	public static class ChallengerDeepEffects extends DimensionSpecialEffects {
		public ChallengerDeepEffects() {
			super(Float.NaN, true, DimensionSpecialEffects.SkyType.NONE, false, false);
		}

		@Override
		public Vec3 getBrightnessDependentFogColor(Vec3 p_108901_, float p_108902_) {
			return p_108901_;
		}

		@Override
		public boolean isFoggyAt(int p_108898_, int p_108899_) {
			return true;
		}
	}
}