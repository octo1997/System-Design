package designPattern.Singleton;

import multithreads.MultiThreadingDemo;

public class Executor {
	
	public static void main(String[] args) {
		
		for(int i = 0; i < 9; i++) {
			MultiThreadingDemo mtd = new MultiThreadingDemo();
			mtd.start();
		}
		
		
	}
}
