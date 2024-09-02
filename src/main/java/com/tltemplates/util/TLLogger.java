package com.tltemplates.util;

import java.util.HashMap;
import java.util.Map;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.MarkerManager;

public class TLLogger {
	private Level level;
	private Logger logger;
	private Marker marker;
	private boolean logFloodManagement = true;
	private float throttleRate = 1.0F;
	private Map<String, Long> logs = new HashMap<>();

	public TLLogger(Level level, String name, String marker) {
		this.level = level;
		this.logger = LogManager.getLogger(name);
		this.marker = MarkerManager.getMarker(marker);
		// logs.put("DUMMY", System.currentTimeMillis());
	}

	public void log(String message) {
		if (!logs.containsKey(message)) {
			logger.log(level, marker, message);
			logs.put(message, System.currentTimeMillis());
		} else if (logs.get(message) + (int) (5.0F * 1000) < System.currentTimeMillis()) {
			logger.log(level, marker, message);
			logs.replace(message, System.currentTimeMillis());
		}
	}
	
	public void log(String... message) {
		this.log(message.toString());
	}

	// SUPPRESS BY COUNT
	// EXACT MESSAGE
	// CALLING CLASS
	// SUPPRESS BY WAVE
}
