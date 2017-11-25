package com.Job01;

import java.util.Scanner;

public class Java203 {
	public static void main(String[] args) {
		//3.编写JAVA程序，通过控制台输入一个整数N（N<=10000）,
		//判断该数字是几位数，并输出结果。
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int count =0;
		
		if(N<0 || N>10000){
			System.out.println("您的输入有误，请重新输入。");
		}
		else{
			while (N>0|| N<=10000) {
				
				N=N/10;
				
				count++;
				
			}
			
			System.out.println("您输入的是"+count+"位数");
			
		}
		
	}
			
}
