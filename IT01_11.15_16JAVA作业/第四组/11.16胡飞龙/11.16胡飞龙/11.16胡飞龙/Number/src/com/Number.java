package com;

import java.util.Scanner;



public class Number {public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("请输入一个数字");
	int i=sc.nextInt();
	
	if(i>0){
		System.out.println("正数"+i);
	}
	if(i<0){
		System.out.println("负数"+i);
	}
	
	
}

}
