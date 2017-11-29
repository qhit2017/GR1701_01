package integer;

public class Integer {

	public static void main(String[] args) {
		// 求整数1~100的累加值，但要求跳过个位为3的数
		int sum = 0;
		
		for (int i = 1; i <= 100; i++) {
			if (i % 10 == 3)
				continue;
			sum += i;

		}
		System.out.println("1~100的累加值是：" + sum);
	}
}
