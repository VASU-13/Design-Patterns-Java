package vs.designpatterns.creational.factorymethod;

public class BMWCompany extends CarCompany {

	@Override
	IVehicle manufactureVehicle(String vehicleType) {
		if(vehicleType=="Bike") {
			System.out.println("BMW Bike");
			return new BMWBike();
		}
		else if(vehicleType=="Car") {
			System.out.println("BMW Car");
			return new BMWCar();
		}
		return null;
	}
}