package designPattern.Observer;

public interface Publisher {
	public void attachListener(Reciever r);
	public void detachListener(Reciever r);
	public void triggerListeners();
}
