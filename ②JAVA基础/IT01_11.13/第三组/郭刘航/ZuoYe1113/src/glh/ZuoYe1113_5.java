package glh;

public class ZuoYe1113_5 {
	public static void main(String[] args) {

		int sum = 0;
		for (int a = 1; a <= 100; a++) {
			if (a == 3||a % 10 == 3) {
				continue;
			}
			sum += a;
		}
		System.out.println(sum);
	}
}
