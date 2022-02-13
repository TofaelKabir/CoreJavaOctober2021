package lec04_java_variables;

//we learn how to call a method inside main method and also constructor

public class Address07 {
	// Variables come first
	public static String MyName = "Mohammad Sharkar";	
	public static int houseNumber = 625;	
	public static char houseLocation = 'W';	
	public static int streetNumber = 57;
	public static String streetType = "th St";
	public static String state = "NY -";
	public static int zipCode = 10019;	
	public static boolean inUSA = true;	
	
	// Second: Constructor, no info today
	// same name as Class
	public Address07() {		
	}
	
	// Third: Method
	// method names start with lower case
	public static void myAddress() { 
		System.out.println(MyName+"\n"+houseNumber+houseLocation+" "+streetNumber+streetType+"\n"+state+zipCode);
		System.out.println("Is the adress is in USA? Ans: "+inUSA);
	}	
	
	public static void main(String[] args) { 
		myAddress(); // A method can be called under main method, here from line 23
	}

}
