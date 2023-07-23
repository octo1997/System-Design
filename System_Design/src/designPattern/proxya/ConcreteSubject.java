package designPattern.proxya;

public class ConcreteSubject implements Subject{

	@Override
	public void operation() {
		System.out.println("Performing real operation");
	}
	
}
