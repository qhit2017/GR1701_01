public class Sum {
	public static void main(String[] args) {

		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 10 == 3) {
				continue;
			}
			sum += i;

		}
		System.out.println(sum);
	}
}
