package lec17_java_oop_abstraction_inheritance_encapsulation_catchup;

// This catch up session is taken by Nasir

public abstract class E_AbsCalculator{

	public abstract int percentage(int a, int b);
	public abstract int remainder(int a, int b);
	
	public void className() {
		System.out.println(this.getClass().getName());
	}
	
	public static void aMethod() {
		System.out.println("This is a method");
	}
}
