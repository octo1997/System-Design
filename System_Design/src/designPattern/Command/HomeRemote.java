package designPattern.Command;

public class HomeRemote {
	private Command command;

	public HomeRemote setCommand(Command comm) {
		this.command = comm;
		return this;
	}
	
	public void buttonPressed() {
		command.execute();
	}
	
	
}
