package vs.designpatterns.creational.factorymethod;

public abstract class CarCompany {
	
	public IVehicle produceVehicle(String vehicleType ) {
		
		IVehicle vehicle = manufactureVehicle(vehicleType);
		vehicle.manufacture();
		return vehicle;
	}
	
	abstract IVehicle manufactureVehicle(String vehicleType);
}
