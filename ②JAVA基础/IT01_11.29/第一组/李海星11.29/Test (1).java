package com.Grade;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		double[] t = { 85, 45, 78, 65, 32, 15, 48, 99, 87, 56 };
		Scort ss = new Scort();
		Scanner sc = new Scanner(System.in);
		String s;
		boolean is = true;
		// while
		ss.info();
		while (is) {
			System.out.println("请输入一个指令 回车键执行");
			s = sc.next();

			switch (s) {
			case "sum":
				double sum = ss.sum(t);
				System.out.println(sum);
				break;
			case "Exit":

				is = false;
				break;
			case "average":
				int x = (int) ss.average(t);
				System.out.println("平均分是：" + x);

				break;
			case "min":
				double c = ss.min(t);
				System.out.println("最小值是：" + c);
				break;
			case "flunk":

				int a = ss.flunk(t);
				System.out.println("不及格的学生数量：" + a);

				break;
			case "max":
				double b = ss.max(t);
				System.out.println("最大值是：" + (b));
				break;
			case "info":
				ss.scortinfo(t);
				break;

			case "sort":
                double[] q =ss.sort(t);
                System.out.println(t);
				break;
			default:
				break;
			}

		}
		System.out.println("再见，  欢迎下次使用");
	}
}
