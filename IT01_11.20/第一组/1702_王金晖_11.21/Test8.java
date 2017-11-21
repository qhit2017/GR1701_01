public class Test8 {

	public static void main(String[] args) {
		int sum = 0;
		for (int d = 100; d < 1000; d++) {
			if ((d % 10 == 6) && (d % 3 == 0)) {
				System.out.println("个位数是6且能被3整除的3位整数是:" + d);
				sum++;
			}
		}
		System.out.println("总共有:" + sum);
	}

}
