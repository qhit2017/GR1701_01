package com.ztt;

import java.util.Scanner;


public class Question09 {
	public static void main(String[] args) {
		System.out.println("1.（考试第九题）-->第一种");
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个N，确定范围");
		int N = sc.nextInt();

		if (N > 10000) {
			System.out.println("您输入的值不在范围之内，请重新输入！");
		} else {
			for (int i = 1; i < N; i++) {
				if (i % 7 == 0
						&& (i / 1000 == 7 
						|| i / 100 % 10 == 7
						|| i / 10 % 10 == 7 
						|| i % 10 == 7)) {

					System.out.println(i);
				}
			}
		}
	}

}
