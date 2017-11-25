package com.Job01;

import java.util.Scanner;

public class Java201 {
	//1.编写JAVA程序，通过控制台输入两个小数，判断两个小数是否相等，并输出结果。
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("请输入两个小数：");
		double i =sc.nextDouble();
		double j =sc.nextDouble();
		System.out.println("结果是：");
		if (i<j) {
			System.out.println(i+"<"+j);
		} else if(i>j){
			System.out.println(i+">"+j);
		}else{
			System.out.println(i+"="+j);
		}
		
		
		
		
		
	}

}
