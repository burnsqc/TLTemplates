package com.tltemplates.server.commands;

import com.mojang.brigadier.CommandDispatcher;

import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;
import net.minecraft.network.chat.Component;

public final class EnvironsListCommand {

	public static void register(CommandDispatcher<CommandSourceStack> dispatcher) {
		dispatcher.register(Commands.literal("environs").requires((stack) -> {
			return stack.hasPermission(0);
		}).then(Commands.literal("list").then(Commands.literal("biomes").executes((context) -> {
			return listBiomes(context.getSource());
		}))));
	}

	private static int listBiomes(CommandSourceStack stack) {
		stack.sendSuccess(() -> {
			return Component.literal("Visited Biomes").withStyle((p_265659_) -> {
				return p_265659_.withColor(0x0000).withUnderlined(true);
			});
		}, false);
		return 0;
	}
}
