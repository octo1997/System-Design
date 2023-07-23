package designPattern.adapter;

import designPattern.factory.CarTypes;

public class Car {
	private String wheels;
	private CarTypes type;
	private boolean isEv;
	private int mileage;
	
	private Car(CarBuilder cb) {
		isEv = cb.isEv;
		wheels = cb.wheels;
		type = cb.type;
		mileage = cb.mileage;
	}
	
	public String getWheels() {
		return wheels;
	}

	public CarTypes getType() {
		return type;
	}

	public int getMileage() {
		return mileage;
	}

	public boolean isEv() {
		return isEv;
	}

	
	public static class CarBuilder{

		private String wheels;
		private CarTypes type;
		private boolean isEv;
		private int mileage;

		public CarBuilder setWheels(String wheels) {
			this.wheels = wheels;
			return this;
		}

		public CarBuilder setType(CarTypes type) {
			this.type = type;
			return this;
		}

		public CarBuilder setMileage(int mileage) {
			this.mileage = mileage;
			return this;
		}

		public CarBuilder setEv(boolean isEv) {
			this.isEv = isEv;
			return this;
		}
		
		public Car build() {
			
			return new Car(this);
		}
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return type.toString() + " " + Integer.toString(mileage) + " " + wheels+ " " + Boolean.toString(isEv);
	}
	
}
