package designPattern.mediator;

public abstract class User {
	private String uid;
	private MediatorItf mediator = null;
	
	public User(String uid, MediatorItf mediator) {
		super();
		this.uid = uid;
		this.mediator = mediator;
	}
	public abstract void sendMessage(String message, String uid);
	public abstract void recieveMessage(String message);
	
	public MediatorItf getMediator() {
		return mediator;
	}
	
	
	public String getUid() {
		return uid;
	}

	
	
}
