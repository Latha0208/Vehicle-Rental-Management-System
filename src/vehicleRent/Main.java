package vehicleRent;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		RentalService rentalService = new RentalService();
		rentalService.addVehicle(new Car("Taigun","Punch",500));
		rentalService.addVehicle(new Bike("KMT","BMW",30));
	
		Scanner sc= new Scanner(System.in);
		System.out.println("available vehicles:");
		rentalService.showVehicle();
		
		
		System.out.println("Select the vehicleindex to rent:");
		int choice= sc.nextInt();
		
		System.out.println("Enter hours");
		int hours= sc.nextInt();
		
		Vehicle selected=rentalService.getVehicle(choice);
		double cost =selected.calculateRent(hours);
		System.out.println("You selected"+ selected.getDetails());
		System.out.println("total rent" + cost);
		
		
}
}