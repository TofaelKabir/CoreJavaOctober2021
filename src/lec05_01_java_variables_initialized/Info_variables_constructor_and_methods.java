package lec05_01_java_variables_initialized;

/*

1) What are the common symbols used in Java? (Please memorize them)?
			(  ) 	  Parentheses
			{  } 	  Curly braces
			[  ] 	  Square bracket
			<  >   Angular bracket
			“  “	 Double Quotation or quotation
			‘  ‘ 	 Single quotation (single must be mentioned)
			/   	 Slash/Single slash
			\    	 Back slash
			;        Semicolon
			=    	 Assign operator
			|        Pipe
			~       Tilde
			%      Modulus
			!        Exclamatory sign

2) Describe the classification of variables?
-- Class Variable 2 type:
		i) Primitive data type variable- eight types - byte, short, int, long, float, double, char or boolean.
		ii) Reference data type variable --- 
            MyInfo myInfo = new MyInfo();
            myInfo is called reference type variable, it is mostly called object

3) Describe primitive type data?

		byte = –128 (2^7) to 127 (2^7-1)  //because of zero, zero is counted on the plus side. (-128 to +127)
		
		short = –32,768 to 32,767   (32,768 = 256byte)
		
		int (integer) = –2,147,483,648 to 2,147,483, 647     [mostly used]
		
		long = –9,223,372,036,854,775,808 to 9,223,372,036,854,775,807     [highest range, we never used] [we have to use l (small L) at the end]
		
		float = decimal till 6 to 7 digit [example: 3.1415927]   [we have to use f at the end]
		
		double = decimal till 15 to 16 digit [example: 3.1415927410125732] 
		
		String = “Tofael483” [Only variable start with Uppercase] [V V Imp interview question: Not a pure primitive type]
		
		char = ‘A’      
		         
		boolean = true or false
		
		Mostly used variables: String, int, char, boolean, double

4) What is the difference between float and double in details?
 -- Though both float and double data type are used to represent floating point numbers in Java, a double data type is more precise than float. A double variable can provide precision up to 15 to 16 decimal points as compared to float precision of 6 to 7 decimal digits. Another significant difference between float and double is their storage requirement, double is more expensive than float. It takes 8 bytes to store a variable while float just takes 4 bytes. Which means, if memory is constraint then its better to use float than double. BTW, the double type also has a larger range than float and if your numbers don't fit well in float then you have to use double in Java.
 
5a) What is Java?
-- Java is an object-oriented programming language.

5b) What is a class in Java?
-- Class is a blueprint from which -- individual objects are created.

6) Is Java Strongly Typed Language?
-- Yes, Java is a strongly typed language. Reason: Each and every variable must have a declared type. Primitive (int, String, char, boolean, double, short, long, float) and reference type variable.   

7) What is an object in java? (will discuss later)
-- Object is an instance (illustration) of the class and Object is the physical reality.

8) What is constructor in java?
-- A constructor is a special method that is used to initialize a newly created object and is called just after the memory is allocated for the object. 
-- MyInfo myInfo = new MyInfo();

9) Explain MyInfo myInfo = new MyInfo(); ******
-- MyInfo is a Class. myInfo is an object (most of the places, it is called object)
-- myInfo is also called a reference variable
-- object always starts with lowercase. = is equal operator or assign operator.
-- new is a keyword. MyInfo() is a newly created Class name 'MyInfo'
-- In Summary, an object is created (myInfo) from MyInfo class which is a new MyInfo type
 
 10) What does it mean by A class is instantiated? ****
 -- When an object is created from a class, we say -- the class is instantiated.
 
 11) What is the Info about byte type variables? **
-- byte type variable start with lowercase, byte type variable doesn't have any quotation
-- Any value between –128 (2^7) to +127 (2^7-1) is byte type
-- because of zero, zero is counted on the plus side. (-128 to +127) 
-- solid number, no decimal.

12) What is the Info about short type variables?
-- short type variable start with lowercase, short type variable doesn't have any quotation
-- Any value between –256 byte to +256 byte is short type
-- because of zero, zero is counted on the plus side. (–32,768 to 32,767)
-- solid number, no decimal.

13) What is the Info about int (called Integer) type variables?
-- int type variable start with lowercase, int type variable doesn't have any quotation
-- By default, the value of int is zero. (important interview question)
-- solid number, no decimal.

14) What is the Info about long type variables?
-- long type variable start with lowercase, long type variable doesn't have any quotation
-- solid number, no decimal.
-- have to use l at the end.

15) What is the Info about float type variables?
-- float type variable start with lowercase, float type variable doesn't have any quotation
-- not solid numbers, decimal till 6 to 7 digits.
-- have to use f at the end.

16) What is the Info about double type variables?
-- double type variable start with lowercase, double type variable doesn't have any quotation
-- not solid numbers, decimal till 15 to 16 digits.


 * */

public class Info_variables_constructor_and_methods {

	public static void main(String[] args) {
		System.out.println("\"Info regarding Variable, Constructor and Method\"");

	}

}
