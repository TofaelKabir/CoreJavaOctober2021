package lec09_02_different_type_of_method;

public class TestClass {

	public static void main(String[] args) {
		Calculator01 cal1 = new Calculator01();
		cal1.addition();
		cal1.subtraction();		
		
		System.out.println("\n-------------------------------\n");		
		Calculator02 cal2 = new Calculator02();
		cal2.addition();
		cal2.subtraction();
		
		System.out.println("\n-------------------------------\n");
		Calculator03 cal3 = new Calculator03();
		cal3.multiplication();
		cal3.division(8.222f, 3.011f);
		
		System.out.println("\n-------------------------------\n");
		Calculator04 cal4 = new Calculator04();
		cal4.division();
		
		System.out.println("\n-------------------------------\n");
		Calculator05 cal5 = new Calculator05();
		cal5.addition(44, 23); // we put the argument
		cal5.addition(77, 21);
		cal5.subtraction(33, 6);
		cal5.subtraction(55, 7);
		cal5.multiplication(6, 3);
		cal5.division(10, 5);
		
		System.out.println("\n-------------------------------\n");
		Calculator06 cal6 = new Calculator06();
		cal6.addition(31, 13); // we put the argument
		cal6.subtraction(12, 2);
		
		System.out.println("\n-------------------------------\n");
		Calculator07 cal7 = new Calculator07();
		cal7.addition(56, "7");
		cal7.subtraction(34, 12.74658364);
		cal7.multiplication(4, 2.123f);
		cal7.division(4.22, "2.11");

	}

}
