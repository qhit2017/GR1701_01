package com.zk.qhit.statictest;

import java.util.Scanner;


public class Sizesort {
		public static void main(String[] args) {
			Scanner soc = new Scanner(System.in);
			System.out.println("输入第一个数");
			int a = soc.nextInt();
			System.out.println("输入第二个数");
			int b = soc.nextInt();
			System.out.println("输入第三个数");
			int c = soc.nextInt();
			int d = 0;
			if (a<b){
				d = a;
				a = b;
				b = d;
			}
			if (a<c){
				d = a;
				a = c;
				c = d;
			}
			if (b<c){
				d = b;
				b = c;
				c = d;
			}if (c<a){
				d = c;
				c = a;
				a = d;
			}
			System.out.println(a+"<"+b+"<"+c);
		}




}
