package designPattern.StateDesign;

public class Shipped implements PackageState {
	
	private static volatile Shipped instance;
	
	private Shipped() {}
	
	public static Shipped getInstance() {
		if(instance == null) {
			synchronized (Shipped.class) {
				if(instance == null) instance = new Shipped();
			}
		}
		
		return instance;
	}

	@Override
	public void updateState(PackageCtxt pck) {
		// TODO Auto-generated method stub
		System.out.println(pck.getId() + " is shipped!");
		pck.setCurState(Delivered.getInstance());
	}

}
