package designPattern.adapter;

import designPattern.factory.CarTypes;

public class OldCar {
	private CarTypes type;
	private int mileage;
	
	
	
	public OldCar(CarTypes type) {
		super();
		this.type = type;
	}
	
	
	public CarTypes getType() {
		return type;
	}
	public void setType(CarTypes type) {
		this.type = type;
	}
	public int getMileage() {
		return mileage;
	}
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return type.toString() + " " + Integer.toString(mileage);
	}
	
	
}
