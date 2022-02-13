package lec09_01_java_constructor;

public class TestMySelf {
	public static void main(String[] args) {
		MySelf mySelf = new MySelf(); // default constructor initialized
		// parameterized constructor initialized
		// for byte and short type, we have do 'Java casting'
		MySelf tofael = new MySelf("Tofael", (byte)46, (short)30000, 300000, 284863746764872l, 'M', 1.60f, 3.233447, false);

	}
}
