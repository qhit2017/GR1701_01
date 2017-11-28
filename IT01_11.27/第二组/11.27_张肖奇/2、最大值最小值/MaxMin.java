
public class MaxMin {

	public static void main(String[] args) {
		int[] a = { 5, 9, 12, 45, 18, 30 };

		int sum = 0;
		int Max = 0;
		int Min = 0;

		for (int i = 0; i < a.length; i++) {

			sum += a[i];
			Max = 5;
			Min = 5;

			if (a[i] > Max) {
				Max = a[i];
			}
			if (a[i] < Min) {
				Min = a[i];

			}

		}

		System.out.println("数组的和为：" + sum);
		System.out.println("数组的最大值为：" + Max);
		System.out.println("数组的最小值为：" + Min);

	}

}
