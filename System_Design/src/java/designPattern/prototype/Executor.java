package designPattern.prototype;

import designPattern.prototype.PrototypeFactory.types;

public class Executor {
	public static void main(String[] args) {
		
		String arr[] = {types.Art, types.Drama, types.Drama, types.movie};
		
		for(String a : arr) {
			Prototypeable temp = PrototypeFactory.getInstance(a);
			System.out.println(temp.toString());
		}
		
		
	}
}
