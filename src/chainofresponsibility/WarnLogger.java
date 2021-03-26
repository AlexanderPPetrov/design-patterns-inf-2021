package chainofresponsibility;

public class WarnLogger extends Logger {

	public WarnLogger() {
		this.level = Logger.WARNING;
	}

	@Override
	protected void logMessage(String message) {
		System.out.println("Warning message: " + message);
	}

}
