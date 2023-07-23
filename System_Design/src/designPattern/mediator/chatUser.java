package designPattern.mediator;

public class chatUser extends User {

	public chatUser(String uid, MediatorItf mediator) {
		super(uid, mediator);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sendMessage(String message, String uid) {
		// TODO Auto-generated method stub
		getMediator().sendMessage(message, uid);
	}

	@Override
	public void recieveMessage(String message) {
		// TODO Auto-generated method stub
		
		System.out.println(getUid() + " recieved " + message);
	}

}
