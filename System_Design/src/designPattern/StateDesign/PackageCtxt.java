package designPattern.StateDesign;

public class PackageCtxt {
	private PackageState curState;
	private final String id;
	
	
	public PackageCtxt(String id) {
		super();
		this.id = id;
		
		this.curState = Shipped.getInstance();
	}
	
	
	public PackageState getCurState() {
		return curState;
	}
	
	
	public void setCurState(PackageState curState) {
		this.curState = curState;
	}
	
	
	public String getId() {
		return id;
	}
	
	public void update() {
		this.curState.updateState(this);
	}
	
	
}
