package designPattern.DecoratorDesigna;

import java.io.File;

public abstract class ColumnDecorator implements Report{
	
	Report rpt;
	
	

	public ColumnDecorator(Report rpt) {
		super();
		this.rpt = rpt;
	}

	@Override
	public File getReportData() {
		return rpt.getReportData();
	}

	@Override
	public String getFirstColumn() {
		return rpt.getFirstColumn();
	}
	
}
