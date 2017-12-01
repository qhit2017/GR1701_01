package com.duhuiyou;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
/*	System.out.println("------成绩管理系统------");
	System.out.println("[1]求和请输入1");
	System.out.println("[2]求最大值请输入2");
	System.out.println("[3]求最小值请输入3");
	System.out.println("[4]求最平均值请输入4");
	System.out.println("[5]排序请输入5");
	System.out.println("[6]查看成绩请输入6");
	System.out.println("[7]查看不及格请输入7");
	System.out.println("[8]退出请输入8");*/
	public static void main(String[] args) {
		//鍵盤接收
		Scanner sc = new Scanner(System.in);
		//定义动态数组
		//double[]a=new double[10];
		//定义静态数组
		double[]a={56,46,85,68,67,89,98,48,51,96,76,81};
		//實例化
		FANG fang = new FANG();
		//調用
		fang.info();
		//布耳變量判斷
		boolean isquit = true;
		//定义字符串	
		String s;
		
		//for循环接收键盘值
		/*for (int i = 0; i < args.length; i++) {
			System.out.println("请输入第"+(i+1)+"个值");
			a[i]=sc.nextInt();
		}*/
		System.out.println("请输入指令按回车键执行");
		while (isquit) {
			s = sc.next();
			switch (s) {
			case "1":
				

				break;
			case "2":

				break;
			case "3":

				break;
			case "4":

				break;
			case "5":

				break;
			case "6":

				break;
			case "7":

				break;
			case "8":
				isquit =false;

				break;

			default:
				break;
			}
		}
		System.out.println("再見，我的朋友");
	}

}
