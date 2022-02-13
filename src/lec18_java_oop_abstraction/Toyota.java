package lec18_java_oop_abstraction;

// A regular class
// A regular class can inherit only one regular class or one abstract class by extends keyword
// A regular class can't inherit an Interface by extends keyword

// implements keyword is used to inherit Interface in regular class
// a regular class can inherit more than one Interface
// a regular class cannot inherit a regular class or abstract class by implements keyword


public class Toyota extends FlyingCar implements Car, Drone{
	// method is implemented inside class, not declared
	public void toyotaInfo() {
		System.out.println("This method is from Toyota class");
	}
	
	public static void toyota() {
		System.out.println("Toyota is a static method of Toyota class" );
	}

	@Override
	public void rent() {
		System.out.println("rent method from Taxi Interface");
		
	}

	@Override
	public void carryingPassenger() {
		System.out.println("carryingPassenger method from Taxi Interface");
		
	}

	@Override
	public void carryingGoods() {
		System.out.println("carryingGoods method from Truck Interface");
		
	}

	@Override
	public void lightWeight() {
		System.out.println("lightWeight method from Drone Interface");
		
	}

	@Override
	public void start() {
		System.out.println("start method from Car Interface");
		
	}

	@Override
	public void stop() {
		System.out.println("stop method from Car Interface");
		
	}

	@Override
	public void brake() {
		System.out.println("brake method from Car Interface");
		
	}

	@Override
	public void autoPilot() {
		System.out.println("autoPilot method from Flying Car Abstract class");
		
	}

	@Override
	public void price() {
		System.out.println("price method From Electric Car Abstract class");
		
	}

	@Override
	public void canFloat() {
		System.out.println("canFloat method from HoverCar Interface");
		
	}

	@Override
	public void space() {
		System.out.println("space method from Rocket Interface");
		
	}

	@Override
	public String model() {
		String m = "Toyota Camry";
		System.out.println("Model: "+m);
		return m;
	}

}
