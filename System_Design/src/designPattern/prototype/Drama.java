package designPattern.prototype;

public class Drama implements Prototypeable {
	public Drama clone() throws CloneNotSupportedException {
		return (Drama) super.clone();
	}
}
