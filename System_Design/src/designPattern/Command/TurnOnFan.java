package designPattern.Command;

public class TurnOnFan implements Command {
	
	Appliance fan;
	
	public TurnOnFan(Appliance fan) {
		// TODO Auto-generated constructor stub
		this.fan = fan;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		fan.turnOn();

	}

}
