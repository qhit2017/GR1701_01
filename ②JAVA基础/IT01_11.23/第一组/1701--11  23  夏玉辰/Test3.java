package com.xyc;

import java.util.Scanner;

public class Test3 {
	 public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("输入一个不大于10000的数");
		int N=sc.nextInt();
		if(N<10){
			System.out.println("是一位数");
		}else if(N<100){
			System.out.println("是二位数");
		}else if(N<1000){
			System.out.println("是三位数");
		}else if(N<10000){
			System.out.println("是四位数");
		}else if(N==100){
			System.out.println("是五位数");
		}
		
	}
}
