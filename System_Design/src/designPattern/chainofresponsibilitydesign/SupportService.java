package designPattern.chainofresponsibilitydesign;

public class SupportService implements SupportServiceItf {
	
	private SupportServiceItf handler = null;
	
	public SupportServiceItf getHandler() {
		// TODO Auto-generated method stub
		return handler;
	}
	
	public void setHandler(SupportServiceItf handler) {
		this.handler = handler;
	}

	@Override
	public void handleRequest(ServiceRequest sr) {
		// TODO Auto-generated method stub
		handler.handleRequest(sr);
	}
	
}
