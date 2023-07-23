package multithreads;

import designPattern.Singleton.Logger;
import designPattern.singletonUpdated.LoggerUpdated;

public class MultiThreadingDemo extends Thread {

	@SuppressWarnings("deprecation")
	@Override
	public void run() {
		// TODO Auto-generated method stub
		LoggerUpdated lg = LoggerUpdated.getInstance();
		lg.log(this.getId());
	}
	
}
