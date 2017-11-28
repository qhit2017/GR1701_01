package com.jhb;

import java.util.Arrays;
import java.util.Scanner;

public class After {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int []a = new int[10];
		
		for (int i = 0; i < a.length; i++) {
			
			System.out.println("请输入第"+(i+1)+"个数");
			
			a[i] = sc.nextInt();
			
		}
		
		for (int i = a.length-5; i < a.length; i++) {
			
			System.out.println(Arrays.toString(a));
		}
		
	}

}
