package com.Job04;

import java.util.Scanner;

public class t2 {
	//4 从键盘输入1~7的数字，如果数字是1，
	//则输出星期一，如果数字是2，则输出星期二........如果数字是7,
	//则输出星期日(用switch)

	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("请输入一个数字：");
		int H = sc.nextInt();
		
		switch (H) {
		case 1:
			System.out.println("今天是星期一！");
			break;
		case 2:
			System.out.println("今天是星期二！");
			break;
		case 3:
			System.out.println("今天是星期三！");
			break;
		case 4:
			System.out.println("今天是星期四！");
			break;
		case 5:
			System.out.println("今天是星期五！");
			break;
		case 6:
			System.out.println("今天是星期六！");
			break;
		case 7:
			System.out.println("今天是星期日！");
			break;			
		default:
			break;
		}	
		
		
		
		
		
	}
}
