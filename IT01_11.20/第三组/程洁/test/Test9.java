package test;

import java.util.Scanner;

public class Test9 {
	public static void main(String[] args) {

		System.out.println("请输入一个不大于10000的正整数:");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		if (i <= 10000&&i>0) {
			for (int k = 1; k <= i; k++) {
				if (k % 7 == 0 || k / 1000 == 7 || k / 100 == 7 || k / 10 == 7) {
					System.out.println(a);
				}
			}
		} else {
			System.out.println("请输入一个正确的数!");
		}
		sc.close();
	}
}