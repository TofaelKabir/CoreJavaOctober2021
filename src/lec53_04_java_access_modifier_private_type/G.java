package lec53_04_java_access_modifier_private_type;

public class G {
	private String info3 = "This is coming from a variable which is private";

	private G() {
		System.out.println("This is coming from a constructor which is private");
	}

	private void msg3() {
		System.out.println("This is coming from a method which is private");
	}

	public static void main(String[] args) {
		System.out.println("\n---------- In the same package, private type modifier content of same class can be accessed ----------");
		G g = new G();
		System.out.println(g.info3);
		g.msg3();

	}

}
