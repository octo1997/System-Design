package designPattern.singletonUpdated;

public class LoggerUpdated {
	private LoggerUpdated() {
		
	}
	
	public void log(String a) {
		System.out.println(a);
	}
	
	public void log(Long a) {
		System.out.println(a);
	}
	
	private static class loggerGenerator{
		public static LoggerUpdated logger = new LoggerUpdated(); 
	}
	
	public static LoggerUpdated getInstance() {
		return loggerGenerator.logger;
	}
}
