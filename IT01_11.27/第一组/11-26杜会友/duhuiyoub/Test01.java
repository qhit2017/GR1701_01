
package com;

import java.util.Scanner;


public class Test01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("输入两个小数");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		if (a<b){
			System.out.println(a+"<"+b+"不等");
		}else if(a>b){
			System.out.println(a+">"+b+"不等");
		}else{
			System.out.println(a+"="+b+"等");
		}
	}
}
