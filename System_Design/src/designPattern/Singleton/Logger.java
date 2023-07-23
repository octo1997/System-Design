package designPattern.Singleton;

public class Logger {
	
	private static volatile Logger loggerInstance;
	
	private Logger() {
		if(loggerInstance != null) {
			throw new RuntimeException("Not allowed");
		}
	}
	
	public static Logger getInstance() {
		if(loggerInstance == null) {
			synchronized (Logger.class) {
				if(loggerInstance == null) {
					loggerInstance = new Logger();
				}
			}
			
		}
		
		return loggerInstance;
	}
	
	public void log(String a) {
		System.out.println(a);
	}
	
	public void log(long a) {
		System.out.println(a);
	}
}
