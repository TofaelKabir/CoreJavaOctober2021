package lec14_java_oop_abstraction;

// This is an abstract class
// we must have to put abstract keyword in abstract class
public abstract class FlyingCar {
	// method can be implemented and declared both in an abstract class
	// we must have to put abstract keyword together with abstract method
	
	// also called non-abstract method
	public void flyingFeature() { // method implemented
		System.out.println("Flying feature of flying car");
	}
	
	// also called abstract method
	public abstract void autoPilot(); // method declared

}
