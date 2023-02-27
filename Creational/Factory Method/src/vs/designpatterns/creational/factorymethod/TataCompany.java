package vs.designpatterns.creational.factorymethod;

public class TataCompany extends CarCompany {

	@Override
	IVehicle manufactureVehicle(String vehicleType) {
		if(vehicleType=="Bike") {
			System.out.println("Tata Bike");
			return new TataBike();
		}
		else if(vehicleType=="Car") {
			System.out.println("Tata Car");
			return new TataCar();
		}
		return null;
	}
}
