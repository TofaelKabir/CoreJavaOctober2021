package lec18_java_oop_abstraction;

public abstract class SolarCar {
	public String name = "Solary";
	public int cost = 45000;
	
	// constructor can be initialized inside Abstract class
	public SolarCar() {
		System.out.println("Yes, It can be initialized");
	}
	
	public abstract void speed();
	public abstract void cost();

}
