package red;

public class Config {
	private Config() throws InstantiationException {
		throw new InstantiationException("Cannot create an instance of the configuration class!");
	}
	
	public static final int DEFAULT_SIZE_WIDTH = 1280,
							DEFAULT_SIZE_HEIGHT = 720;
	
	public static final int MAX_ITERATIONS = 256;
	
	public static final double PERCENT_OF_SCREEN_TO_KEEP_WHEN_ZOOMING_IN = 0.85;
}
