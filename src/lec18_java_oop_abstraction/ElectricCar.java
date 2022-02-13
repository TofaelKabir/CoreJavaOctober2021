package lec18_java_oop_abstraction;

public abstract class ElectricCar extends Ferrari {
	// This is the norm to write at least one abstract method inside abstract class
	public abstract void price(); // abstract method
	
	public void battery() { // non-abstract method
		System.out.println("Battery is very efficient");
	}
	

}
