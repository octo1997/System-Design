package designPattern.singletonUpdated;

import multithreads.MultiThreadingDemo;

public class Executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		while(i++ < 9) {
			MultiThreadingDemo mtd = new MultiThreadingDemo();
			mtd.start();
		}

	}

}
