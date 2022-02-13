package lec09_02_different_type_of_method;

public class Employee {
	public int empID;
	public String firstName;
	public String lastName;
	public char sex;
	public boolean usCitizen;

	// If global and local variables are same, we don't need to use this keyword in parameterized method
	public void empInfo1(int empID, String firstName, String lastName, char sex, boolean usCitizen) {
		System.out.println("EmpName: "+firstName + " " + lastName + "\nEmpId: " + empID + "\nSex: " + sex + "\nIs US Citizen? "+ usCitizen + "\n"  );

	}
	
	// If global and local variables are not same, we must have to use this keyword in parameterized method
	public void empInfo2(int id, String fn, String ln, char s, boolean isCitizen) {
		this.empID = id;
		this.firstName = fn;
		this.lastName = ln;
		this.sex = s;
		this.usCitizen = isCitizen;
		System.out.println("EmpName: "+fn + " " + ln + "\nEmpId: " + id + "\nSex: " + s + "\nIs US Citizen? "+ isCitizen + "\n"  );
	}
	
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.empInfo1(2188458, "Bijoy", "Choubey", 'M', true);
		employee.empInfo2(3188458, "Tina", "Xu", 'F', false);
	}

}
