package designPattern.StateDesign;

public class Delivered implements PackageState {
	
	private static volatile Delivered instance;
	
	private Delivered() {}
	
	public static Delivered getInstance() {
		if(instance == null) {
			synchronized (Shipped.class) {
				if(instance == null) instance = new Delivered();
			}
		}
		
		return instance;
	}

	@Override
	public void updateState(PackageCtxt pck) {
		// TODO Auto-generated method stub
		System.out.println(pck.getId() + " is Delivered!");
	}

}