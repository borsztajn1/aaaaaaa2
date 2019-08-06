package Mechanic001;
public class Car extends Vehicle {

	@Override
	public void service() {
		System.out.println("Car specific servicing");
	}

}