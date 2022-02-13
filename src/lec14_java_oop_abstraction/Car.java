package lec14_java_oop_abstraction;

// This is an interface
public interface Car {
	
	// method declared inside interface, not implemented
	// also called abstract method
	// This is not mandatory to put abstract keyword together with abstract method
	public void start(); 
	public void stop();
	public abstract void brake();

}
