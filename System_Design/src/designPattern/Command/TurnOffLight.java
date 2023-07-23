package designPattern.Command;

public class TurnOffLight implements Command {
	
	Appliance light;
	
	public TurnOffLight(Appliance light) {
		// TODO Auto-generated constructor stub
		this.light = light;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		light.turnOff();

	}

}
