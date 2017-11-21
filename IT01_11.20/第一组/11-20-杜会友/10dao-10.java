
package com.qhit.Work;

import java.util.Scanner;

public class Quzi9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("输入一个10000内的整数");
		int a = sc.nextInt();
		for (int b= 1;b<=a ;b++){
			if (b%7==0 || b%1000==7 || b%100==7 || b%10==7){
				System.out.println(b);
			}
		}
	}
}
