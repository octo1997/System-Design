package designPattern.adapter;

public class OldCarAdapter {
	public static Car adapt(OldCar car) {
		return new Car.CarBuilder().setMileage(car.getMileage()).setType(car.getType()).build();
	}
}
