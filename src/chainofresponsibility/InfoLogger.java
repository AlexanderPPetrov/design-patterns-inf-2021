package chainofresponsibility;

public class InfoLogger extends Logger {

	public InfoLogger() {
		this.level = Logger.INFO;
	}

	@Override
	protected void logMessage(String message) {
		System.out.println("Info message: " + message);
	}

}
