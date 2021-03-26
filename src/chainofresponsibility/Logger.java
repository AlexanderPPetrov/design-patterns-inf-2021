package chainofresponsibility;

public abstract class Logger {

	
	public static int ERROR = 3;
	public static int WARNING = 2;
	public static int INFO = 1;

	protected int level;
	
	protected Logger nextLogger;
	
	public void setNextLogger(Logger nextLogger) {
		this.nextLogger = nextLogger;
	}
	
	public void handleMessage(int level, String message) {
		
		if(this.level <= level) {
			this.logMessage(message);
			return;
		}
		
		if(this.nextLogger != null) {
			this.nextLogger.handleMessage(level, message);
		}
	}
	
	abstract protected void logMessage(String message);
	
}
