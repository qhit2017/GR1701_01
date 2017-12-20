package com.saj;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个整数");
		int score1 = sc.nextInt();
		System.out.println("请输入第二个整数");
		int score2 = sc.nextInt();
		System.out.println("请输入第三个整数");
		int score3 = sc.nextInt();
		System.out.println("请输入第四个整数");
		int score4 = sc.nextInt();
		int temp = 0;
		if (score1 < score2) {
			temp = score2;
			score2 = score1;
			score1 = temp;
		}
		if (score1 < score3) {
			temp = score3;
			score3 = score1;
			score1 = temp;
		}
		if (score1 < score4) {
			temp = score4;
			score4 = score1;
			score1 = temp;
		}
		if (score2 < score3) {
			temp = score3;
			score3 = score2;
			score2 = temp;
		}
		if (score2 < score4) {
			temp = score4;
			score4 = score2;
			score2 = temp;
		}
		if (score3 < score4) {
			temp = score4;
			score4 = score3;
			score3 = temp;
		}
		System.out.println("四个整数从小到大：" + score4 + "   " + score3 + "   "
				+ score2 + "   " + score1);
		sc.close();
	}

}
