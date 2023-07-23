package designPattern.chainofresponsibilitydesign;

public class FrontDeskSupport implements SupportServiceItf {
	
	private SupportServiceItf next = null;
	private static final Levels level = Levels.SEV4;  



	public SupportServiceItf getNext() {
		return next;
	}


	public void setNext(SupportServiceItf next) {
		this.next = next;
	}


	@Override
	public void handleRequest(ServiceRequest sr) {
		if(sr.getLevel() == level) {
			System.out.println("Front desk resolved request!");
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