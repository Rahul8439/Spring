package beans;

import javax.annotation.PostConstruct;

public class Engine {
	private static String engineName;

	public static String getEngineName() {
		return engineName;
	}
	public static void setEngineName(String engineName) {
		Engine.engineName = engineName;
	}
}
