package lec18_java_oop_abstraction_Final;

public class Toyota extends FlyingCar implements Car {
	
	public void toyotaInfo() {
		System.out.println("This method is from Toyota class");
	}
	
	public static void toyota() {
		System.out.println("Toyota is a static method of Toyota class" );
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
	public String model() {
		String m = "Toyota Camry";
		System.out.println("Model: "+m);
		return m;
	}

}
