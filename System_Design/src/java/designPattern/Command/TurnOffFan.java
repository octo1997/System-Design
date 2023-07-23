package designPattern.Command;

public class TurnOffFan implements Command {
	
	Appliance fan;
	
	public TurnOffFan(Appliance fan) {
		// TODO Auto-generated constructor stub
		this.fan = fan;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		fan.turnOff();

	}

}
