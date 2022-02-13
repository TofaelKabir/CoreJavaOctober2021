package lec18_java_oop_abstraction_Final;

public abstract class FlyingCar {
	
	public FlyingCar() {
		System.out.println("Default constructor");
	}
	
	public void flyingFeature() { 
		System.out.println("Flying feature of flying car");
	}
	
	public abstract void autoPilot(); 
	
	public static void flyingCar() {
		System.out.println("flyingCar is a static method of FlyingCar class" );
	}

}
