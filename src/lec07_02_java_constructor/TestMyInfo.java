package lec07_02_java_constructor;

public class TestMyInfo {

	public static void main(String[] args) {
		MyInfo info = new MyInfo();
		MyInfo john = new MyInfo("John", 26, 20000, 76343264722l, 'M', 1.676f, 3.9765384, false);
		System.out.println("\n********************************\n");
		MyInfo tina = new MyInfo("Tina", 36, 30000, 765765264722l, 'F', 1.076f, 3.65384, true);
		System.out.println("\n********************************\n");
		MyInfo tofael = new MyInfo("Tofael", 26, 'M', false);

	}

}
