package de.tr7zw.changeme.nbtapi.metodes;

import org.bukkit.plugin.Plugin;

import static de.tr7zw.changeme.nbtapi.utils.MinecraftVersion.getVersion;

public class RegisterNbtAPI {
	private static Plugin PLUGIN;

	public RegisterNbtAPI(Plugin plugin, boolean turnOffLogger) {
		PLUGIN = plugin;
		getVersion(turnOffLogger);

	}

	public void yamlLoad() {
		//work in progress.
	}

	public static Plugin getPlugin() {
		return PLUGIN;
	}
}
