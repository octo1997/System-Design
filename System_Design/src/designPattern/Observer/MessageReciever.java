package designPattern.Observer;

public class MessageReciever implements Reciever {
	
	private String id;
	
	

	public MessageReciever(String id) {
		super();
		this.id = id;
	}



	@Override
	public void update(String state) {
		// TODO Auto-generated method stub
		System.out.println("Recieved update for " + state + " on id = " + id);
	}
	
}
