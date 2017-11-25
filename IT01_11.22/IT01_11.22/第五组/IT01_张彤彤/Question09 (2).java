package com.ztt;

import java.util.Scanner;

public class Question09 {

	static boolean isDivision(int x, int y) {
		return (y / x == 0) ? true : false;
	}

	static boolean isContainNum(int x, int y) {
		boolean isCotain = false;
		int M = x;
		while (M > 0) {
			if (M % 10 == y) {
				isCotain = true;
				break;
			} else {
				M = M / 10;
			}
		}
		return isCotain;
	}

	public static void main(String[] args) {
		System.out.println("1.（考试第九题）-->第二种");
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个N，确定范围");
		int N = sc.nextInt();
		if (N > 10000) {
			System.out.println("您输入的值不在范围之内，请重新输入！");
		} else {
			for (int i = 7; i <= N; i++) {
				if (isContainNum(i, 7) && isDivision(i, 7)) {

					System.out.println(i);
				}
			}
		}
	}

}
