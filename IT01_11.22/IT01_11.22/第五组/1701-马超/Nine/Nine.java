package machao;

import java.util.Scanner;

public class Nine {
	public static void main(String[] args) {
              //通过控制台输入一个整数N,N不大于10000，
              //输入所有的七的倍数和包含七的数字。
		Scanner sc = new Scanner(System.in);
		System.out.println("数值不可大于10000");
		int a = sc.nextInt();
		if (a > 10000) {
			System.out.println("错误");
		} else {
			for (int p = 1; p < a;p++) {
				if (p % 7 == 0 || p %1000 == 7 || p % 100 == 7
						|| p / 10 % 10 == 7 || p % 10 == 7) {

					System.out.println("输出7的倍数和含7的数字" + p);
				}

			}

		}

	}
}
