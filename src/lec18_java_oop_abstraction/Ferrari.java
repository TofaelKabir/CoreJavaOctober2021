package lec18_java_oop_abstraction;

public class Ferrari extends Mercedes implements Rocket {
	public void ferrariInfo() {
		System.out.println("Invented in Italy");
	}

	@Override
	public void space() {
		System.out.println("space method From Rocket Interface");

	}

}
