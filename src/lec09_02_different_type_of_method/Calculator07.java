package lec09_02_different_type_of_method;

public class Calculator07 {
	
	public int addition(int a, String b) { // local variable
		int total1 = a+Integer.parseInt(b);
		System.out.println("Addition of a and b is: "+total1);
		return total1;
	}
	
	public int subtraction(int c, double d) {
		int total2 = c-(int)d;
		System.out.println("Subtraction of c and d is: "+total2);
		return total2;
	}
	
	// newly added after class
	public int multiplication(int e, float f) {
		int total3 = e*(int)f;
		System.out.println("Multiplication of e and f is: "+total3);
		return total3;
	}
	
	// newly added after class
	public double division(double g, String h) {
		double total4 = g/Double.parseDouble(h);
		System.out.println("division of g and h is: "+total4);
		return total4;
	}
	
}

// Formula to convert String to int:
// Integer.parseInt(b)

// Formula to convert String to double:
// Double.parseDouble(h)


