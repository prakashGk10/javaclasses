package Java_All_class;


public class Retrun_Stst {

	private static int sampel(int a, int b) {
		return a + b;
	}

	private static String test(String msg) {
		return msg;
	}

	public static void main(String[] args) {

		int c = sampel(10, 20);
		System.out.println(c);

		String d = test("Return Statment");
		System.out.println(d);

	}
}
