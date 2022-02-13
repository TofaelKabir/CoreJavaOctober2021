package lec18_java_oop_abstraction_Final;

public class TestVehicle {

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
		Car car = new Toyota();
		car.brake();
		car.honk();
		car.model();
		car.start();
		car.stop();
		Car.gear();
		
		System.out.println("\n--------------------- Abstract class FlyingCar ------------------------");
		FlyingCar flyingCar = new Toyota();
		flyingCar.autoPilot();
		flyingCar.flyingFeature();
		FlyingCar.flyingCar();
		

	}

}
