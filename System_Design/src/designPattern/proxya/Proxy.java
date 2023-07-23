package designPattern.proxya;

public class Proxy extends ConcreteSubject {
	@Override
	public void operation() {
		System.out.println("Performing proxy operation");
		super.operation();
	}
}
