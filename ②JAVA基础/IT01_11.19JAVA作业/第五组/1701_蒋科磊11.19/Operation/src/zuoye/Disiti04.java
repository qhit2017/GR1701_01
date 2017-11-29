package zuoye;

public class Disiti04 {

	public static void main(String[] args) {

		int sum = 0;
		for (int a = 1; a <= 1000; a++) {
			if (a % 8 == 0) {
				sum += a;
			}
		}
		System.out.println(sum);
	}

}
