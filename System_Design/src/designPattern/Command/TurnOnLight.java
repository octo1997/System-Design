package designPattern.Command;

public class TurnOnLight implements Command {
	
	Appliance light;
	
	public TurnOnLight(Appliance light) {
		// TODO Auto-generated constructor stub
		this.light = light;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		light.turnOn();

	}

}
