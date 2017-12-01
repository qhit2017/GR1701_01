package ccom.cjgl;

import java.util.Arrays;
import java.util.Scanner;

public class Text {

	public static void main(String[] args) {

		double[] c = { 58, 98, 74, 68, 75, 83, 97, 66, 76, 81 };
		Score score = new Score();
		score.info();
		Scanner sc = new Scanner(System.in);
		boolean isQuit = true;
		String s;
		while (isQuit) {
			System.out.println("请输入指令");
			s = sc.next();

			switch (s) {
			case "Sum":
				double sum = score.sum(c);
				System.out.println("总成绩是"+sum);
				break;
				
			case "Max":
				double max = score.max(c);
				System.out.println("最大值是："+max);
				break;
				
			case "Min":
				double min = score.min(c);
				System.out.println("最小值是："+min);
				break;
			case "Average":
				double average = score.average(c);
				System.out.println("平均分是："+average);
				break;	
				
			case "Sort":
				System.out.println(Arrays.toString(score.sort(c)));
				
				break;	
				
			case "Not":
				double not = score.numberNot60(c);
				System.out.println("不及格人数"+not);
				break;	
				
				
			case "Info":
				score.scoreInfo(c);
				break;
				
			case "Exit":
				isQuit = false;
				break;
			default:
				break;
			}
		}
		System.out.println("再见，我的朋友");
	}

}
