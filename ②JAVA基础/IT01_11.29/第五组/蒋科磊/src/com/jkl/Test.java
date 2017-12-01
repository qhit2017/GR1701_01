package com.jkl;

import java.util.Arrays;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		double[] d={12,32,34,54,65,56,23,26,69,36};
		Score score = new Score();
		score.info();
		Scanner sc=new Scanner(System.in);
		boolean isQuit = true;
		String s;
		while(isQuit){
			System.out.println("请输入下一条指令并回车执行");
			s=sc.next();
			
			switch (s) {
			case "sum":
				double sum=score.sum(d);
				System.out.println("总成绩是："+sum);
				break;
			case "Max":
				double Max=score.Max(d);
				System.out.println("最大值是："+Max);
				break;
			case "Min":
				double Min=score.Min(d);
				System.out.println("最小值是："+Min);
				break;
			case "average":
				double average=score.average(d);
				System.out.println("平均值是："+average);
				break;
			case "Sort":
				System.out.println("升序是："+Arrays.toString(score.sort(d)));
				break;
			case "Not":
				int a = score.numberNot60(d);
			
				System.out.println("不及格是："+a);
				break;
			case "Exit":
				isQuit=false;
				break;
			

			default:
				break;
			}
		}
		System.out.println("再见了，我的朋友");

	}

}
