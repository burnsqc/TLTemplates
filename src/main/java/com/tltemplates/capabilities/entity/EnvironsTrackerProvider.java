package com.tltemplates.capabilities.entity;

import org.jetbrains.annotations.Nullable;

import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;
import net.minecraftforge.common.util.LazyOptional;

public final class EnvironsTrackerProvider implements ICapabilitySerializable<CompoundTag> {
	private final EnvironsTracker environsTracker = new EnvironsTracker();
	private final LazyOptional<EnvironsTracker> optionalData = LazyOptional.of(() -> environsTracker);

	@Override
	public <T> LazyOptional<T> getCapability(Capability<T> capability, @Nullable Direction direction) {
		return null;
	}

	@Override
	public CompoundTag serializeNBT() {
		return environsTracker.serializeNBT();
	}

	@Override
	public void deserializeNBT(CompoundTag compoundTag) {
		environsTracker.deserializeNBT(compoundTag);
	}
}
