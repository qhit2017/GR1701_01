package com.gaojie.qhit;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 作者：高洁 E-mail:740997177@qq.com 电话:17630520503
 * 
 * 创建时间：2017年11月29日 下午2:10:59
 */
public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Score score = new Score();
		System.out.println("请输入学生成绩：");
		double[] d = new double[5];
		for (int i = 0; i < d.length; i++) {
			d[i] = sc.nextInt();
		}
		score.info();
		boolean c = true;
		String s;
		while (c) {
			s = sc.next();

			switch (s) {
			case "Sum":
				double su = score.Sum(d);
				System.out.println(su);
				System.out.println("请输入下一条指令");
				break;
			case "MAN":
				double M = score.MAN(d);
				System.out.println(M);
				System.out.println("请输入下一条指令");
				break;
			case "MIN":
				double m = score.MIN(d);
				System.out.println(m);
				System.out.println("请输入下一条指令");
				break;
			case "Average":
				double av = score.Average(d);
				System.out.println(av);
				System.out.println("请输入下一条指令");
				break;
			case "sort":
				score.sort(d);
				System.out.println("请输入下一条指令");
				break;
			case "Number60":
				int nu = score.Number60(d);
				System.out.println(nu);
				System.out.println("请输入下一条指令");
				break;
			case "Info":
				score.Info(d);
				System.out.println("请输入下一条指令");
				break;
			case "ESC":
				c = false;

				break;

			}

		}
		System.out.println("再见");
		sc.close();
	}
}
