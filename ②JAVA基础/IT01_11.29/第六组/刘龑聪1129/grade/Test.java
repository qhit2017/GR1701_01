package com.grade;

import java.util.Arrays;
import java.util.Scanner;

/*Author：刘龑聪
  E-mail：15539919713@163.com
 */
public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("你将对几个学生成绩进行管理？");
		int n = sc.nextInt();
		double[] d = new double[n];
		for (int i = 0; i < d.length; i++) {
			System.out.print("请输入第"+(i+1)+"个成绩：");
			double s = sc.nextDouble();
			d[i] = s;
		}
	
		Score score = new Score();
		boolean isExit = true;
		score.help();
		while(isExit){
			
			System.out.println("请输入指令并按Enter键\n");
			String k = sc.next();
			
			switch (k) {
			
			case "Help":
				score.help();
				break;
				
			case "Info":
				score.ScoreInfo(d);
				System.out.println();
				break;
				
			case "Sum":
				System.out.println(score.sum(d));
				System.out.println();
				break;
				
			case "Max":
				System.out.println(score.max(d));
				System.out.println();
				break;
				
			case "Min":
				System.out.println(score.min(d));
				System.out.println();
				break;
				
			case "Average":
				System.out.println(score.average(d));
				System.out.println();
				break;
				
			case "Sort":
				System.out.println(Arrays.toString(score.sort(d)));
				System.out.println();
				break;
				
			case "Not":
				System.out.println(score.Not60(d));
				System.out.println();
				break;
				
			case "Exit":
				isExit = false;
				break;

			default:
				System.out.println("请输入正确的指令！");
				System.out.println();
				break;
			}
			
		}
	System.out.println("感谢您的使用！再见！");
	sc.close();
	}
}