package com.saj;

import java.util.Arrays;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] d = { 78, 65, 79, 45, 64, 89, 87, 94, 100, 66 };
		Score score = new Score();
		score.info();

		Scanner sc = new Scanner(System.in);
		boolean is = true;
		String s;
		
		while (is) {
			System.out.println("请输入下一条指令");
			s = sc.next();
			
			switch (s) {
			
			case "Max":
				double max = score.max(d);
				System.out.println("最大值是：" + max);
				break;
			case "Min":
				double min = score.min(d);
				System.out.println("最小值是：" + min);
				break;
			case "Average":
				double average = score.average(d);
				System.out.println("平均值是：" + average);
				break;
			case "Sort":
				System.out.println(Arrays.toString(d));
				System.out.println();
				
				break;
				
			case "Sum":
				double a = score.sum(d);
				System.out.println("总成绩是：" + a);
				break;
				
			case "Number":
				int b = score.numberNot60(d);
				System.out.println("不及格的人数有：" + b);
				break;
			case "Examine":
				score.examine(d);
				System.out.println("查看全部成绩");
				break;

			case "Exit":
				is = false;
				break;
			default:
				break;
			}
		}
		System.out.println("再见啦！我的朋友。");
	}

}
