package designPattern.adapter;

import designPattern.factory.CarTypes;

public class Executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car.CarBuilder().setEv(true).setMileage(18).setType(CarTypes.Sedan).setWheels("4").build();
		
		
		Car car2 = OldCarAdapter.adapt(new OldCar(CarTypes.Sedan));
		
		System.out.println(car1);
		System.out.println(car2);
	}

}
