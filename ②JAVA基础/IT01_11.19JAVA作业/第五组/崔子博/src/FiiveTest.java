public class FiiveTest {
	public static void main(String[] args) {

		int a = 1;
		do {
			if (a % 5 == 0 && a % 3 == 0) {
				System.out.println(a);

			}
			a++;
		} while (a <= 1000);

	}

}
