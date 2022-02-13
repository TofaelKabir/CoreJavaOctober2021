package lec07_01_java_constructor_details_with_info;

public class Employee {
	// Global variable or class variable
	public String EmpName; // variables are declared
	public int empId;
	public char empSex;
	public boolean fullTimeEmployee;

	// Constructor are 2 types --
	// default constructor (no argument constructor) and parameterized constructor
	// A class can contain one default and multiple parameterized constructor
	// Default Constructor must be declared before parameterized constructor.
	// you shouldn't write a parameterized constructor without writing a default constructor. It's a norm.

	// Default Constructor (a lot of interview question)
	public Employee() {
		System.out.println("This constructor is from Employee class");
	}

	// Parameterized constructor, here 'EmpName' is a parameter and String is the type of variable
	// Parameterized constructor 01 declared
	public Employee(String EmpName) { // local variable
		this.EmpName = EmpName;
		System.out.println("Employee Nmae: " + EmpName);
	}

	// Parameterized constructor 02 declared
	public Employee(String EmpName, int empId) { // local variable
		this.EmpName = EmpName;
		this.empId = empId;
		System.out.println("Employee Name: " + EmpName + ", Employee Id: " + empId);
	}

	// Parameterized constructor 03 declared
	// local variables are placed in different position
	// Sysout outcome also not similar as above one
	public Employee(int empId, String EmpName) { // Sequence of parameter and sequence of argument matter
		this.empId = empId;
		this.EmpName = EmpName;
		System.out.println("Emp Name: " + EmpName + ", Emp Id: " + empId); // NOT NECESSARY TO CHANGE
	}
	
	// Parameterized constructor 04 declared
	public Employee(String EmpName, int empId, char empSex, boolean fullTimeEmployee) { 
		this.EmpName = EmpName;
		this.empId = empId;
		this.empSex = empSex;
		this.fullTimeEmployee = fullTimeEmployee;
		System.out.println("Employee Name: " + EmpName + ", Employee Id: " + empId+", Employee Sex: " + empSex+" and Full time Employee? Ans: " +fullTimeEmployee); 
	}
	
	// Parameterized constructor 05 declared,
	// local variables are placed in different position
	// Sysout outcome also not similar as the sequence of local variable
	public Employee(String EmpName, char empSex, boolean fullTimeEmployee, int empId) {
		this.EmpName = EmpName;
		this.empId = empId;
		this.empSex = empSex;
		this.fullTimeEmployee = fullTimeEmployee;
		System.out.println("Employee sex: " + empSex + ", ID: " + empId + ", Name: " + EmpName
					+ "and full Time Employee? : " + fullTimeEmployee);
	}
	
	// Parameterized method implemented
	// If global and local variables are same, we don't need to use this keyword in parameterized method
	// But here we kept it as it is not a problem
	// we will not use from next time
	public void employee(String EmpName, int empId, char empSex, boolean fullTimeEmployee) {
		this.EmpName = EmpName;
		this.empId = empId;
		this.empSex = empSex;
		this.fullTimeEmployee = fullTimeEmployee;
		System.out.println("Employee Name: " + EmpName + ", Employee Id: " + empId+", Employee Sex: " + empSex+" and Full time Employee? Ans: " +fullTimeEmployee);
	}
	
	
	
	

}
