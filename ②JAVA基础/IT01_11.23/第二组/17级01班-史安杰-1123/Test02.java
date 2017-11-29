package com.saj;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个三位数");
		int a=sc.nextInt();
		
		System.out.println("十位数是"+a/10%10);

	}

}
