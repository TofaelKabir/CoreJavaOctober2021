package lec18_java_oop_abstraction_Final;



public interface Car {
	public void start(); 
	public void stop();
	public abstract void brake();
	public String model();
	
	public default void honk() {
		System.out.println("Honk feature from Car Interface");
	}
	
	public static void gear() {
		System.out.println("Gear feature from Car Interface");
	}

}
