package lec04_java_variables;

public class Address05 {
	
	public static String MyName = "Mohammad Sharkar";	
	public static int houseNumber = 625;	
	public static char houseLocation = 'W';	
	public static int streetNumber = 57;
	public static String streetType = "th St";
	public static String state = "NY -";
	public static int zipCode = 10019;	
	public static boolean inUSA = true;	
	
	public static void main(String[] args) { 
		// below we are calling multiple variables. but the outcome doesn't look good
		// Like String concatenation, variables are executing one after another by + symbol.
		System.out.println(MyName+houseNumber+houseLocation+streetNumber+streetType+state+zipCode); 
		System.out.println("Is the adress is in USA? Ans: "+inUSA);
		// A solution by putting space
		System.out.println(MyName+" "+houseNumber+houseLocation+" "+streetNumber+streetType+" "+state+zipCode);
		// Also we can use \n
		System.out.println(MyName+"\n"+houseNumber+houseLocation+" "+streetNumber+streetType+"\n"+state+zipCode);
		
	}

}
