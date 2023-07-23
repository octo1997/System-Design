package designPattern.mediator;

public interface MediatorItf {
	public void sendMessage(String message, String uid);
	public void addUser(User user);
}
