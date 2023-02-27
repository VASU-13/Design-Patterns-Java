package vs.designpatterns.creational.factorymethod;

public class Main {
	
	public static void main(String args[]) {
		CarCompany BMWCompany = new BMWCompany();
		BMWCompany.produceVehicle("Car");
		BMWCompany.produceVehicle("Bike");
		
		CarCompany TataCompany = new TataCompany();
		TataCompany.produceVehicle("Car");
		TataCompany.produceVehicle("Bike");
	}	
}
