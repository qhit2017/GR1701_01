package com.jkl;

import java.util.Scanner;


public class Disanti {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个数");
		int a=sc.nextInt();
		if (a>0) {
			System.out.println("此数是正数");
		} else if(a<0){
			System.out.println("此数是负数");
		} else {
			System.out.println("请输入正确的数");
		}
	}
}
