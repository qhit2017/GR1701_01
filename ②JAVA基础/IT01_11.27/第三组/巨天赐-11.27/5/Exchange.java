package com.jtc;

import java.util.Arrays;
import java.util.Scanner;

public class Exchange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//从键盘接收10个数，第2个和第6个交换
		//第4个和第8 个交换，输出原来的10个数，再输出交换后的10个数
		Scanner sc = new Scanner(System.in);
		
		int [] a = new int [10];
		
		int b = 0;
		
		int c = 0;

		for (int i = 0; i < a.length; i++) {
			
			System.out.println("请输入第"+(i+1)+"个数");
			
			a[i] = sc.nextInt();
		}
		
		for (int i = 0; i < a.length; i++) {
			
			if (i==1) {
				
				b = a[1];
				
				a[1] = a[5];
				
				a[5] = b;
				
			}
			if (i==3) {
				
				c = a[3];
				
				a[3] = a[7];
				
				a[7] = c;
				
			}
			
			System.out.println(Arrays.toString(a));
		}
			
		}
		
		
	}


