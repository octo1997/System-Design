package designPattern.factory;

public abstract class Car implements Cloneable {
	protected CarTypes type;
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " " + type.toString();
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
}
