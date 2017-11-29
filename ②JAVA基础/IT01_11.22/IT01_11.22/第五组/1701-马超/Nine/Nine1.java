package machao;

import java.util.Scanner;

public class Test10 {

	static boolean isDivision(int n, int m) {
		return (n % m == 0) ? true : false;

	}

	static boolean isContain7(int n, int m) {

		boolean isContain7 = false;
		int temp = n;
		while (temp > 0) {
			if (temp % 10 == m) {
				isContain7 = true;
				break;
			} else {
				temp = temp / 10;
			}
		}
		return isContain7;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个整数");
		int a = sc.nextInt();
		if (a > 10000) {
			System.out.println("输入的不正确");

		} else {

			for (int i = 7; i <= a; i++) {
				if (isContain7(i, 7) && isContain7(i, 7)) {
					System.out.println(i);

				}

			}

		}

	}

}
