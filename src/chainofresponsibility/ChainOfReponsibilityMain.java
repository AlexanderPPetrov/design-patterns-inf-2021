package chainofresponsibility;

public class ChainOfReponsibilityMain {

	public static void main(String[] args) {

		Logger chain = getLoggersChain();
		chain.handleMessage(2, "Test message");
		chain.handleMessage(1, "Another message");
		chain.handleMessage(3, "More messages");
		chain.handleMessage(5, "QA big level message");
		chain.handleMessage(0, "QA 0 level message");
	}

	
	private static Logger getLoggersChain() {
		
		Logger errorLogger = new ErrorLogger();
		Logger warnLogger = new WarnLogger();
		Logger infoLogger = new InfoLogger();
		
		errorLogger.setNextLogger(warnLogger);
		warnLogger.setNextLogger(infoLogger);
		
		return errorLogger;
	}
	
}
