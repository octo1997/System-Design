package designPattern.DecoratorDesigna;

public class Executor {

	public static void main(String[] args) {
		
		ColumnDecorator cdr = new ColumnPopupDecorator(new ColumnLinkDecorator(new ClientReport("shubham")));
		
		System.out.println(cdr.getFirstColumn());

	}

}
