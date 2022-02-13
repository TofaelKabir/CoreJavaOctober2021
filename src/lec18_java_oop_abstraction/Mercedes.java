package lec18_java_oop_abstraction;

public class Mercedes extends SolarCar{
	public void mercedesInfo() {
		System.out.println("Invented in Germany");
	}

	@Override
	public void speed() {
		System.out.println("speed method From Solar Car Abstract class");
		
	}

	@Override
	public void cost() {
		System.out.println("cost method From Solar Car Abstract class");
		
	}

	

}
