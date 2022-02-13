package lec16_java_oop_abstraction;

public abstract class SolarCar {
	public String name;
	public int cost;
	
	public SolarCar() {
		System.out.println("It can be initialized?");
	}
	public abstract void speed();
	public abstract void cost();

}
