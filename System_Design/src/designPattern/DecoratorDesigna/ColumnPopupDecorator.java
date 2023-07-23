package designPattern.DecoratorDesigna;

public class ColumnPopupDecorator extends ColumnDecorator{
	public ColumnPopupDecorator(Report rpt) {
		super(rpt);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String getFirstColumn() {
		return postProcess(super.getFirstColumn());
	}
	
	private String postProcess(String col) {
		return col + "popup decorated";
	}
	
}
