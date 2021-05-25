package Java_All_class;

public class Throw_throws {

	public static void test() throws Exception {

		int i = 10;
		int j = 0;

		if (j == 0) {

			throw new MyException();

		}
	}

	public static void main(String[] args) throws Exception {

		test();

	}
}
