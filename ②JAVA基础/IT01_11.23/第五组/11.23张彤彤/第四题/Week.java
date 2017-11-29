package com.gaojie.qhit01;

import java.util.Scanner;

/**
 * 作者：张彤彤
 * 
 * 创建时间：2017年11月23日 下午8:00:30
 */
public class Week {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("请输入1到7的数字");
		int i = sc.nextInt();
		if (i >= 1 && i <= 7) {
			switch (i) {
			case 1:
				System.out.println("星期一");
				break;
			case 2:
				System.out.println("星期二");
				break;
			case 3:
				System.out.println("星期三");
				break;
			case 4:
				System.out.println("星期四");
				break;
			case 5:
				System.out.println("星期五");
				break;
			case 6:
				System.out.println("星期六");
				break;
			case 7:
				System.out.println("星期日");
				break;
			}
		} else {
			System.out.println("请输入1到7的数字");
		}

	}
}
