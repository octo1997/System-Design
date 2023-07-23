package designPattern.momento;

public class Executor {
	public static void main(String[] args) {
		Article myart = new Article("1", "My name is Kenny");
		
		myart.setContent("I am Kenny");
		System.out.println(myart.toString());
		myart.setContent("I am KennyTheRipper");
		System.out.println(myart.toString());
		System.out.println(myart.undo());
		myart.setContent("I am Shubham");
		System.out.println(myart.toString());
		System.out.println(myart.undo());
		System.out.println(myart.undo());
	}
}
