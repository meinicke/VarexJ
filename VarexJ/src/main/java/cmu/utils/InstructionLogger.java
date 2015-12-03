package cmu.utils;

import java.util.HashMap;
import java.util.Map;

/**
 * Logger instructions to measure execution times.  
 * @author Meinicke
 *
 */
public class InstructionLogger {
	
	static Map<String, LogEntry> instructions = new HashMap<>();

	public static void log(String name, long time, String description) {
		if (instructions.containsKey(name)) {
			LogEntry entry = instructions.get(name);
			entry.log(time, description);
		} else {
			LogEntry entry = new LogEntry(name);
			entry.log(time,description);
			instructions.put(name, entry);
		}
	}
	
	public static void print() {
		for (LogEntry i : instructions.values()) {
			if (i.average() == 0) {
				continue;
			}
			System.out.println(i);
		}
	}
	
}

class LogEntry {
	
	final String name;
	long durationAll = 0;
	long numberOfCalls = 0;
	long max = 0;
	private String description;
	
	public LogEntry(String name) {
		this.name = name;
	}
	
	long average() {
		return durationAll / numberOfCalls;
	}

	void log(long duration, String description) {
		numberOfCalls++;
		durationAll += duration;
		if (duration > max) {
			max = duration;
			this.description = description;
		}
	}
	
	@Override
	public String toString() {
		return name + "-" +  description.replaceAll(" ", "") + " " +  max;//average();
	}
	
	@Override
	public int hashCode() {
		return name.hashCode();
	}
}
