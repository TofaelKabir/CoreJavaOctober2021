package lec09_02_different_type_of_method;

public class Day {

	public static void main(String[] args) {
		String day = "Monday";
		
		switch (day) {
		
		case "Saturday":
			System.out.println("Today is Saturday");
			break;

		case "Sunday":
			System.out.println("Today is Sunday");
			break;
			
		case "Monday":
			System.out.println("Today is Monday");
			break;	
			
		case "Tuesday":
			System.out.println("Today is Tuesday");
			break;	
			
		case "Wednesday":
			System.out.println("Today is Wednesday");
			break;	
		
		case "Thursday":
			System.out.println("Today is Thursday");
			break;
			
		case "Friday":
			System.out.println("Today is Friday");
			break;	
			
		default:
			System.out.println("Please put a valid day");
			break;
		}

	}

}
