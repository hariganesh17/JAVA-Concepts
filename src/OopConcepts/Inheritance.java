package OopConcepts;
/*
 * defn: Inheritance is the mechanism by which sub class can inherit the fields and methods of super class. 
 * 
 * 		adv: This promotes code reusability.
 */

class vehicle {
	private String brand;

	public vehicle(String brand) {

		this.brand = brand;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void display() {
		System.out.println("Welcome to " + brand);
	}
}

class car extends vehicle {
	private String model;

	public car(String brand, String model) {
		
		super(brand);
		this.model = model;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void speed() {
		System.out.println("the speed of " + getBrand() + " " + getModel() + " is 100kmph ");
	}
}

public class Inheritance {
	public static void main(String args[]) {

		vehicle vehicle = new vehicle("TATA");
		car car = new car("TATA", "NEXON");

		vehicle.display();
		car.speed();

	}

}
