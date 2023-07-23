package designPattern.chainofresponsibilitydesign;

public class Manager implements SupportServiceItf {
	
	private SupportServiceItf next = null;
	private static final Levels level = Levels.SEV2;  

	public SupportServiceItf getNext() {
		return next;
	}


	public void setNext(SupportServiceItf next) {
		this.next = next;
	}


	@Override
	public void handleRequest(ServiceRequest sr) {
		if(sr.getLevel() == level) {
			System.out.println("Mnager resolved request!");
		}
		else {
			if(next != null) {
				next.handleRequest(sr);
			}else {
				throw new IllegalArgumentException("Out of scope");
			}
		}
		
	}
	
}