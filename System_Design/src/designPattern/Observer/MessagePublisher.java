package designPattern.Observer;

import java.util.*;

public class MessagePublisher implements Publisher{
	
	private List<Reciever> rList = new ArrayList<Reciever>();
	private String state;
	
	

	public MessagePublisher(String state) {
		super();
		this.state = state;
	}
	
	

	public String getState() {
		return state;
	}



	public void setState(String state) {
		this.state = state;
		triggerListeners();
	}



	@Override
	public void attachListener(Reciever r) {
		// TODO Auto-generated method stub
		rList.add(r);
	}

	@Override
	public void detachListener(Reciever r) {
		// TODO Auto-generated method stub
		rList.remove(r);
	}

	@Override
	public void triggerListeners() {
		// TODO Auto-generated method stub
		for(Reciever r : rList) r.update(this.state);
	}
	
}
