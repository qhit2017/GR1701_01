package com.WH;

import java.util.Arrays;
import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] a=new int[10];
		
		for (int i = 0; i < a.length; i++) {
			System.out.println("请输入第"+(i+1)+"个数");
			a[i]=sc.nextInt();
		}
		for (int j = 0; j < a.length; j++) {
			int temp;
			for (int i = 0; i < a.length-1; i++) {
				if(a[i]>a[i+1]){
					temp=a[i];
					a[i]=a[i+1];
					a[i+1]=temp;
				}
				
			}
			
		}
		System.out.println(Arrays.toString(a));

	}

}
