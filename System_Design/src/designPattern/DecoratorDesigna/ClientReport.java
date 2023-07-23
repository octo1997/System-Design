package designPattern.DecoratorDesigna;

import java.io.File;

public class ClientReport implements Report{
	
	private String reportId;
	private File reportFile;
	
	

	public ClientReport(String reportId) {
		super();
		this.reportId = reportId;
	}

	public void setReportFile(File reportFile) {
		this.reportFile = reportFile;
	}

	@Override
	public File getReportData() {
		// TODO Auto-generated method stub
		System.out.println("Generate client report data for " + reportId + "\n");
		return reportFile;
	}

	@Override
	public String getFirstColumn() {
		// TODO Auto-generated method stub
		System.out.println("Generate first column for " + reportId + "\n");
		return null;
	}
	
}
