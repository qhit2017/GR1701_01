package com.saj;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个整数");
		int a = sc.nextInt();

		if (a < 10) {
			System.out.println("该数为一位数");

		} else if (a < 100) {
			System.out.println("该数为二位数");

		}

		else if (a < 1000) {
			System.out.println("该数为三位数");

		}

		else if (a < 10000) {
			System.out.println("该数为四位数");

		} else if (a == 10000) {
			System.out.println("该数为五位数");
		}

	}

}
