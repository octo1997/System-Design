package designPattern.factory;

public class Executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			CarTypes[] cts = {CarTypes.Sedan, CarTypes.SUV, CarTypes.Hatchback, CarTypes.Sedan, CarTypes.SUV, CarTypes.Hatchback};
			
			for(CarTypes ct: cts) {
				Car a = CarFactory.getInstance(ct);
				
				System.out.println(a.toString());
			}
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		
	}

}
