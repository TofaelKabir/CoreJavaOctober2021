package lec18_java_oop_abstraction;

public class TestVehicle {

	public static void main(String[] args) {
		System.out.println("\n--------------------- Regular class Toyota ------------------------");
		Toyota toyota = new Toyota(); 
		toyota.toyotaInfo();
		toyota.rent();
		toyota.carryingPassenger();
		toyota.carryingGoods();
		toyota.lightWeight();
		toyota.start();
		toyota.stop();
		toyota.brake();
		toyota.autoPilot();
		toyota.price();
		toyota.canFloat();
		toyota.space();
		toyota.model();
		toyota.honk();
		//toyota.gear(); // not possible because this is a static method
		// Static method doesn't need an object to call, A class/Interface directly can
		// call a static method
		// Toyota.gear(); //because gear is the static method of Car interface
		toyota.flyingFeature();
		toyota.battery();
		toyota.ferrariInfo();
		toyota.space();
		toyota.mercedesInfo();
		toyota.cost();
		toyota.speed();
		Toyota.toyota(); // To call a static method, we need the help of the class where ot belongs to
		Toyota.flyingCar(); // This is added later
		
		System.out.println("\n--------------------- Interface Car ------------------------");
		// Cannot instantiate the type Car
		// an interface can't be instantiated, it needs the help of a concrete class, here Toyota class
		// Because Toyota implements Car		
		Car car = new Toyota();
		car.start();
		car.stop();
		car.brake();
		car.model();
		car.honk();
		// car.gear(); // not possible because this is a static method
		// This static method of interface Car can only be accessed as Car interface
		// Static method don't need an object to call, A class/Interface directly can
		// call a static method
		Car.gear();
		car.carryingGoods();
		car.carryingPassenger();
		car.rent();
		System.out.println("Car first build in: "+Car.year);
	
		System.out.println("\n--------------------- Abstract class FlyingCar ------------------------");
		// an abstract class can't be instantiated, it needs the help of a concrete class, here Toyota
		FlyingCar flyingCar = new Toyota();
		flyingCar.flyingFeature();
		flyingCar.autoPilot();
		FlyingCar.flyingCar();
		flyingCar.canFloat();
		flyingCar.price();
		flyingCar.battery();
		flyingCar.ferrariInfo();
		flyingCar.space();
		flyingCar.space();
		flyingCar.mercedesInfo();
		flyingCar.cost();
		flyingCar.speed();
		
		
		System.out.println("\n--------------------- Abstract class SolarCar ------------------------");
		// to get the answer to find the constructor/variables are initialized in abstract class -- we instantiate this class
		SolarCar solarCar = new Mercedes();
		System.out.println("Solar Car Name: "+solarCar.name+", and Price: "+solarCar.cost);
		
		
		System.out.println("\n--------------------- Not Instantiated by myself here in this clss: Drone, ElectricCar, Ferrari, HoverCar, Mercedes, Rocket, Taxi, Truck ------------------------\n");
		

	}

}
