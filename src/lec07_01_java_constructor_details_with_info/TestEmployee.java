package lec07_01_java_constructor_details_with_info;

public class TestEmployee {

	public static void main(String[] args) {
		 // default constructor is initialized
		Employee employee = new Employee();
		// Parameterized Constructor 01 Initialized
		Employee employee1 = new Employee("John Bolta"); // Here 'John Bolta' is an argument
		// Parameterized Constructor 02 Initialized
		Employee employee2 = new Employee("Alex B", 221856);
		Employee employee21 = new Employee("Rahman H", 221556);
		// Parameterized Constructor 03 Initialized
		Employee employee3 = new Employee(237865, "Robert F");
		// Parameterized Constructor 04 Initialized
		Employee employee4 = new Employee("Michael H", 768273, 'M', true);
		Employee employee41 = new Employee("Jenifer B", 673425, 'F', false);
		// Parameterized Constructor 05 Initialized
		Employee employee5 = new Employee("Tina B", 'F', true, 006754);
		employee5.employee("Tofael K", 2218458, 'M', true); // Parameterized method initialized	
	
		
		// summary:
		// we must have to put the argument in a sequence like the way local variable (parameter) declared in constructor
		// it doesn't matter the sequence of variable declared inside sysout
		// It is possible to create a parameterized constructor with the same number of variables but they are organized in a different manner.
	}

}
