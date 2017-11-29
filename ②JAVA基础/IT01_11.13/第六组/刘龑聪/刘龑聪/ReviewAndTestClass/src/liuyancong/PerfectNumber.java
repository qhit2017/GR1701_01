package liuyancong;

public class PerfectNumber {
	public static void main(String[] args) {

		int a;
		int b;

		for (a = 2; a <= 1000; a++) {
			int sum = 0;
			for (b = 1; b < a; b++) {
				if (a % b == 0) {
					sum += b;
				}
			}
			if (a == sum) {
				System.out.println(a);
			}
		}
	}
}
