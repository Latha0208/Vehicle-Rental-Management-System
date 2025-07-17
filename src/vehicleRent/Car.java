package vehicleRent;

public class Car extends Vehicle
{

	public Car(String brand, String model, double ratePerHr) {
		super(brand, model, ratePerHr);
		// TODO Auto-generated constructor stub
	}

	@Override
	double calculateRent(int hours) {
		// TODO Auto-generated method stub
		return  hours * getRate();
	}

}
class Bike extends Vehicle{

	public Bike(String brand, String model, double ratePerHr) {
		super(brand, model, ratePerHr);
		// TODO Auto-generated constructor stub
	}

	@Override
	double calculateRent(int hours) {
		// TODO Auto-generated method stub
		return hours * getRate();
	}
	
}
