package designPattern.factory;
import java.util.*;

public class CarFactory {
	private static Map<CarTypes, Car> carMap = new HashMap<CarTypes, Car>();
	static {
		carMap.put(CarTypes.Sedan, new Sedan(CarTypes.Sedan));
		carMap.put(CarTypes.Hatchback, new Sedan(CarTypes.Hatchback));
		carMap.put(CarTypes.SUV, new Sedan(CarTypes.SUV));
	}
	
	public static Car getInstance(CarTypes ct) throws CloneNotSupportedException {
		return (Car)carMap.get(ct).clone();
	}
}
