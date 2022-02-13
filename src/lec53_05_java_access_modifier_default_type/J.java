package lec53_05_java_access_modifier_default_type;

public class J {
	String info4 = "This is coming from a variable which is default";

	J() {
		System.out.println("This is coming from a constructor which is default");
	}

	void msg4() {
		System.out.println("This is coming from a method which is default");
	}

	public static void main(String[] args) {
		System.out.println("\n---------- In the same package, default type modifier content of same class can be accessed ----------");
		J j = new J();
		System.out.println(j.info4);
		j.msg4();
	}

}
