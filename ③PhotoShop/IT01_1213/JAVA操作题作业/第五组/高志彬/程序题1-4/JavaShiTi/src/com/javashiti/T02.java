package com.javashiti;

import java.util.Iterator;
import java.util.Scanner;

public class T02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("输入一个十进制数：");
		int s = sc.nextInt();
		if (s <= 99 && s >= 10) {
			String a = Integer.toString(s, 16);
			System.out.println("转化为16进制为：" + a);
		} else {
			System.out.println("您输入的数字不在范围内，" 
							+ "请在10~99之间选取数字。");
		}

	}

}
