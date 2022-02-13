package lec09_02_different_type_of_method;

/*
 
1) How can you change a String value to int?
 -- Integer.parseInt(v)
 
2) How can you change an int value to String?
 -- String.valueOf(v)
 
3) How can you change a String value to double?
 -- Double.parseDouble(v)
 
4) Give an example of a variable initialized where the default type of access modifier is used.
 -- int age = 30;
 
5) How can we convert a float or double to an int in Java? Give an example.
 -- By casting (because byte, short, int, long, float and double are number type data). example below:
 
 public int subtraction(int c, double d) {
		int total2 = c-(int)d; // here casting is done to d
		System.out.println("Subtraction of c and d is: "+total2);
		return total2;
}
	
public int multiplication(int e, float f) {
		int total3 = e*(int)f; // here casting is done to f
		System.out.println("Multiplication of e and f is: "+total3);
		return total3;
}
 
6) Do we need to use the 'this' keyword always in a parameterized method?
-- If global and local variables are not the same, we must use this keyword in a parameterized method to make a relation between global and local variables. otherwise not.
 
7) What is Java Type Casting?
-- Type casting is when you assign a value of one primitive data type to another type.
-- In Java, there are two types of casting:

Widening Casting (automatically) - Widening casting is done automatically when passing a smaller size type to a larger size type

Narrowing Casting (manually) - Narrowing casting must be done manually by placing the type in parentheses in front of the value.


 */

public class Info_methods {

}
