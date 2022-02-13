package lec16_java_oop_use_of_super_in_child_class;

public class TestEmployee {

	public static void main(String[] args) {
		System.out.println("---------- default constructor initialized for Employee Class ----------");
		Employee emp01 = new Employee();
		
		System.out.println("\n---------- parameterized constructor initialized for Employee Class ----------");
		Employee emp02 = new Employee("Tofael", 483, 'M', false); // the value called argument
		
		System.out.println("\n---------- void type method initialized for Employee Class ----------");
		emp02.empInfo();
		
		System.out.println("\n---------- parameterized method initialized for Employee Class ----------");
		emp02.employeeInfo("Sharkar", 228145, 'M', true);
		
		
		System.out.println("\n---------- default constructor initialized for MountSinai Class ----------");
		MountSinai ms01 = new MountSinai();
		
		System.out.println("\n---------- parameterized constructor initialized for MountSinai Class ----------");
		MountSinai ms02 = new MountSinai("Manhattan", 20);
		
		System.out.println("\n---------- void type method initialized for MountSinai Class ----------");
		ms02.msInfo();
		
		System.out.println("\n---------- parameterized method initialized for MountSinai Class ----------");
		ms02.mountSinaiInfo("Queens", 19);
		

	}

}
