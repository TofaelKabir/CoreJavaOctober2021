package lec18_java_oop_abstraction_Final;

public class TestVehicleAnotherWay {

	public static void main(String[] args) {
		System.out.println("\n--------------------- Regular class Toyota ------------------------");
		Toyota toyota = new Toyota();
		toyota.autoPilot();
		toyota.brake();
		toyota.flyingFeature();
		toyota.honk();
		toyota.model();
		toyota.start();
		toyota.stop();
		toyota.toyotaInfo();
		Toyota.toyota();
		
		System.out.println("\n--------------------- Interface Car ------------------------");
		// Just save the code, no need to use for now
		Car car = new Car() { // Instantiated by anonymous inner class Car
			
			@Override
			public void stop() {
				System.out.println("stop method from Car Interface");
				
			}
			
			@Override
			public void start() {
				System.out.println("start method from Car Interface");
				
			}
			
			@Override
			public String model() {
				String m = "Toyota Camry";
				System.out.println("Model: "+m);
				return m;
			}
			
			@Override
			public void brake() {
				System.out.println("brake method from Car Interface");
				
			}
		};
		car.honk();
		Car.gear();
		

		
		System.out.println("\n--------------------- Abstract class FlyingCar ------------------------");
		// Just save the code, no need to use for now
		FlyingCar flyingCar = new FlyingCar() { // Instantiated by anonymous inner class FlyingCar
			
			@Override
			public void autoPilot() {
				System.out.println("autoPilot method from Flying Car Abstract class");
				
			}
		};
		flyingCar.flyingFeature();
		FlyingCar.flyingCar();
	}

}
