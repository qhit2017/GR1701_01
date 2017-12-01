package com.Grade;

import java.util.Scanner;

/**
 * @author 作者 E-mail:1456014420@qq.com
 * @date 创建时间：2017年11月29日 上午8:56:31
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] a = new double[10];
		for (int i = 0; i < a.length; i++) {
			System.out.println("请输入第" + (i + 1) + "个数");
			a[i] = sc.nextInt();
		}
		Score score = new Score();
		score.info();
		//double[] a = { 55, 88, 47, 95, 86, 78, 64, 88, 61, 35 };

		String s;
		boolean isQuit = true;
		while (isQuit) {
			System.out.println("请输入下一条指令后按回车键执行：");
			s = sc.next();
			switch (s) {	
			case "Sum":
				double sum = score.sum(a);
				System.out.println("总成绩为：" + sum);
				break;
			case "Max":
				double max = score.max(a);
				System.out.println("最大值是：" + max);
				break;
			case "Min":
				double min = score.min(a);
				System.out.println("最小值是：" + min);
				break;
			case "Sort":
				double[] sort=score.sort(a);
				System.out.println("排序：" + sort);
				break;
			case "Avarage":
				double avarage = score.avarage(a);
				System.out.println("平均值是："+avarage);
				break;
			case "Not":
				double[] not = score.sort(a);
				System.out.println("不及格人数："+not);
				break;
			case "Info":
				System.out.println("成绩总览：");
				score.scoreInfo(a);
				break;
			case "Exit":
				isQuit = false;
				break;

			default:
				break;
			}
		}
		System.out.println("再见~");

	}
}
