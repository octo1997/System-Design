package designPattern.DecoratorDesigna;

public class ColumnLinkDecorator extends ColumnDecorator {

	public ColumnLinkDecorator(Report rpt) {
		super(rpt);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String getFirstColumn() {
		return postProcess(super.getFirstColumn());
	}
	
	private String postProcess(String col) {
		return col + "link decorated";
	}
	
}
