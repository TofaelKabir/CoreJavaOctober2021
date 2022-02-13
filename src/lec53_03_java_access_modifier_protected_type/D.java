package lec53_03_java_access_modifier_protected_type;

public class D {
	protected String info2 = "This is coming from a variable which is protected";

	protected D() {
		System.out.println("This is coming from a constructor which is protected");
	}

	protected void msg2() {
		System.out.println("This is coming from a method which is protected");
	}
	
	public static void main(String[] args) {
		System.out.println("\n---------- In the same package, protected type modifier content of same class can be accessed ----------");
		D d = new D();
		System.out.println(d.info2);
		d.msg2();
		
	}

}
