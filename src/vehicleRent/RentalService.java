package vehicleRent;

import java.util.ArrayList;
import java.util.List;

public class RentalService 
{
 private List<Vehicle> availableVehicles= new ArrayList<>();	
 
 public void addVehicle(Vehicle vehicle) 
 {
	 availableVehicles.add(vehicle);
 }
	
public void showVehicle()	
{
	for(int i=0; i< availableVehicles.size();i++) {
		System.out.println(i + "." + availableVehicles.get(i).getDetails());
	}
}
public Vehicle getVehicle(int index)
{
	return availableVehicles.get(index);
}

}