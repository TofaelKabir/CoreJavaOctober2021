package lec09_02_different_type_of_method;

public class Shirt {
	public static void main(String[] args) {
		
		char size = 'L';
		
		switch(size) {
		
		case 'S':
			System.out.println("We have your Small Size Shirt");
			break;
			
		case 'M':
			System.out.println("We have your Medium Size Shirt");
			break;	
			
		case 'L':
			System.out.println("We have your Large Size Shirt");
			break;			
		
		default:
			System.out.println("Sorry we don't have your shirt");
			
		}		
		
	}

}
