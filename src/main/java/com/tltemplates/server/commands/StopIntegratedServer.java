package com.tltemplates.server.commands;

import com.mojang.brigadier.CommandDispatcher;

import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;

public final class StopIntegratedServer {

	public static void register(CommandDispatcher<CommandSourceStack> dispatcher) {
		dispatcher.register(Commands.literal("halt").requires((stack) -> {
			return stack.hasPermission(0);
		}).executes((context) -> {
			return halt(context.getSource());
		}));
	}

	private static int halt(CommandSourceStack stack) {
		stack.getServer().halt(false);
		return 196;
	}
}
