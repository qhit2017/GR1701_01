

public class MaxMin {
	public static void main(String[] args) {
		int[] a = { 5, 9, 12, 45, 18, 30 };
		int sum = 0;
		int max = 5;
		int min = 5;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];

			if (a[i] > max) {
				max = a[i];
			}
			if (a[i] < min) {
				min = a[i];
			}

		}
		System.out.println(sum);
		System.out.println(max);
		System.out.println(min);
	}

}
