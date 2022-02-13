package lec18_java_oop_abstraction;

// This is an abstract class
// we must have to put abstract keyword in abstract class
// An abstract class can inherit only one abstract class or one regular class by extends key word
// An abstract class can't inherit an Interface by extends key word

// implements keyword is used to inherit Interface in abstract class
// an abstract class can inherit more than one Interface
// an abstract class cannot inherit a regular class or abstract class by implements keyword

public abstract class FlyingCar extends ElectricCar implements HoverCar {
	// method can be implemented and declared both in an abstract class
	// we must have to put abstract keyword together with abstract method
	// An abstract class can contain variable and can contain parameterized method.
	
	// also called non-abstract method
	public void flyingFeature() { // method implemented
		System.out.println("Flying feature of flying car");
	}
	
	// also called abstract method
	public abstract void autoPilot(); // method declared
	
	public static void flyingCar() {
		System.out.println("flyingCar is a static method of FlyingCar class" );
	}

}
