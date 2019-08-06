package Mechanic001;
import java.util.ArrayList;
import java.util.List;

public class Mechanic {

	//public void addVehicle(List<? extends Vehicle> vehicles){
		
	//}
    public void addVehicle(List<Vehicle> vehicles){
    	vehicles.add(new Car());
    	// some code here
    }
	//http://www.thejavageek.com/2013/08/28/generics-the-wildcard-operator/

    public static void main(String[] args) {

        List<Vehicle> vehicles = new ArrayList<Vehicle>();
        vehicles.add(new Vehicle());
        vehicles.add(new Vehicle());

        List<Bike> bikes = new ArrayList<Bike>();
        bikes.add(new Bike());
        bikes.add(new Bike());

        List<Car> cars = new ArrayList<Car>();
        cars.add(new Car());
        cars.add(new Car());

        Mechanic mechanic = new Mechanic();

        mechanic.addVehicle(vehicles); // compiles fine
        //mechanic.addVehicle(bikes);    // compilation fails
       // mechanic.addVehicle(cars);     // compilation fails

    }

}