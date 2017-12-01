package com.sxl;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] d={12,45,89,21 ,96,25,23,32,78,98  };
        Score  score =new Score();
        score.help();
		Scanner sc =new Scanner(System.in);
		boolean isExit=true;
		String s;
		while (isExit) {
			s=sc.next();
			switch (s) {
			case "sum":
				System.out.println("所求和："+score.sum(d));
				break;
            case "Max":
				System.out.println("最大值是："+score.max(d));
				break;
            case "Min":
            	System.out.println("最小值是："+score.min(d));
				break;
            case "Average":
				System.out.println("平均值是："+score.average(d));
				break;
             case "Sort":
				score.sort(d);
				break;
            case "Not":
 			    System.out.println("不及格人数："+score.numberNot60(d));
 				break;
 			case "Info":
 				System.out.println("以下是本次测试的成绩");
 				score.info(d);
 				break;
            case "Exit":
				isExit=false;
				break;
      
			default:
				break;
			}
			
			
	
		}
		
		System.out.println("再见了，我的朋友。");
		sc.close();
	}

}
