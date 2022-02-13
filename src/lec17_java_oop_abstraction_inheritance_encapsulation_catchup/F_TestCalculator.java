package lec17_java_oop_abstraction_inheritance_encapsulation_catchup;

public class F_TestCalculator {

	public static void main(String[] args) {
		A_ImplCalculator calculator = new A_ImplCalculator();
		calculator.concreatClass();
		int result = calculator.addition(5, 111);
		System.out.println(result);
		result = calculator.multiplication(60, 200);// Reinitializing, resuing object
		System.out.println(result);
		result = calculator.substraction(20, 5);
		System.out.println(result);
		result = calculator.substraction(20, 100);
		System.out.println(result);
		result = calculator.substraction(20, 20);
		System.out.println(result);
		double result2 = calculator.division(111.0, 11.0);
		System.out.println(result2);
		calculator.className();

		// calculator.aMethod();
		A_ImplCalculator.aMethod();

		System.out.println("JVM Object reference " + calculator.hashCode());
		System.out.println(calculator.getClass().getName());
		calculator.toString();

		B_CalculatorBluePrint calculatorBluePrint = new A_ImplCalculator();
		calculatorBluePrint.addition(5, 10);
		// calculatorBluePrint.className();
		B_CalculatorBluePrint.interfaceName();
		// calculatorBluePrint.interfaceName();

		E_AbsCalculator absCalculator = new A_ImplCalculator();
		absCalculator.className();
		// absCalculator.addition(5, 10);
		E_AbsCalculator.aMethod();

	}
}
