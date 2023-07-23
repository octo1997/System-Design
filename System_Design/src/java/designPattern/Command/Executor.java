package designPattern.Command;

public class Executor {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Appliance lght = new Light(), fan = new Fan();
		
		HomeRemote hr = new HomeRemote();
		hr.setCommand(new TurnOnFan(fan)).buttonPressed();
		hr.setCommand(new TurnOffFan(fan)).buttonPressed();
		hr.setCommand(new TurnOnLight(lght)).buttonPressed();
		hr.setCommand(new TurnOffLight(lght)).buttonPressed();

	}

}