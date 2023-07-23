package designPattern.StateDesign;

public class Executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PackageCtxt pctxt = new PackageCtxt("Monitor");
		PackageCtxt pctxt1 = new PackageCtxt("MonitorArm");
		pctxt.update();
		pctxt.update();
		pctxt.update();
		pctxt1.update();
		pctxt1.update();
		
	}

}
