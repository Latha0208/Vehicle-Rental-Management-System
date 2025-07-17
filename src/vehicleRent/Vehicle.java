package vehicleRent;

public abstract class Vehicle
{
  private String brand;
  private String model;
  private double ratePerHr;
  
  public Vehicle(String brand, String model, double ratePerHr) {

	this.brand = brand;
	this.model = model;
	this.ratePerHr = ratePerHr;
  }
  
	public String getDetails() {
		return brand + " " + model;
	}
	
	public double getRate() {
		return ratePerHr;
	}
	
	abstract double calculateRent(int hours);
	
}
