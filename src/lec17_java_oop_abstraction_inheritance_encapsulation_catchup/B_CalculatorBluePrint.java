package lec17_java_oop_abstraction_inheritance_encapsulation_catchup;

public interface B_CalculatorBluePrint extends C_NumberFormat, D_NumberInterface{

	public abstract int addition(int a, int b);
	public abstract int substraction(int a, int b);
	public abstract int multiplication(int a, int b);
	public abstract double division(double a, double b);
	
	public static void interfaceName() {
		System.out.println("Calculator Interface");
	}
	
	public default void intName() {
		System.out.println("From default method of Interface");
	}
}
