package lec16_java_oop_abstraction;

// This is an interface
// An Interface can inherit more than one Interface by extends keyword
// an Interface can't inherit a regular class or an abstract class by extends keyword

// implements keyword can't be used for inheritance in Interface

public interface Car extends Taxi, Truck {
	
	// the variables inside Interface are final and static in nature. interview question
	public static final int year = 2021;
	
	// method declared inside interface, not implemented (except default and static method)
	// also called abstract method
	// This is not mandatory to put abstract keyword together with abstract method
	public void start(); 
	public void stop();
	public abstract void brake();
	
	// from Java 1.8, JAVA implemented static and default type method in interface
	public default void honk() {
		System.out.println("Honk feature from Car Interface");
	}
	
	public static void gear() {
		System.out.println("Gear feature from Car Interface");
	}

}
